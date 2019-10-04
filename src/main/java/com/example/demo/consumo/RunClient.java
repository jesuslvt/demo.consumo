package com.example.demo.consumo;


import com.example.demo.consumo.schemas.*;
import com.example.demo.consumo.schemas.Map;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.font.AttributeMap;

import java.util.*;

public class RunClient {



    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(context.getBeanDefinitionCount());
        ContractClient client = context.getBean(ContractClient.class);
        List<MapEntry> listData= new ArrayList<>();
        MapEntry mapEntry= new MapEntry();

        mapEntry.setKey("LasPartes");
        mapEntry.setValue("TELMEX");
        listData.add(mapEntry);

        MapEntry mapEntry1= new MapEntry();
        mapEntry1.setKey("TipoVenta");
        mapEntry1.setValue("9");
        listData.add(mapEntry1);

        MapEntry mapEntry2= new MapEntry();
        mapEntry2.setKey("NUI");
        mapEntry2.setValue("M89a2818b2b314111b8319794129f0a18");
        listData.add(mapEntry2);



        GetContractRequest request = new GetContractRequest();
       // request.getMap().getMapEntry().addAll(listData);

        ObjectFactory objectFactory =new ObjectFactory();

        GetContractRequest request2= objectFactory.createGetContractRequest();

        Map ma=objectFactory.createMap();ma.getMapEntry().addAll(listData);
        request.setMap(ma);

        HuellaYFirmaCliente nuellaYFirmaCliente= new HuellaYFirmaCliente();
        nuellaYFirmaCliente.setFirma("asdasdasdas");
        nuellaYFirmaCliente.setHuella("asdasdasdas");
        request.setHuellaYFirmaCliente(nuellaYFirmaCliente);
        System.out.println(request.toString());
        GetContractResponse resp = client.getContract(request);
        System.out.println("response: " + resp);
    }

}