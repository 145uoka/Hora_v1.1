package com.olympus.hora.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.olympus.hora.Exception.RecordNotFoundException;

/**
 * ショップ情報編集画面コントローラ
 * @author developer
 *
 */
@Controller
public class ShopEditController {

    /**
     * ショップ情報編集画面初期表示
     * @return
     * @throws RecordNotFoundException
     */
    @RequestMapping(value = "shop/edit", method = RequestMethod.GET)
    public String show() throws Exception {



        return "shop/edit";
    }

    /**
     * ショップ情報編集画面編集確定処理
     * @return
     * @throws RecordNotFoundException
     */
    @RequestMapping(value = "shop/edit", method = RequestMethod.GET)
    public String edit() throws Exception {



        return "shop/edit";
    }

}
