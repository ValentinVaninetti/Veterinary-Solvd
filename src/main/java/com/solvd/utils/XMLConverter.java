package com.solvd.utils;

import com.solvd.pojos.Client;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;


import java.io.File;


public class XMLConverter {
    private Client client;
    private String xmlPath = Constants.XML_PATH;

    public XMLConverter() {

    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void marshall(Client client) throws JAXBException {
        JAXBContext contextClient = JAXBContext.newInstance(Client.class);
        Marshaller marshallerClient = contextClient.createMarshaller();
        marshallerClient.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshallerClient.marshal(client, new File(xmlPath));
    }

    public void unMarshall() throws JAXBException {
        JAXBContext contextClient = JAXBContext.newInstance(Client.class);
        Client client = (Client) contextClient.createUnmarshaller().unmarshal(new File(xmlPath));
        System.out.println(client);
    }
}
