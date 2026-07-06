package com.typeex;

/* Wrapper Class : 기본 데이터형의 Class화 시킴
 *
 * 기본 데이터형 Class화
 * byte        Byte
 * short       Short 2바이트
 * int          Integer 4바이트
 * long        Long  4바이트
 * float        Float 4바이트
 * double     Double 8바이트
 * boolean   Boolean
 * char        Character
 */



public class wrapperEx {

	public static void main(String[] args) {
	       byte a_min = Byte.MIN_VALUE;
	       byte a_max = Byte.MAX_VALUE;
          short s_min = Short.MIN_VALUE;
         short s_max = Short.MAX_VALUE;
         int i_min = Integer.MIN_VALUE;
         int i_max = Integer.MAX_VALUE;
	    long l_min = Long.MIN_VALUE;
	    long l_max	=	Long.MAX_VALUE;
	    
	    int i_size = Integer.BYTES;
	    System.out.println(i_size);
	       
	       
	       System.out.println("byte : "+a_min+"~"+a_max);
	       System.out.println("short : "+s_min+"~"+s_max);
	   
	}

}
