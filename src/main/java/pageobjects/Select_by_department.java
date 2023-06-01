package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_by_department {
	public WebDriver driver;

	public Select_by_department(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-t='hamburger-navigation-button']")
	WebElement menu;
	@FindBy(xpath = "//button[@data-lid='ubr_cp'] ")
	WebElement computer;
	@FindBy(xpath = "//button[@data-lid='ubr_cp_ld'] ")
	WebElement laptops;
	@FindBy(xpath = "//a[@data-lid='ubr_cp_ld_gaming_laptops'] ")
	WebElement gaminglaptop;
	@FindBy(xpath = "//span[text()='ASUS']")
	WebElement asus;
	@FindBy(xpath = "(//img[@alt='ASUS - TUF Gaming A15 15.6\" FHD 144Hz Gaming Laptop-AMD Ryzen 7-8GB DDR5 Memory-NVIDIA GeForce RTX 3050 Ti-512GB PCIe SSD - Front_Zoom'])[2]")
	WebElement asuslaptop;
	@FindBy(id = "warranty-sku-5802830-warranty-selector")
	WebElement waranty;
	@FindBy(xpath = "//button[@data-sku-id='6535501']")
	WebElement addtocard;
	@FindBy(xpath = "//a[text()='Go to Cart']")
	WebElement gotocard;
	@FindBy(xpath = "//button[@class='c-button c-button-primary c-button-md btn-lg']")
	WebElement titleclick;
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkout;
	

	public void singlemethod() throws InterruptedException {
		menu.click();
		computer.click();
		laptops.click();
		gaminglaptop.click();
		asus.click();
		// asuslaptop.click();
		// waranty.click();
		addtocard.click();
		Thread.sleep(10000);
		gotocard.click();
		titleclick.click();
		Thread.sleep(4000);
		checkout.click();
		

	}
}