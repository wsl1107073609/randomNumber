package com.test;

//import java.sql.Array;
//import java.util.Random;

public class RandomNum {

	public boolean NumIsExist(int array[], int n){
		boolean flag= false;
		for(int i=0;i<array.length;i++){
			if(array[i] == n){
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//把输出的数据定义成数组，没有考虑重复性的问题
		int randomNum[] = new int[7];
		for(int i=0;i<7;i++){
			int m = (int) Math.floor(Math.random()*100);
		    randomNum[i] = m;
		    System.out.println(randomNum[i]);
			
		}
		*/
		
		//把输出的数据定义成数组，考虑重复性的问题
		int randomNum[] = new int[7];
		RandomNum rand = new RandomNum();
		for(int i=0;i<7;i++){			
			int m = (int) Math.floor(Math.random()*100);
            boolean flag = rand.NumIsExist(randomNum, m);
            if(flag == true){
            	i = i-1;
            }
            else{
            	randomNum[i] = m;
            	System.out.println(randomNum[i]);
            }
					
		}
		
				
		/*
		//把输出的数据定义成字符串		
		for(int i =0;i<7;i++){
			String randomNum = "";
			int m = (int) Math.floor(Math.random()*100);
			if(randomNum.indexOf(Integer.toString(m)) == -1){
				randomNum += m;
				System.out.println(randomNum);
			}
			else{
				i = i-1;
			}			
		}
		*/
	}
}
