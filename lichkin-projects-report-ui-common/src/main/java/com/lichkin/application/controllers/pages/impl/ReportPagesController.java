package com.lichkin.application.controllers.pages.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lichkin.springframework.controllers.LKPagesController;
import com.lichkin.springframework.web.beans.LKPage;

@Controller
@RequestMapping("/")
public class ReportPagesController extends LKPagesController {

	/**
	 * 图标展示页面
	 * @param module 模块
	 * @param subModule 子模块
	 * @param moduleName 模块名（相当于一级菜单名）
	 * @param subModuleName 子模块名（相当于二级菜单名）
	 * @param sourceId list页面调用/GetDictList接口获取的字典编码值
	 * @param sourceName list页面调用/GetDictList接口获取的字典名称值
	 * @param chartType 图表类型（子模块地址）
	 * @return 页面调用/{module}/{chartType}接口，按需实现。
	 */
	@GetMapping("/report/chart/{chartType}/{module}/{subModule}" + MAPPING)
	public LKPage linkToChart(@PathVariable String chartType, @PathVariable String module, @PathVariable String subModule, String moduleName, String subModuleName, String sourceId, String sourceName) {
		LKPage mv = new LKPage("/report/chart").setRealViewName(true);

		mv.putServerData("chartType", chartType);
		mv.putServerData("module", module);
		mv.putServerData("subModule", subModule);

		mv.putServerData("moduleName", moduleName);
		mv.putServerData("subModuleName", subModuleName);
		mv.putServerData("sourceId", sourceId);
		mv.putServerData("sourceName", sourceName);

		return mv;
	}

}
