package com.lichkin.springframework.entities.impl;

import javax.persistence.Entity;

import com.lichkin.springframework.entities.suppers.BaseStatisticsCountSumEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 停车场收入汇总表实体类
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
@Getter
@Setter
@Entity
public class SysSumParkingLotAmountEntity extends BaseStatisticsCountSumEntity {

	/** serialVersionUID */
	private static final long serialVersionUID = 77003L;

}
