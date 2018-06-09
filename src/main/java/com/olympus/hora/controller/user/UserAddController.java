package com.olympus.hora.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.olympus.hora.Exception.RecordNotFoundException;
import com.olympus.hora.constants.code.CodeGroup;
import com.olympus.hora.form.Pulldown;
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
     * @return "user/add"
     * @throws RecordNotFoundException
     */
    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public String index(@ModelAttribute("form") UserAddForm form, Model model) throws RecordNotFoundException {
        Pulldown prefectureList = codeMasterService.searchPulldown(CodeGroup.PREFECTURE);
        model.addAttribute("form", form);
        return "user/add";
    }
}