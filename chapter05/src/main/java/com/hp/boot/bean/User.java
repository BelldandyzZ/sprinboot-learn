package com.hp.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Data
@ToString
public class User {
    private String username;
    private String password;
    private String email;
    private MultipartFile userImg;
    private MultipartFile[] phones;

}
