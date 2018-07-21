package com.olympus.hora.controller.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.olympus.hora.Exception.RecordNotFoundException;
import com.olympus.hora.common.util.DateUtil;
import com.olympus.hora.common.util.MessageKeyUtil;
import com.olympus.hora.constants.MessageKeyConstants;
import com.olympus.hora.constants.SystemCodeConstants.MessageType;
import com.olympus.hora.constants.code.CodeGroup;
import com.olympus.hora.dto.CodeDto;
import com.olympus.hora.dto.user.MUserDto;
import com.olympus.hora.form.user.UserAddForm;
import com.olympus.hora.service.CodeMasterService;
import com.olympus.hora.service.user.UserService;

/**
 * ユーザ情報追加コントローラ
 * @author majo_k
 */
@Controller
public class UserAddController {

    private static final String MODEL_KEY_FORM = "form";
    private static final String SUBPATH_INIT = "/user/add";
    private static final String SUBPATH_REGISTER = "/user/add/register";

    @Autowired
    protected MessageSource messageSource;

    @Autowired
    CodeMasterService codeMasterService;

    @Autowired
    UserService service;

    /**
     * 初期表示
     *
     * @param form フォーム
     * @param model Model
     * @return 初期表示サブパス
     * @throws RecordNotFoundException
     */
    @RequestMapping(value = SUBPATH_INIT, method = RequestMethod.GET)
    public String index(@ModelAttribute("form") UserAddForm form, Model model) throws RecordNotFoundException {
        List<CodeDto> sexList = codeMasterService.searchPulldown(CodeGroup.SEX, true);
        List<CodeDto> prefectureList = codeMasterService.searchPulldown(CodeGroup.PREFECTURE, true);
        form.setSexPulldown(sexList);
        form.setPrefecturePulldown(prefectureList);
        model.addAttribute("form", form);
        return "user/add";
    }

    /**
     * ユーザ登録
     *
     * @param form フォーム
     * @param model Model
     * @return "user/add"
     * @throws RecordNotFoundException
     */
    @RequestMapping(value = SUBPATH_REGISTER, method = RequestMethod.POST)
    public String register(@Validated @ModelAttribute("form") UserAddForm form, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model) throws RecordNotFoundException {
        if (bindingResult.hasErrors() || !validation()) {
            redirectAttributes.addFlashAttribute(MODEL_KEY_FORM, form);
            redirectAttributes.addFlashAttribute("errors", bindingResult);
            //super.setDisplayTitle(model, DisplayIdConstants.DeptMst.EMP_0302);
            //form = settingStartDate(form);

            return SUBPATH_INIT;
        }

        service.registerUser(toDto(form));

        // 完了メッセージを設定
        String message = messageSource.getMessage(MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null,
                Locale.getDefault());
        List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
        model.addAttribute(MessageType.SUCCESS, successMessageList);

        return "forward:" + SUBPATH_INIT;
    }

    private static boolean validation() {
        // TODO 入力チェックを行います
        return true;
    }

    private static MUserDto toDto(UserAddForm form) {
        MUserDto dto = new MUserDto();
        dto.setFamilyName(form.getFamilyName());
        dto.setGivenName(form.getGivenName());
        dto.setFamilyNameKana(form.getFamilyNameKana());
        dto.setGivenNameKana(form.getGivenNameKana());
        dto.setSex(form.getSex().isEmpty() ? null : Integer.parseInt(form.getSex()));
        dto.setBirthday(form.getBirthday().isEmpty() ? null : DateUtil.toLocalDate(form.getBirthday()));
        dto.setPhoneFirst1(form.getPhone1_1());
        dto.setPhoneFirst2(form.getPhone1_2());
        dto.setPhoneFirst3(form.getPhone1_3());
        dto.setPhoneSecond1(form.getPhone2_1());
        dto.setPhoneSecond2(form.getPhone2_2());
        dto.setPhoneSecond3(form.getPhone2_3());
        dto.setEmail1(form.getEmail1());
        dto.setEmail2(form.getEmail2());
        dto.setPostalCode(form.getPostalCode());
        dto.setPrefecture(form.getPrefecture().isEmpty() ? null : Integer.parseInt(form.getPrefecture()));
        dto.setCity(form.getCity());
        dto.setAddress1(form.getAddress1());
        dto.setAddress2(form.getAddress2());
        dto.setRemarks(form.getRemarks());
        dto.setDeleteFlag(false);
        return dto;
    }

}
