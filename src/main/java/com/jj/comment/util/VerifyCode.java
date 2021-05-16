package com.jj.comment.util;

import java.util.Random;

public class VerifyCode {
    /**
     * 生成指定长度的随机纯数字码
     *
     * @param len
     * @return
     */
    public static String generateNumberCode(int len) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            int rn = random.nextInt(10); // 因为是10进制
            sb.append(rn);
        }
        return sb.toString();
    }
}
