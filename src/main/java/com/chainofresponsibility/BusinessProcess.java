package com.chainofresponsibility;

/**
 * 业务执行器
 * @author 三歪
 */
public interface BusinessProcess {
    void process(ProcessContext context);
}
