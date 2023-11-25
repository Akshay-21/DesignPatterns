package factorymethod.osfactorymethod;

public class MainClientFactory {

    public static void main(String[] args) {
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS osObject = operatingSystemFactory.getInstanceOfOSFactory("Android");
        osObject.spec();
    }
}
