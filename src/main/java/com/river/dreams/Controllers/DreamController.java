package com.river.dreams.Controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DreamController {

    public DreamController(){

    }

    public String home(){
        return "";
    }
}
