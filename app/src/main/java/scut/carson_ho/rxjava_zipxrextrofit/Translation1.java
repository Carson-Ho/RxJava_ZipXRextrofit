package scut.carson_ho.rxjava_zipxrextrofit;

/**
 * Created by Carson_Ho on 17/7/21.
 */

public class Translation1 {
    private int status;
    private content content;
    private static class content {
        private String from;
        private String to;
        private String vendor;
        private String out;
        private int errNo;
    }

    //定义 输出返回数据 的方法
    public String show() {

        return ("第1次翻译=" + content.out);

    }
}
