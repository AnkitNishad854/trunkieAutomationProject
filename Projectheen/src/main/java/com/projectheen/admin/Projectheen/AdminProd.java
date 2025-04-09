package com.projectheen.admin.Projectheen;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminProd {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://admin.projectheen.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		highlightElement(driver, userName);
		userName.sendKeys("a2025040819875");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		highlightElement(driver, password);
		password.sendKeys("DWG2RRQS");

		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[6]/div[1]/input"));
		checkbox.click();

		WebElement btn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[6]/div[2]"));
		highlightElement(driver, btn);
		btn.click();

		// * Department List *//

		WebElement DepListpBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[1]"));
		highlightElement(driver, DepListpBtn);
		DepListpBtn.click();

		WebElement addDepBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[1]/div[2]/a"));
		highlightElement(driver, addDepBtn);
		addDepBtn.click();

		WebElement depField = driver.findElement(By.xpath("//*[@id=\"departmentName\"]"));
		highlightElement(driver, depField);
		depField.sendKeys("Math");

		WebElement descriptinField = driver.findElement(By.xpath("//*[@id=\"description\"]"));
		highlightElement(driver, descriptinField);
		descriptinField.sendKeys("Test Descp");

		WebElement btnSubmit = driver.findElement(By.xpath("//*[@id=\"saveBtndepartment\"]"));
		highlightElement(driver, btnSubmit);
		btnSubmit.click();

		WebElement btnSucess = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucess);
		btnSucess.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// * Academic Year List *//

		WebElement AcademicYearListBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[2]"));
		highlightElement(driver, AcademicYearListBtn);
		AcademicYearListBtn.click();

		WebElement addAcademicYearListBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[1]/div[2]/a"));
		highlightElement(driver, addAcademicYearListBtn);
		addAcademicYearListBtn.click();

		WebElement FromMonthDropDownBtn = driver.findElement(By.xpath("//*[@id=\"select2-fromMonth-container\"]"));
		highlightElement(driver, FromMonthDropDownBtn);
		FromMonthDropDownBtn.click();

		WebElement FromMonthJanSelect = driver.findElement(By.xpath("//li[text()='Jan']"));
		highlightElement(driver, FromMonthJanSelect);
		FromMonthJanSelect.click();

		WebElement FromYearDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-fromYear-container\"]"));
		highlightElement(driver, FromYearDropdownBtn);
		FromYearDropdownBtn.click();

		WebElement FromYearSelect = driver.findElement(By.xpath("//li[text()='2025']\r\n"));
		highlightElement(driver, FromYearSelect);
		FromYearSelect.click();

		WebElement ToMonthDropDownBtn = driver.findElement(By.xpath("//*[@id=\"select2-toMonth-container\"]"));
		highlightElement(driver, ToMonthDropDownBtn);
		ToMonthDropDownBtn.click();

		WebElement ToMonthJanSelect = driver.findElement(By.xpath("//li[text()='Jan']\r\n"));
		highlightElement(driver, ToMonthJanSelect);
		ToMonthJanSelect.click();

		WebElement toYearDropdownBtn = driver.findElement(By.xpath("//span[@id='select2-toYear-container']"));
		highlightElement(driver, toYearDropdownBtn);
		toYearDropdownBtn.click();

		WebElement ToYearSelect = driver.findElement(By.xpath("//li[text()='2026']"));
		highlightElement(driver, ToYearSelect);
		ToYearSelect.click();

		WebElement btnSave = driver.findElement(By.xpath("//a[@id='saveAcademicYear']"));
		highlightElement(driver, btnSave);
		btnSave.click();

		WebElement btnSucessAcadYear = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessAcadYear);
		btnSucessAcadYear.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// * Employee *//

		WebElement EmployeeBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[3]"));
		highlightElement(driver, EmployeeBtn);
		EmployeeBtn.click();

		WebElement addEmployeeBtn = driver.findElement(By.xpath("//*[@id=\"empList\"]/div/div[2]/a"));
		highlightElement(driver, addEmployeeBtn);
		addEmployeeBtn.click();

		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		highlightElement(driver, FirstName);
		FirstName.sendKeys("Ankit");

		WebElement LastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		highlightElement(driver, LastName);
		LastName.sendKeys("Nishad");

		WebElement BloodGrpDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-bloodGroup-container\"]"));
		highlightElement(driver, BloodGrpDropdownBtn);
		BloodGrpDropdownBtn.click();

		WebElement BloodGrpSelect = driver.findElement(By.xpath("//li[contains(text(), 'O+')]"));
		highlightElement(driver, BloodGrpSelect);
		BloodGrpSelect.click();

		WebElement GenderDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-gender-container\"]"));
		highlightElement(driver, GenderDropdownBtn);
		GenderDropdownBtn.click();

		WebElement GenderSelect = driver.findElement(By.xpath("//li[contains(text(), 'Male')]"));
		highlightElement(driver, GenderSelect);
		GenderSelect.click();

		WebElement dobField = driver.findElement(By.xpath("//input[@id='dob']"));
		highlightElement(driver, dobField);
		dobField.sendKeys("07-01-2000");

		WebElement designation = driver.findElement(By.xpath("//*[@id=\"designation\"]"));
		highlightElement(driver, designation);
		designation.sendKeys("QA");

		WebElement experience = driver.findElement(By.xpath("//*[@id=\"experience\"]"));
		highlightElement(driver, experience);
		experience.sendKeys("2");

		WebElement joiningDateField = driver.findElement(By.xpath("//input[@id='joiningDate']"));
		highlightElement(driver, joiningDateField);
		joiningDateField.sendKeys("01-01-2023");

		WebElement qualification = driver.findElement(By.xpath("//*[@id=\"qualification\"]"));
		highlightElement(driver, qualification);
		qualification.sendKeys("B.Tech");

		WebElement deptnameDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-departmentId-container\"]"));
		highlightElement(driver, deptnameDropdownBtn);
		deptnameDropdownBtn.click();
		
		WebElement deptnameSelect = driver.findElement(By.xpath("//li[@role='treeitem' and text()='Math']"));
		highlightElement(driver, deptnameSelect);
		deptnameSelect.click();

		WebElement empcode = driver.findElement(By.xpath("//*[@id=\"empCode\"]"));
		highlightElement(driver, empcode);
		empcode.sendKeys("167");

		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		highlightElement(driver, email);
		email.sendKeys("ankit.qa2.nishad@gmail.com");

		WebElement confirmEmail = driver.findElement(By.xpath("//*[@id=\"emailCnfrm\"]"));
		highlightElement(driver, confirmEmail);
		confirmEmail.sendKeys("ankit.qa2.nishad@gmail.com");

		WebElement mobileNo = driver.findElement(By.xpath("//*[@id=\"mobileNo\"]"));
		highlightElement(driver, mobileNo);
		mobileNo.sendKeys("9528748159");

		WebElement primaryAdr = driver.findElement(By.xpath("//*[@id=\"primaryAddress\"]"));
		highlightElement(driver, primaryAdr);
		primaryAdr.sendKeys("Knp, UP");

	    WebElement fileInput = driver.findElement(By.id("file"));
	    highlightElement(driver, fileInput);
		fileInput.sendKeys("C:\\Users\\Dell\\Downloads\\images.png");

		WebElement btnSaves = driver.findElement(By.xpath("//*[@id=\"empSaveBtn\"]"));
		highlightElement(driver, btnSaves);
		btnSaves.click();

		WebElement btnSucessAcadYearr = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessAcadYearr);
		btnSucessAcadYearr.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// * Classes & Section List *//

		WebElement ClsandSecBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[4]"));
		highlightElement(driver, ClsandSecBtn);
		ClsandSecBtn.click();

		WebElement addClsandSecBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[2]/div[2]/a"));
		highlightElement(driver, addClsandSecBtn);
		addClsandSecBtn.click();

		WebElement boardNameDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-boardId-container\"]"));
		highlightElement(driver, boardNameDropdownBtn);
		boardNameDropdownBtn.click();

		WebElement boardNameSelect = driver.findElement(By.xpath("//*[contains(@id, 'select2-boardId-result') and text()='CBSE']"));
		highlightElement(driver, boardNameSelect);
		boardNameSelect.click();

		WebElement publisherDropdownBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[1]/div/div[2]/div/span/span[1]/span"));
		highlightElement(driver, publisherDropdownBtn);
		publisherDropdownBtn.click();

		WebElement publisherSelect = driver.findElement(By.xpath("//*[contains(@id, 'select2-publisherName-result') and text()='NCERT']"));
		highlightElement(driver, publisherSelect);
		publisherSelect.click();

		WebElement classNameDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-className-container\"]"));
		highlightElement(driver, classNameDropdownBtn);
		classNameDropdownBtn.click();

		WebElement classNameSelect = driver.findElement(By.xpath("//*[contains(@id, 'select2-className-result') and text()='9']"));
		highlightElement(driver, classNameSelect);
		classNameSelect.click();

		WebElement SectionBtn = driver.findElement(By.xpath("//*[@id=\"sectionNo\"]"));
		highlightElement(driver, SectionBtn);
		SectionBtn.sendKeys("9C");

		WebElement classTeacherDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-employeeId-container\"]"));
		highlightElement(driver, classTeacherDropdownBtn);
		classTeacherDropdownBtn.click();

		WebElement classTeacherSelect = driver.findElement(By.xpath("//li[@role='treeitem' and contains(text(), 'Ankit - 167')]"));
		highlightElement(driver, classTeacherSelect);
		classTeacherSelect.click();

		WebElement DescBtn = driver.findElement(By.xpath("//*[@id=\"stream\"]"));
		highlightElement(driver, DescBtn);
		DescBtn.sendKeys("Test Desc");

		WebElement noOfPeriodBtn = driver.findElement(By.xpath("//*[@id=\"noOfPeriod\"]"));
		highlightElement(driver, noOfPeriodBtn);
		noOfPeriodBtn.sendKeys("6");

		WebElement academicYearDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-academicYearId-container\"]"));
		highlightElement(driver, academicYearDropdownBtn);
		academicYearDropdownBtn.click();

		WebElement academicYearSelect = driver.findElement(By.xpath("//*[contains(@id, 'select2-academicYearId-result') and contains(text(), 'Jan 2025 - Jan 2026')]"));
		highlightElement(driver, academicYearSelect);
		academicYearSelect.click();

		WebElement endDateField = driver.findElement(By.xpath("//*[@id=\"endDate\"]"));
		highlightElement(driver, endDateField);
		endDateField.sendKeys("01-06-2026");

		WebElement saveBtnSection = driver.findElement(By.xpath("//*[@id=\"saveBtnSection\"]"));
		highlightElement(driver, saveBtnSection);
		saveBtnSection.click();

		WebElement btnSucessClassandSec = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessClassandSec);
		btnSucessClassandSec.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// * Classes & Section List Mapping *//
		
		WebElement searchBarBtn = driver.findElement(By.xpath("//*[@id=\"managementTable_filter\"]/ul/span/input"));
		highlightElement(driver, searchBarBtn);
		searchBarBtn.sendKeys("9C");

	
		WebElement ClsAndSectionMappingBtn = driver.findElement(By.xpath("//*[@id=\"managementTable\"]/tbody/tr/td[7]/a/span"));
		highlightElement(driver, ClsAndSectionMappingBtn);
		ClsAndSectionMappingBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='select2-search__field']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	
		WebElement mappingListSelect = driver.findElement(By.xpath("//*[contains(@id, 'select2-subjectIdDiv-result') and contains(text(), 'Math')]"));
		highlightElement(driver, mappingListSelect);
		mappingListSelect.click();
		
		
		WebElement submitmappingBtn = driver.findElement(By.xpath("//a[text()='Submit']"));
		highlightElement(driver, submitmappingBtn);
		submitmappingBtn.click();
		
		WebElement btnSucessMaping = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessMaping);
		btnSucessMaping.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}

		// * Employee Mapping *//
		
		WebElement EmployeBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[3]"));
		highlightElement(driver, EmployeBtn);
		EmployeBtn.click();
		
		WebElement EmployeeMappingBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[2]/div/ul/li[2]/a"));
		highlightElement(driver, EmployeeMappingBtn);
		EmployeeMappingBtn.click();
		
		WebElement selectTeacherDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-teacherId-container\"]"));
		highlightElement(driver, selectTeacherDropdownBtn);
		selectTeacherDropdownBtn.click();
		
		WebElement teacherSelect = driver.findElement(By.xpath("//*[contains(@id, 'select2-teacherId-result') and contains(text(), 'Ankit Nishad - 167')]"));
		highlightElement(driver, teacherSelect);
		teacherSelect.click();
		
		WebElement selectClassSectionDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-sectionId-container\"]"));
		highlightElement(driver, selectClassSectionDropdownBtn);
		selectClassSectionDropdownBtn.click();
		
		WebElement classSectionSelect = driver.findElement(By.xpath("//*[contains(@id, 'select2-sectionId-result') and contains(text(), '9')]"));
		highlightElement(driver, classSectionSelect);
		classSectionSelect.click();
		
		WebElement selectSubjectDropdownBtn = driver.findElement(By.xpath("//*[@id=\"empMapping\"]/div[1]/div[3]/div/span/span[1]/span"));
		highlightElement(driver, selectSubjectDropdownBtn);
		selectSubjectDropdownBtn.click();
		
		WebElement subjectSelect = driver.findElement(By.xpath("//*[contains(@id, 'select2-subjectId-result') and contains(text(), 'Engerring Maths - II')]"));
		highlightElement(driver, subjectSelect);
		subjectSelect.click();
		
		WebElement mapBtn = driver.findElement(By.xpath("//*[@id=\"mappingBtn\"]/a"));
		highlightElement(driver, mapBtn);
		mapBtn.click();

		WebElement btnSucessMap = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessMap);
		btnSucessMap.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		                     //* Student *//
		

		WebElement studentModuleBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[6]"));
		highlightElement(driver, studentModuleBtn);
		studentModuleBtn.click();

		WebElement studentClsSecDropDown = driver.findElement(By.xpath("//*[@id='select2-classSection-container']"));
		highlightElement(driver, studentClsSecDropDown);
		studentClsSecDropDown.click();

		WebElement studentClasSecSelect = driver.findElement(By.xpath("//*[contains(@id, 'select2-classSection-result') and contains(text(), '9-9C')]"));
		highlightElement(driver, studentClasSecSelect);
		studentClasSecSelect.click();

		WebElement addStudentBtn = driver.findElement(By.xpath("//*[@id=\"stuList\"]/div[2]/div[2]/a"));
		highlightElement(driver, addStudentBtn);
		addStudentBtn.click();

		WebElement FirstNameStudent = driver.findElement(By.xpath("//*[@id=\"studentFirstName\"]"));
		highlightElement(driver, FirstNameStudent);
		FirstNameStudent.sendKeys("Ankit");

		WebElement LastNameStudent = driver.findElement(By.xpath("//*[@id=\"studentLastName\"]"));
		highlightElement(driver, LastNameStudent);
		LastNameStudent.sendKeys("Nishad");

		WebElement classNamesDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-className-container\"]"));
		highlightElement(driver, classNamesDropdownBtn);
		classNamesDropdownBtn.click();

		WebElement classSelect = driver.findElement(By.xpath("//li[contains(@id, 'select2-className-result') and text()='9']"));
		highlightElement(driver, classSelect);
		classSelect.click();

		WebElement sectionDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-sectionId-container\"]"));
		highlightElement(driver, sectionDropdownBtn);
		sectionDropdownBtn.click();

		WebElement secSelect = driver.findElement(By.xpath("//*[contains(@id, 'select2-sectionId-result') and contains(text(), '9C (Jan 2025 - Jan 2026)')]"));
		highlightElement(driver, secSelect);
		secSelect.click();

		WebElement sessionStudent = driver.findElement(By.xpath("//*[@id=\"session\"]"));
		highlightElement(driver, sessionStudent);
		sessionStudent.sendKeys("2026");

		WebElement enrollmentIdStudent = driver.findElement(By.xpath("//*[@id=\"enrollmentId\"]"));
		highlightElement(driver, enrollmentIdStudent);
		enrollmentIdStudent.sendKeys("1221");

		WebElement genderDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-gender-container\"]"));
		highlightElement(driver, genderDropdownBtn);
		genderDropdownBtn.click();

		WebElement genderSelect = driver.findElement(By.xpath("//li[contains(@id, 'select2-gender-result') and text()='Male']"));
		highlightElement(driver, genderSelect);
		genderSelect.click();

		WebElement dobFieldStudent = driver.findElement(By.xpath("//*[@id=\"studentDob\"]"));
		highlightElement(driver, dobFieldStudent);
		dobFieldStudent.sendKeys("07-01-2004");

		WebElement bloodgrpDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-bloodGroup-container\"]"));
		highlightElement(driver, bloodgrpDropdownBtn);
		bloodgrpDropdownBtn.click();

		WebElement bloodgrpSelect = driver.findElement(By.xpath("//li[contains(text(), 'O+')]"));
		highlightElement(driver, bloodgrpSelect);
		bloodgrpSelect.click();

		WebElement primaryadrStudent = driver.findElement(By.xpath("//*[@id=\"primaryAddress\"]"));
		highlightElement(driver, primaryadrStudent);
		primaryadrStudent.sendKeys("Gurgaon, India");

		WebElement emailIdStudent = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		highlightElement(driver, emailIdStudent);
		emailIdStudent.sendKeys("ankit.qa2.nishad@gmail.com");

		WebElement cnfrmemailStudent = driver.findElement(By.xpath("//*[@id=\"emailCnfrm\"]"));
		highlightElement(driver, cnfrmemailStudent);
		cnfrmemailStudent.sendKeys("ankit.qa2.nishad@gmail.com");

		WebElement mobileNoStudent = driver.findElement(By.xpath("//*[@id=\"mobileNo\"]"));
		highlightElement(driver, mobileNoStudent);
		mobileNoStudent.sendKeys("9528748159");

		WebElement studentupload = driver.findElement(By.id("file"));
		highlightElement(driver, studentupload);
		studentupload.sendKeys("C:\\Users\\Dell\\Downloads\\images.png");
		
		WebElement activeparentsDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-activeParent-container\"]"));
		highlightElement(driver, activeparentsDropdownBtn);
		activeparentsDropdownBtn.click();
		
		WebElement actvparentsSelect = driver.findElement(By.xpath("//ul[@id='select2-activeParent-results']//li[contains(text(), 'Father')]"));
		highlightElement(driver, actvparentsSelect);
		actvparentsSelect.click();	
		
		WebElement fatherFirstNameStudent = driver.findElement(By.xpath("//*[@id=\"fatherFirstName\"]"));
		highlightElement(driver, fatherFirstNameStudent);
		fatherFirstNameStudent.sendKeys("Ramakant");
		
		WebElement fatherLastNameStudent = driver.findElement(By.xpath("//*[@id=\"fatherLastName\"]"));
		highlightElement(driver, fatherLastNameStudent);
		fatherLastNameStudent.sendKeys("Singh");
		
		WebElement fatheroccupationStudent = driver.findElement(By.xpath("//*[@id=\"fatherOccupation\"]"));
		highlightElement(driver, fatheroccupationStudent);
		fatheroccupationStudent.sendKeys("Doctor");
		
		WebElement fatherMobileNoStudent = driver.findElement(By.xpath("//*[@id=\"fatherPhoneNo\"]"));
		highlightElement(driver, fatherMobileNoStudent);
		fatherMobileNoStudent.sendKeys("9528748158");
		
		WebElement dobFatherStudent = driver.findElement(By.xpath("//*[@id=\"fatherDOB\"]"));
		highlightElement(driver, dobFatherStudent);
		dobFatherStudent.sendKeys("10-04-1980");
		
		WebElement motherFirstNameStudent = driver.findElement(By.xpath("//*[@id=\"motherFirstName\"]"));
		highlightElement(driver, motherFirstNameStudent);
		motherFirstNameStudent.sendKeys("Carry");
		
		WebElement motherLastNameStudent = driver.findElement(By.xpath("//*[@id=\"motherLastName\"]"));
		highlightElement(driver, motherLastNameStudent);
		motherLastNameStudent.sendKeys("Devi");
		
		WebElement motheroccupationStudent = driver.findElement(By.xpath("//*[@id=\"motherOccupation\"]"));
		highlightElement(driver, motheroccupationStudent);
		motheroccupationStudent.sendKeys("Housewife");
		
		WebElement motherMobileNoStudent = driver.findElement(By.xpath("//*[@id=\"motherPhoneNo\"]"));
		highlightElement(driver, motherMobileNoStudent);
		motherMobileNoStudent.sendKeys("9528748158");
		
		WebElement dobmotherStudent = driver.findElement(By.xpath("//*[@id=\"motherDOB\"]"));
		highlightElement(driver, dobmotherStudent);
		dobmotherStudent.sendKeys("17-05-1982");
		
		WebElement saveBtnStudent = driver.findElement(By.xpath("//*[@id=\"studentSaveBtn\"]"));
		highlightElement(driver, saveBtnStudent);
		saveBtnStudent.click();

		WebElement btnSucessStudent = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessStudent);
		btnSucessStudent.click();
			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement studentMapBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[2]/div/ul/li[2]/a"));
		highlightElement(driver, studentMapBtn);
		studentMapBtn.click();
		
		WebElement classSecDropdownMapstudentBtn = driver.findElement(By.xpath("//*[@id=\"select2-sectionId-container\"]"));
		highlightElement(driver, classSecDropdownMapstudentBtn);
		classSecDropdownMapstudentBtn.click();
		
		WebElement classSecSelectMapstudentBtn = driver.findElement(By.xpath("//*[contains(@id, 'select2-sectionId-result') and contains(text(), '9-9C (Jan 2025 - Jan 2026)')]"));
		highlightElement(driver, classSecSelectMapstudentBtn);
		classSecSelectMapstudentBtn.click();
		
		WebElement subjectDropdownMapstudentBtn = driver.findElement(By.xpath("//*[@id=\"select2-subjectId-container\"]"));
		highlightElement(driver, subjectDropdownMapstudentBtn);
		subjectDropdownMapstudentBtn.click();
		
		WebElement subjectcSelectMapstudentBtn = driver.findElement(By.xpath("//*[contains(@id, 'select2-subjectId-result') and contains(text(), 'Engerring Maths - II')]"));
		highlightElement(driver, subjectcSelectMapstudentBtn);
		subjectcSelectMapstudentBtn.click();
		
		WebElement stdListDropdownMapstudentBtn = driver.findElement(By.xpath("//*[@id=\"stuMapping\"]/div[2]/div[1]/div/span/span[1]/span"));
		highlightElement(driver, stdListDropdownMapstudentBtn);
		stdListDropdownMapstudentBtn.click();
		
		WebElement stdListSelectMapstudentBtn = driver.findElement(By.xpath("//*[contains(@id, 'select2-studentId-result') and contains(text(), 'Ankit Nishad')]"));
		highlightElement(driver, stdListSelectMapstudentBtn);
		stdListSelectMapstudentBtn.click();
		
		WebElement selAllSelectMapstudentBtn = driver.findElement(By.xpath("//*[@id=\"chkall\"]"));
		highlightElement(driver, selAllSelectMapstudentBtn);
		selAllSelectMapstudentBtn.click();
		
		WebElement mapBtnStudent = driver.findElement(By.xpath("//*[@id=\"mappingStuBtn\"]/a"));
		highlightElement(driver, mapBtnStudent);
		mapBtnStudent.click();
		
		WebElement btnSucessMapStudent = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessMapStudent);
		btnSucessMapStudent.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		                      //* Chapter List *//
		         
		
		WebElement chapterListBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[8]"));
		highlightElement(driver, chapterListBtn);
		chapterListBtn.click();
		
		WebElement boardDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-boardIdFltr-container\"]"));
		highlightElement(driver, boardDropdownBtn);
		boardDropdownBtn.click();
		
		WebElement boardSelect = driver.findElement(By.xpath("//li[@role='treeitem' and text()='CBSE']"));	
		highlightElement(driver, boardSelect);
		boardSelect.click();
		
		WebElement classDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-sectionId-container\"]"));
		highlightElement(driver, classDropdownBtn);
		classDropdownBtn.click();
		
		WebElement classSelectChapList = driver.findElement(By.xpath("//li[@role='treeitem' and text()='9']"));	
		highlightElement(driver, classSelectChapList);
		classSelectChapList.click();
		
		WebElement subjectDropdownBtn = driver.findElement(By.xpath("//*[@id=\"select2-subjectId-container\"]"));
		highlightElement(driver, subjectDropdownBtn);
		subjectDropdownBtn.click();
		
		WebElement subjectSelectChapTerList = driver.findElement(By.xpath("//li[@role='treeitem' and text()='Engerring Maths - II']"));	
		highlightElement(driver, subjectSelectChapTerList);
		subjectSelectChapTerList.click();
		
		WebElement publisherDropdownBtnChapterL = driver.findElement(By.xpath("//*[@id=\"select2-publisherIdFltr-container\"]"));
		highlightElement(driver, publisherDropdownBtnChapterL);
		publisherDropdownBtnChapterL.click();
		
		WebElement publisherSelectChap = driver.findElement(By.xpath("//li[@role='treeitem' and text()='NCERT']"));		
		highlightElement(driver, publisherSelectChap);
		publisherSelectChap.click();
		
		WebElement addChapterBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[2]/div[2]/a"));
		highlightElement(driver, addChapterBtn);
		addChapterBtn.click();
		
		WebElement chapterNameChapterList = driver.findElement(By.xpath("//*[@id=\"chapterName\"]"));
		highlightElement(driver, chapterNameChapterList);
		chapterNameChapterList.sendKeys("Vector Calculus");
		
		WebElement chapterSectionNameChapterList = driver.findElement(By.xpath("//*[@id=\"chapterDynamicDiv\"]/div/div/div/input"));
		highlightElement(driver, chapterSectionNameChapterList);
		chapterSectionNameChapterList.sendKeys("Line, Surface aur Volume Integrals");
		
		WebElement submitBtnChapterList = driver.findElement(By.xpath("//*[@id=\"saveBtnchapter\"]"));
		highlightElement(driver, submitBtnChapterList);
		submitBtnChapterList.click();

		WebElement btnSucessChapterList = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessChapterList);
		btnSucessChapterList.click();
		
		WebElement searchBarBtnChapterList = driver.findElement(By.xpath("//*[@id=\"managementTable_filter\"]/ul/span/input"));
		highlightElement(driver, searchBarBtnChapterList);
		searchBarBtnChapterList.sendKeys("Vector Calculus");
		
		WebElement mapBtnChapterList = driver.findElement(By.xpath("//*[@id=\"managementTable\"]/tbody/tr/td[6]/a[3]/img"));
		highlightElement(driver, mapBtnChapterList);
		mapBtnChapterList.click();
		
		WebElement addMoreClsSecDropdownBtn = driver.findElement(By.xpath("//*[@id=\"topDis\"]/div/div[1]/span/span[1]/span"));
		highlightElement(driver, addMoreClsSecDropdownBtn);
		addMoreClsSecDropdownBtn.click();
		
		WebElement addMoreClsSecSelect = driver.findElement(By.xpath("//*[contains(@id, 'select2-sectionIdDiv-result') and contains(text(), '9C (Jan 2025 - Jan 2026)')]"));	
		highlightElement(driver, addMoreClsSecSelect);
		addMoreClsSecSelect.click();
		
		WebElement submitmappingBtnChapterList = driver.findElement(By.xpath("//a[contains(text(),'Submit')]"));
		highlightElement(driver, submitmappingBtnChapterList);
		submitmappingBtnChapterList.click();
		
		WebElement btnSucessMapingChap = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessMapingChap);
		btnSucessMapingChap.click();
		
		try {
		Thread.sleep(3000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
		
		        
		                        //* Comprehensive Guide List *//
		
		WebElement comprehensiveListBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[9]"));
		highlightElement(driver, comprehensiveListBtn);
		comprehensiveListBtn.click();
		
		WebElement classDropdownCgListBtn = driver.findElement(By.xpath("//*[@id=\"select2-sectionId-container\"]"));
		highlightElement(driver, classDropdownCgListBtn);
		classDropdownCgListBtn.click();
		
		WebElement classSelectCgList = driver.findElement(By.xpath("//li[contains(@id, 'select2-sectionId-result') and text()='9']"));	
		highlightElement(driver, classSelectCgList);
		classSelectCgList.click();
		
		WebElement boardDropdownCgListBtn = driver.findElement(By.xpath("//*[@id=\"select2-boardId-container\"]"));
		highlightElement(driver, boardDropdownCgListBtn);
	    boardDropdownCgListBtn.click();
		
		WebElement boardSelectCgList = driver.findElement(By.xpath("//li[contains(@id, 'select2-boardId-result') and text()='CBSE']"));	
		highlightElement(driver, boardSelectCgList);
		boardSelectCgList.click();
		
		WebElement subjectDropdownCgListBtn = driver.findElement(By.xpath("//*[@id=\"select2-subjectId-container\"]"));
		highlightElement(driver, subjectDropdownCgListBtn);
		subjectDropdownCgListBtn.click();
		
		WebElement subjectSelectCgList = driver.findElement(By.xpath("//li[@role='treeitem' and contains(text(), 'Engerring Maths - II')]"));
		highlightElement(driver, subjectSelectCgList);
		subjectSelectCgList.click();
		
		WebElement publishertDropdownCgListBtn = driver.findElement(By.xpath("//*[@id=\"select2-publisherId-container\"]"));
		highlightElement(driver, publishertDropdownCgListBtn);
		publishertDropdownCgListBtn.click();
		
		WebElement publisherSelectCgList = driver.findElement(By.xpath("//li[@role='treeitem' and text()='NCERT']"));	
		highlightElement(driver, publisherSelectCgList);
		publisherSelectCgList.click();
		
		WebElement chapterDropdownCgListBtn = driver.findElement(By.xpath("//*[@id=\"select2-chapterId-container\"]"));
		highlightElement(driver, chapterDropdownCgListBtn);
		chapterDropdownCgListBtn.click();
		
		WebElement chapterSelectCgList = driver.findElement(By.xpath("//li[@role='treeitem' and text()='Vector Calculus']"));	
		highlightElement(driver, chapterSelectCgList);
		chapterSelectCgList.click();
		
		WebElement addBtnCgList = driver.findElement(By.xpath("//*[@id=\"managementTable\"]/tbody/tr/td[5]/a/i"));	
		highlightElement(driver, addBtnCgList);
		addBtnCgList.click();
				
		WebElement uploadElement = driver.findElement(By.id("readfileForComp"));
		highlightElement(driver, uploadElement);
		uploadElement.sendKeys("C:\\Users\\Dell\\Desktop\\Projectheen\\Trunkie All Uploaded Materail\\C.G.List\\Detailed_Atoms.pdf");
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.className("modalloader")));

		WebElement fiveStar = driver.findElement(By.xpath("//*[@id='stars']/li[5]/i"));
		highlightElement(driver, fiveStar);
		fiveStar.click();
		
		WebElement importantPointsCgList = driver.findElement(By.xpath("//a[@aria-controls='collapseOne']"));
		highlightElement(driver, importantPointsCgList);
		importantPointsCgList.click();
		
		WebElement uploadImpPoints = driver.findElement(By.id("readfileForImp"));
		highlightElement(driver, uploadImpPoints);
		uploadImpPoints.sendKeys("C:\\Users\\Dell\\Desktop\\Projectheen\\Trunkie All Uploaded Materail\\C.G.List\\Important Points on Atoms.pdf");
		
		WebElement relevantPointsCgList = driver.findElement(By.xpath("//a[@aria-controls='collapseTwo']"));	
		highlightElement(driver, relevantPointsCgList);
		relevantPointsCgList.click();
		
		WebElement uploadRelevantPoints = driver.findElement(By.id("readfileForRel"));
		highlightElement(driver, uploadRelevantPoints);
		uploadRelevantPoints.sendKeys("C:\\Users\\Dell\\Desktop\\Projectheen\\Trunkie All Uploaded Materail\\C.G.List\\Relevant_Points.pdf");
		
		WebElement teacherTipsCgList = driver.findElement(By.xpath("//a[@aria-controls='collapseThree']"));
		highlightElement(driver, teacherTipsCgList);
		teacherTipsCgList.click();
		
		WebElement uploadTeacherTips = driver.findElement(By.id("readfileForTeach"));
		highlightElement(driver, uploadTeacherTips);
		uploadTeacherTips.sendKeys("C:\\Users\\Dell\\Desktop\\Projectheen\\Trunkie All Uploaded Materail\\C.G.List\\Teaching Tips.pdf");
		
		WebElement learningTipsCgList = driver.findElement(By.xpath("//a[@aria-controls='collapseFour']"));	
		highlightElement(driver, learningTipsCgList);
		learningTipsCgList.click();
		
		WebElement uploadlearningTips = driver.findElement(By.id("readfileForLearn"));
		highlightElement(driver, uploadlearningTips);
		uploadlearningTips.sendKeys("C:\\Users\\Dell\\Desktop\\Projectheen\\Trunkie All Uploaded Materail\\C.G.List\\Learning Tips.pdf");
		
		WebElement submitCgListBtn = driver.findElement(By.id("saveBtncomprehensive"));
		highlightElement(driver, submitCgListBtn);
		submitCgListBtn.click();
		
		WebElement btnSucessCgList = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessCgList);
		btnSucessCgList.click();
		
		try {
		Thread.sleep(3000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
		
		
		                         //* Similarity Threshold *//
		
		
		WebElement similarityThresgouldBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[10]"));
		highlightElement(driver, similarityThresgouldBtn);
		similarityThresgouldBtn.click();
		
		WebElement similaritySearchBTn = driver.findElement(By.xpath("//*[@id=\"StdTable_filter\"]/ul/span/input"));
		highlightElement(driver, similaritySearchBTn);
		similaritySearchBTn.sendKeys("Engerring Maths - II");
		
		WebElement similarityRightBtn = driver.findElement(By.xpath("//*[@id=\"StdTable\"]/tbody/tr/td[4]/a/i"));
		highlightElement(driver, similarityRightBtn);
		similarityRightBtn.click();
		
		WebElement btnSucessSimilarityThreshould = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessSimilarityThreshould);
		btnSucessSimilarityThreshould.click();
		
		try {
		Thread.sleep(3000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
		
		                       
		                         //* Question Bank *//
		
		WebElement questionBankBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[11]"));
		highlightElement(driver, questionBankBtn);
		questionBankBtn.click();
		
		WebElement classDropdownQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"select2-sectionId-container\"]"));
		highlightElement(driver, classDropdownQuestionBankBtn);
		classDropdownQuestionBankBtn.click();
		
		WebElement classSelectQuestionBank = driver.findElement(By.xpath("//li[@role='treeitem' and text()='9']"));	
		highlightElement(driver, classSelectQuestionBank);
		classSelectQuestionBank.click();
		
		WebElement boardDropdownQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"select2-boardId-container\"]"));
		highlightElement(driver, boardDropdownQuestionBankBtn);
		boardDropdownQuestionBankBtn.click();
		
		WebElement boardSelectQuestionBank = driver.findElement(By.xpath("//li[@role='treeitem' and text()='CBSE']"));	
		highlightElement(driver, boardSelectQuestionBank);
		boardSelectQuestionBank.click();

		WebElement subjectDropdownQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"select2-subjectId-container\"]"));
		highlightElement(driver, subjectDropdownQuestionBankBtn);
		subjectDropdownQuestionBankBtn.click();
		
		WebElement subjectSelectQuestionBank = driver.findElement(By.xpath("//li[@role='treeitem' and text()='Engerring Maths - II']"));	
		highlightElement(driver, subjectSelectQuestionBank);
		subjectSelectQuestionBank.click();
		
		WebElement publisherDropdownQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"select2-publisherId-container\"]"));
		highlightElement(driver, publisherDropdownQuestionBankBtn);
		publisherDropdownQuestionBankBtn.click();
		
		WebElement publisherSelectQuestionBank = driver.findElement(By.xpath("//li[@role='treeitem' and text()='NCERT']"));	
		highlightElement(driver, publisherSelectQuestionBank);
		publisherSelectQuestionBank.click();
		
		WebElement chapterDropdownQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"select2-chapterId-container\"]"));
		highlightElement(driver, chapterDropdownQuestionBankBtn);
		chapterDropdownQuestionBankBtn.click();
		
		WebElement chapterSelectQuestionBank = driver.findElement(By.xpath("//li[@role='treeitem' and text()='Vector Calculus']"));	
		highlightElement(driver, chapterSelectQuestionBank);
		chapterSelectQuestionBank.click();
		

		WebElement chapterSectionDropdownQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"select2-chapterSecId-container\"]"));
		highlightElement(driver, chapterSectionDropdownQuestionBankBtn);
		chapterSectionDropdownQuestionBankBtn.click();
		
		WebElement chapterSectionSelectQuestionBank = driver.findElement(By.id("select2-chapterSecId-results"));	
		highlightElement(driver, chapterSectionSelectQuestionBank);
		chapterSectionSelectQuestionBank.click();
		
		WebElement addQuestionBtnQuestionBank = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[3]/div[2]/a"));
		highlightElement(driver, addQuestionBtnQuestionBank);
		addQuestionBtnQuestionBank.click();
		
		WebElement typologyDropdownQuestionBankBtn = driver.findElement(By.id("select2-typologyId-container"));
		highlightElement(driver, typologyDropdownQuestionBankBtn);
		typologyDropdownQuestionBankBtn.click();
		
		WebElement typologySelectQuestionBank = driver.findElement(By.xpath("//li[@role='treeitem' and text()='Analysing']"));	
		highlightElement(driver, typologySelectQuestionBank);
		typologySelectQuestionBank.click();
		
		WebElement quesTypeDropdownQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"select2-questionType-container\"]"));
		highlightElement(driver, quesTypeDropdownQuestionBankBtn);
		quesTypeDropdownQuestionBankBtn.click();
		
		WebElement quesTypeySelectQuestionBank = driver.findElement(By.xpath("//li[@role='treeitem' and text()='Basic']"));	
		highlightElement(driver, quesTypeySelectQuestionBank);
		quesTypeySelectQuestionBank.click();
		
		WebElement idenTypeDropdownQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"select2-identifierId-container\"]"));
		highlightElement(driver, idenTypeDropdownQuestionBankBtn);
		idenTypeDropdownQuestionBankBtn.click();
		
		WebElement idenTypySelectQuestionBank = driver.findElement(By.xpath("//li[@role='treeitem' and text()='One word answer']"));
		highlightElement(driver, idenTypySelectQuestionBank);
		idenTypySelectQuestionBank.click();
		
		WebElement appearanceQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"appearance\"]"));
		highlightElement(driver, appearanceQuestionBankBtn);
		appearanceQuestionBankBtn.sendKeys("4");
		
		WebElement examQuesSelectQuestionBank = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[1]/div[1]/div[13]/div/input[2]"));
		highlightElement(driver, examQuesSelectQuestionBank);
		examQuesSelectQuestionBank.click();
				
		WebElement quesSelectndFillQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"myFirstQuill\"]/div[1]"));
		highlightElement(driver, quesSelectndFillQuestionBankBtn);
		quesSelectndFillQuestionBankBtn.sendKeys("What is the one-word answer for Vector Calculus or Line, Surface and Volume Integrals");
		
		WebElement anserQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"myFirstQuillAnswer\"]/div[1]"));
		highlightElement(driver, anserQuestionBankBtn);
		anserQuestionBankBtn.sendKeys("Multivariable");
		
		WebElement diffLevelDropdownQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"select2-difficultyId-container\"]"));
		highlightElement(driver, diffLevelDropdownQuestionBankBtn);
		diffLevelDropdownQuestionBankBtn.click();
		
		WebElement diffLevelSelectQuestionBank = driver.findElement(By.xpath("//li[@role='treeitem' and text()='Hard']"));	
		highlightElement(driver, diffLevelSelectQuestionBank);
		diffLevelSelectQuestionBank.click();
		
		WebElement impRatingDropdownQuestionBankBtn = driver.findElement(By.xpath("//*[@id=\"select2-ratingId-container\"]"));
		highlightElement(driver, impRatingDropdownQuestionBankBtn);
		impRatingDropdownQuestionBankBtn.click();
		
		WebElement impRatSelectQuestionBank = driver.findElement(By.xpath("//li[@role='treeitem' and text()='2']"));
		highlightElement(driver, impRatSelectQuestionBank);
		impRatSelectQuestionBank.click();
		
		WebElement checkSimiQuestionBank = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[1]/div[7]/div/button[1]"));
		highlightElement(driver, checkSimiQuestionBank);
		checkSimiQuestionBank.click();
		
		WebElement saveQuesBankBtn = driver.findElement(By.xpath("//*[@id=\"saveBtnquestionBank\"]"));
		highlightElement(driver, saveQuesBankBtn);
		saveQuesBankBtn.click();
		
		WebElement btnSucessComgList = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessComgList);
		btnSucessComgList.click();
		
		try {
		Thread.sleep(3000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

		                            //* Syllabus List *//
		
		WebElement syllabusListBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[12]"));
		highlightElement(driver, syllabusListBtn);
		syllabusListBtn.click();
		
		WebElement classSectionDropdownSyllabusListBtn = driver.findElement(By.xpath("//*[@id=\"select2-sectionId-container\"]"));
		highlightElement(driver, classSectionDropdownSyllabusListBtn);
		classSectionDropdownSyllabusListBtn.click();
		
		WebElement chapterSectionSelectQuesBank = driver.findElement(By.xpath("//li[@role='treeitem' and contains(text(),'9-9C')]"));
		highlightElement(driver, chapterSectionSelectQuesBank);
		chapterSectionSelectQuesBank.click();
		
		WebElement addSyllabusListBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[2]/div[2]/a"));
		highlightElement(driver, addSyllabusListBtn);
		addSyllabusListBtn.click();
		
		WebElement nameSyllabusList = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		highlightElement(driver, nameSyllabusList);
		nameSyllabusList.sendKeys("Trunkie MCQ");
		
		WebElement descSyllabusList = driver.findElement(By.xpath("//*[@id=\"description\"]"));
		highlightElement(driver, descSyllabusList);
		descSyllabusList.sendKeys("Test Desc");
		
		WebElement fileInputSyllabusList = driver.findElement(By.xpath("//*[@id='inp']"));
		highlightElement(driver, fileInputSyllabusList);
		fileInputSyllabusList.sendKeys("C:\\Users\\Dell\\Desktop\\Projectheen\\Trunkie All Uploaded Materail\\Syllabus List\\Science Syllabus List.pdf");
		
		WebElement saveSyllabusListBtn = driver.findElement(By.xpath("//*[@id=\"saveBtnsyllabus\"]"));
		highlightElement(driver, saveSyllabusListBtn);
		saveSyllabusListBtn.click();
		
		WebElement btnSucessCompregList = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessCompregList);
		btnSucessCompregList.click();
		
		try {
		Thread.sleep(3000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
		
		                         //* Text Book Link *//
		
		WebElement textBookLinkBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[13]"));
		highlightElement(driver, textBookLinkBtn);
		textBookLinkBtn.click();
		
		WebElement boardDropdownTextBookLinkBtn = driver.findElement(By.xpath("//*[@id=\"select2-boardIdFltr-container\"]"));
		highlightElement(driver, boardDropdownTextBookLinkBtn);
		boardDropdownTextBookLinkBtn.click();
		
		WebElement boardSelectTextBookLink = driver.findElement(By.xpath("//li[@role='treeitem' and text()='CBSE']"));
		highlightElement(driver, boardSelectTextBookLink);
		boardSelectTextBookLink.click();
		
		WebElement classDropdownTextBookLinkBtn = driver.findElement(By.xpath("//*[@id=\"select2-sectionId-container\"]"));
		highlightElement(driver, classDropdownTextBookLinkBtn);
		classDropdownTextBookLinkBtn.click();
		
		WebElement classSelectTextBookLink = driver.findElement(By.xpath("//li[@role='treeitem' and text()='9']"));	
		highlightElement(driver, classSelectTextBookLink);
		classSelectTextBookLink.click();
		
		WebElement subjectDropdownTextBookLinkBtn = driver.findElement(By.xpath("//*[@id=\"select2-subjectId-container\"]"));
		highlightElement(driver, subjectDropdownTextBookLinkBtn);
		subjectDropdownTextBookLinkBtn.click();
		
		WebElement subjectSelectTextBookLink = driver.findElement(By.xpath("//li[@role='treeitem' and text()='Engerring Maths - II']"));
		highlightElement(driver, subjectSelectTextBookLink);
		subjectSelectTextBookLink.click();
		
		WebElement publisherDropdownTextBookLinkBtn = driver.findElement(By.xpath("//*[@id=\"select2-publisherIdFltr-container\"]"));
		highlightElement(driver, publisherDropdownTextBookLinkBtn);
		publisherDropdownTextBookLinkBtn.click();
		
		WebElement publisherSelectTextBookLink = driver.findElement(By.xpath("//li[@role='treeitem' and text()='NCERT']"));		
		highlightElement(driver, publisherSelectTextBookLink);
		publisherSelectTextBookLink.click();
		
		WebElement addTextBookLinkBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[2]/div[2]/a"));
		highlightElement(driver, addTextBookLinkBtn);
		addTextBookLinkBtn.click();
		
		WebElement nameTextBookLink = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		highlightElement(driver, nameTextBookLink);
		nameTextBookLink.sendKeys("Engineering Math pdf");
		
		WebElement descTextBookLink = driver.findElement(By.xpath("//*[@id=\"description\"]"));
		highlightElement(driver, descTextBookLink);
		descTextBookLink.sendKeys("Test Desc");
		
		WebElement urlTextBookLink = driver.findElement(By.xpath("//*[@id=\"url\"]"));
		highlightElement(driver, urlTextBookLink);
		urlTextBookLink.sendKeys("https://ncert.nic.in/textbook.php?iesc1=0-12");
		
		WebElement saveTextBookLinkBtn = driver.findElement(By.xpath("//*[@id=\"saveBtntextBookLink\"]"));
		highlightElement(driver, saveTextBookLinkBtn);
		saveTextBookLinkBtn.click();
		
		WebElement btnSucessCompgList = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessCompgList);
		btnSucessCompgList.click();
		
		WebElement searchTextBookLink = driver.findElement(By.xpath("//*[@id=\"managementTable_filter\"]/ul/span/input"));
		highlightElement(driver, searchTextBookLink);
		searchTextBookLink.sendKeys("Engineering Math pdf");
		
		WebElement mapBtnTextBookLink = driver.findElement(By.xpath("//*[@id=\"managementTable\"]/tbody/tr/td[4]/a[3]/img"));
		highlightElement(driver, mapBtnTextBookLink);
		mapBtnTextBookLink.click();
		
		WebElement clasSecDropDownTextBookLink = driver.findElement(By.xpath("//*[@id=\"topDis\"]/div/div[1]/span/span[1]/span"));
		highlightElement(driver, clasSecDropDownTextBookLink);
		clasSecDropDownTextBookLink.click();
		
		WebElement classSecTextBookLink = driver.findElement(By.xpath("//*[contains(@id, 'select2-sectionIdDiv-result') and contains(text(), '9C (Jan 2025 - Jan 2026)')]"));
		highlightElement(driver, classSecTextBookLink);
		classSecTextBookLink.click();
		
		WebElement submitmapTextBookLinkBtn = driver.findElement(By.xpath("//a[contains(text(), 'Submit')]"));
		highlightElement(driver, submitmapTextBookLinkBtn);
		submitmapTextBookLinkBtn.click();
		
		WebElement btnSucessCguideList = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessCguideList);
		btnSucessCguideList.click();
		
		try {
		Thread.sleep(3000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
		
		
		                           //* Notification List *//
		
		WebElement notificationListBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[14]"));
		highlightElement(driver, notificationListBtn);
		notificationListBtn.click();
		
		WebElement addnotificationBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[1]/div[2]/a"));
		highlightElement(driver, addnotificationBtn);
		addnotificationBtn.click();
		
		WebElement headingNotificationList = driver.findElement(By.xpath("//*[@id=\"heading\"]"));
		highlightElement(driver, headingNotificationList);
		headingNotificationList.sendKeys("Annual Funtion");
		
		WebElement descNotificationList = driver.findElement(By.xpath("//*[@id=\"description\"]"));
		highlightElement(driver, descNotificationList);
		descNotificationList.sendKeys("Test Desc");
		
		WebElement startDateNotificationList = driver.findElement(By.xpath("//input[@id='date']"));
		highlightElement(driver, startDateNotificationList);
		startDateNotificationList.sendKeys("01-05-2025");
		
		WebElement endtDateNotificationList = driver.findElement(By.xpath("//*[@id='expiryDate']"));
		highlightElement(driver, endtDateNotificationList);
		endtDateNotificationList.sendKeys("02-05-2025");
		
		WebElement saveNotificationListBtn = driver.findElement(By.xpath("//*[@id=\"saveBtnnotification\"]"));
		highlightElement(driver, saveNotificationListBtn);
		saveNotificationListBtn.click();
		
		WebElement btnSucessComguideList = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessComguideList);
		btnSucessComguideList.click();
		
		try {
		Thread.sleep(3000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
		
		
		                               //* Calendar Event *//
		
		
		WebElement notificationListBtnCalen = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[15]"));
		highlightElement(driver, notificationListBtnCalen);
		notificationListBtnCalen.click();
		
		WebElement addnotificationBtnCalender = driver.findElement(By.xpath("//*[@id='mainDiv']/div[1]/div[2]/a"));
		highlightElement(driver, addnotificationBtnCalender);
		addnotificationBtnCalender.click();
		
		WebElement typeDropdownCalenderEvent = driver.findElement(By.xpath("//*[@id=\"select2-type-container\"]"));
		highlightElement(driver, typeDropdownCalenderEvent);
		typeDropdownCalenderEvent.click();
		
		WebElement classSecTextBookLinkCalender = driver.findElement(By.xpath("//li[@role='treeitem' and text()='Event']"));
		highlightElement(driver, classSecTextBookLinkCalender);
		classSecTextBookLinkCalender.click();
		
		WebElement descCalenderEvent = driver.findElement(By.xpath("//*[@id=\"description\"]"));
		highlightElement(driver, descCalenderEvent);
		descCalenderEvent.sendKeys("Test Desc");
		
		WebElement fromDateCalenderEvent = driver.findElement(By.xpath("//*[@id='fromDate']"));
		highlightElement(driver, fromDateCalenderEvent);
		fromDateCalenderEvent.sendKeys("01-05-2025");
		
		WebElement totDateCalenderEvent = driver.findElement(By.xpath("//*[@id='toDate']"));
		highlightElement(driver, totDateCalenderEvent);
		totDateCalenderEvent.sendKeys("02-05-2025");
		
		WebElement saveCalenderEventBtn = driver.findElement(By.xpath("//*[@id=\"saveBtnevent\"]"));
		highlightElement(driver, saveCalenderEventBtn);
		saveCalenderEventBtn.click();
		
		WebElement btnSucessCalenderEvent = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessCalenderEvent);
		btnSucessCalenderEvent.click();
		
		try {
		Thread.sleep(3000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
		
		                                    //* VC - Links *//
		
		WebElement vcLinksBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[16]"));
		highlightElement(driver, vcLinksBtn);
		vcLinksBtn.click();
		
		WebElement clsSecDropdownVcLinksBtn = driver.findElement(By.xpath("//*[@id=\"select2-sectionId-container\"]"));
		highlightElement(driver, clsSecDropdownVcLinksBtn);
		clsSecDropdownVcLinksBtn.click();
		
		WebElement clsSecSelectVcLinks = driver.findElement(By.xpath("//*[contains(@id, 'select2-sectionId-result') and contains(text(), '9C (Jan 2025 - Jan 2026)')]"));	
		highlightElement(driver, clsSecSelectVcLinks);
		clsSecSelectVcLinks.click();
		
		WebElement addVcLinkBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[2]/div[2]/a"));
		highlightElement(driver, addVcLinkBtn);
		addVcLinkBtn.click();
		
		WebElement hostusrNameVcLinks = driver.findElement(By.xpath("//*[@id=\"hostUserName\"]"));
		highlightElement(driver, hostusrNameVcLinks);
		hostusrNameVcLinks.sendKeys("ankitnishad");
		
		WebElement hostPassVcLinks = driver.findElement(By.xpath("//*[@id=\"hostPassword\"]"));
		highlightElement(driver, hostPassVcLinks);
		hostPassVcLinks.sendKeys("ankitnishad@1221");
		
		WebElement urlVcLinks = driver.findElement(By.xpath("//*[@id=\"url\"]"));
		highlightElement(driver, urlVcLinks);
		urlVcLinks.sendKeys("https://meet.google.com/uqh-gaqt-pqs\r\n");
		
		WebElement descVcLinks = driver.findElement(By.xpath("//*[@id=\"description\"]"));
		highlightElement(driver, descVcLinks);
		descVcLinks.sendKeys("Test Descr");
		
		WebElement submitVcLinks = driver.findElement(By.xpath("//*[@id=\"saveBtnvclink\"]"));
		highlightElement(driver, submitVcLinks);
		submitVcLinks.sendKeys("Test Descr");
			
		WebElement btnSucessVcLinks = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessVcLinks);
		btnSucessVcLinks.click();
		
		try {
		Thread.sleep(3000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
		
		                                        //* Exam Term *//
	
		WebElement examTermBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[17]"));
		highlightElement(driver, examTermBtn);
		examTermBtn.click();
		
		WebElement clsDropdownExamTermBtn = driver.findElement(By.xpath("//*[@id=\"select2-sectionId-container\"]"));
		highlightElement(driver, clsDropdownExamTermBtn);
		clsDropdownExamTermBtn.click();
		
		WebElement clsSelectExamterm = driver.findElement(By.xpath("//li[@role='treeitem' and text()='9']"));	
		highlightElement(driver, clsSelectExamterm);
		clsSelectExamterm.click();
		
		WebElement addExamTermBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[2]/div[2]/a"));
		highlightElement(driver, addExamTermBtn);
		addExamTermBtn.click();
		
		WebElement examterm = driver.findElement(By.xpath("//*[@id=\"examDynamicDiv\"]/div/div[1]/div/input"));
		highlightElement(driver, examterm);
		examterm.sendKeys("PUT Exam");
		
		WebElement quesThreshould = driver.findElement(By.xpath("//*[@id=\"examDynamicDiv\"]/div/div[2]/div/input"));
		highlightElement(driver, quesThreshould);
		quesThreshould.sendKeys("80");
		
		WebElement duedays = driver.findElement(By.xpath("//*[@id=\"examDynamicDiv\"]/div/div[3]/div/input"));
		highlightElement(driver, duedays);
		duedays.sendKeys("1");
		
		WebElement noOfRecQues = driver.findElement(By.xpath("//*[@id=\"examDynamicDiv\"]/div/div[4]/div/input"));
		highlightElement(driver, noOfRecQues);
		noOfRecQues.sendKeys("2");
		
		WebElement standardDropDownBtn = driver.findElement(By.xpath("//*[@id=\"examDynamicDiv\"]/div/div[5]/div/span/span[1]/span"));
		highlightElement(driver, standardDropDownBtn);
		standardDropDownBtn.click();
		
		WebElement standardSelectBtn = driver.findElement(By.xpath("//li[@role='treeitem' and text()='9']"));
		highlightElement(driver, standardSelectBtn);
		standardSelectBtn.click();
		
		WebElement submitExamTermBtn = driver.findElement(By.xpath("//*[@id=\"saveBtnexam\"]"));
		highlightElement(driver, submitExamTermBtn);
		submitExamTermBtn.click();
			
		WebElement btnSucessExamTerm = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessExamTerm);
		btnSucessExamTerm.click();
		
		try {
		Thread.sleep(3000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
		
		
		                                     //* Exam Pattern *//
		
		WebElement examPattBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[18]"));
		highlightElement(driver, examPattBtn);
		examPattBtn.click();
		
		WebElement boardExamPattDropDownBtn = driver.findElement(By.xpath("//*[@id=\"select2-boardId-container\"]"));
		highlightElement(driver, boardExamPattDropDownBtn);
		boardExamPattDropDownBtn.click();
		
		WebElement boardExamPattSelectBtn = driver.findElement(By.xpath("//li[@role='treeitem' and text()='CBSE']"));
		highlightElement(driver, boardExamPattSelectBtn);
		boardExamPattSelectBtn.click();
		
		WebElement clsExamPattDropDownBtn = driver.findElement(By.xpath("//*[@id=\"select2-stdId-container\"]"));
		highlightElement(driver, clsExamPattDropDownBtn);
		clsExamPattDropDownBtn.click();
		
		WebElement clsExamPattSelectBtn = driver.findElement(By.xpath("//li[@role='treeitem' and text()='9']"));
		highlightElement(driver, clsExamPattSelectBtn);
		clsExamPattSelectBtn.click();
		
		WebElement searchExamPattern = driver.findElement(By.xpath("//*[@id=\"managementTable_filter\"]/ul/span/input"));
		highlightElement(driver, searchExamPattern);
		searchExamPattern.sendKeys("Cycle Test");
		
		WebElement examPatternMapBtn = driver.findElement(By.xpath("//*[@id=\"managementTable\"]/tbody/tr/td[4]/a[3]/img"));
		highlightElement(driver, examPatternMapBtn);
		examPatternMapBtn.click();
		
		WebElement clsSecExamPattDropDownBtn = driver.findElement(By.xpath("//*[@id=\"topDis\"]/div/div[1]/span/span[1]/span"));
		highlightElement(driver, clsSecExamPattDropDownBtn);
		clsSecExamPattDropDownBtn.click();
		
		WebElement clsSecExamPattSelectBtn = driver.findElement(By.xpath("//*[contains(@id, 'select2-sectionIdDiv-result') and contains(text(), '9C (Jan 2025 - Jan 2026)')]"));
		highlightElement(driver, clsSecExamPattSelectBtn);
		clsSecExamPattSelectBtn.click();
		
		WebElement submitExamTermMapBtn = driver.findElement(By.xpath("//a[contains(@class, 'AddModlBtn') and text()='Submit']"));
		highlightElement(driver, submitExamTermMapBtn);
		submitExamTermMapBtn.click();
			
		WebElement btnSucessExampatternMapBtn = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucessExampatternMapBtn);
		btnSucessExampatternMapBtn.click();
		
		WebElement bulkTempDowntBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[19]"));
		highlightElement(driver, bulkTempDowntBtn);
		bulkTempDowntBtn.click();
		
		WebElement bulkTempEmpDowntBtn = driver.findElement(By.xpath("//*[@id=\"BulkTempDown\"]/table/tbody/tr[4]/td[3]/a"));
		highlightElement(driver, bulkTempEmpDowntBtn);
		bulkTempEmpDowntBtn.click();
		
		WebElement bulkTempStupDowntBtn = driver.findElement(By.xpath("//*[@id=\"BulkTempDown\"]/table/tbody/tr[5]/td[3]/a"));
		highlightElement(driver, bulkTempStupDowntBtn);
		bulkTempStupDowntBtn.click();
		
		WebElement bulkTempClosepDowntBtn = driver.findElement(By.xpath("//*[contains(@id, 'topDis')]/div/div[2]/a[contains(text(), 'Close')]"));
		highlightElement(driver, bulkTempClosepDowntBtn);
		bulkTempClosepDowntBtn.click();
		
		
	}
	
	    public static void highlightElement(WebDriver driver, WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].style.background='Yellow'; arguments[0].style.border='2px solid Red';", element);
	}
}