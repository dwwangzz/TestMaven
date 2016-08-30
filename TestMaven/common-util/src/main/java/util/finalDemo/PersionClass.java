package util.finalDemo;

/**
 * Created by wangzz on 2016/6/21.
 */
class PersionClass {

    public PersionClass(String name) {
        this.name = name;
    }

    private String name;

    private int age;

    public void eat() {
        System.out.println(this.name + "吃了一个馒头！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
