package com.olympus.hora.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.olympus.hora.Exception.RecordNotFoundException;
import com.olympus.hora.constants.code.CodeGroup;
import com.olympus.hora.dto.CodeDto;
import com.olympus.hora.form.user.UserAddForm;
import com.olympus.hora.service.CodeMasterService;
import com.olympus.hora.service.user.UserService;

/**
 * ユーザ情報追加コントローラ
 * @author majo_k
 */
@Controller
public class UserAddController {

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

    private static final String MODEL_KEY_FORM = "form";
    private static final String SUBPATH_INIT = "/user/add";
    private static final String SUBPATH_REGISTER = "/user/register";

    /**
     * ユーザ登録
     *
     * @param form フォーム
     * @param model Model
     * @return "user/add"
     * @throws RecordNotFoundException
     */
    @RequestMapping(value = SUBPATH_REGISTER, method = RequestMethod.GET)
    public String register(@ModelAttribute("form") UserAddForm form, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model) throws RecordNotFoundException {
        if (!validation()) {
            redirectAttributes.addFlashAttribute(MODEL_KEY_FORM, form);
            redirectAttributes.addFlashAttribute("errors", bindingResult);
            //super.setDisplayTitle(model, DisplayIdConstants.DeptMst.EMP_0302);
            //form = settingStartDate(form);
            model.addAttribute("form", form);
            return SUBPATH_INIT;
        }


        return SUBPATH_INIT;
    }

    private static boolean validation() {
        // TODO 入力チェックを行います
        return true;
    }
}
