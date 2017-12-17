package com.scott.transer.task;

import java.util.concurrent.ExecutorService;

/**
 * <p>Author:    shijiale</p>
 * <p>Date:      2017-12-13 13:17</p>
 * <p>Email:     shilec@126.com</p>
 * <p>Describe:</p>
 */

public interface ITaskHolderProxy extends ITaskHolder{

    void setTaskHandler(ITaskInternalHandler handler);

    void setThreadPool(ExecutorService threadPool);

    ITaskInternalHandler getTaskHandler();
}