package pom_Config;

public class Configuration {
	
	//Testsite
	public static final String testsite = "https://www.google.com/";
	public static final String browser = "chrome";
	
	//gmail loginPages....11Question         
	
	public static final String signin="//a[@id='gb_70']";
	public static final String username="//input[@type='email']";
	public static final String next1="//span[@class='VfPpkd-vQzf8d']/following-sibling::div[1]";
	public static final String password="//input[@class='whsOnd zHQkBf']";
	public static final String next2="//span[text()='Next']/following-sibling::div";
		
	public static final String Gmail1="//a[@class='gb_g']";
	public static final String Starred="//a[contains(text(),'Starred')]";
	public static final String TotalNoEmailStarred ="";

	//unread email inbox count....12 
		public static final String UnreadEmail="//*[@id=':4f']";
		public static final String ReadEmailCount="//tr[@class='zA yO']";
		public static final String TotalEmail="//span[text()='60']";



	//==================================================================================

	    //Compose Verify email.....13Question
		public static final String Composebtn="//div[text()='Compose']";
		//public static final String Compose="/html/body/div[21]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]";
		public static final String Compose="//div[@role='dialog']";///html/body/div[20]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div";

	//======================================================================================
		
		//sending email verify user recevie....14Question
		public static final String To="//textarea[@name='to']";
		public static final String Subject="//input[@name='subjectbox']";
		public static final String MsgBox="//div[contains(@class,'Ar Au')]//div[1]";
		public static final String Send="//div[@data-tooltip-delay='800']";
		public static final String Sentbtn="//div[@data-tooltip='Sent']";
		public static final String Sentinbox="//*[@id=':3']";


	//===================================================================================
		
		//search btn verify email inbox...15Question
		public static final String Search="//input[@placeholder='Search mail']";
		public static final String Searchbtn="//*[@id='aso_search_form_anchor']/button[4]";//button[@class='gb_yf gb_zf']";
		public static final String SearchInbox="//div[@class='ae4 UI UJ']";
		

	//================================================================

		 //verify attachmentinboxEmail...16Question
		public static final String Searchoptionbtn="//button[@class='gb_vf']";  //div[contains(@class,'gb_Ud gb_ee')]";
		public static final String AllMailoptionbutton = "//*[@id=':uc']";
		public static final String HasAttachmentbtn="/html/body/div[30]/div/div[2]/div[9]/span[1]/label";
		public static final String SearchButton="//*[@data-tooltip='Search Mail']";
		public static final String Inbox="//a[text()='Inbox']";
		public static final String HasAttechment="//input[@type='checkbox']/following-sibling::label";
		public static final String Searchbtn1="(//div[text()='Search'])[2]";
		public static final String countNoTotalAttachmt="//img[@class='yE']";
	    public static final String Inboxmail="//a[contains(@class,'J-Ke n0')]";

	    
	//==========================================================================================

	   //Clickon Settingbtn and Verify settingFuntion...17Question
	    public static final String Settingbtn="//div[@data-tooltip='Settings']//a[1]";
	    public static final String allSetting="//button[text()='See all settings']";
	    public static final String SettingsTxt="//div[contains(@class,'nH qZ')]";


	//=================================================================================
	   
	    //create new label link.............18Question
	    public static final String More = "//span[@class='CJ']";
	    public static final String Createnewlabelbtn="//a[contains(text(),'Create new label')]";
	    public static final String PleaseEnterNewLabel="//label[text()='Please enter a new label name:']/following::input";
	    public static final String Createbtn="//button[text()='Create']";
	    public static final String Testing="//div[@data-tooltip='Testing']";
	    public static final String Testingdtbtn="//div[@data-label-name='Testing']";
	    public static final String Removelabel="//div[text()='Remove label']";
	    public static final String Deletelabel="//button[text()='Delete']";


	//====================================================================================
	    
	    //Verify email Moved......19Question
	    public static final String Selectemailbox="//*[@id=':4u']";
	    public static final String Clickckbox="//*[@id=':5u']";
	    public static final String Movetobtn="//div[@data-tooltip='Move to']//div";
	    public static final String TestingLabel="(//div[contains(@class,'TN aY7xie')]//div)[3]";
	    public static final String labelbtn="//a[@aria-label='Label1 has menu']";
	    public static final String Verifylabelmail="//tr[@aria-labelledby=':na']";
	    
	//==========================================================================================

	  //Gmail SignOut Successfully...20Question
	    
	    public static final String ALogobtnClick="//*[@id='gb']/div[2]/div[3]/div[1]/div[2]/div";
	    public static final String signOutClick="//a[contains(text(),'Sign out')]";
	    public static final String RemoveanAccount="//div[text()='Remove an account']";
	    public static final String Removeemail="//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/ul/li[1]/div/div[2]";
	    public static final String RemoveAccountYes="(//span[text()='Yes, remove'])[2]";
}