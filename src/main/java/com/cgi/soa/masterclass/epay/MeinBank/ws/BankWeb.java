
package com.cgi.soa.masterclass.epay.MeinBank.ws;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankWeb", targetNamespace = "http://ws.samplebank.masterclass.soa.cgi.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankWeb {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "transfer", targetNamespace = "http://ws.samplebank.masterclass.soa.cgi.com/", className = "com.cgi.soa.masterclass.epay.MeinBank.ws.Transfer")
    @ResponseWrapper(localName = "transferResponse", targetNamespace = "http://ws.samplebank.masterclass.soa.cgi.com/", className = "com.cgi.soa.masterclass.epay.MeinBank.ws.TransferResponse")
    @Action(input = "http://ws.samplebank.masterclass.soa.cgi.com/BankWeb/transferRequest", output = "http://ws.samplebank.masterclass.soa.cgi.com/BankWeb/transferResponse")
    public void transfer(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        BigDecimal arg3);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isBalanceCovered", targetNamespace = "http://ws.samplebank.masterclass.soa.cgi.com/", className = "com.cgi.soa.masterclass.epay.MeinBank.ws.IsBalanceCovered")
    @ResponseWrapper(localName = "isBalanceCoveredResponse", targetNamespace = "http://ws.samplebank.masterclass.soa.cgi.com/", className = "com.cgi.soa.masterclass.epay.MeinBank.ws.IsBalanceCoveredResponse")
    @Action(input = "http://ws.samplebank.masterclass.soa.cgi.com/BankWeb/isBalanceCoveredRequest", output = "http://ws.samplebank.masterclass.soa.cgi.com/BankWeb/isBalanceCoveredResponse")
    public boolean isBalanceCovered(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        BigDecimal arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isAccountExist", targetNamespace = "http://ws.samplebank.masterclass.soa.cgi.com/", className = "com.cgi.soa.masterclass.epay.MeinBank.ws.IsAccountExist")
    @ResponseWrapper(localName = "isAccountExistResponse", targetNamespace = "http://ws.samplebank.masterclass.soa.cgi.com/", className = "com.cgi.soa.masterclass.epay.MeinBank.ws.IsAccountExistResponse")
    @Action(input = "http://ws.samplebank.masterclass.soa.cgi.com/BankWeb/isAccountExistRequest", output = "http://ws.samplebank.masterclass.soa.cgi.com/BankWeb/isAccountExistResponse")
    public boolean isAccountExist(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isAccountOwner", targetNamespace = "http://ws.samplebank.masterclass.soa.cgi.com/", className = "com.cgi.soa.masterclass.epay.MeinBank.ws.IsAccountOwner")
    @ResponseWrapper(localName = "isAccountOwnerResponse", targetNamespace = "http://ws.samplebank.masterclass.soa.cgi.com/", className = "com.cgi.soa.masterclass.epay.MeinBank.ws.IsAccountOwnerResponse")
    @Action(input = "http://ws.samplebank.masterclass.soa.cgi.com/BankWeb/isAccountOwnerRequest", output = "http://ws.samplebank.masterclass.soa.cgi.com/BankWeb/isAccountOwnerResponse")
    public boolean isAccountOwner(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

}
