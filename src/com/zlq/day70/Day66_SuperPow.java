package com.zlq.day70;

/**
 * @ProjectName:dataStructruesPractice
 * @Package:com.zlq.day70
 * @ClassName: Day66_SuperPow
 * @description:
 * @author: LiQun
 * @CreateDate:2021/12/5 9:49 上午
 */
public class Day66_SuperPow {
    public static void main(String[] args) {
        int[] b = {1, 1};
        System.out.println(superPow(2, b));
    }

    public static int superPow(int a, int[] b) {
        int res = 1, up = a % 1337;
        for (int i = b.length - 1; i >= 0; i--) {
            int t = 1;
            for (int j = 1; j <= 10; j++) {
                t = (t * up) % 1337;
                if (j == b[i]) {
                    res = (res * t) % 1337;
                }
            }
            up = t;
        }
        return res;
    }



}
