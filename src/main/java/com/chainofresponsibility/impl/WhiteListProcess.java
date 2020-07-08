package com.chainofresponsibility.impl;

import com.chainofresponsibility.BusinessProcess;
import com.chainofresponsibility.Model;
import com.chainofresponsibility.ProcessContext;
import com.chainofresponsibility.UserModel;
import org.springframework.stereotype.Service;

/**
 * 白名单处理器
 * @author 3y
 */
@Service
public class WhiteListProcess implements BusinessProcess {
    @Override
    public void process(ProcessContext context) {
        UserModel user = (UserModel) context.getModel();
        if ("3y".equals(user.getName())) {
            context.setNeedBreak(true);
        }
    }
}
