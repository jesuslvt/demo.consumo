package com.example.demo.consumo;

import com.example.demo.consumo.schemas.GetContractRequest;
import com.example.demo.consumo.schemas.GetContractResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class ContractClient extends WebServiceGatewaySupport {


    public GetContractResponse getContract(GetContractRequest request){
        return (GetContractResponse) getWebServiceTemplate().marshalSendAndReceive(request,new SoapActionCallback("http://localhost:8090/ws/getContractRequest"));
    }
}
