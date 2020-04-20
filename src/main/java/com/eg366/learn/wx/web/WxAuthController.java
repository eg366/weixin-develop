package com.eg366.learn.wx.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class WxAuthController {

    private static final String TOKEN = "eg366";

    @ResponseBody
    @GetMapping("wxAuth")
    public String wxAuth(String signature, String timestamp, String nonce, String echostr) {
        log.info("signature={}, timestamp={}, nonce={}, echostr={}", signature, timestamp, nonce, echostr);

        return echostr;
    }
}
