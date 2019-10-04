package com.example.demo.consumo;

import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;


@Configuration
public class Config {
   /* @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this is the package name specified in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.example.demo.consumo.schemas");
        return marshaller;
    }*/

  /*  @Bean
    public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
        SOAPConnector client = new SOAPConnector();
        client.setDefaultUri("http://localhost:8090/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }*/


    @Bean
    public Wss4jSecurityInterceptor securityInterceptor(){
        Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
        wss4jSecurityInterceptor.setSecurementActions(WSHandlerConstants.USERNAME_TOKEN);
        //wss4jSecurityInterceptor.setSecurementActions("UsernameToken");
        wss4jSecurityInterceptor.setSecurementPasswordType(WSConstants.PW_TEXT);
        wss4jSecurityInterceptor.setSecurementUsername("admin");
        wss4jSecurityInterceptor.setSecurementPassword("secret");
        wss4jSecurityInterceptor.setSecurementUsernameTokenCreated(false);
        wss4jSecurityInterceptor.setSecurementUsernameTokenNonce(false);
        wss4jSecurityInterceptor.setSecurementMustUnderstand(false);
        //wss4jSecurityInterceptor.setsetSecurementUsernameTokenCreated(false);
        //;se.setSecurementUsernameTokenElements("Created");
        return wss4jSecurityInterceptor;
    }

    @Bean
    public Jaxb2Marshaller getMarshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.demo.consumo.schemas");
        return marshaller;
    }

    @Bean
    public ContractClient getContractClient(){
        ContractClient contractClient = new ContractClient();
        contractClient.setMarshaller(getMarshaller());
        contractClient.setUnmarshaller(getMarshaller());
        contractClient.setDefaultUri("http://localhost:8090/ws/contracts");
        ClientInterceptor[] interceptors = new ClientInterceptor[] {securityInterceptor()};
        contractClient.setInterceptors(interceptors);
        return contractClient;
    }

}