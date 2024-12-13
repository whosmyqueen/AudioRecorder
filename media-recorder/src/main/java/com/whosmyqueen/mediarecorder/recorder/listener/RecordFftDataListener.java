package com.whosmyqueen.mediarecorder.recorder.listener;


/**
 * 记录FFT数据监听器
 *
 * @author zhengzhihui1.vendor
 * @date 2024/12/13
 */
public interface RecordFftDataListener {

    /**
     * @param data 录音可视化数据，即傅里叶转换后的数据：fftData
     */
    void onFftData(byte[] data);

}
