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

package com.activeservice.model;

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
 * SupportingServiceRefRequest is used provide reference to an existing Supporting Service in a POST request.
 */
@Schema(description = "SupportingServiceRefRequest is used provide reference to an existing Supporting Service in a POST request.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-12T04:30:03.026Z[GMT]")
public class SupportingServiceRefRequest {
  @SerializedName("id")
  private String id = null;

  @SerializedName("href")
  private String href = null;

  public SupportingServiceRefRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID. Unique Id of the Service Instance.
   * @return id
  **/
  @Schema(required = true, description = "UUID. Unique Id of the Service Instance.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SupportingServiceRefRequest href(String href) {
    this.href = href;
    return this;
  }

   /**
   * URI Reference to the Service (useful for delete or modify command).
   * @return href
  **/
  @Schema(required = true, description = "URI Reference to the Service (useful for delete or modify command).")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportingServiceRefRequest supportingServiceRefRequest = (SupportingServiceRefRequest) o;
    return Objects.equals(this.id, supportingServiceRefRequest.id) &&
        Objects.equals(this.href, supportingServiceRefRequest.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportingServiceRefRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
