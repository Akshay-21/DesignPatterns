package factorymethod.dialog.factory.concrete_creator;

import factorymethod.dialog.buttons.Button;
import factorymethod.dialog.buttons.HtmlButton;
import factorymethod.dialog.factory.Dialog;



/**
 * Concrete creator
 *
 * HTML Dialog will produce HTML Buttons.
 *
 * */

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
