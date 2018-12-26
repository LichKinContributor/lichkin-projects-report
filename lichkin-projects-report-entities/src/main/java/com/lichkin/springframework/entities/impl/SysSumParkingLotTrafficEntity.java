package com.lichkin.springframework.entities.impl;

import javax.persistence.Entity;

import com.lichkin.springframework.entities.suppers.BaseSummaryEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 停车场车流量汇总表实体类
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
@Getter
@Setter
@Entity
public class SysSumParkingLotTrafficEntity extends BaseSummaryEntity {

	/** serialVersionUID */
	private static final long serialVersionUID = 77004L;

}
