package com.biz.inout.exec;

import java.util.Scanner;

import com.biz.inout.vo.IoComeVO;
import com.biz.service.IoComeService;

public class IoComExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IoComeService is = new IoComeService();
		// IoComeVO vo = new IoComeVO();

		while (true) {
			IoComeVO vo = ioInsert();
			System.out.println(vo);
			if(vo == null) break;
			
			is.ioInOutInsert(vo); // null이 아닌경우
		}
		
		is.iolistPrint();
	}

	public static IoComeVO ioInsert() {
		IoComeVO vo = new IoComeVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("==============================");
		System.out.println("매입 매출 등록");
		System.out.println("------------------------------");
		System.out.print("거래일(-1:종료) >>");
		String strDate = scan.nextLine();
		if (strDate.equals("-1"))
			return null; // 종료코드
							// 나머지 코드를 실행하지 말고 중단

		System.out.print("거래방법(매입/매출) >>");
		String strInOut = scan.nextLine();

		System.out.print("품목(상품명) >>");
		String strPum = scan.nextLine();

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
	
		// 모든 입력과 변환이 정상적으로 완료되면
		// vo를 main으로 return
		return vo;
	}

}
