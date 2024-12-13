package com.whosmyqueen.mediarecorder.recorder.listener;

import com.whosmyqueen.mediarecorder.recorder.RecordHelper;


/**
 * 记录状态监听器
 *
 * @author zhengzhihui1.vendor
 * @date 2024/12/13
 */
public interface RecordStateListener {

    /**
     * 当前的录音状态发生变化
     *
     * @param state 当前状态
     */
    void onStateChange(RecordHelper.RecordState state);

    /**
     * 录音错误
     *
     * @param error 错误
     */
    void onError(String error);

}
