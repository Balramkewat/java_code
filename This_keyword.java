package google.com;
class Test{
    int i;
    void show(int i){
       //i=i //  0
        this.i=i; // 10
    }
    void show1(){
        System.out.println(i);
    }
}
public class This_keyword {
    public static void main(String[] args) {
        Test t=new Test();
        t.show(10);
        t.show1();
    }
}
