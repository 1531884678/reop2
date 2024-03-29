package com.day04.dome004;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*十、在原有世界杯Map 的基础上，增加如下功能： 读入一支球队的名字，
输出该球队夺冠的年份列表。 例如，读入“巴西”，应当输出 1958 1962 1970 1994 2002
读入“荷兰”，应当输出 没有获得过世界杯
//tips:参阅Map接口containsValue(Object value)方法
*/
public class Test10 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        String time = sc.next();
        map.put("1930", "乌拉圭");
        map.put("1934", "意大利");
        map.put("1938", "意大利");
        map.put("1950", "乌拉圭");
        map.put("1954", "西德");
        map.put("1958", "巴西");
        map.put("1962", "巴西");
        map.put("1966", "英格兰");
        map.put("1970", "巴西");
        map.put("1974", "西德");
        map.put("1978", "阿根廷");
        map.put("1982", "意大利");
        map.put("1986", "阿根廷");
        map.put("1990", "西德");
        map.put("1994", "巴西");
        map.put("1998", "法国");
        map.put("2002", "巴西");
        map.put("2006", "德国");
        map.put("2010", "西班牙");
        map.put("2014", "德国");
        if (map.containsKey(time)) {
            String value = map.get(time);
            System.out.println(value);
        } else {
            System.out.println("没有举办世界杯");

        }
        System.out.println("请输入国家:");
        String time1 = sc.next();
        for (String st : map.keySet()) {
            String value = map.get(st);
            if (map.containsValue(time1)) {
                if (value.equals(time1)) {
                    System.out.println(st);
                }
            } else {
                System.out.println("没有获得过世界杯");
                break;
            }
        }
    }
}
