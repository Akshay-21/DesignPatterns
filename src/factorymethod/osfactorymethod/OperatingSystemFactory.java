package factorymethod.osfactorymethod;

public class OperatingSystemFactory {
    public OS getInstanceOfOSFactory(String osConfirmationObj) {
        if (osConfirmationObj.equals("Android")) {
            return new Android();
        } else if (osConfirmationObj.equals("IOS")) {
            return new IOS();
        } else {
            return new WindowOS();
        }
    }
}
