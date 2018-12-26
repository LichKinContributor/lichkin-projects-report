package com.lichkin.application.apis.GetReportData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lichkin.framework.defines.LKFrameworkStatics;
import com.lichkin.framework.defines.exceptions.LKException;
import com.lichkin.framework.defines.exceptions.LKFrameworkException;
import com.lichkin.framework.web.annotations.LKApiType;
import com.lichkin.framework.web.enums.ApiType;
import com.lichkin.springframework.controllers.ApiKeyValues;
import com.lichkin.springframework.controllers.LKApiY0Controller;

@RestController(Statics.CONTROLLER_NAME)
@RequestMapping(value = LKFrameworkStatics.WEB_MAPPING_API + Statics.SUB_URL)
@LKApiType(apiType = ApiType.OPEN)
public class C extends LKApiY0Controller<I, Object> {

	@Autowired
	private MAmount mapperAmount;

	@Autowired
	private MQuantity mapperQuantity;

	@Autowired
	private MRate mapperRate;


	@Override
	protected Object doInvoke(I cin, ApiKeyValues<I> params) throws LKException {
		// 处理表名转换逻辑
		String tableName = Statics.tableMapping.get(cin.getModule() + "|" + cin.getSubModule() + "|" + cin.getChartType());
		if (tableName == null) {
			throw new LKFrameworkException("tableMapping not configed.");
		}
		cin.setTableName(tableName);

		// 处理统计类型决定采用何种统计类
		switch (cin.getChartType()) {
			case Statics.CHART_TYPE_AMOUNT:
				return mapperAmount.getValue(cin);
			case Statics.CHART_TYPE_QUANTITY:
				return mapperQuantity.getValue(cin);
			case Statics.CHART_TYPE_RATE:
				return mapperRate.getValue(cin);
			default:
				throw new LKFrameworkException("chartType " + cin.getChartType() + " not implemented.");
		}
	}

}
