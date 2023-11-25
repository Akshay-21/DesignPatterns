package factorymethod.logistics;

import factorymethod.transport.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new SeaLogistics();
    }

    @Override
    public void deliver() {

    }
}
