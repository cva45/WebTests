package locators;


import org.openqa.selenium.By;

public class OrangeHRM {
	
	public static class Login{
		public static class TextBox{
			public static By txtUserName = By.id("txtUsername");
			public static By txtPassword = By.id("txtPassword");
		}
		public static class Button{
			public static By btnlogin = By.id("btnLogin");			
		}	
	}

		//Home page locators
		public static class Homepage
		{
			public static class Button
			{
				public static By btnWelcome = By.id("welcome");
				public static By btnLogOut = By.linkText("Logout");
			}
			
			public static class MenuItem
			{
				public static By Admin = By.id("menu_admin_viewAdminModule");
				public static By User = By.id("menu_admin_viewSystemUsers");
				public static By UserMangement = By.id("menu_admin_UserManagement");
			}
			
			public static class Users
			{
				
				public static By txtHeader = By.id("UserHeading");
				
				public static class TextBox{
					public static By txtSearchUser = By.id("searchSystemUser_userName");
					public static By txtEmpName = By.id("systemUser_employeeName_empName");
					public static By txtUserName = By.id("systemUser_userName");
					public static By txtPassword = By.id("systemUser_password");
					public static By txtConfirmPassword = By.id("systemUser_confirmPassword");
					
				}
				public static class Button{
					public static By btnSearchUser = By.id("searchBtn");			
					public static By btnAddUser = By.id("btnAdd");
					public static By btnSave = By.id("btnSave");
					public static By btnCommit = By.xpath("//input[name='commit']");
				}
				
				public static class Select{
					public static By optUserRole = By.id("systemUser_userType");			
					public static By optStatus = By.id("systemUser_status");
				}
				
				public static class Table{
					public static By tblResults = By.id("resultTable");
					public static By tblFrstCell = By.xpath("//table[@id='resultTable']//tr/td[text()='No Records Found']");	
				}
			}
		}
		

}
