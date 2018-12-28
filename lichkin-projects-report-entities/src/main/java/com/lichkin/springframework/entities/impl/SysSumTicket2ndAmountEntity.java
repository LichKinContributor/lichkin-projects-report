package com.lichkin.springframework.entities.impl;

import javax.persistence.Entity;

import com.lichkin.springframework.entities.suppers.BaseStatisticsSumEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 项目票收入汇总表实体类
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
@Getter
@Setter
@Entity
public class SysSumTicket2ndAmountEntity extends BaseStatisticsSumEntity {

	/** serialVersionUID */
	private static final long serialVersionUID = 77005L;

}
