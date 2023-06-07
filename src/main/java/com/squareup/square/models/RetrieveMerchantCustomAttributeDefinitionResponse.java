
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.squareup.square.http.client.HttpContext;
import java.util.List;
import java.util.Objects;

/**
 * This is a model class for RetrieveMerchantCustomAttributeDefinitionResponse type.
 */
public class RetrieveMerchantCustomAttributeDefinitionResponse {
    private HttpContext httpContext;
    private final CustomAttributeDefinition customAttributeDefinition;
    private final List<Error> errors;

    /**
     * Initialization constructor.
     * @param  customAttributeDefinition  CustomAttributeDefinition value for
     *         customAttributeDefinition.
     * @param  errors  List of Error value for errors.
     */
    @JsonCreator
    public RetrieveMerchantCustomAttributeDefinitionResponse(
            @JsonProperty("custom_attribute_definition") CustomAttributeDefinition customAttributeDefinition,
            @JsonProperty("errors") List<Error> errors) {
        this.customAttributeDefinition = customAttributeDefinition;
        this.errors = errors;
    }

    @JsonIgnore
    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for CustomAttributeDefinition.
     * Represents a definition for custom attribute values. A custom attribute definition specifies
     * the key, visibility, schema, and other properties for a custom attribute.
     * @return Returns the CustomAttributeDefinition
     */
    @JsonGetter("custom_attribute_definition")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomAttributeDefinition getCustomAttributeDefinition() {
        return customAttributeDefinition;
    }

    /**
     * Getter for Errors.
     * Any errors that occurred during the request.
     * @return Returns the List of Error
     */
    @JsonGetter("errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Error> getErrors() {
        return errors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customAttributeDefinition, errors);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetrieveMerchantCustomAttributeDefinitionResponse)) {
            return false;
        }
        RetrieveMerchantCustomAttributeDefinitionResponse other =
                (RetrieveMerchantCustomAttributeDefinitionResponse) obj;
        return Objects.equals(customAttributeDefinition, other.customAttributeDefinition)
            && Objects.equals(errors, other.errors);
    }

    /**
     * Converts this RetrieveMerchantCustomAttributeDefinitionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RetrieveMerchantCustomAttributeDefinitionResponse [" + "customAttributeDefinition="
                + customAttributeDefinition + ", errors=" + errors + "]";
    }

    /**
     * Builds a new {@link RetrieveMerchantCustomAttributeDefinitionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RetrieveMerchantCustomAttributeDefinitionResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customAttributeDefinition(getCustomAttributeDefinition())
                .errors(getErrors());
        return builder;
    }

    /**
     * Class to build instances of {@link RetrieveMerchantCustomAttributeDefinitionResponse}.
     */
    public static class Builder {
        private HttpContext httpContext;
        private CustomAttributeDefinition customAttributeDefinition;
        private List<Error> errors;



        /**
         * Setter for httpContext.
         * @param  httpContext  HttpContext value for httpContext.
         * @return Builder
         */
        public Builder httpContext(HttpContext httpContext) {
            this.httpContext = httpContext;
            return this;
        }

        /**
         * Setter for customAttributeDefinition.
         * @param  customAttributeDefinition  CustomAttributeDefinition value for
         *         customAttributeDefinition.
         * @return Builder
         */
        public Builder customAttributeDefinition(
                CustomAttributeDefinition customAttributeDefinition) {
            this.customAttributeDefinition = customAttributeDefinition;
            return this;
        }

        /**
         * Setter for errors.
         * @param  errors  List of Error value for errors.
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link RetrieveMerchantCustomAttributeDefinitionResponse} object using the
         * set fields.
         * @return {@link RetrieveMerchantCustomAttributeDefinitionResponse}
         */
        public RetrieveMerchantCustomAttributeDefinitionResponse build() {
            RetrieveMerchantCustomAttributeDefinitionResponse model =
                    new RetrieveMerchantCustomAttributeDefinitionResponse(customAttributeDefinition,
                            errors);
            model.httpContext = httpContext;
            return model;
        }
    }
}