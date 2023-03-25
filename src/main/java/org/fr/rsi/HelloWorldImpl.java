package org.fr.rsi;

import javax.jws.WebService;
@WebService(endpointInterface = "org.fr.rsi.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Witaj świecie JAX-WS: " + name;
    }
}
