import com.google.common.collect.Lists;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class NewCharacteristics {

    public static void main(String[] args) {

//        jjs

        /**
         * lambda 表达式  不能是final参数*/
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                LocalDate.now().toString();
//            }
//        };

       /* Runnable runnable = () -> {
            System.out.println(LocalDate.now().toString());
            System.out.println(LocalDate.now().toString());
        };
        runnable.run();*/



       /**
        Stream  Java 8 中的Stream是对集合（Collection）对象功能的增强*/

/*

        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        Arrays.stream(arr).filter(x -> x>2&x<7);

        String[] strArr = new String[]{"abc4","ABc55","ABC7777","Abc666","Abc88888"};
        Arrays.stream(strArr).map(m ->m.toUpperCase()).forEach(System.out::println);
*/


       /* String[] strArr2 = new String[]{"abc","ABc","ABC","Abc","Abc"};
        Stream.of(strArr,strArr2).flatMap(Arrays::stream).forEach(System.out::println);
*/
//        Arrays.stream(strArr).sorted(Comparator.comparing(String::length)).forEach(System.out::println);

       //TODO  for 计时看下效率
        ArrayList<Integer> list = Lists.newArrayList(1, null, 3, null, 4, 5, 6, null, 8);
        //串行
        long res = list.stream().filter(n -> n != null).count();
        //并行
        long res2 = list.parallelStream().filter(n -> n != null).count();
        //res12 结果只能用一次
        System.out.println(res);


        //optional
        List<String>  lll = new ArrayList<String>(){
            {
                add("A");
                add("B");
                add("C");
            }

        };
        Optional<String> optional = Optional.of("D");
        optional.ifPresent(lll::add);
        lll.forEach(System.out::println);

    }

}
