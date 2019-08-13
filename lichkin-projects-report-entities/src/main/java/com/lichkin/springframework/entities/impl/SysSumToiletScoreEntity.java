package com.lichkin.springframework.entities.impl;

import javax.persistence.Entity;

import com.lichkin.springframework.entities.suppers.BaseStatisticsEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 厕所评分统计表实体类
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
@Getter
@Setter
@Entity
public class SysSumToiletScoreEntity extends BaseStatisticsEntity {

	/** serialVersionUID */
	private static final long serialVersionUID = 77009L;

}
