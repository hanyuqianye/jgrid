
package com.amazon.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AWSECommerceServicePortType", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AWSECommerceServicePortType {


    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.HelpResponse
     */
    @WebMethod(operationName = "Help", action = "http://soap.amazon.com/Help")
    @WebResult(name = "HelpResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public HelpResponse help(
        @WebParam(name = "Help", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        Help body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.ItemSearchResponse
     */
    @WebMethod(operationName = "ItemSearch", action = "http://soap.amazon.com/ItemSearch")
    @WebResult(name = "ItemSearchResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public ItemSearchResponse itemSearch(
        @WebParam(name = "ItemSearch", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        ItemSearch body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.ItemLookupResponse
     */
    @WebMethod(operationName = "ItemLookup", action = "http://soap.amazon.com/ItemLookup")
    @WebResult(name = "ItemLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public ItemLookupResponse itemLookup(
        @WebParam(name = "ItemLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        ItemLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.BrowseNodeLookupResponse
     */
    @WebMethod(operationName = "BrowseNodeLookup", action = "http://soap.amazon.com/BrowseNodeLookup")
    @WebResult(name = "BrowseNodeLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public BrowseNodeLookupResponse browseNodeLookup(
        @WebParam(name = "BrowseNodeLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        BrowseNodeLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.ListSearchResponse
     */
    @WebMethod(operationName = "ListSearch", action = "http://soap.amazon.com/ListSearch")
    @WebResult(name = "ListSearchResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public ListSearchResponse listSearch(
        @WebParam(name = "ListSearch", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        ListSearch body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.ListLookupResponse
     */
    @WebMethod(operationName = "ListLookup", action = "http://soap.amazon.com/ListLookup")
    @WebResult(name = "ListLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public ListLookupResponse listLookup(
        @WebParam(name = "ListLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        ListLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.CustomerContentSearchResponse
     */
    @WebMethod(operationName = "CustomerContentSearch", action = "http://soap.amazon.com/CustomerContentSearch")
    @WebResult(name = "CustomerContentSearchResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public CustomerContentSearchResponse customerContentSearch(
        @WebParam(name = "CustomerContentSearch", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        CustomerContentSearch body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.CustomerContentLookupResponse
     */
    @WebMethod(operationName = "CustomerContentLookup", action = "http://soap.amazon.com/CustomerContentLookup")
    @WebResult(name = "CustomerContentLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public CustomerContentLookupResponse customerContentLookup(
        @WebParam(name = "CustomerContentLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        CustomerContentLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.SimilarityLookupResponse
     */
    @WebMethod(operationName = "SimilarityLookup", action = "http://soap.amazon.com/SimilarityLookup")
    @WebResult(name = "SimilarityLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public SimilarityLookupResponse similarityLookup(
        @WebParam(name = "SimilarityLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        SimilarityLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.SellerLookupResponse
     */
    @WebMethod(operationName = "SellerLookup", action = "http://soap.amazon.com/SellerLookup")
    @WebResult(name = "SellerLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public SellerLookupResponse sellerLookup(
        @WebParam(name = "SellerLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        SellerLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.CartGetResponse
     */
    @WebMethod(operationName = "CartGet", action = "http://soap.amazon.com/CartGet")
    @WebResult(name = "CartGetResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public CartGetResponse cartGet(
        @WebParam(name = "CartGet", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        CartGet body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.CartCreateResponse
     */
    @WebMethod(operationName = "CartCreate", action = "http://soap.amazon.com/CartCreate")
    @WebResult(name = "CartCreateResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public CartCreateResponse cartCreate(
        @WebParam(name = "CartCreate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        CartCreate body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.CartAddResponse
     */
    @WebMethod(operationName = "CartAdd", action = "http://soap.amazon.com/CartAdd")
    @WebResult(name = "CartAddResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public CartAddResponse cartAdd(
        @WebParam(name = "CartAdd", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        CartAdd body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.CartModifyResponse
     */
    @WebMethod(operationName = "CartModify", action = "http://soap.amazon.com/CartModify")
    @WebResult(name = "CartModifyResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public CartModifyResponse cartModify(
        @WebParam(name = "CartModify", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        CartModify body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.CartClearResponse
     */
    @WebMethod(operationName = "CartClear", action = "http://soap.amazon.com/CartClear")
    @WebResult(name = "CartClearResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public CartClearResponse cartClear(
        @WebParam(name = "CartClear", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        CartClear body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.TransactionLookupResponse
     */
    @WebMethod(operationName = "TransactionLookup", action = "http://soap.amazon.com/TransactionLookup")
    @WebResult(name = "TransactionLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public TransactionLookupResponse transactionLookup(
        @WebParam(name = "TransactionLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        TransactionLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.SellerListingSearchResponse
     */
    @WebMethod(operationName = "SellerListingSearch", action = "http://soap.amazon.com/SellerListingSearch")
    @WebResult(name = "SellerListingSearchResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public SellerListingSearchResponse sellerListingSearch(
        @WebParam(name = "SellerListingSearch", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        SellerListingSearch body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.SellerListingLookupResponse
     */
    @WebMethod(operationName = "SellerListingLookup", action = "http://soap.amazon.com/SellerListingLookup")
    @WebResult(name = "SellerListingLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public SellerListingLookupResponse sellerListingLookup(
        @WebParam(name = "SellerListingLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        SellerListingLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.TagLookupResponse
     */
    @WebMethod(operationName = "TagLookup", action = "http://soap.amazon.com/TagLookup")
    @WebResult(name = "TagLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public TagLookupResponse tagLookup(
        @WebParam(name = "TagLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        TagLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.VehicleSearchResponse
     */
    @WebMethod(operationName = "VehicleSearch", action = "http://soap.amazon.com/VehicleSearch")
    @WebResult(name = "VehicleSearchResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public VehicleSearchResponse vehicleSearch(
        @WebParam(name = "VehicleSearch", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        VehicleSearch body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.VehiclePartSearchResponse
     */
    @WebMethod(operationName = "VehiclePartSearch", action = "http://soap.amazon.com/VehiclePartSearch")
    @WebResult(name = "VehiclePartSearchResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public VehiclePartSearchResponse vehiclePartSearch(
        @WebParam(name = "VehiclePartSearch", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        VehiclePartSearch body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.VehiclePartLookupResponse
     */
    @WebMethod(operationName = "VehiclePartLookup", action = "http://soap.amazon.com/VehiclePartLookup")
    @WebResult(name = "VehiclePartLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public VehiclePartLookupResponse vehiclePartLookup(
        @WebParam(name = "VehiclePartLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        VehiclePartLookup body);

    /**
     * 
     * @param body
     * @return
     *     returns com.amazon.webservices.awsecommerceservice._2011_04_01.MultiOperationResponse
     */
    @WebMethod(operationName = "MultiOperation", action = "http://soap.amazon.com/MultiOperation")
    @WebResult(name = "MultiOperationResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
    public MultiOperationResponse multiOperation(
        @WebParam(name = "MultiOperation", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", partName = "body")
        MultiOperation body);

}