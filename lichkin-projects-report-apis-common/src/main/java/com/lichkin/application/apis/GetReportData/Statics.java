package com.lichkin.application.apis.GetReportData;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取报表数据
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
class Statics {

	private static final String NAME = "GetReportData";

	static final String SUB_URL = "/" + NAME;

	static final String CONTROLLER_NAME = NAME + "C";

	static final String SERVICE_NAME = NAME + "S";

	static final Map<String, String> tableMapping = new HashMap<>();

	private static final String TABLE_SUM_PREFIX = "t_sys_sum_";

	static final String CHART_TYPE_AMOUNT = "amount";

	static final String CHART_TYPE_QUANTITY = "quantity";

	static final String CHART_TYPE_RATE = "rate";

	static {
		// 人流量
		tableMapping.put("human_traffic||" + CHART_TYPE_QUANTITY, TABLE_SUM_PREFIX + "human_traffic");

		// 停车场
		tableMapping.put("parking_lot||" + CHART_TYPE_AMOUNT, TABLE_SUM_PREFIX + "parking_lot_amount");
		tableMapping.put("parking_lot||" + CHART_TYPE_QUANTITY, TABLE_SUM_PREFIX + "parking_lot_traffic");
		tableMapping.put("parking_lot||" + CHART_TYPE_RATE, TABLE_SUM_PREFIX + "parking_lot_amount");

		// 厕所
		tableMapping.put("toilet|human_traffic|" + CHART_TYPE_QUANTITY, TABLE_SUM_PREFIX + "toilet_human_traffic");
	}

}
