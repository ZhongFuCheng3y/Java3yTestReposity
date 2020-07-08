package com.chainofresponsibility;

import lombok.Data;

/**
 * 责任链上下文
 * @author 3y
 */
@Data
public class ProcessContext {
    // 标识责任链的code
    private String code;
    // 存储上下文的真正载体
    private Model model;
    // 责任链中断的标识
    private Boolean needBreak = false;
}
