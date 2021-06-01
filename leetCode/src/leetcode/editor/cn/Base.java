package leetcode.editor.cn;

import sun.jvm.hotspot.oops.Instance;

public class Base {
    static Instance staticInstance = new Instance("1---Base类的静态成员变量staticInstance");
    static {
        System.out.println("2---Base类静态代码快");
    }

}
