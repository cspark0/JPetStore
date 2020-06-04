package com.example.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.domain.Auction;
import com.example.jpetstore.domain.Order;

public interface AuctionDao {
	/*
	 * ������������ ���� ��������(getAuctionListByUserId)
	 * ���ǿ��� ������db���� ���� ����
	 * insert, update, (delete), 
	 *  
	 *  
	 *  */
	 List<Order> getAuctionByUsername(String username) throws DataAccessException;
	 int updateBiddingPrice(double price)throws DataAccessException;
	 int insertAuction(Auction auction)throws DataAccessException;
	 int deleteAuctionbyAuctionId(Auction auction)throws DataAccessException; // ����Ŀ� ��� ����
}
