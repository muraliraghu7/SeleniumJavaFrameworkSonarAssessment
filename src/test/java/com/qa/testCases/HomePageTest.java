package com.qa.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.baseTest.BaseTest;
import com.qa.pages.HomePage;

public class HomePageTest extends BaseTest{

	
	HomePage home;
	
	@Test(alwaysRun=true)
	public void goToSignInPage() {
		String LoginPageTitle=page.getInstance(HomePage.class).clickOnSignInButton();
		String HomePageTitle=page.getInstance(HomePage.class).returnToHomePage();
		assertEquals(LoginPageTitle, "Login - My Shop");
		assertEquals(HomePageTitle, "My Shop");
	}
	
	@Test(dependsOnMethods= {"goToSignInPage"},alwaysRun=true)
	public void searchAText() {
		String SearchPageTitle=page.getInstance(HomePage.class).enterTextInSearchbar();
		String HomePageTitle=page.getInstance(HomePage.class).returnToHomePage();
		assertEquals(SearchPageTitle, "Search - My Shop");
		assertEquals(HomePageTitle, "My Shop");
	}
	
	@Test(dependsOnMethods= {"searchAText"}, alwaysRun=true)
	public void gotoContactUsPage() {
		String ContactPageTitle=page.getInstance(HomePage.class).clickOnContactUsButton();
		String HomePageTitle=page.getInstance(HomePage.class).returnToHomePage();
		assertEquals(ContactPageTitle, "Contact us - My Shop");
		assertEquals(HomePageTitle, "My Shop");
	}
	
	@Test(dependsOnMethods= {"gotoContactUsPage"}, alwaysRun=true)
	public void gotoCartPage() {
		String OrdertPageTitle=page.getInstance(HomePage.class).clickOnCartButton();
		String HomePageTitle=page.getInstance(HomePage.class).returnToHomePage();
		assertEquals(OrdertPageTitle, "Order - My Shop");
		assertEquals(HomePageTitle, "My Shop");
	}
	
	@Test(dependsOnMethods= {"gotoCartPage"}, alwaysRun=true)
	public void mouseHoverAndClickOnTopsButton() {
		String TopsPageTitle=page.getInstance(HomePage.class).mouseHoverToWomenTabAndClickOnTops();
		String HomePageTitle=page.getInstance(HomePage.class).returnToHomePage();
		assertEquals(TopsPageTitle, "Tops - My Shop");
		assertEquals(HomePageTitle, "My Shop");
	}
	
	@Test(dependsOnMethods= {"mouseHoverAndClickOnTopsButton"}, alwaysRun=true)
	public void mouseHoverAndClickOnDressesButton() {
		String DressesPageTitle=page.getInstance(HomePage.class).mouseHoverToWomenTabAndClickOnDresses();
		String HomePageTitle=page.getInstance(HomePage.class).returnToHomePage();
		assertEquals(DressesPageTitle, "Dresses - My Shop");
		assertEquals(HomePageTitle, "My Shop");
	}
	
	@Test(dependsOnMethods= {"mouseHoverAndClickOnDressesButton"}, alwaysRun=true)
	public void mouseHoverAndClickOnCasualDresses() {
		String CasualDressesPageTitle=page.getInstance(HomePage.class).mouseHoverToDressesTabAndClickOnCasualDresses();
		String HomePageTitle=page.getInstance(HomePage.class).returnToHomePage();
		assertEquals(CasualDressesPageTitle, "Casual Dresses - My Shop");
		assertEquals(HomePageTitle, "My Shop");
	}
	
	@Test(dependsOnMethods= {"mouseHoverAndClickOnCasualDresses"}, alwaysRun=true)
	public void mouseHoverAndClickOnEveningDresses() {
		String EveningDressesPageTitle=page.getInstance(HomePage.class).mouseHoverToDressesTabAndClickOnEveningDresses();
		String HomePageTitle=page.getInstance(HomePage.class).returnToHomePage();
		assertEquals(EveningDressesPageTitle, "Evening Dresses - My Shop");
		assertEquals(HomePageTitle, "My Shop");
	}
	
	@Test(dependsOnMethods= {"mouseHoverAndClickOnEveningDresses"}, alwaysRun=true)
	public void mouseHoverAndClickOnSummerDresses() {
		String SummerDressesPageTitle=page.getInstance(HomePage.class).mouseHoverToDressesTabAndClickOnSummerDresses();
		String HomePageTitle=page.getInstance(HomePage.class).returnToHomePage();
		assertEquals(SummerDressesPageTitle, "Summer Dresses - My Shop");
		assertEquals(HomePageTitle, "My Shop");
	}
	
	@Test(dependsOnMethods= {"mouseHoverAndClickOnSummerDresses"}, alwaysRun=true)
	public void clickOnTshirtsTab() {
		String TshirtsPageTitle=page.getInstance(HomePage.class).ClickOntShirtsTab();
		String HomePageTitle=page.getInstance(HomePage.class).returnToHomePage();
		assertEquals(TshirtsPageTitle, "T-shirts - My Shop");
		assertEquals(HomePageTitle, "My Shop");
	}
	
}
