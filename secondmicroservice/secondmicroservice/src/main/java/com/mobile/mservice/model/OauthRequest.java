/*
 * MobileAccess v1.3.0
 *  ##### **NaaS API Version:** 2.4.0 ##### **mobileAccess service version:** 1.2.3 ## OVERVIEW TMF 640 - Activation and Configuration API. This is a strategic mobileAccess service aiming to provide network capabilities to products.   **Note: Enum values are case sensitive**
 *
 * OpenAPI spec version: 2.4.5
 * Contact: D1701045@team.telstra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.mobile.mservice.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OauthRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-12T04:30:03.026Z[GMT]")
public class OauthRequest {
  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("client_secret")
  private String clientSecret = null;

  @SerializedName("grant_type")
  private String grantType = "client_credentials";

  public OauthRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Also known as CONSUMER_KEY. The client identifier issued to the  client during the registration process. 
   * @return clientId
  **/
  @Schema(required = true, description = "Also known as CONSUMER_KEY. The client identifier issued to the  client during the registration process. ")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OauthRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Also kown as CONSUMER_SECRET  or CLIENT_SECRET. The client secret issued to the client during the registration process 
   * @return clientSecret
  **/
  @Schema(required = true, description = "Also kown as CONSUMER_SECRET  or CLIENT_SECRET. The client secret issued to the client during the registration process ")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OauthRequest grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

   /**
   * Value MUST be set to \&quot;client_credentials\&quot; for fetching \&quot;  token. The same field will be later used for Refresh token 
   * @return grantType
  **/
  @Schema(example = "client_credentials", required = true, description = "Value MUST be set to \"client_credentials\" for fetching \"  token. The same field will be later used for Refresh token ")
  public String getGrantType() {
    return grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthRequest oauthRequest = (OauthRequest) o;
    return Objects.equals(this.clientId, oauthRequest.clientId) &&
        Objects.equals(this.clientSecret, oauthRequest.clientSecret) &&
        Objects.equals(this.grantType, oauthRequest.grantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, grantType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthRequest {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}