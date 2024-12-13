package com.whosmyqueen.mediarecorder.recorder.listener;


/**
 * 记录数据监听器
 *
 * @author zhengzhihui1.vendor
 * @date 2024/12/13
 */
public interface RecordDataListener {

    /**
     * 当前的录音状态发生变化
     *
     * @param data 当前音频数据
     */
    void onData(byte[] data);

}
