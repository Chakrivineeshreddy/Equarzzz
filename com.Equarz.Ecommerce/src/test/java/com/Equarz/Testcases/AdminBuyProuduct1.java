package com.Equarz.Testcases;

	import org.testng.Assert;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.Pageobjects.AdminScenarios1BuyProduct;
	import com.Pageobjects.Login_Functionality;
	
	import com.base.Testbase;

	public class AdminBuyProuduct1 extends Testbase{
		
		int testid;

		Login_Functionality LOG;
		
		AdminScenarios1BuyProduct Admin;
			
			public AdminBuyProuduct1() {
				super();
				
			}
			@BeforeMethod
			
			public void initialize() {
				Setup();
				LOG= new Login_Functionality(driver);
				Admin = new AdminScenarios1BuyProduct(driver);
			}
			@Test  (testName = "test1")
			public void verifyproduct() throws Throwable {
				
				LOG.Verifylogin();
				Admin.AdminProduct();
//				String url=driver.getCurrentUrl();
//				Assert.assertEquals("http://e-quarz.com/", url);
				

}
	}
