package util.string_util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangzz on 2016/5/25.
 */
public class StringDemo {

    public static void main(String[] args) {
        //test1();
        //test2();
        String str = "<![CDATA[2*1925>-71>2-*79><-*3-51+<>3791>4915384372*2</996+140+45535*-764-+71>63529<6><0-41" +
                "<793861" +
                ">4915384372*2</>0*<]]>";
        str = str.replaceAll("<!\\[CDATA\\[", "").replaceAll("]]>", "");
        System.out.println(str);

        String a = "hello";
        String b = new String("hello");
        String c = new String("hello");
        String d = b.intern();
        String e = new String("hel")+ "lo";

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(b == d);
        System.out.println(a == d);
        System.out.println(a == e);


    }

    /**
     * format测试
     */
    private static void test1() {
        String str = "https://sso.com:8666/cas/serviceValidate?ticket=%s&service=%s";
        String formatStr = String.format(str, "tickets-val", "service-val");
        System.out.println(formatStr);
    }

    /**
     * 删除前后[]
     */
    public static void test2(){
        List<String> list = new ArrayList<String>();
        list.add("aaaaaa");
        list.add("bbbbbb");
        list.add("cccccc");
        String str = list.toString();
        str = str.replaceAll("[\\[\\]]","");
        System.out.println(str);

    }

}
