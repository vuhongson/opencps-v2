/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.dossiermgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import org.opencps.dossiermgt.model.ServiceInfo;
import org.opencps.dossiermgt.model.ServiceInfoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ServiceInfo service. Represents a row in the &quot;opencps_serviceinfo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ServiceInfoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ServiceInfoImpl}.
 * </p>
 *
 * @author huymq
 * @see ServiceInfoImpl
 * @see ServiceInfo
 * @see ServiceInfoModel
 * @generated
 */
@ProviderType
public class ServiceInfoModelImpl extends BaseModelImpl<ServiceInfo>
	implements ServiceInfoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a service info model instance should use the {@link ServiceInfo} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_serviceinfo";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "serviceInfoId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "serviceCode", Types.VARCHAR },
			{ "serviceName", Types.VARCHAR },
			{ "processText", Types.VARCHAR },
			{ "methodText", Types.VARCHAR },
			{ "dossierText", Types.VARCHAR },
			{ "conditionText", Types.VARCHAR },
			{ "durationText", Types.VARCHAR },
			{ "applicantText", Types.VARCHAR },
			{ "resultText", Types.VARCHAR },
			{ "regularText", Types.VARCHAR },
			{ "feeText", Types.VARCHAR },
			{ "administrationCode", Types.VARCHAR },
			{ "administrationName", Types.VARCHAR },
			{ "administrationIndex", Types.VARCHAR },
			{ "domainCode", Types.VARCHAR },
			{ "domainName", Types.VARCHAR },
			{ "domainIndex", Types.VARCHAR },
			{ "maxLevel", Types.INTEGER },
			{ "public_", Types.BOOLEAN }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("serviceInfoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("serviceCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("serviceName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("processText", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("methodText", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dossierText", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("conditionText", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("durationText", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("applicantText", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("resultText", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("regularText", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("feeText", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("administrationCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("administrationName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("administrationIndex", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("domainCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("domainName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("domainIndex", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("maxLevel", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("public_", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE = "create table opencps_serviceinfo (uuid_ VARCHAR(75) null,serviceInfoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,serviceCode VARCHAR(75) null,serviceName VARCHAR(75) null,processText VARCHAR(75) null,methodText VARCHAR(75) null,dossierText VARCHAR(75) null,conditionText VARCHAR(75) null,durationText VARCHAR(75) null,applicantText VARCHAR(75) null,resultText VARCHAR(75) null,regularText VARCHAR(75) null,feeText VARCHAR(75) null,administrationCode VARCHAR(75) null,administrationName VARCHAR(75) null,administrationIndex VARCHAR(75) null,domainCode VARCHAR(75) null,domainName VARCHAR(75) null,domainIndex VARCHAR(75) null,maxLevel INTEGER,public_ BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table opencps_serviceinfo";
	public static final String ORDER_BY_JPQL = " ORDER BY serviceInfo.serviceInfoId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_serviceinfo.serviceInfoId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.dossiermgt.model.ServiceInfo"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.dossiermgt.model.ServiceInfo"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.dossiermgt.model.ServiceInfo"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long DOMAINCODE_COLUMN_BITMASK = 2L;
	public static final long GROUPID_COLUMN_BITMASK = 4L;
	public static final long SERVICECODE_COLUMN_BITMASK = 8L;
	public static final long UUID_COLUMN_BITMASK = 16L;
	public static final long SERVICEINFOID_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"lock.expiration.time.org.opencps.dossiermgt.model.ServiceInfo"));

	public ServiceInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _serviceInfoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setServiceInfoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _serviceInfoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceInfo.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("serviceInfoId", getServiceInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("serviceCode", getServiceCode());
		attributes.put("serviceName", getServiceName());
		attributes.put("processText", getProcessText());
		attributes.put("methodText", getMethodText());
		attributes.put("dossierText", getDossierText());
		attributes.put("conditionText", getConditionText());
		attributes.put("durationText", getDurationText());
		attributes.put("applicantText", getApplicantText());
		attributes.put("resultText", getResultText());
		attributes.put("regularText", getRegularText());
		attributes.put("feeText", getFeeText());
		attributes.put("administrationCode", getAdministrationCode());
		attributes.put("administrationName", getAdministrationName());
		attributes.put("administrationIndex", getAdministrationIndex());
		attributes.put("domainCode", getDomainCode());
		attributes.put("domainName", getDomainName());
		attributes.put("domainIndex", getDomainIndex());
		attributes.put("maxLevel", getMaxLevel());
		attributes.put("public_", getPublic_());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long serviceInfoId = (Long)attributes.get("serviceInfoId");

		if (serviceInfoId != null) {
			setServiceInfoId(serviceInfoId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String serviceCode = (String)attributes.get("serviceCode");

		if (serviceCode != null) {
			setServiceCode(serviceCode);
		}

		String serviceName = (String)attributes.get("serviceName");

		if (serviceName != null) {
			setServiceName(serviceName);
		}

		String processText = (String)attributes.get("processText");

		if (processText != null) {
			setProcessText(processText);
		}

		String methodText = (String)attributes.get("methodText");

		if (methodText != null) {
			setMethodText(methodText);
		}

		String dossierText = (String)attributes.get("dossierText");

		if (dossierText != null) {
			setDossierText(dossierText);
		}

		String conditionText = (String)attributes.get("conditionText");

		if (conditionText != null) {
			setConditionText(conditionText);
		}

		String durationText = (String)attributes.get("durationText");

		if (durationText != null) {
			setDurationText(durationText);
		}

		String applicantText = (String)attributes.get("applicantText");

		if (applicantText != null) {
			setApplicantText(applicantText);
		}

		String resultText = (String)attributes.get("resultText");

		if (resultText != null) {
			setResultText(resultText);
		}

		String regularText = (String)attributes.get("regularText");

		if (regularText != null) {
			setRegularText(regularText);
		}

		String feeText = (String)attributes.get("feeText");

		if (feeText != null) {
			setFeeText(feeText);
		}

		String administrationCode = (String)attributes.get("administrationCode");

		if (administrationCode != null) {
			setAdministrationCode(administrationCode);
		}

		String administrationName = (String)attributes.get("administrationName");

		if (administrationName != null) {
			setAdministrationName(administrationName);
		}

		String administrationIndex = (String)attributes.get(
				"administrationIndex");

		if (administrationIndex != null) {
			setAdministrationIndex(administrationIndex);
		}

		String domainCode = (String)attributes.get("domainCode");

		if (domainCode != null) {
			setDomainCode(domainCode);
		}

		String domainName = (String)attributes.get("domainName");

		if (domainName != null) {
			setDomainName(domainName);
		}

		String domainIndex = (String)attributes.get("domainIndex");

		if (domainIndex != null) {
			setDomainIndex(domainIndex);
		}

		Integer maxLevel = (Integer)attributes.get("maxLevel");

		if (maxLevel != null) {
			setMaxLevel(maxLevel);
		}

		Boolean public_ = (Boolean)attributes.get("public_");

		if (public_ != null) {
			setPublic_(public_);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getServiceInfoId() {
		return _serviceInfoId;
	}

	@Override
	public void setServiceInfoId(long serviceInfoId) {
		_serviceInfoId = serviceInfoId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public String getServiceCode() {
		if (_serviceCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _serviceCode;
		}
	}

	@Override
	public void setServiceCode(String serviceCode) {
		_columnBitmask |= SERVICECODE_COLUMN_BITMASK;

		if (_originalServiceCode == null) {
			_originalServiceCode = _serviceCode;
		}

		_serviceCode = serviceCode;
	}

	public String getOriginalServiceCode() {
		return GetterUtil.getString(_originalServiceCode);
	}

	@Override
	public String getServiceName() {
		if (_serviceName == null) {
			return StringPool.BLANK;
		}
		else {
			return _serviceName;
		}
	}

	@Override
	public void setServiceName(String serviceName) {
		_serviceName = serviceName;
	}

	@Override
	public String getProcessText() {
		if (_processText == null) {
			return StringPool.BLANK;
		}
		else {
			return _processText;
		}
	}

	@Override
	public void setProcessText(String processText) {
		_processText = processText;
	}

	@Override
	public String getMethodText() {
		if (_methodText == null) {
			return StringPool.BLANK;
		}
		else {
			return _methodText;
		}
	}

	@Override
	public void setMethodText(String methodText) {
		_methodText = methodText;
	}

	@Override
	public String getDossierText() {
		if (_dossierText == null) {
			return StringPool.BLANK;
		}
		else {
			return _dossierText;
		}
	}

	@Override
	public void setDossierText(String dossierText) {
		_dossierText = dossierText;
	}

	@Override
	public String getConditionText() {
		if (_conditionText == null) {
			return StringPool.BLANK;
		}
		else {
			return _conditionText;
		}
	}

	@Override
	public void setConditionText(String conditionText) {
		_conditionText = conditionText;
	}

	@Override
	public String getDurationText() {
		if (_durationText == null) {
			return StringPool.BLANK;
		}
		else {
			return _durationText;
		}
	}

	@Override
	public void setDurationText(String durationText) {
		_durationText = durationText;
	}

	@Override
	public String getApplicantText() {
		if (_applicantText == null) {
			return StringPool.BLANK;
		}
		else {
			return _applicantText;
		}
	}

	@Override
	public void setApplicantText(String applicantText) {
		_applicantText = applicantText;
	}

	@Override
	public String getResultText() {
		if (_resultText == null) {
			return StringPool.BLANK;
		}
		else {
			return _resultText;
		}
	}

	@Override
	public void setResultText(String resultText) {
		_resultText = resultText;
	}

	@Override
	public String getRegularText() {
		if (_regularText == null) {
			return StringPool.BLANK;
		}
		else {
			return _regularText;
		}
	}

	@Override
	public void setRegularText(String regularText) {
		_regularText = regularText;
	}

	@Override
	public String getFeeText() {
		if (_feeText == null) {
			return StringPool.BLANK;
		}
		else {
			return _feeText;
		}
	}

	@Override
	public void setFeeText(String feeText) {
		_feeText = feeText;
	}

	@Override
	public String getAdministrationCode() {
		if (_administrationCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _administrationCode;
		}
	}

	@Override
	public void setAdministrationCode(String administrationCode) {
		_administrationCode = administrationCode;
	}

	@Override
	public String getAdministrationName() {
		if (_administrationName == null) {
			return StringPool.BLANK;
		}
		else {
			return _administrationName;
		}
	}

	@Override
	public void setAdministrationName(String administrationName) {
		_administrationName = administrationName;
	}

	@Override
	public String getAdministrationIndex() {
		if (_administrationIndex == null) {
			return StringPool.BLANK;
		}
		else {
			return _administrationIndex;
		}
	}

	@Override
	public void setAdministrationIndex(String administrationIndex) {
		_administrationIndex = administrationIndex;
	}

	@Override
	public String getDomainCode() {
		if (_domainCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _domainCode;
		}
	}

	@Override
	public void setDomainCode(String domainCode) {
		_columnBitmask |= DOMAINCODE_COLUMN_BITMASK;

		if (_originalDomainCode == null) {
			_originalDomainCode = _domainCode;
		}

		_domainCode = domainCode;
	}

	public String getOriginalDomainCode() {
		return GetterUtil.getString(_originalDomainCode);
	}

	@Override
	public String getDomainName() {
		if (_domainName == null) {
			return StringPool.BLANK;
		}
		else {
			return _domainName;
		}
	}

	@Override
	public void setDomainName(String domainName) {
		_domainName = domainName;
	}

	@Override
	public String getDomainIndex() {
		if (_domainIndex == null) {
			return StringPool.BLANK;
		}
		else {
			return _domainIndex;
		}
	}

	@Override
	public void setDomainIndex(String domainIndex) {
		_domainIndex = domainIndex;
	}

	@Override
	public int getMaxLevel() {
		return _maxLevel;
	}

	@Override
	public void setMaxLevel(int maxLevel) {
		_maxLevel = maxLevel;
	}

	@Override
	public boolean getPublic_() {
		return _public_;
	}

	@Override
	public boolean isPublic_() {
		return _public_;
	}

	@Override
	public void setPublic_(boolean public_) {
		_public_ = public_;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				ServiceInfo.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			ServiceInfo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ServiceInfo toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ServiceInfo)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ServiceInfoImpl serviceInfoImpl = new ServiceInfoImpl();

		serviceInfoImpl.setUuid(getUuid());
		serviceInfoImpl.setServiceInfoId(getServiceInfoId());
		serviceInfoImpl.setGroupId(getGroupId());
		serviceInfoImpl.setCompanyId(getCompanyId());
		serviceInfoImpl.setUserId(getUserId());
		serviceInfoImpl.setUserName(getUserName());
		serviceInfoImpl.setCreateDate(getCreateDate());
		serviceInfoImpl.setModifiedDate(getModifiedDate());
		serviceInfoImpl.setServiceCode(getServiceCode());
		serviceInfoImpl.setServiceName(getServiceName());
		serviceInfoImpl.setProcessText(getProcessText());
		serviceInfoImpl.setMethodText(getMethodText());
		serviceInfoImpl.setDossierText(getDossierText());
		serviceInfoImpl.setConditionText(getConditionText());
		serviceInfoImpl.setDurationText(getDurationText());
		serviceInfoImpl.setApplicantText(getApplicantText());
		serviceInfoImpl.setResultText(getResultText());
		serviceInfoImpl.setRegularText(getRegularText());
		serviceInfoImpl.setFeeText(getFeeText());
		serviceInfoImpl.setAdministrationCode(getAdministrationCode());
		serviceInfoImpl.setAdministrationName(getAdministrationName());
		serviceInfoImpl.setAdministrationIndex(getAdministrationIndex());
		serviceInfoImpl.setDomainCode(getDomainCode());
		serviceInfoImpl.setDomainName(getDomainName());
		serviceInfoImpl.setDomainIndex(getDomainIndex());
		serviceInfoImpl.setMaxLevel(getMaxLevel());
		serviceInfoImpl.setPublic_(getPublic_());

		serviceInfoImpl.resetOriginalValues();

		return serviceInfoImpl;
	}

	@Override
	public int compareTo(ServiceInfo serviceInfo) {
		long primaryKey = serviceInfo.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceInfo)) {
			return false;
		}

		ServiceInfo serviceInfo = (ServiceInfo)obj;

		long primaryKey = serviceInfo.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		ServiceInfoModelImpl serviceInfoModelImpl = this;

		serviceInfoModelImpl._originalUuid = serviceInfoModelImpl._uuid;

		serviceInfoModelImpl._originalGroupId = serviceInfoModelImpl._groupId;

		serviceInfoModelImpl._setOriginalGroupId = false;

		serviceInfoModelImpl._originalCompanyId = serviceInfoModelImpl._companyId;

		serviceInfoModelImpl._setOriginalCompanyId = false;

		serviceInfoModelImpl._setModifiedDate = false;

		serviceInfoModelImpl._originalServiceCode = serviceInfoModelImpl._serviceCode;

		serviceInfoModelImpl._originalDomainCode = serviceInfoModelImpl._domainCode;

		serviceInfoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ServiceInfo> toCacheModel() {
		ServiceInfoCacheModel serviceInfoCacheModel = new ServiceInfoCacheModel();

		serviceInfoCacheModel.uuid = getUuid();

		String uuid = serviceInfoCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			serviceInfoCacheModel.uuid = null;
		}

		serviceInfoCacheModel.serviceInfoId = getServiceInfoId();

		serviceInfoCacheModel.groupId = getGroupId();

		serviceInfoCacheModel.companyId = getCompanyId();

		serviceInfoCacheModel.userId = getUserId();

		serviceInfoCacheModel.userName = getUserName();

		String userName = serviceInfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			serviceInfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			serviceInfoCacheModel.createDate = createDate.getTime();
		}
		else {
			serviceInfoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			serviceInfoCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			serviceInfoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		serviceInfoCacheModel.serviceCode = getServiceCode();

		String serviceCode = serviceInfoCacheModel.serviceCode;

		if ((serviceCode != null) && (serviceCode.length() == 0)) {
			serviceInfoCacheModel.serviceCode = null;
		}

		serviceInfoCacheModel.serviceName = getServiceName();

		String serviceName = serviceInfoCacheModel.serviceName;

		if ((serviceName != null) && (serviceName.length() == 0)) {
			serviceInfoCacheModel.serviceName = null;
		}

		serviceInfoCacheModel.processText = getProcessText();

		String processText = serviceInfoCacheModel.processText;

		if ((processText != null) && (processText.length() == 0)) {
			serviceInfoCacheModel.processText = null;
		}

		serviceInfoCacheModel.methodText = getMethodText();

		String methodText = serviceInfoCacheModel.methodText;

		if ((methodText != null) && (methodText.length() == 0)) {
			serviceInfoCacheModel.methodText = null;
		}

		serviceInfoCacheModel.dossierText = getDossierText();

		String dossierText = serviceInfoCacheModel.dossierText;

		if ((dossierText != null) && (dossierText.length() == 0)) {
			serviceInfoCacheModel.dossierText = null;
		}

		serviceInfoCacheModel.conditionText = getConditionText();

		String conditionText = serviceInfoCacheModel.conditionText;

		if ((conditionText != null) && (conditionText.length() == 0)) {
			serviceInfoCacheModel.conditionText = null;
		}

		serviceInfoCacheModel.durationText = getDurationText();

		String durationText = serviceInfoCacheModel.durationText;

		if ((durationText != null) && (durationText.length() == 0)) {
			serviceInfoCacheModel.durationText = null;
		}

		serviceInfoCacheModel.applicantText = getApplicantText();

		String applicantText = serviceInfoCacheModel.applicantText;

		if ((applicantText != null) && (applicantText.length() == 0)) {
			serviceInfoCacheModel.applicantText = null;
		}

		serviceInfoCacheModel.resultText = getResultText();

		String resultText = serviceInfoCacheModel.resultText;

		if ((resultText != null) && (resultText.length() == 0)) {
			serviceInfoCacheModel.resultText = null;
		}

		serviceInfoCacheModel.regularText = getRegularText();

		String regularText = serviceInfoCacheModel.regularText;

		if ((regularText != null) && (regularText.length() == 0)) {
			serviceInfoCacheModel.regularText = null;
		}

		serviceInfoCacheModel.feeText = getFeeText();

		String feeText = serviceInfoCacheModel.feeText;

		if ((feeText != null) && (feeText.length() == 0)) {
			serviceInfoCacheModel.feeText = null;
		}

		serviceInfoCacheModel.administrationCode = getAdministrationCode();

		String administrationCode = serviceInfoCacheModel.administrationCode;

		if ((administrationCode != null) && (administrationCode.length() == 0)) {
			serviceInfoCacheModel.administrationCode = null;
		}

		serviceInfoCacheModel.administrationName = getAdministrationName();

		String administrationName = serviceInfoCacheModel.administrationName;

		if ((administrationName != null) && (administrationName.length() == 0)) {
			serviceInfoCacheModel.administrationName = null;
		}

		serviceInfoCacheModel.administrationIndex = getAdministrationIndex();

		String administrationIndex = serviceInfoCacheModel.administrationIndex;

		if ((administrationIndex != null) &&
				(administrationIndex.length() == 0)) {
			serviceInfoCacheModel.administrationIndex = null;
		}

		serviceInfoCacheModel.domainCode = getDomainCode();

		String domainCode = serviceInfoCacheModel.domainCode;

		if ((domainCode != null) && (domainCode.length() == 0)) {
			serviceInfoCacheModel.domainCode = null;
		}

		serviceInfoCacheModel.domainName = getDomainName();

		String domainName = serviceInfoCacheModel.domainName;

		if ((domainName != null) && (domainName.length() == 0)) {
			serviceInfoCacheModel.domainName = null;
		}

		serviceInfoCacheModel.domainIndex = getDomainIndex();

		String domainIndex = serviceInfoCacheModel.domainIndex;

		if ((domainIndex != null) && (domainIndex.length() == 0)) {
			serviceInfoCacheModel.domainIndex = null;
		}

		serviceInfoCacheModel.maxLevel = getMaxLevel();

		serviceInfoCacheModel.public_ = getPublic_();

		return serviceInfoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", serviceInfoId=");
		sb.append(getServiceInfoId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", serviceCode=");
		sb.append(getServiceCode());
		sb.append(", serviceName=");
		sb.append(getServiceName());
		sb.append(", processText=");
		sb.append(getProcessText());
		sb.append(", methodText=");
		sb.append(getMethodText());
		sb.append(", dossierText=");
		sb.append(getDossierText());
		sb.append(", conditionText=");
		sb.append(getConditionText());
		sb.append(", durationText=");
		sb.append(getDurationText());
		sb.append(", applicantText=");
		sb.append(getApplicantText());
		sb.append(", resultText=");
		sb.append(getResultText());
		sb.append(", regularText=");
		sb.append(getRegularText());
		sb.append(", feeText=");
		sb.append(getFeeText());
		sb.append(", administrationCode=");
		sb.append(getAdministrationCode());
		sb.append(", administrationName=");
		sb.append(getAdministrationName());
		sb.append(", administrationIndex=");
		sb.append(getAdministrationIndex());
		sb.append(", domainCode=");
		sb.append(getDomainCode());
		sb.append(", domainName=");
		sb.append(getDomainName());
		sb.append(", domainIndex=");
		sb.append(getDomainIndex());
		sb.append(", maxLevel=");
		sb.append(getMaxLevel());
		sb.append(", public_=");
		sb.append(getPublic_());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(85);

		sb.append("<model><model-name>");
		sb.append("org.opencps.dossiermgt.model.ServiceInfo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceInfoId</column-name><column-value><![CDATA[");
		sb.append(getServiceInfoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceCode</column-name><column-value><![CDATA[");
		sb.append(getServiceCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceName</column-name><column-value><![CDATA[");
		sb.append(getServiceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processText</column-name><column-value><![CDATA[");
		sb.append(getProcessText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>methodText</column-name><column-value><![CDATA[");
		sb.append(getMethodText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierText</column-name><column-value><![CDATA[");
		sb.append(getDossierText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>conditionText</column-name><column-value><![CDATA[");
		sb.append(getConditionText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>durationText</column-name><column-value><![CDATA[");
		sb.append(getDurationText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicantText</column-name><column-value><![CDATA[");
		sb.append(getApplicantText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resultText</column-name><column-value><![CDATA[");
		sb.append(getResultText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regularText</column-name><column-value><![CDATA[");
		sb.append(getRegularText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>feeText</column-name><column-value><![CDATA[");
		sb.append(getFeeText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>administrationCode</column-name><column-value><![CDATA[");
		sb.append(getAdministrationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>administrationName</column-name><column-value><![CDATA[");
		sb.append(getAdministrationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>administrationIndex</column-name><column-value><![CDATA[");
		sb.append(getAdministrationIndex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>domainCode</column-name><column-value><![CDATA[");
		sb.append(getDomainCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>domainName</column-name><column-value><![CDATA[");
		sb.append(getDomainName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>domainIndex</column-name><column-value><![CDATA[");
		sb.append(getDomainIndex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maxLevel</column-name><column-value><![CDATA[");
		sb.append(getMaxLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>public_</column-name><column-value><![CDATA[");
		sb.append(getPublic_());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = ServiceInfo.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			ServiceInfo.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _serviceInfoId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _serviceCode;
	private String _originalServiceCode;
	private String _serviceName;
	private String _processText;
	private String _methodText;
	private String _dossierText;
	private String _conditionText;
	private String _durationText;
	private String _applicantText;
	private String _resultText;
	private String _regularText;
	private String _feeText;
	private String _administrationCode;
	private String _administrationName;
	private String _administrationIndex;
	private String _domainCode;
	private String _originalDomainCode;
	private String _domainName;
	private String _domainIndex;
	private int _maxLevel;
	private boolean _public_;
	private long _columnBitmask;
	private ServiceInfo _escapedModel;
}