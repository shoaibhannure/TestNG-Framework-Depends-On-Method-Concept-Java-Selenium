package com.shoaib.testng;

import org.testng.annotations.Test;

/*
 * 
 * Author:- Shoaib Hannure
 * 
 */
public class DependsOnMethodConcept {
	@Test
	public void loginTest(){
		System.out.println("This is Login Test");
		int i=2/0;
		System.out.println(i);
	}
//	 If Any Method is dependent on another Method in that case if Base Method
//	 Fails then dependent Method will not be executed and hence it will be shown in
//	 skipped

	@Test(dependsOnMethods="loginTest")
	public void homePage(){
		System.out.println("This is Home Page Test");
	}
    @Test
    public void searchPageText(){
	System.out.println("This is search Page Text");
}

}


