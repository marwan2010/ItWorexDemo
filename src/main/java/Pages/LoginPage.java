package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPage extends PagesBase {
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "inputPassword")
	WebElement inputPassword;

	@FindBy(id = "btnLogin")
	WebElement btnLogin;

	@FindBy(id = "btnMyCoursesList")
	WebElement btnMyCoursesList;

	@FindBy(id = "btnListAddCourse")
	WebElement btnListAddCourse;

	@FindBy(id = "txtCourseName")
	WebElement txtCourseName;

	@FindBy(id = "courseSubject")
	WebElement courseSubject;
	@FindBy(id = "courseGrade")
	WebElement courseGrade;

	@FindBy(id = "teacherOnBehalf")
	WebElement teacherOnBehalf;

	@FindBy(xpath = "//input[@type='search']")
	WebElement input_search;

	@FindBy(id = "btnSaveAsDraftCourse")
	WebElement btnSaveAsDraftCourse;
	
	@FindBy(id = "courseNameView")
	WebElement courseNameView;



	public void enter_email(String value)

	{

		setTextElementText(email, value);
	}

	public void enter_Password_Txt(String value)

	{

		setTextElementText(inputPassword, value);
	}

	public void click_On_btnLogin()

	{

		clickButton(btnLogin);

	}

	public void click_On_far()

	{

		clickButton(btnMyCoursesList);

	}

	public void click_On_btnAddCourse()

	{

		clickButton(btnListAddCourse);

	}

	public void enter_CourseName(String value)

	{

		setTextElementText(txtCourseName, value);
	}

	public void Select_drpGrade()

	{
		Select drpCountry = new Select(courseGrade);
		drpCountry.selectByIndex(2);

	}

	public void Select_drpcourseGrade()

	{
		Select drpcourseGrade = new Select(courseGrade);
		drpcourseGrade.selectByIndex(2);

	}

	public void click_On_teacherOnBehalf()

	{

		clickButton(teacherOnBehalf);
		input_search.sendKeys(Keys.ENTER);

	}
	

	public void click_On_ScrollDown()

	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	

	}


	public void click_On_btnSaveAsDraftCourse()

	{
		
		clickButton(btnSaveAsDraftCourse);

	}
	
	public void assert_course_title_is_displayed(String value)

	{
	String ExpectedText =value;

	{Assert.assertEquals(ExpectedText, courseNameView.getText());
	System.out.println(" text is a expected – Assert passed");

		
	}	

	}

}
