package com.neuedu.text;

import java.util.Scanner;

public class zuoye {
    public static void main(String[] args) {
        /*第一题
        for (int a=100;a<999;a++){
            int b=a/100;
            int c=a%100/10;
            int d=a%10;
            if(a==b*b*b+c*c*c+d*d*d)
            {
                System.out.println(a);
            }
        }*/



        /*第二题
        Scanner scan= new Scanner(System.in);
        System.out.print("请输入");
        int  score = scan.nextInt();
        String leve1 = score>=90?"a":(score>=60?"b":"c");
        System.out.print("成绩"+leve1);
        */

        /*第三题
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for (a=1;a<=4;a++){
            for (b=1;b<=4;b++){
                for (c=1;c<=4;c++){
                    if (a!=b && b!=c && a!=c){
                        d+=1;
                        System.out.println(a*100 + b*10 + c);
                    }
                }
            }
        }*/


    /*第四题
       int a=1;
       for (int b=9;b>0;b--){
           a*=b;
       }
       System.out.print(a);
        */

/*第五题
            int sum=0;
            for (int a=1;a<=100;a++){
                if (a%2==0){
                    sum +=a;
                }
            }
            System.out.println("偶数和："+sum);
            for (int b=1;b<=100;b=b+2){
                sum=sum+b;
            }
            System.out.println("奇数和："+sum);

            */

    /*第六题
        Scanner aa=new Scanner(System.in);
        System.out.print("五位数数字");
        int num=aa.nextInt();
        if (num%10==num/10000&&num%100/10==num%10000/1000){
            System.out.println(num+"为回数");
        }

        */


/*第七题
        Scanner scan = new Scanner(System.in);
        System.out.println("年份：");
        long year = scan.nextLong();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "闰年！");
        } else {
            System.out.println(year + "no");
        }

        */




/*第九道
        int sum=0;
        for (int a=1;a<=200;a++){
            if (a%3==0){
                sum+=a;
            }
            a++;
        }
        System.out.print("和值为"+sum);
        */

  //第十题
       /* Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean flag = false;
        int temp = 0;
        while(input%10>0){
            temp += input%10;
            input = input/10;
        }
        temp = temp + input;
        if(temp%9==0){
            flag = true;
        }
        System.out.println(flag?"能":"不能");*/

    }
    }

