package com.lichkin.springframework.entities.impl;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.lichkin.springframework.entities.suppers.BaseSummaryAmountEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 酒店入住量汇总表实体类
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
@Getter
@Setter
@Entity
public class SysSumHotelCheckInEntity extends BaseSummaryAmountEntity {

	/** serialVersionUID */
	private static final long serialVersionUID = 77001L;

	/** 房间数量 */
	@Column(nullable = false)
	private Integer cnt;

}
