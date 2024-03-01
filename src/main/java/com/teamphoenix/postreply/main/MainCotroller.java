package com.teamphoenix.postreply.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainCotroller {
    @GetMapping(value = {"/","/main"})
    public String main() {
        return "main/main";
    }
}
