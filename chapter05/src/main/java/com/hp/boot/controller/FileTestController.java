package com.hp.boot.controller;

import com.hp.boot.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@Slf4j
public class FileTestController {

    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }

    @PostMapping("/upload")
    public String upload(User user) throws IOException {
        MultipartFile userImg = user.getUserImg();
        if(!userImg.isEmpty()){
            String originalFilename = userImg.getOriginalFilename();
            userImg.transferTo(new File("C:\\Users\\Yuno\\Desktop\\singleton\\" + originalFilename));
        }

        MultipartFile[] phones = user.getPhones();
        for (MultipartFile phone : phones) {
            if(!phone.isEmpty()){
                String originalFilename = phone.getOriginalFilename();
                phone.transferTo(new File("C:\\Users\\Yuno\\Desktop\\prototype\\" + originalFilename));
            }
        }

        return "redirect:/main.html";
    }

}
