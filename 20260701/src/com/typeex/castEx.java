package com.typeex;

public class castEx {

	public static void main(String[] args) {
		
		/* 자동형변환(묵시적 형변환) (작은데이터에 큰데이터를 집어넣기) :큰 자료형으로 변환시킴 -> 정보의 손실이 없다.
		   - 작은 데이터형을 큰 데아터형으로 변환할때 사용한다.
		   - 컴파일러가 자동으로 변환시켜 줌
		*/
		
		
		
		short a,b;
		a=10; 
		b=10;
		
      int c= a+ b;		
		
      /*강제형변환(명시적형변환)
       * -큰 데이터형을 작은 데이터형으로 변환할때 사용한다.
       * -캐스터 연산자를 사용한다.
       * -값의 정밀도를 잃어버림(정보의 손실이 있음)
       * 
       */
      
      int i=0;
      short s=10;
      
      i =(int) (10 + 3.5f);
     System.out.println(i); 

     
     //숫자를 문자열로 변환 (그니깐 더하면 20이 아니라 10 10의 문자가 붙었음)
     String s1= String.valueOf(10.0);
     String s2= String.valueOf(10.0);
     
     String s3=s1+s2;
     System.out.println(s3);
     
     //문자열을 숫자로 변환
     
     /*  (c
     int i1 = Integer.parseInt(s1);
     int i2 = Integer.parseInt(s2);
     int i3 = i1 + i2;
     System.out.println(i3);
     */
     double d1 = Double.parseDouble(s1);
     double d2 = Double.parseDouble(s2);
     double d3 = d1 + d2;
     System.out.println(d3);
     
     
	}

}
