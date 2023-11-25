package factorymethod.logistics;

import factorymethod.transport.Transport;

public abstract class Logistics implements Transport {

    public abstract Transport createTransport();
}
