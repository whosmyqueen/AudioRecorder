package com.whosmyqueen.mediarecorder.recorder.listener;

import java.io.File;

/**
 * 录音完成回调
 *
 * @author zhengzhihui1.vendor
 * @date 2024/12/13
 */
public interface RecordResultListener {

    /**
     * 录音文件
     *
     * @param result 录音文件
     */
    void onResult(File result);
}
