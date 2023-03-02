//Exception'i extends eden Base classimizi olusturdum//
class Base extends Exception {
}
//Base classimiz altinda Derived adinda class olusturdum//
class Derived extends Base {
}
public class Main {
    public static void main(String args[])
    {
        //try catch yardimi ile Exception Handling yapiyoruz //
        try {
            throw new Derived();
        }
        catch (Base b) {
        }
        catch (Derived d) {
            //iki catch kullanarak hatamizi aliyoruz//
        }
    }
}
