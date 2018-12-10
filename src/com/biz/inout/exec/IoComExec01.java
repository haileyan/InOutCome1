package com.biz.inout.exec;

import java.util.Scanner;

import com.biz.inout.vo.IoComeVO;
import com.biz.service.IoComeService;

public class IoComExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IoComeService is = new IoComeService();
		// IoComeVO vo = new IoComeVO();

		while (true) {
			IoComeVO vo = ioInsert();
			System.out.println(vo);

			/*
			// vo에 담기는 값은 완성된 vo이거나, null이다
			if (vo != null) {
				if (vo.getStrDate().equals("-1")) {
					System.out.println("종료합니다");
				}
				// 변환과정에서 오류가 있었으면
				if (vo.getIntDan() < 0 || vo.getIntSu() < 0) {
					System.out.println("단가나 수량 입력 오류");
					continue;
				}
				is.ioInOutInsert(vo);
			}
			 */
		}

//		vo.setStrDate("2018-12-10");
//		vo.setStrInOut("매입");
//		vo.setStrPum("새콤달콤");
//		vo.setIntDan(2000);
//		vo.setIntSu(10);

//		is.ioInOutInsert(vo);

	}

	public static IoComeVO ioInsert() {
		IoComeVO vo = new IoComeVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("==============================");
		System.out.println("매입 매출 등록");
		System.out.println("------------------------------");
		System.out.print("거래일(-1:종료) >>");
		String strDate = scan.nextLine();
		vo.setStrDate("-1");
		if (strDate.equals("-1"))
			return null; // 종료코드

		System.out.print("거래방법(매입/매출) >>");
		String strInOut = scan.nextLine();

		System.out.print("품목(상품명) >>");
		String strPum = scan.nextLine();

		try {
			System.out.print("단가 >>");
			String strDan = scan.nextLine();
			int intDan = Integer.valueOf(strDan);

			System.out.print("수량 >>");
			String strSu = scan.nextLine();
			int intSu = Integer.valueOf(strSu);

			vo.setStrDate(strDate);
			vo.setStrInOut(strInOut);
			vo.setStrPum(strPum);
			vo.setIntDan(intDan);
			vo.setIntSu(intSu);
			
		} catch (Exception e) {
			System.out.println("입력이 잘못 되었습니다");
			return null;
			// TODO: handle exception
		}
		return vo;
	}

}
