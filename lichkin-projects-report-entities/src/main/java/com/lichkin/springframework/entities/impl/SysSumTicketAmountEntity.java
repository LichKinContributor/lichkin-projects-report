package com.lichkin.springframework.entities.impl;

import javax.persistence.Entity;

import com.lichkin.springframework.entities.suppers.BaseStatisticsEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 门票收入统计表实体类
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
@Getter
@Setter
@Entity
public class SysSumTicketAmountEntity extends BaseStatisticsEntity {

	/** serialVersionUID */
	private static final long serialVersionUID = 77007L;

}
