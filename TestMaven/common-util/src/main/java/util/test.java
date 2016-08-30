package util;

/**
 * Created by wangzz on 2016/6/20.
 */
public class test {

    public static void main(String[] args) throws Exception {

        /**HtmlUnit请求web页面*/
       /* WebClient wc = new WebClient();
        wc.getOptions().setJavaScriptEnabled(true); //启用JS解释器，默认为true
        wc.getOptions().setCssEnabled(false); //禁用css支持
        wc.getOptions().setThrowExceptionOnScriptError(false); //js运行错误时，是否抛出异常
        wc.getOptions().setTimeout(100000); //设置连接超时时间 ，这里是10S。如果为0，则无限期等待
        HtmlPage page = wc.getPage("http://cq.qq.com/baoliao/detail.htm?294064");
        Set<Cookie> cookies = wc.getCookieManager().getCookies();
        String pageXml = page.asXml(); //以xml的形式获取响应文本
        System.out.println(pageXml);*/

        /**jsoup解析文档*//*
        Document doc = Jsoup.parse(pageXml);
        Element pv = doc.select("#feed_content span").get(1);
        System.out.println(pv.text());
        System.out.println(pv.text().contains("浏览"));

        System.out.println("Thank God!");*/
    }

}
