package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	public static WebDriver driver = null;

	@Given("Open http:\\/\\/elearningm{int}.upskills.in\\/index.php")
	public void open_http_elearningm_upskills_in_index_php(Integer int1) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\WTEAutomation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://elearningm1.upskills.in/index.php");
		driver.manage().window().maximize();
		

	}

	@Given("Click signUp")
	public void click_signUp() throws InterruptedException {

		WebElement singup = driver.findElement(By.xpath("//*[text()=' Sign up! ']"));
		singup.click();
		

	}

	@When("YOu need to fill up the registeration Form for all mandatory fields")
	public void you_need_to_fill_up_the_registeration_Form_for_all_mandatory_fields() throws InterruptedException {
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		firstname.sendKeys("Ankit");
		

		WebElement lastname = driver.findElement(By.xpath("//*[@name='lastname']"));
		lastname.sendKeys("Sharma");
		

		WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
		email.sendKeys("test" + Math.random() + "@mail.com");
		

		WebElement official_code = driver.findElement(By.xpath("//*[@name='official_code']"));
		official_code.sendKeys("test1234");
		

		WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
		username.sendKeys("AnkitSpartan"+ Math.random());
		

		WebElement pass1 = driver.findElement(By.xpath("//*[@name='pass1']"));
		pass1.sendKeys("AnkitSpartan123");
		

		WebElement pass2 = driver.findElement(By.xpath("//*[@name='pass2']"));
		pass2.sendKeys("AnkitSpartan123");
		

		WebElement phone = driver.findElement(By.xpath("//*[@name='phone']"));
		phone.sendKeys("1234567890");
		

		WebElement drop1 = driver.findElements(By.xpath("//button[@type='button' and @title='Upon reception']")).get(0);
		drop1.click();
		
		WebElement ele1 = driver.findElement(By.xpath("(//span[text()='Once a day'])[1]"));

		ele1.click();
		

		WebElement drop2 = driver.findElements(By.xpath("//button[@type='button' and @title='Upon reception']")).get(1);
		drop2.click();
		
		WebElement ele2 = driver.findElement(By.xpath("(//span[text()='Once a day'])[4]"));
		ele2.click();
		

	}

	@When("click on Submit button")
	public void click_on_Submit_button() throws InterruptedException {
		WebElement registerbtn = driver.findElement(By.xpath("//button[@name='submit']"));
		registerbtn.click();
		
	}

	@When("Verify Message {string}")
	public void verify_Message(String string) throws InterruptedException {
		WebElement ele2 = driver.findElement(By.xpath("//*[text()='Your personal settings have been registered.']"));
		String Actualtext = ele2.getText();
		String Expectedtext = "Your personal settings have been registered";
		if (Actualtext.matches(Expectedtext))
			System.out.println("Message has been verified");
		

	}

	@Then("Click on Next")
	public void click_on_Next() throws InterruptedException {
		WebElement next = driver.findElement(By.xpath("//*[@name='next']"));
		next.click();
		
	}

	@Then("Verify home page title")
	public void verify_home_page_title() throws InterruptedException {
		WebElement logoutTitle = driver.findElement(By.xpath("//*[@title='Logout']"));

		String Actualtext = logoutTitle.getText();
		String Expectedtext = "Logout";
		if (Actualtext.matches(Expectedtext))
			System.out.println("Title has been verified");
		

	}

	@Then("click your username")
	public void once_on_HomePage_click_your_username() {
		driver.findElement(By.xpath("(//span[@class='caret'])[1]")).click();
	}

	@Then("Choose profile from Dropdown")
	public void choose_profile_from_Dropdown() {
		driver.findElement(By.xpath("//a[normalize-space()='Profile']")).click();
	}

	@Then("Click on Messages")
	public void click_on_Messages() {
		driver.findElement(By.xpath("//a[normalize-space()='Messages']")).click();
	}

	@Then("Click on Compose message")
	public void click_on_Compose_Message() throws InterruptedException {
		driver.findElement(By.xpath("//img[@title='Compose message']")).click();
		
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("test FST IBM");
		
		driver.findElement(By.xpath("//*[@name='title']")).sendKeys("test FST IBM Testing");
		Thread.sleep(5000);
		WebElement iframe = driver.findElement(By.xpath("//*[@title='Rich Text Editor, content']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Spartan");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='file-descrtiption']")).sendKeys("Thanks Ankit Sharma");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.quit();
		System.out.println("Finish !!!");
		
	}
	
	
		
}
