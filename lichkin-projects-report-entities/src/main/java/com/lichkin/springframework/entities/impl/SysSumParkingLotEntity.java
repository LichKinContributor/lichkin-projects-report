package com.lichkin.springframework.entities.impl;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.lichkin.springframework.entities.suppers.BaseStatisticsEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 停车场车流量及收入金额统计表实体类
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
@Getter
@Setter
@Entity
public class SysSumParkingLotEntity extends BaseStatisticsEntity {

	/** serialVersionUID */
	private static final long serialVersionUID = 77003L;

	/** 车位数 */
	@Column(nullable = false)
	private Integer parkingLotCount;

}
