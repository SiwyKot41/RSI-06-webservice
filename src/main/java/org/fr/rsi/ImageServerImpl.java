package org.fr.rsi;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.MTOM;
import javax.xml.ws.soap.SOAPBinding;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@MTOM
@WebService
@BindingType(value = SOAPBinding.SOAP11HTTP_MTOM_BINDING)
public class ImageServerImpl  {

    @WebMethod
    public String echo(String text) {
        return "Hallo" + text;
    }

    public Image downloadImage(String name) {
        try {
            File image = new File("/home/philip/IdeaProjects/RSI-06-webservice" + name);
            return ImageIO.read(image);

        } catch (IOException e) {
            e.printStackTrace();
            return null;

        }

    }
}
