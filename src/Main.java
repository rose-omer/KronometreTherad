public class Main {
    public static void main(String[] args) {
        KronometreTherad therad1=new KronometreTherad("therad1");
        KronometreTherad therad2=new KronometreTherad("therad2");
        KronometreTherad therad3=new KronometreTherad("therad3");

        therad1.start();
        therad2.start();
        therad3.start();
    }
}