package com.lichkin.springframework.entities.impl;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.lichkin.springframework.entities.suppers.BaseSummaryEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 厕所人流量汇总表实体类
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
@Getter
@Setter
@Entity
public class SysSumToiletHumanTrafficEntity extends BaseSummaryEntity {

	/** serialVersionUID */
	private static final long serialVersionUID = 77008L;

	/** 厕所类型。1:男;2:女;3:第三; */
	@Column(nullable = false)
	private Byte toiletType;

}
