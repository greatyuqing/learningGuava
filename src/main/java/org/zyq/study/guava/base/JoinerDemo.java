package org.zyq.study.guava.base;

import java.util.Arrays;

import com.google.common.base.Joiner;

public class JoinerDemo {

	public static void main(String[] args) {
        Joiner joiner = null;
        String result = "";

        // 可以简单的用一个字符来连接
        joiner = Joiner.on(';').skipNulls();
        result = joiner.join("Harry", null, "Ron", "Hermione");
        System.out.println(result); // Harry;Ron;Hermione

        // 也可以用一个字符串来连接
        joiner = Joiner.on("-->").skipNulls();
        result = joiner.join("Harry", null, "Ron", "Hermione");
        System.out.println(result); // Harry-->Ron-->Hermione

        // useForNull(String)用来指定代替null的字符串
        joiner = Joiner.on("-->").useForNull("default");
        result = joiner.join("Harry", null, "Ron", "Hermione");
        System.out.println(result); // Harry-->default-->Ron-->Hermione

        // Joiner也可以用于Object，会先调用对象的toString()方法再做连接
        joiner = Joiner.on(",");
        result = joiner.join(Arrays.asList(1, 5, 7));
        System.out.println(result);
	}

}
