package google.com;

interface  Vehicle{
    void speedup(int increment );
    void applybreak(int decrement);

}
class Cycle implements Vehicle{
    public void applybreak(int decrement){
        System.out.println(" applying break ");
    }
    public void speedup(int increment){
        System.out.println("applying speed ");
    }
}
public class Interfaacce {
    public static void main(String[] args) {

    }
}
