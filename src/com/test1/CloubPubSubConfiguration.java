package com.test1;

public class CloubPubSubConfiguration {
	private Integer configurationId;
	private String configurationOwner;
	private boolean activeCloubPubSub;
	private Integer configurationTypeID;
	private String configurationType;
	private String configurationStatus;
	private Integer configurationDescription;
	private Integer relativeDependencies;
	private String parentFunction;
	private Integer flushInterval;
	private String buildConditions;
	private String status;
	private String obsoleteConfigRemoval;

	public CloubPubSubConfiguration() {

	}

	public CloubPubSubConfiguration(Integer configurationId, String configurationOwner, boolean activeCloubPubSub,
			Integer configurationTypeID, String configurationType, String configurationStatus,
			Integer configurationDescription, Integer relativeDependencies, String parentFunction,
			Integer flushInterval, String buildConditions, String status, String obsoleteConfigRemoval) {
		super();
		this.configurationId = configurationId;
		this.configurationOwner = configurationOwner;
		this.activeCloubPubSub = activeCloubPubSub;
		this.configurationTypeID = configurationTypeID;
		this.configurationType = configurationType;
		this.configurationStatus = configurationStatus;
		this.configurationDescription = configurationDescription;
		this.relativeDependencies = relativeDependencies;
		this.parentFunction = parentFunction;
		this.flushInterval = flushInterval;
		this.buildConditions = buildConditions;
		this.status = status;
		this.obsoleteConfigRemoval = obsoleteConfigRemoval;
	}

	public Integer getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(Integer configurationId) {
		this.configurationId = configurationId;
	}

	public String getConfigurationOwner() {
		return configurationOwner;
	}

	public void setConfigurationOwner(String configurationOwner) {
		this.configurationOwner = configurationOwner;
	}

	public boolean isActiveCloubPubSub() {
		return activeCloubPubSub;
	}

	public void setActiveCloubPubSub(boolean activeCloubPubSub) {
		this.activeCloubPubSub = activeCloubPubSub;
	}

	public Integer getConfigurationTypeID() {
		return configurationTypeID;
	}

	public void setConfigurationTypeID(Integer configurationTypeID) {
		this.configurationTypeID = configurationTypeID;
	}

	public String getConfigurationType() {
		return configurationType;
	}

	public void setConfigurationType(String configurationType) {
		this.configurationType = configurationType;
	}

	public String getConfigurationStatus() {
		return configurationStatus;
	}

	public void setConfigurationStatus(String configurationStatus) {
		this.configurationStatus = configurationStatus;
	}

	public Integer getConfigurationDescription() {
		return configurationDescription;
	}

	public void setConfigurationDescription(Integer configurationDescription) {
		this.configurationDescription = configurationDescription;
	}

	public Integer getRelativeDependencies() {
		return relativeDependencies;
	}

	public void setRelativeDependencies(Integer relativeDependencies) {
		this.relativeDependencies = relativeDependencies;
	}

	public String getParentFunction() {
		return parentFunction;
	}

	public void setParentFunction(String parentFunction) {
		this.parentFunction = parentFunction;
	}

	public Integer getFlushInterval() {
		return flushInterval;
	}

	public void setFlushInterval(Integer flushInterval) {
		this.flushInterval = flushInterval;
	}

	public String getBuildConditions() {
		return buildConditions;
	}

	public void setBuildConditions(String buildConditions) {
		this.buildConditions = buildConditions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getObsoleteConfigRemoval() {
		return obsoleteConfigRemoval;
	}

	public void setObsoleteConfigRemoval(String obsoleteConfigRemoval) {
		this.obsoleteConfigRemoval = obsoleteConfigRemoval;
	}

}
