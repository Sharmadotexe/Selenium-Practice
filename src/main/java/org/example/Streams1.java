package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams1 {

//    @Test
//    public void regular(){
//        ArrayList<String> arr = new ArrayList<String>();
//        arr.add("a");
//        arr.add("ab");
//        arr.add("c");
//        arr.add("d");
//        arr.add("e");
//
//        int count = 0;
//        for(int i = 0; i < arr.size(); i++) {
//            if (arr.get(i).startsWith("a")){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }


//    @Test
//    public void streamss(){
//        ArrayList<String> arr = new ArrayList<String>();
//        arr.add("a");
//        arr.add("ab");
//        arr.add("c");
//        arr.add("d");
//        arr.add("e");
//        arr.add("hfhfhf");
//
//        long a = arr.stream().filter(s -> s.startsWith("A")).count();
//        System.out.println(a);
//
//
//        long b = Stream.of("aa","ab","cc","vv").filter(s -> {
//            s.startsWith("a");
//            return true;
//        }).count();
//        System.out.println(b);
//
//        arr.stream().filter(s -> s.length()>4).forEach(s -> System.out.println(s));
//
//
//    }


//    @Test
//    public void StreamMap() {
//        ArrayList<String> arr = new ArrayList<String>();
//        arr.add("a");
//        arr.add("ab");
//        arr.add("c");
//        arr.add("d");
//        arr.add("e");
//        arr.add("hfhfhf");
//
////        Stream.of("aa", "ab", "cc", "vv", "bc").filter(s -> s.endsWith("c")).map(s -> s.toUpperCase())
////                .forEach(s -> System.out.println(s));
////
////
//        List<String> names = Arrays.asList("Aman", "Aon", "Mallika", "Vikas", "Rishika");
//        names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s-> System.out.println(s));
//
//
//        //Streams concat
//        Stream<String> newStream = Stream.concat(arr.stream(), names.stream());
//        newStream.sorted().forEach(s -> System.out.println(s));
//
//
//        boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Aman"));
//        Assert.assertTrue(flag);
//    }


//    @Test
//    public void collect(){
//       List<String> ls =  Stream.of("aa", "ab", "cc", "vv", "bc").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
//                .collect(Collectors.toList());
//        System.out.println(ls);
//    }
//}

@Test
//print unique numbers
        public void assignment(){
        List<Integer>in = Arrays.asList(2,5,99,55,55,1,2);
        in.stream().distinct().forEach(s -> System.out.println(s));
        }
}


