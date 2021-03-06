package com.lichkin.springframework.entities.impl;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.lichkin.springframework.entities.suppers.BaseStatisticsEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 超市产品收入统计表实体类
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
@Getter
@Setter
@Entity
public class SysSumSupermarketProductAmountEntity extends BaseStatisticsEntity {

	/** serialVersionUID */
	private static final long serialVersionUID = 77006L;

	/** 产品ID(SysPssProductEntity.ID) */
	@Column(length = 64, nullable = false)
	private String productId;

}
