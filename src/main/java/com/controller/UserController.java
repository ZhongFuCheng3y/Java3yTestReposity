package com.controller;

import com.chainofresponsibility.ProcessContext;
import com.chainofresponsibility.ProcessController;
import com.chainofresponsibility.UserModel;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private ProcessController processController;

    @RequestMapping("/send")
    public void send(String userName) {
        // 构建上下文
        ProcessContext processContext = new ProcessContext();

        UserModel userModel = new UserModel();
        userModel.setAge("22");
        userModel.setName(userName);
        processContext.setModel(userModel);

        processContext.setCode("sendMessage");

        processController.process(processContext);

        if ("3y".equals(userModel.getName())) {
            return;
        }
        System.out.println("给" + userModel.getName() + "发消息");


    }

}
