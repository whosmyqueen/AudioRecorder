package com.whosmyqueen.mediarecorder.recorder.listener;


/**
 * 记录声音大小监听器
 *
 * @author zhengzhihui1.vendor
 * @date 2024/12/13
 */
public interface RecordSoundSizeListener {

    /**
     * 实时返回音量大小
     *
     * @param soundSize 当前音量大小
     */
    void onSoundSize(int soundSize);

}
