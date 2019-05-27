public class Student {

        String sname;
        String sno;
        int sage;
        int height;
        public void setHeight(int height1){

            if(height1<=0){
                System.out.println("重新输入");
            }else{
                System.out.println("合法");
                height=height1;
            }

        }
        //定义方法 打印输出
    public void print_student(){
        System.out.println(height);
        System.out.println("姓名："+sname+";学号："+sage+";身高："+height);
    }

        //验证某一个值    必然进方法
    //格式    访问权限修饰符   有无返回值    方法名（参数列表）{方法体}
    //   方法执行过程   1定义  2 调用
    /*public void a(){
        System.out.println(1);
    }
    public long add(){
        int a=1;
        int b=2;
        long c=a+b;
        return c;
    }*/

    //在方法定义时 参数  形式参数
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public int a(int a,int b){
        return a+b;
    }

    }

