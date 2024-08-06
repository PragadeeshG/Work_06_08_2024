package com.test1;

public class FunctionAsServiceCloubPubSubData {
	private String pubSubCode;
	private String pubSubName;
	private String localFunction;
	private String tradeFunction;
	private String shortDescription;
	private String multiCloubPubSubOption;
	private String pubSubConditions;
	private Integer uploadVersion;
	private String launchFunction;
	private String manageFunction;
	private String status;

	public FunctionAsServiceCloubPubSubData() {

	}

	public FunctionAsServiceCloubPubSubData(String pubSubCode, String pubSubName, String localFunction,
			String tradeFunction, String shortDescription, String multiCloubPubSubOption, String pubSubConditions,
			Integer uploadVersion, String launchFunction, String manageFunction, String status) {
		super();
		this.pubSubCode = pubSubCode;
		this.pubSubName = pubSubName;
		this.localFunction = localFunction;
		this.tradeFunction = tradeFunction;
		this.shortDescription = shortDescription;
		this.multiCloubPubSubOption = multiCloubPubSubOption;
		this.pubSubConditions = pubSubConditions;
		this.uploadVersion = uploadVersion;
		this.launchFunction = launchFunction;
		this.manageFunction = manageFunction;
		this.status = status;
	}

	public String getPubSubCode() {
		return pubSubCode;
	}

	public void setPubSubCode(String pubSubCode) {
		this.pubSubCode = pubSubCode;
	}

	public String getPubSubName() {
		return pubSubName;
	}

	public void setPubSubName(String pubSubName) {
		this.pubSubName = pubSubName;
	}

	public String getLocalFunction() {
		return localFunction;
	}

	public void setLocalFunction(String localFunction) {
		this.localFunction = localFunction;
	}

	public String getTradeFunction() {
		return tradeFunction;
	}

	public void setTradeFunction(String tradeFunction) {
		this.tradeFunction = tradeFunction;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getMultiCloubPubSubOption() {
		return multiCloubPubSubOption;
	}

	public void setMultiCloubPubSubOption(String multiCloubPubSubOption) {
		this.multiCloubPubSubOption = multiCloubPubSubOption;
	}

	public String getPubSubConditions() {
		return pubSubConditions;
	}

	public void setPubSubConditions(String pubSubConditions) {
		this.pubSubConditions = pubSubConditions;
	}

	public Integer getUploadVersion() {
		return uploadVersion;
	}

	public void setUploadVersion(Integer uploadVersion) {
		this.uploadVersion = uploadVersion;
	}

	public String getLaunchFunction() {
		return launchFunction;
	}

	public void setLaunchFunction(String launchFunction) {
		this.launchFunction = launchFunction;
	}

	public String getManageFunction() {
		return manageFunction;
	}

	public void setManageFunction(String manageFunction) {
		this.manageFunction = manageFunction;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
