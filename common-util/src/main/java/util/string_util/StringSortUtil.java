package util.string_util;

import java.util.Arrays;

/**
 * Created by wangzz on 2016/8/15.
 */
public class StringSortUtil
{

    public static void main(StringSortUtil[] args) {
        //字符串倒序 - 方法一
        java.lang.String str = "I love you Java";
        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println(new java.lang.String(chars));
        Arrays.sort(chars);
        System.out.println(new java.lang.String(chars));


        //字符串倒序 - 方法二
        StringBuffer sb = new StringBuffer("I love you Java");
        System.out.println(sb.reverse().toString());
    }

}
