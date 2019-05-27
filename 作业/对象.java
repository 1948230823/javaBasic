public class 对象 {
    public static void main(String[] args) {

        int[] arrs = {1,62,52,6,7,98,29};
        //int[] arr1s = new int[5];
        //int[] arr2s = new int[]{1,2,3,5,9};
        //int arr3s[] = {};
        //索引  //下标，从0开始
        //length 数组长度
        //System.out.println(arrs.length);
        //冒泡排序

            for (int i=0;i<arrs.length-1;i++){
                for (int j=0;j<arrs.length-1-i;j++){
        //            数据交换
                    if (arrs[j]>arrs[j+1]){
                        int tmp=0;
                        tmp = arrs[j];
                        arrs[j]=arrs[j+1];
                        arrs[j+1]=tmp;
                    }
                }
            }
           // for (int i=0;i<arrs.length;i++){
            //    System.out.println(arrs[i]);
            //}
        for (int a:arrs)
        {
            System.out.println(a);
        }

        //面向对象语言                  Java操作  都是通过对象进行的操作
        //  类    对象

        //java 类  一类事物的特征的总结
        //  类   具有相同特征和行为的一类事物












    }
}
