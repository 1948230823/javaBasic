import java.util.Scanner;

public class Rto {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Get cle = new Get();
        System.out.println("请输入圆的半径");
        Scanner c = new Scanner(System.in);
        cle.radius = c.nextDouble();
        System.out.println("圆形的周长为" + cle.caculatePerimeter());
        System.out.println("圆形的面积为" + cle.caculateArea());
        Square are = new Square();
        System.out.println("请输入正方形的边长");
        Scanner s = new Scanner(System.in);
        are.side = s.nextDouble();
        System.out.println("正方形的周长为" + are.caculatePerimeter());
        System.out.println("正方形的面积为" + are.caculateArea());

    }

}
