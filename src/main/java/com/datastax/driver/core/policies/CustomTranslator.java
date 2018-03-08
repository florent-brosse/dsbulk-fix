package com.datastax.driver.core.policies;

import com.datastax.driver.core.Cluster;
import java.net.InetSocketAddress;

public class CustomTranslator implements AddressTranslator {
    public CustomTranslator() {
    }

    public void init(Cluster cluster) {
    }

    public InetSocketAddress translate(InetSocketAddress address) {
       return new InetSocketAddress(address.getAddress(),1521);
    }

    public void close() {
    }
}
