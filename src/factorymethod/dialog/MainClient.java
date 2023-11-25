package factorymethod.dialog;

import factorymethod.dialog.factory.Dialog;
import factorymethod.dialog.factory.concrete_creator.HtmlDialog;
import factorymethod.dialog.factory.concrete_creator.WindowsDialog;

/**
 * Client Class or DriverClass or MainClientCode or DemoClass
 *
 * Everything comes together here.
 */


public class MainClient {

    private static Dialog dialog;

    public static void main(String args[]) {

        System.out.println("OS Name-- "+ System.getProperty("os.name"));

        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment option.
     */

    static void configure(){
        if(System.getProperty("os.name").equals("Windows 11")){
            dialog = new WindowsDialog();
        }else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}