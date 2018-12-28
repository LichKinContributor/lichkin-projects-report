package com.lichkin.springframework.entities.impl;

import javax.persistence.Entity;

import com.lichkin.springframework.entities.suppers.BaseStatisticsCountEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 公园人流量汇总表实体类
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
@Getter
@Setter
@Entity
public class SysSumParkHumanTrafficEntity extends BaseStatisticsCountEntity {

	/** serialVersionUID */
	private static final long serialVersionUID = 77002L;

}
