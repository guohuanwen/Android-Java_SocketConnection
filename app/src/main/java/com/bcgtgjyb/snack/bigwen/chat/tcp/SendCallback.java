package com.bcgtgjyb.snack.bigwen.chat.tcp;

/**
 * Created by bigwen on 2016/5/19.
 */
public interface SendCallback {
    void onSuccess();
    void onFailed(Exception e);
}
