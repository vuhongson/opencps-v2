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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRVehicleEquipment;
import com.fds.vr.business.model.VRVehicleEquipmentModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VRVehicleEquipment service. Represents a row in the &quot;vr_vehicleequipment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VRVehicleEquipmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VRVehicleEquipmentImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRVehicleEquipmentImpl
 * @see VRVehicleEquipment
 * @see VRVehicleEquipmentModel
 * @generated
 */
@ProviderType
public class VRVehicleEquipmentModelImpl extends BaseModelImpl<VRVehicleEquipment>
	implements VRVehicleEquipmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vr vehicle equipment model instance should use the {@link VRVehicleEquipment} interface instead.
	 */
	public static final String TABLE_NAME = "vr_vehicleequipment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "vehicleCertificateId", Types.BIGINT },
			{ "certificateRecordId", Types.BIGINT },
			{ "modifyDate", Types.TIMESTAMP },
			{ "syncDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("vehicleCertificateId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("certificateRecordId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("modifyDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("syncDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table vr_vehicleequipment (id LONG not null primary key,vehicleCertificateId LONG,certificateRecordId LONG,modifyDate DATE null,syncDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_vehicleequipment";
	public static final String ORDER_BY_JPQL = " ORDER BY vrVehicleEquipment.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_vehicleequipment.id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.fds.vr.business.model.VRVehicleEquipment"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.fds.vr.business.model.VRVehicleEquipment"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.fds.vr.service.util.ServiceProps.get(
				"lock.expiration.time.com.fds.vr.business.model.VRVehicleEquipment"));

	public VRVehicleEquipmentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return VRVehicleEquipment.class;
	}

	@Override
	public String getModelClassName() {
		return VRVehicleEquipment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleCertificateId", getVehicleCertificateId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long vehicleCertificateId = (Long)attributes.get("vehicleCertificateId");

		if (vehicleCertificateId != null) {
			setVehicleCertificateId(vehicleCertificateId);
		}

		Long certificateRecordId = (Long)attributes.get("certificateRecordId");

		if (certificateRecordId != null) {
			setCertificateRecordId(certificateRecordId);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getVehicleCertificateId() {
		return _vehicleCertificateId;
	}

	@Override
	public void setVehicleCertificateId(long vehicleCertificateId) {
		_vehicleCertificateId = vehicleCertificateId;
	}

	@Override
	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordId = certificateRecordId;
	}

	@Override
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	@Override
	public Date getSyncDate() {
		return _syncDate;
	}

	@Override
	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			VRVehicleEquipment.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VRVehicleEquipment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VRVehicleEquipment)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VRVehicleEquipmentImpl vrVehicleEquipmentImpl = new VRVehicleEquipmentImpl();

		vrVehicleEquipmentImpl.setId(getId());
		vrVehicleEquipmentImpl.setVehicleCertificateId(getVehicleCertificateId());
		vrVehicleEquipmentImpl.setCertificateRecordId(getCertificateRecordId());
		vrVehicleEquipmentImpl.setModifyDate(getModifyDate());
		vrVehicleEquipmentImpl.setSyncDate(getSyncDate());

		vrVehicleEquipmentImpl.resetOriginalValues();

		return vrVehicleEquipmentImpl;
	}

	@Override
	public int compareTo(VRVehicleEquipment vrVehicleEquipment) {
		long primaryKey = vrVehicleEquipment.getPrimaryKey();

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

		if (!(obj instanceof VRVehicleEquipment)) {
			return false;
		}

		VRVehicleEquipment vrVehicleEquipment = (VRVehicleEquipment)obj;

		long primaryKey = vrVehicleEquipment.getPrimaryKey();

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
	}

	@Override
	public CacheModel<VRVehicleEquipment> toCacheModel() {
		VRVehicleEquipmentCacheModel vrVehicleEquipmentCacheModel = new VRVehicleEquipmentCacheModel();

		vrVehicleEquipmentCacheModel.id = getId();

		vrVehicleEquipmentCacheModel.vehicleCertificateId = getVehicleCertificateId();

		vrVehicleEquipmentCacheModel.certificateRecordId = getCertificateRecordId();

		Date modifyDate = getModifyDate();

		if (modifyDate != null) {
			vrVehicleEquipmentCacheModel.modifyDate = modifyDate.getTime();
		}
		else {
			vrVehicleEquipmentCacheModel.modifyDate = Long.MIN_VALUE;
		}

		Date syncDate = getSyncDate();

		if (syncDate != null) {
			vrVehicleEquipmentCacheModel.syncDate = syncDate.getTime();
		}
		else {
			vrVehicleEquipmentCacheModel.syncDate = Long.MIN_VALUE;
		}

		return vrVehicleEquipmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleCertificateId=");
		sb.append(getVehicleCertificateId());
		sb.append(", certificateRecordId=");
		sb.append(getCertificateRecordId());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append(", syncDate=");
		sb.append(getSyncDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.fds.vr.business.model.VRVehicleEquipment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleCertificateId</column-name><column-value><![CDATA[");
		sb.append(getVehicleCertificateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateRecordId</column-name><column-value><![CDATA[");
		sb.append(getCertificateRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncDate</column-name><column-value><![CDATA[");
		sb.append(getSyncDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VRVehicleEquipment.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VRVehicleEquipment.class
		};
	private long _id;
	private long _vehicleCertificateId;
	private long _certificateRecordId;
	private Date _modifyDate;
	private Date _syncDate;
	private VRVehicleEquipment _escapedModel;
}