package gov.huaibei.shifan.university;

public class Test {
    Bird bird=new Bird();
    Aireoplant aireoplant=new Aireoplant();
    public static void main(String[] args) {
        Test test=new Test();
        test.makeFly();

    }
    public void makeFly(){
        bird.fly();
        aireoplant.fly();
    }
}
