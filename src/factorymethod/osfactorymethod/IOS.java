package factorymethod.osfactorymethod;

public class IOS implements OS {

    @Override
    public void spec() {
        System.out.println("THis is the most secure OS");
    }
}
