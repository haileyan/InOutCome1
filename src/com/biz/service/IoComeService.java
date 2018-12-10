package com.biz.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.inout.vo.IoComeVO;

public class IoComeService {

	List<IoComeVO> ioList;

	public IoComeService() {
		ioList = new ArrayList();

	}

	public void ioInOutInsert(IoComeVO vo) {
		// 수량 * 단가
		int intTotal = vo.getIntSu() * vo.getIntDan();
		vo.setIntTotal(intTotal);
		this.ioList.add(vo);
	}

	public void iolistPrint() {
		
		System.out.println("매입리스트");
		System.out.println("================================================");
		System.out.println("거래일자\t구분\t품목\t단가\t수량\t합계");
		
		for(IoComeVO io : ioList) {
			if(io.getStrInOut().equals("매입")) {
				System.out.print(io.getStrDate()+"\t");
				System.out.print(io.getStrInOut()+"\t");
				System.out.print(io.getStrPum()+"\t");
				System.out.print(io.getIntDan()+"\t");
				System.out.print(io.getIntSu()+"\t");
				System.out.println(io.getIntTotal());
			} 
		}
		System.out.println();
		System.out.println("매출리스트");
		System.out.println("===================================================");
		System.out.println("거래일자\t구분\t품목\t단가\t수량\t합계");
		
		for(IoComeVO io : ioList) {
			if(io.getStrInOut().equals("매출")) {
				System.out.print(io.getStrDate()+"\t");
				System.out.print(io.getStrInOut()+"\t");
				System.out.print(io.getStrPum()+"\t");
				System.out.print(io.getIntDan()+"\t");
				System.out.print(io.getIntSu()+"\t");
				System.out.println(io.getIntTotal());
			} 
		}
	}
	
}
