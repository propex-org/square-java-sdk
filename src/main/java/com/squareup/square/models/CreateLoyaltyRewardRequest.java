
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;


/**
 * This is a model class for CreateLoyaltyRewardRequest type.
 */
public class CreateLoyaltyRewardRequest {
    private final LoyaltyReward reward;
    private final String idempotencyKey;

    /**
     * Initialization constructor.
     * @param reward LoyaltyReward value for reward.
     * @param idempotencyKey String value for idempotencyKey.
     */
    @JsonCreator
    public CreateLoyaltyRewardRequest(
            @JsonProperty("reward") LoyaltyReward reward,
            @JsonProperty("idempotency_key") String idempotencyKey) {
        this.reward = reward;
        this.idempotencyKey = idempotencyKey;
    }

    /**
     * Getter for Reward.
     * @return Returns the LoyaltyReward
     */
    @JsonGetter("reward")
    public LoyaltyReward getReward() {
        return this.reward;
    }

    /**
     * Getter for IdempotencyKey.
     * A unique string that identifies this `CreateLoyaltyReward` request. Keys can be any valid
     * string, but must be unique for every request.
     * @return Returns the String
     */
    @JsonGetter("idempotency_key")
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(reward, idempotencyKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateLoyaltyRewardRequest)) {
            return false;
        }
        CreateLoyaltyRewardRequest other = (CreateLoyaltyRewardRequest) obj;
        return Objects.equals(reward, other.reward)
            && Objects.equals(idempotencyKey, other.idempotencyKey);
    }

    /**
     * Builds a new {@link CreateLoyaltyRewardRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateLoyaltyRewardRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(reward,
            idempotencyKey);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateLoyaltyRewardRequest}.
     */
    public static class Builder {
        private LoyaltyReward reward;
        private String idempotencyKey;

        /**
         * Initialization constructor.
         * @param reward LoyaltyReward value for reward.
         * @param idempotencyKey String value for idempotencyKey.
         */
        public Builder(LoyaltyReward reward,
                String idempotencyKey) {
            this.reward = reward;
            this.idempotencyKey = idempotencyKey;
        }

        /**
         * Setter for reward.
         * @param reward LoyaltyReward value for reward.
         * @return Builder
         */
        public Builder reward(LoyaltyReward reward) {
            this.reward = reward;
            return this;
        }

        /**
         * Setter for idempotencyKey.
         * @param idempotencyKey String value for idempotencyKey.
         * @return Builder
         */
        public Builder idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        /**
         * Builds a new {@link CreateLoyaltyRewardRequest} object using the set fields.
         * @return {@link CreateLoyaltyRewardRequest}
         */
        public CreateLoyaltyRewardRequest build() {
            return new CreateLoyaltyRewardRequest(reward,
                idempotencyKey);
        }
    }
}
