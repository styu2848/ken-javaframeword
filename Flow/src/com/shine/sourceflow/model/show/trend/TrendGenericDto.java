package com.shine.sourceflow.model.show.trend;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.shine.framework.core.util.DateUtil;
import com.shine.sourceflow.model.GenericDto;

public class TrendGenericDto extends GenericDto {
	/** 周期选择列表 */
	private Map<Integer, String> statPeriodList;
	
	/** 当前选择的统计周期类型 */
	private int statPeroid = 4;
	
	/** 查询日期 */
	private String date = DateUtil.getCurrentDate();
	
	/** 当前选择IP类型 */
	private int ipType = 1;
	
	/** 当前选择IP地址 */
	private String ipAddress = "";
	
	/** IP分组ID */
	private String ipGroupId = "";
	
	/** 协议ID */
	private String protocolId = "";
	
	/** 会话ID */
	private String sessionId = "";
	
	/** 应用ID */
	private String appId = "";
	
	public TrendGenericDto() {
		this.statPeriodList = new HashMap<Integer, String>();
		this.statPeriodList.put(1, "日报表");
		this.statPeriodList.put(2, "周报表");
		this.statPeriodList.put(3, "月报表");
		this.statPeriodList.put(4, "最近一小时");
	}
	
	@Override
	public void init(HttpServletRequest request) {
		// 查询周期
		String statPeroid = request.getParameter("statPeroid");
		if (statPeroid != null && 
				this.statPeriodList.containsKey(Integer.parseInt(statPeroid))) {
			this.statPeroid = Integer.parseInt(statPeroid);
		}
		// 查询日期
		String date = request.getParameter("date");
		if (date != null) {
			this.date = date;
		}
		// 查询IP类型
		String ipType = request.getParameter("ipType");
		if (ipType != null) {
			this.ipType = Integer.parseInt(ipType);
		}
		// 查询IP地址
		String ipAddress = request.getParameter("ipAddress");
		if (ipAddress != null) {
			this.ipAddress = ipAddress;
		}
		// IP别名
		String ipGroupId = request.getParameter("ipGroupId");
		if (ipGroupId != null) {
			this.ipGroupId = ipGroupId;
		}
		// 协议ID
		String protocolId = request.getParameter("protocolId");
		if (protocolId != null) {
			this.protocolId = protocolId;
		}
		// 会话ID
		String sessionId = request.getParameter("sessionId");
		if (sessionId != null) {
			this.sessionId = protocolId;
		}
		// 应用ID
		String appId = request.getParameter("appId");
		if (appId != null) {
			this.appId = appId;
		}
	}
	
	public Map<Integer, String> getStatPeriodList() {
		return this.statPeriodList;
	}
	
	public int getStatPeroid() {
		return this.statPeroid;
	}
	
	public int getIpType() {
		return this.ipType;
	}
	
	public String getIpAddress() {
		return this.ipAddress;
	}
	
	public String getIpGroupId() {
		return this.ipGroupId;
	}
	
	public String getProtocolId() {
		return this.protocolId;
	}
	
	public String getSessionId() {
		return this.sessionId;
	}
	
	public String getAppId() {
		return this.appId;
	}
	
	public String getDate() {
		return this.date;
	}
}
