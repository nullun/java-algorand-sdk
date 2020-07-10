/*
 * Algod REST API.
 * API Endpoint for AlgoD Operations.
 *
 * OpenAPI spec version: 0.0.1
 * Contact: contact@algorand.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.algorand.algosdk.algod.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;

/**
 * Account Description
 */
@ApiModel(description = "Account Description")

public class Account {
  @SerializedName("address")
  private String address = null;

  @SerializedName("amount")
  private java.math.BigInteger amount = null;

  @SerializedName("amountwithoutpendingrewards")
  private java.math.BigInteger amountwithoutpendingrewards = null;

  @SerializedName("assets")
  private Map<java.math.BigInteger, AssetHolding> assets = null;

  @SerializedName("participation")
  private Participation participation = null;
    
  @SerializedName("pendingrewards")
  private java.math.BigInteger pendingrewards = null;

  @SerializedName("rewards")
  private java.math.BigInteger rewards = null;

  @SerializedName("round")
  private java.math.BigInteger round = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("thisassettotal")
  private Map<java.math.BigInteger, AssetParams> thisassettotal = null;

  public Account address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address indicates the account public key
   * @return address
  **/
  @ApiModelProperty(required = true, value = "Address indicates the account public key")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Account amount(java.math.BigInteger amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount indicates the total number of MicroAlgos in the account
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Amount indicates the total number of MicroAlgos in the account")
  public java.math.BigInteger getAmount() {
    return amount;
  }

  public void setAmount(java.math.BigInteger amount) {
    this.amount = amount;
  }

  public Account amountwithoutpendingrewards(java.math.BigInteger amountwithoutpendingrewards) {
    this.amountwithoutpendingrewards = amountwithoutpendingrewards;
    return this;
  }

   /**
   * AmountWithoutPendingRewards specifies the amount of MicroAlgos in the account, without the pending rewards.
   * @return amountwithoutpendingrewards
  **/
  @ApiModelProperty(required = true, value = "AmountWithoutPendingRewards specifies the amount of MicroAlgos in the account, without the pending rewards.")
  public java.math.BigInteger getAmountwithoutpendingrewards() {
    return amountwithoutpendingrewards;
  }

  public void setAmountwithoutpendingrewards(java.math.BigInteger amountwithoutpendingrewards) {
    this.amountwithoutpendingrewards = amountwithoutpendingrewards;
  }

  public Account assets(Map<java.math.BigInteger, AssetHolding> assets) {
    this.assets = assets;
    return this;
  }

   /**
   * Assets specifies the holdings of assets by this account, indexed by the asset ID.
   * @return assets
  **/
  @ApiModelProperty(value = "Assets specifies the holdings of assets by this account, indexed by the asset ID.")
  public AssetHolding getHolding(java.math.BigInteger assetIndex) {
    return assets.get(assetIndex);
  }

  public void setAssets(Map<java.math.BigInteger, AssetHolding> assets) {
    this.assets = assets;
  }

  public Account participation(Participation participation) {
    this.participation = participation;
    return this;
  }

   /**
   * Get participation
   * @return participation
  **/
  @ApiModelProperty(value = "")
  public Participation getParticipation() {
    return participation;
  }

  public void setParticipation(Participation participation) {
    this.participation = participation;
  }

  public Account pendingrewards(java.math.BigInteger pendingrewards) {
    this.pendingrewards = pendingrewards;
    return this;
  }

   /**
   * PendingRewards specifies the amount of MicroAlgos of pending rewards in this account.
   * @return pendingrewards
  **/
  @ApiModelProperty(required = true, value = "PendingRewards specifies the amount of MicroAlgos of pending rewards in this account.")
  public java.math.BigInteger getPendingrewards() {
    return pendingrewards;
  }

  public void setPendingrewards(java.math.BigInteger pendingrewards) {
    this.pendingrewards = pendingrewards;
  }

  public Account rewards(java.math.BigInteger rewards) {
    this.rewards = rewards;
    return this;
  }

   /**
   * Rewards indicates the total rewards of MicroAlgos the account has received, including pending rewards.
   * @return rewards
  **/
  @ApiModelProperty(required = true, value = "Rewards indicates the total rewards of MicroAlgos the account has received, including pending rewards.")
  public java.math.BigInteger getRewards() {
    return rewards;
  }

  public void setRewards(java.math.BigInteger rewards) {
    this.rewards = rewards;
  }

  public Account round(java.math.BigInteger round) {
    this.round = round;
    return this;
  }

   /**
   * Round indicates the round for which this information is relevant
   * @return round
  **/
  @ApiModelProperty(required = true, value = "Round indicates the round for which this information is relevant")
  public java.math.BigInteger getRound() {
    return round;
  }

  public void setRound(java.math.BigInteger round) {
    this.round = round;
  }

  public Account status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status indicates the delegation status of the account&#39;s MicroAlgos Offline - indicates that the associated account is delegated. Online  - indicates that the associated account used as part of the delegation pool. NotParticipating - indicates that the associated account is neither a delegator nor a delegate.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status indicates the delegation status of the account's MicroAlgos Offline - indicates that the associated account is delegated. Online  - indicates that the associated account used as part of the delegation pool. NotParticipating - indicates that the associated account is neither a delegator nor a delegate.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Account thisassettotal(Map<java.math.BigInteger, AssetParams> thisassettotal) {
    this.thisassettotal = thisassettotal;
    return this;
  }

   /**
   * AssetParams specifies the parameters of assets created by this account.
   * @return thisassettotal
  **/
  @ApiModelProperty(value = "AssetParams specifies the parameters of assets created by this account.")
  public Map<java.math.BigInteger, AssetParams>  getThisassettotal() {
    return thisassettotal;
  }

  public void setThisassettotal(Map<java.math.BigInteger, AssetParams> thisassettotal) {
    this.thisassettotal = thisassettotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Account account = (Account) o;
    return ObjectUtils.equals(this.address, account.address) &&
    ObjectUtils.equals(this.amount, account.amount) &&
    ObjectUtils.equals(this.amountwithoutpendingrewards, account.amountwithoutpendingrewards) &&
    ObjectUtils.equals(this.assets, account.assets) &&
    ObjectUtils.equals(this.participation, account.participation) &&
    ObjectUtils.equals(this.pendingrewards, account.pendingrewards) &&
    ObjectUtils.equals(this.rewards, account.rewards) &&
    ObjectUtils.equals(this.round, account.round) &&
    ObjectUtils.equals(this.status, account.status) &&
    ObjectUtils.equals(this.thisassettotal, account.thisassettotal);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(address, amount, amountwithoutpendingrewards, assets, participation, pendingrewards, rewards, round, status, thisassettotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountwithoutpendingrewards: ").append(toIndentedString(amountwithoutpendingrewards)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
    sb.append("    pendingrewards: ").append(toIndentedString(pendingrewards)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thisassettotal: ").append(toIndentedString(thisassettotal)).append("\n");
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
