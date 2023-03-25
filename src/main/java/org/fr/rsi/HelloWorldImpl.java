package org.fr.rsi;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "org.fr.rsi.HelloWorld",
        name = "HelloWorldService", portName = "7070",
        serviceName = "xdd", targetNamespace = "http://org.fr.rsi")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Witaj świecie JAX-WS: " + name;
    }

    @Override
    public String getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("komputer", "urzadzenie do pracy", 2500));
        products.add(new Product("rower", "pojazd na dwoch kolach", 1300));
        products.add(new Product("mikrofalowka", "urzadzenie do podgrzewania jedzenia", 10000));

        String productsString = "";
        for (int i = 0; i < products.size(); i++) {
            productsString = productsString + "Produkt: " + products.get(i).nazwa + " Opis: " + products.get(i).opis
                    +" Cena: " + products.get(i).cena + " ";
        }

        return productsString;
    }
}
