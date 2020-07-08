package com.chainofresponsibility;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 责任链的流程控制器（整个责任链的执行流程通用控制）
 * @author 3y
 */
@Data
public class ProcessController {

    // 不同的code 对应不同的责任链
    private Map<String, ProcessTemplate> templateConfig = null;

    public void process(ProcessContext context) {
        //根据上下文的Code 执行不同的责任链
        String businessCode = context.getCode();
        ProcessTemplate processTemplate = templateConfig.get(businessCode);
        List<BusinessProcess> actionList = processTemplate.getProcessList();
        //遍历某个责任链的流程节点
        for (BusinessProcess action : actionList) {
            try {
                action.process(context);
                if (context.getNeedBreak()) {
                    break;
                }
            } catch (Exception e2) {
                //...
            }
        }
    }
}
