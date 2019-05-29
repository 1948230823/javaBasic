public class Rto1 {

        public void play(){
            System.out.println("使用乐器！");
        }
        public static void main(String[] args){
            Rto1 i;
            Wind w = new Wind();
            Percussion p = new Percussion();
            Stringed s = new Stringed();
            i = w; i.play();
            i = p; i.play();
            i = s; i.play();
        }
    }
    //管乐器
    class Wind extends Rto1{
        public void play(){
            System.out.println("管乐器~~吹");
        }
    }
    //打击乐器
    class Percussion extends Rto1 {
        public void play(){
            System.out.println("打击乐器~~打");
        }
    }
    //弦乐器
    class Stringed extends Rto1{
        public void play(){
            System.out.println("弦乐器~~弹");
        }


}
