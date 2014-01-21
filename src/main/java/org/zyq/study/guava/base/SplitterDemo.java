package org.zyq.study.guava.base;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.collect.Maps;

public class SplitterDemo {
    public static void main(String[] args) {
        // 大部分split方法的返回值是Iterable<String>
        Iterable<String> strings = null;

        strings = Splitter.on('.').split("foo.bar.qux");
        Iterator<String> it = strings.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(strings); // ["foo", "bar", "qux"]

        // Splitter默认允许元素为空
        strings = Splitter.on('.').split(" foo...  bar .");
        System.out.println(strings); // [" foo", "", "", "  bar ", ""]

        // 使用CharMatcher匹配分隔符
        strings = Splitter.on(CharMatcher.anyOf(";,")).split("foo,;bar,quux");
        System.out.println(strings); // ["foo", "", "bar", "quux"]

        // 使用字符串分割
        strings = Splitter.on("||").split("ab||c||ef");
        System.out.println(strings); // ["ab", "c", "ef"]

        // omitEmptyStrings方法：忽略空值
        strings = Splitter.on('.').omitEmptyStrings().split(" foo...  bar .");
        System.out.println(strings); // [" foo", "  bar "]

        // trimResults方法：去掉结果中的空白
        strings = Splitter.on('.').trimResults().split(" foo.  bar ");
        System.out.println(strings); // ["foo", "bar"]

        // trimResults(CharMatcher)方法：去掉由CharMathcher指定的字符
        strings = Splitter.on('.').trimResults(CharMatcher.is('_')).split("a_.b_._c_");
        System.out.println(strings); // ["a", "b", "c"]

        strings = Splitter.on('.').trimResults().omitEmptyStrings().split(" foo...  bar .");
        System.out.println(strings); // ["foo", "bar"]

        // fixedLength方法： 按固定的字符个数拆分字符串
        strings = Splitter.fixedLength(2).split("abcde");
        System.out.println(strings); // ["ab", "cd", "e"]

        // limit方法：限制拆分结果的个数
        strings = Splitter.on('.').limit(3).split("a.b.c.d");
        System.out.println(strings); // ["a", "b", "c.d"]

        strings = Splitter.on('.').limit(3).split("a...b...c.d");
        System.out.println(strings); // ["a", "", ".b...c.d"]

        strings = Splitter.on('.').limit(3).omitEmptyStrings().split("a...b...c.d");
        System.out.println(strings); // ["a", "b", "c.d"]

        // splitToList方法：返回值为不可变(immutable)的List<String>
        List<String> list = Splitter.on('.').splitToList("a.b.c");
        //list.add("ss"); //list是不可变，这一句会抛出UnsupportedOperationException

        // withKeyValueSeparator方法：返回一个Splitter.MapSplitter对象
        // 该对象用于将字符串分解并填入一个Map<String, String>
        // note: 返回的Map也是immutable的
        // ps: 此方法尤其适用于解析url参数
        Map<String, String> stringsMap;
        stringsMap = Splitter.on('&').withKeyValueSeparator('=').split("id=123&name=wang&age=12");
        System.out.println(stringsMap); // {id=123, name=wang, age=12}

        // 可以使用newHashMap方法将stringsMap转为mutable的
        Map<String, String> mutableMap = Maps.newHashMap(stringsMap);
        mutableMap.put("test_key", "test_value");
        System.out.println(mutableMap);

        stringsMap = Splitter.on(';').withKeyValueSeparator("->").split("A->B;C->D;E->F");
        System.out.println(stringsMap); // {A=B, C=D, E=F}

        // withKeyValueSeparator(Splitter s)方法：返回的MapSplitter使用参数s来分割，并将分割结果填入Map中
        stringsMap = Splitter.on(';').withKeyValueSeparator(Splitter.on("->").trimResults()).split("X -> Y;M -> N;P -> Q");
        System.out.println(stringsMap); // {X=Y, M=N, P=Q}

    }
}