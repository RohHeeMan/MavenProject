package com.project01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 디폴트 경로는 원래는 WEB-INF이지만 WEB-INF/views로 옮기기 위해서 하단의 xml들 추가함
    @GetMapping("/")
    public String index() {
        return "index"; // => index.jsp 출력
    }
}
