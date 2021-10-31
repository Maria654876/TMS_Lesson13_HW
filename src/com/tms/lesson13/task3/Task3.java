package com.tms.lesson13.task3;

public class Task3 {
    public static void main(String[] args) {
        ofi();
    }

    private static void ofi(){
        Func<String> rev=(str) ->{
            String result="";
            int i;
            for (i=str.length()-1; i>=0; i--)
                result+=str.charAt(i);
            return result;
        };
        System.out.println(rev.func("java"));

        Func<Integer> factorial=(n) -> {
            int result=1;

            for (int i=1; i<=n; i++)
                result=i*result;

            return result;
        };

        System.out.println("Factorial number 3 - "+factorial.func(3));
    }

}
