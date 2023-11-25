package factorymethod.logistics;

import factorymethod.transport.Transport;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new RoadLogistics();
    }

    @Override
    public void deliver() {

    }
}
