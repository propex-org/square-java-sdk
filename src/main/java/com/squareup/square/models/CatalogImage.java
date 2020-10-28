
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;


/**
 * This is a model class for CatalogImage type.
 */
public class CatalogImage {
    private final String name;
    private final String url;
    private final String caption;

    /**
     * Initialization constructor.
     * @param name String value for name.
     * @param url String value for url.
     * @param caption String value for caption.
     */
    @JsonCreator
    public CatalogImage(
            @JsonProperty("name") String name,
            @JsonProperty("url") String url,
            @JsonProperty("caption") String caption) {
        this.name = name;
        this.url = url;
        this.caption = caption;
    }

    /**
     * Getter for Name.
     * The internal name to identify this image in calls to the Square API.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    /**
     * Getter for Url.
     * The URL of this image, generated by Square after an image is uploaded using the
     * [CreateCatalogImage](#endpoint-Catalog-CreateCatalogImage) endpoint.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return this.url;
    }

    /**
     * Getter for Caption.
     * A caption that describes what is shown in the image. Displayed in the Square Online Store.
     * This is a searchable attribute for use in applicable query filters.
     * @return Returns the String
     */
    @JsonGetter("caption")
    public String getCaption() {
        return this.caption;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(name, url, caption);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatalogImage)) {
            return false;
        }
        CatalogImage other = (CatalogImage) obj;
        return Objects.equals(name, other.name)
            && Objects.equals(url, other.url)
            && Objects.equals(caption, other.caption);
    }

    /**
     * Builds a new {@link CatalogImage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CatalogImage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .name(getName())
            .url(getUrl())
            .caption(getCaption());
        return builder;
    }

    /**
     * Class to build instances of {@link CatalogImage}.
     */
    public static class Builder {
        private String name;
        private String url;
        private String caption;



        /**
         * Setter for name.
         * @param name String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for url.
         * @param url String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for caption.
         * @param caption String value for caption.
         * @return Builder
         */
        public Builder caption(String caption) {
            this.caption = caption;
            return this;
        }

        /**
         * Builds a new {@link CatalogImage} object using the set fields.
         * @return {@link CatalogImage}
         */
        public CatalogImage build() {
            return new CatalogImage(name,
                url,
                caption);
        }
    }
}
