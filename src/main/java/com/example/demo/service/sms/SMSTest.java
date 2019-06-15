package com.example.demo.service.sms;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.json.JSONException;

import java.io.IOException;

/**
 * @author 郑智国 (zhengzhiguo7@gmail.com)
 * @time 2019/6/14 16:40
 */
public class SMSTest {

    public static void main(String[] args) {

        // 短信应用 SDK AppID
        int appId = 0;

        // 短信应用 SDK AppKey
        String appKey = "";

        // 需要发送短信的手机号码
        String[] phoneNumbers = {""};
        // 短信模板 Id
        int loginTemplateId = 0;
        // 短信签名
        String smsSign = "";
        // 短信参数
        String[] params = {"CCL666", "3"};

        try {
            SmsSingleSender ssender = new SmsSingleSender(appId, appKey);
            // 发送短信
            SmsSingleSenderResult result = ssender.sendWithParam("86", phoneNumbers[0], loginTemplateId, params, smsSign, "", "");
            System.out.println(result);
        } catch (HTTPException e) {
            // HTTP 响应码错误
            e.printStackTrace();
        } catch (JSONException e) {
            // JSON 解析错误
            e.printStackTrace();
        } catch (IOException e) {
            // 网络 IO 错误
            e.printStackTrace();
        }
    }
}
