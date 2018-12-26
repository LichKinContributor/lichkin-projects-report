package com.lichkin.application.apis.GetReportData;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MRate {

	ORate getValue(I in);

}
