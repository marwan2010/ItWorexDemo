package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.CoursePage;
import Pages.LoginPage;

public class CourseWFlowTest extends TestBase {

	LoginPage loginObject;
	CoursePage courseObj;

	@BeforeClass
	public void Login()

	{
		loginObject = new LoginPage(driver);
		loginObject.enter_email("testregister@aaa.com");
		loginObject.enter_Password_Txt("Wakram_123");
	}

	@Test(priority = 0)
	public void Create_And_SaveAsDraftCourse()

	{
		/*courseObj = new CoursePage(driver);

		loginObject.click_On_btnLogin();
		courseObj.OpenMyCoursesList();
		courseObj.click_On_btnAddCourse();
		courseObj.enter_CourseName("Test");
		courseObj.Select_drpGrade();
		courseObj.click_On_teacherOnBehalf();
		courseObj.click_On_btnSaveAsDraftCourse();
		courseObj.courseNameView("Test");*/

	}

	@Test(priority = 0)
	public void Assert_course_title_is_displayed()

	{

		
		courseObj = new CoursePage(driver);
		courseObj.test();


	}

}
