package com.lichkin.framework.db.beans;

/**
 * 数据库资源初始化类
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
class SysReportRInitializer implements LKRInitializer {

	/**
	 * 初始化数据库资源
	 */
	public static void init() {
		LKDBResource.addTable("com.lichkin.springframework.entities.impl.SysSumHotelCheckInEntity", "T_SYS_SUM_HOTEL_CHECK_IN", "SysSumHotelCheckInEntity");
		LKDBResource.addColumn("77001000", "SysSumHotelCheckInEntity", "id");
		LKDBResource.addColumn("77001001", "SysSumHotelCheckInEntity", "sourceId");
		LKDBResource.addColumn("77001002", "SysSumHotelCheckInEntity", "summaryDate");
		LKDBResource.addColumn("77001003", "SysSumHotelCheckInEntity", "summaryMinutes");
		LKDBResource.addColumn("77001004", "SysSumHotelCheckInEntity", "quantity");
		LKDBResource.addColumn("77001005", "SysSumHotelCheckInEntity", "amount");
		LKDBResource.addColumn("77001006", "SysSumHotelCheckInEntity", "cnt");
		LKDBResource.addTable("com.lichkin.springframework.entities.impl.SysSumParkHumanTrafficEntity", "T_SYS_SUM_PARK_HUMAN_TRAFFIC", "SysSumParkHumanTrafficEntity");
		LKDBResource.addColumn("77002000", "SysSumParkHumanTrafficEntity", "id");
		LKDBResource.addColumn("77002001", "SysSumParkHumanTrafficEntity", "sourceId");
		LKDBResource.addColumn("77002002", "SysSumParkHumanTrafficEntity", "summaryDate");
		LKDBResource.addColumn("77002003", "SysSumParkHumanTrafficEntity", "summaryMinutes");
		LKDBResource.addColumn("77002004", "SysSumParkHumanTrafficEntity", "quantity");
		LKDBResource.addTable("com.lichkin.springframework.entities.impl.SysSumParkingLotAmountEntity", "T_SYS_SUM_PARKING_LOT_AMOUNT", "SysSumParkingLotAmountEntity");
		LKDBResource.addColumn("77003000", "SysSumParkingLotAmountEntity", "id");
		LKDBResource.addColumn("77003001", "SysSumParkingLotAmountEntity", "sourceId");
		LKDBResource.addColumn("77003002", "SysSumParkingLotAmountEntity", "summaryDate");
		LKDBResource.addColumn("77003003", "SysSumParkingLotAmountEntity", "summaryMinutes");
		LKDBResource.addColumn("77003004", "SysSumParkingLotAmountEntity", "quantity");
		LKDBResource.addColumn("77003005", "SysSumParkingLotAmountEntity", "amount");
		LKDBResource.addColumn("77003006", "SysSumParkingLotAmountEntity", "cnt");
		LKDBResource.addTable("com.lichkin.springframework.entities.impl.SysSumParkingLotTrafficEntity", "T_SYS_SUM_PARKING_LOT_TRAFFIC", "SysSumParkingLotTrafficEntity");
		LKDBResource.addColumn("77004000", "SysSumParkingLotTrafficEntity", "id");
		LKDBResource.addColumn("77004001", "SysSumParkingLotTrafficEntity", "sourceId");
		LKDBResource.addColumn("77004002", "SysSumParkingLotTrafficEntity", "summaryDate");
		LKDBResource.addColumn("77004003", "SysSumParkingLotTrafficEntity", "summaryMinutes");
		LKDBResource.addColumn("77004004", "SysSumParkingLotTrafficEntity", "quantity");
		LKDBResource.addTable("com.lichkin.springframework.entities.impl.SysSumTicket2ndAmountEntity", "T_SYS_SUM_TICKET2ND_AMOUNT", "SysSumTicket2ndAmountEntity");
		LKDBResource.addColumn("77005000", "SysSumTicket2ndAmountEntity", "id");
		LKDBResource.addColumn("77005001", "SysSumTicket2ndAmountEntity", "sourceId");
		LKDBResource.addColumn("77005002", "SysSumTicket2ndAmountEntity", "summaryDate");
		LKDBResource.addColumn("77005003", "SysSumTicket2ndAmountEntity", "summaryMinutes");
		LKDBResource.addColumn("77005004", "SysSumTicket2ndAmountEntity", "quantity");
		LKDBResource.addColumn("77005005", "SysSumTicket2ndAmountEntity", "amount");
		LKDBResource.addTable("com.lichkin.springframework.entities.impl.SysSumSupermarketProductAmountEntity", "T_SYS_SUM_SUPERMARKET_PRODUCT_AMOUNT", "SysSumSupermarketProductAmountEntity");
		LKDBResource.addColumn("77006000", "SysSumSupermarketProductAmountEntity", "id");
		LKDBResource.addColumn("77006001", "SysSumSupermarketProductAmountEntity", "sourceId");
		LKDBResource.addColumn("77006002", "SysSumSupermarketProductAmountEntity", "summaryDate");
		LKDBResource.addColumn("77006003", "SysSumSupermarketProductAmountEntity", "summaryMinutes");
		LKDBResource.addColumn("77006004", "SysSumSupermarketProductAmountEntity", "quantity");
		LKDBResource.addColumn("77006005", "SysSumSupermarketProductAmountEntity", "amount");
		LKDBResource.addColumn("77006006", "SysSumSupermarketProductAmountEntity", "productId");
		LKDBResource.addTable("com.lichkin.springframework.entities.impl.SysSumTicketAmountEntity", "T_SYS_SUM_TICKET_AMOUNT", "SysSumTicketAmountEntity");
		LKDBResource.addColumn("77007000", "SysSumTicketAmountEntity", "id");
		LKDBResource.addColumn("77007001", "SysSumTicketAmountEntity", "sourceId");
		LKDBResource.addColumn("77007002", "SysSumTicketAmountEntity", "summaryDate");
		LKDBResource.addColumn("77007003", "SysSumTicketAmountEntity", "summaryMinutes");
		LKDBResource.addColumn("77007004", "SysSumTicketAmountEntity", "quantity");
		LKDBResource.addColumn("77007005", "SysSumTicketAmountEntity", "amount");
		LKDBResource.addTable("com.lichkin.springframework.entities.impl.SysSumToiletHumanTrafficEntity", "T_SYS_SUM_TOILET_HUMAN_TRAFFIC", "SysSumToiletHumanTrafficEntity");
		LKDBResource.addColumn("77008000", "SysSumToiletHumanTrafficEntity", "id");
		LKDBResource.addColumn("77008001", "SysSumToiletHumanTrafficEntity", "sourceId");
		LKDBResource.addColumn("77008002", "SysSumToiletHumanTrafficEntity", "summaryDate");
		LKDBResource.addColumn("77008003", "SysSumToiletHumanTrafficEntity", "summaryMinutes");
		LKDBResource.addColumn("77008004", "SysSumToiletHumanTrafficEntity", "quantity");
		LKDBResource.addColumn("77008005", "SysSumToiletHumanTrafficEntity", "toiletType");
	}

}