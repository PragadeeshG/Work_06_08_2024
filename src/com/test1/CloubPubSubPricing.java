package com.test1;

public class CloubPubSubPricing {
	private Integer pubSubCode;
	private Integer pricingConsoleCode;
	private String scalableCharacter;
	private String cloudScheduler;
	private String consoleTools;
	private String noOfTopics;
	private boolean apiGatewayEnabled;
	private String totalLambdas;
	private String noOfSubscribers;
	private String memory;
	private String cpus;
	private String gpus;
	private String cronJobOption;
	private String globalInfraSupport;

	public CloubPubSubPricing() {

	}

	public CloubPubSubPricing(Integer pubSubCode, Integer pricingConsoleCode, String scalableCharacter,
			String cloudScheduler, String consoleTools, String noOfTopics, boolean apiGatewayEnabled,
			String totalLambdas, String noOfSubscribers, String memory, String cpus, String gpus, String cronJobOption,
			String globalInfraSupport) {
		super();
		this.pubSubCode = pubSubCode;
		this.pricingConsoleCode = pricingConsoleCode;
		this.scalableCharacter = scalableCharacter;
		this.cloudScheduler = cloudScheduler;
		this.consoleTools = consoleTools;
		this.noOfTopics = noOfTopics;
		this.apiGatewayEnabled = apiGatewayEnabled;
		this.totalLambdas = totalLambdas;
		this.noOfSubscribers = noOfSubscribers;
		this.memory = memory;
		this.cpus = cpus;
		this.gpus = gpus;
		this.cronJobOption = cronJobOption;
		this.globalInfraSupport = globalInfraSupport;
	}

	public Integer getPubSubCode() {
		return pubSubCode;
	}

	public void setPubSubCode(Integer pubSubCode) {
		this.pubSubCode = pubSubCode;
	}

	public Integer getPricingConsoleCode() {
		return pricingConsoleCode;
	}

	public void setPricingConsoleCode(Integer pricingConsoleCode) {
		this.pricingConsoleCode = pricingConsoleCode;
	}

	public String getScalableCharacter() {
		return scalableCharacter;
	}

	public void setScalableCharacter(String scalableCharacter) {
		this.scalableCharacter = scalableCharacter;
	}

	public String getCloudScheduler() {
		return cloudScheduler;
	}

	public void setCloudScheduler(String cloudScheduler) {
		this.cloudScheduler = cloudScheduler;
	}

	public String getConsoleTools() {
		return consoleTools;
	}

	public void setConsoleTools(String consoleTools) {
		this.consoleTools = consoleTools;
	}

	public String getNoOfTopics() {
		return noOfTopics;
	}

	public void setNoOfTopics(String noOfTopics) {
		this.noOfTopics = noOfTopics;
	}

	public boolean isApiGatewayEnabled() {
		return apiGatewayEnabled;
	}

	public void setApiGatewayEnabled(boolean apiGatewayEnabled) {
		this.apiGatewayEnabled = apiGatewayEnabled;
	}

	public String getTotalLambdas() {
		return totalLambdas;
	}

	public void setTotalLambdas(String totalLambdas) {
		this.totalLambdas = totalLambdas;
	}

	public String getNoOfSubscribers() {
		return noOfSubscribers;
	}

	public void setNoOfSubscribers(String noOfSubscribers) {
		this.noOfSubscribers = noOfSubscribers;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getCpus() {
		return cpus;
	}

	public void setCpus(String cpus) {
		this.cpus = cpus;
	}

	public String getGpus() {
		return gpus;
	}

	public void setGpus(String gpus) {
		this.gpus = gpus;
	}

	public String getCronJobOption() {
		return cronJobOption;
	}

	public void setCronJobOption(String cronJobOption) {
		this.cronJobOption = cronJobOption;
	}

	public String getGlobalInfraSupport() {
		return globalInfraSupport;
	}

	public void setGlobalInfraSupport(String globalInfraSupport) {
		this.globalInfraSupport = globalInfraSupport;
	}

}
