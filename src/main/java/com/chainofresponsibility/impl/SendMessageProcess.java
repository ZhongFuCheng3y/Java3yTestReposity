package com.chainofresponsibility.impl;

import com.chainofresponsibility.BusinessProcess;
import com.chainofresponsibility.Model;
import com.chainofresponsibility.ProcessContext;
import com.chainofresponsibility.UserModel;
import com.entity.User;
import org.springframework.stereotype.Service;

/**
 * 发消息处理器
 * @author 三歪
 */
@Service
public class SendMessageProcess implements BusinessProcess {

    @Override
    public void process(ProcessContext context) {
        UserModel user = (UserModel) context.getModel();
        System.out.println("给"+user.getName()+"发消息");
    }
}
