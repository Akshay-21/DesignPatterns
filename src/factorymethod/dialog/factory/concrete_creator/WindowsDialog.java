package factorymethod.dialog.factory.concrete_creator;

import factorymethod.dialog.buttons.Button;
import factorymethod.dialog.buttons.WindowsButton;
import factorymethod.dialog.factory.Dialog;

/**
 * Concrete Creator
 *
 * One more concrete creator for different button object.
 *
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
