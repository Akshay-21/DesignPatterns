package factorymethod.dialog.factory;

import factorymethod.dialog.buttons.Button;

/**
 * Base Creator
 *
 * Base factory class. Note the "factory" is merely a role for the class. It
 * should have some core business logic which needs different product to be
 * created.
 *
 * */
public abstract class Dialog {

    public void renderWindow(){
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclass will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
