package com.lichkin.application.apis.GetReportData;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import com.lichkin.framework.beans.impl.LKRequestBean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class I extends LKRequestBean {

	/** 统计模块 */
	@NotBlank
	private String module;

	/** 统计模块 */
	@NotNull
	private String subModule;

	/** 统计报表类型 */
	@NotBlank
	private String chartType;

	/** 统计日期维度类型 */
	@NotBlank
	private String dateType;

	/** 业务ID */
	@NotBlank
	private String sourceId;

	/** 统计表名 */
	@Null
	private String tableName;

}
