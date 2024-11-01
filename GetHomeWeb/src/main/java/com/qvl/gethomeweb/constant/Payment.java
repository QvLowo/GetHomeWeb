package com.qvl.gethomeweb.constant;

import lombok.Data;

import java.util.UUID;

@Data
public class Payment {
    /**
     * LINE PAY 相關參數
     */
    public String channelId = "your_channel_id";
    public String ChannelSecret = "your_channel_secret";
    public String requestUri = "/v3/payments/request";
    public String requestUrl = "https://sandbox-api-pay.line.me/v3/payments/request";
    public String domain = "https://sandbox-api-pay.line.me/";
}
