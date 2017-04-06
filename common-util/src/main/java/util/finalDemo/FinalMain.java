package util.finalDemo;

/**
 * Created by wangzz on 2016/6/21.
 */
public class FinalMain {

    public static void main(String[] args) {
        //PersionClass 小红 = new PersionClass("小红");
        //小红.eat();

        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        MyClass myClass3 = new MyClass();
        System.out.println(myClass1.i);
        System.out.println(myClass1.j);
        System.out.println(myClass2.i);
        System.out.println(myClass2.j);
        System.out.println(myClass3.i);
        System.out.println(myClass3.j);

    }

}

class MyClass {
    public final double i = Math.random();
    public static double j = Math.random();
}
