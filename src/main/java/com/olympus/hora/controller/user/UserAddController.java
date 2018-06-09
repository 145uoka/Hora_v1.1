package com.olympus.hora.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.olympus.hora.form.user.UserAddForm;

/**
 * ユーザ情報追加コントローラ
 * @author majo_k
 */
@Controller
public class UserAddController {
    /**
     * 初期表示
     *
     * @param form フォーム
     * @param model Model
     * @return "user/add"
     */
    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public String index(@ModelAttribute("form") UserAddForm form, Model model) {
        model.addAttribute("form", form);
        return "user/add";
    }
}
