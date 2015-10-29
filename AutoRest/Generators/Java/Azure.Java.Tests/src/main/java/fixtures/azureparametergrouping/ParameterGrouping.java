/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping;

import com.microsoft.rest.CloudError;
import com.microsoft.rest.BaseResource;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.http.POST;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.Query;
import retrofit.http.Path;

/**
 * An instance of this class provides access to all the operations defined
 * in ParameterGrouping.
 */
public interface ParameterGrouping {
    /**
     * The interface defining all the services for ParameterGrouping to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ParameterGroupingService {
        @POST("/parameterGrouping/postRequired/{path}")
        Call<ResponseBody> postRequired(@Path("path") String path, @Body int body, @Header("customHeader") String customHeader, @Query("query") Integer query, @Header("accept-language") String acceptLanguage);

        @POST("/parameterGrouping/postOptional")
        Call<ResponseBody> postOptional(@Header("customHeader") String customHeader, @Query("query") Integer query, @Header("accept-language") String acceptLanguage);

        @POST("/parameterGrouping/postMultipleParameterGroups")
        Call<ResponseBody> postMultipleParameterGroups(@Header("header-one") String headerOne, @Query("query-one") Integer queryOne, @Header("header-two") String headerTwo, @Query("query-two") Integer queryTwo, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Post a bunch of required parameters grouped
     *
     * @param path Path parameter
     * @param body the int value
     * @param customHeader the String value
     * @param query Query parameter with default
     * @throws ServiceException exception thrown from REST call
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postRequired(String path, int body, String customHeader, Integer query) throws ServiceException;

    /**
     * Post a bunch of required parameters grouped
     *
     * @param path Path parameter
     * @param body the int value
     * @param customHeader the String value
     * @param query Query parameter with default
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postRequiredAsync(String path, int body, String customHeader, Integer query, final ServiceCallback<Void> serviceCallback);

    /**
     * Post a bunch of optional parameters grouped
     *
     * @param customHeader the String value
     * @param query Query parameter with default
     * @throws ServiceException exception thrown from REST call
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postOptional(String customHeader, Integer query) throws ServiceException;

    /**
     * Post a bunch of optional parameters grouped
     *
     * @param customHeader the String value
     * @param query Query parameter with default
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postOptionalAsync(String customHeader, Integer query, final ServiceCallback<Void> serviceCallback);

    /**
     * Post parameters from multiple different parameter groups
     *
     * @param headerOne the String value
     * @param queryOne Query parameter with default
     * @param headerTwo the String value
     * @param queryTwo Query parameter with default
     * @throws ServiceException exception thrown from REST call
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postMultipleParameterGroups(String headerOne, Integer queryOne, String headerTwo, Integer queryTwo) throws ServiceException;

    /**
     * Post parameters from multiple different parameter groups
     *
     * @param headerOne the String value
     * @param queryOne Query parameter with default
     * @param headerTwo the String value
     * @param queryTwo Query parameter with default
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postMultipleParameterGroupsAsync(String headerOne, Integer queryOne, String headerTwo, Integer queryTwo, final ServiceCallback<Void> serviceCallback);

}
