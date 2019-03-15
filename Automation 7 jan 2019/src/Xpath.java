public class Xpath {
	private static String v= "com.supremegolf.app";
	public static class HomeScreenPath{
		public static final String HOME_TITLE = "//android.widget.TextView[@resource-id='"+v+":id/tvToolbarTitle']";
		public static final String WEATHER_ICON = "//android.widget.ImageView[@resource-id='"+v+":id/ivWeather']";
		public static final String BOOK_TEE_TIME_SECTION = "//android.widget.ImageView[@resource-id='"+v+":id/ivTeeTime_bg']";
		public static final String PLAY_ON_THE_COURSE_SECTION = "//android.widget.ImageView[@resource-id='"+v+":id/ivCourse_bg']";
		public static final String ALLOW_BUTTON = "//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']";
		public static final String SWEEPSTAKES_BANNER = "//android.widget.RelativeLayout[@resource-id='"+v+":id/banner_image']";
		public static final String SWEEPSTAKES_BANNER_TAG_ICON = "//android.widget.ImageView[@resource-id='"+v+":id/imgTag']";
		public static final String SWEEPSTAKES_BANNER_ARROW_ICON = "//android.widget.ImageView[@resource-id='"+v+":id/imgArrow']";
		public static final String CBS_SPORTS_LOGO_LAYOUT = "//android.widget.LinearLayout[@resource-id='"+v+":id/layout_cbs']";
		public static final String CBS_SPORTS_LOGO = "//android.widget.ImageView[@resource-id='"+v+":id/cbs_logo']";
	}
	
	public static class SweepstakesContentDescScreenPath{
		public static final String BACK_ICON = "//android.widget.ImageView[@resource-id='"+v+":id/imgLeftButton']";
		public static final String SHORT_DESC_TITLE = "//android.widget.TextView[@resource-id='"+v+":id/shortDescTitle']";
		public static final String HOLDER_IMAGE_ICON = "//android.widget.ImageView[@resource-id='"+v+":id/imageHolder']";
		public static final String CONTEST_DETAIL_DESC = "//android.widget.TextView[@resource-id='"+v+":id/contestDetailDesc']";
		public static final String CONTEST_RULE = "//android.widget.TextView[@resource-id='"+v+":id/contest_rules_layout']";
		public static final String ENTER_SWEEPSTAKES_BUTTON = "//android.widget.Button[@resource-id='"+v+":id/btnSignMeUp'][@text='Enter Sweepstakes']";
	
	}
	
	public static class SweepstakesEmailScreenPath{
		public static final String CANCEL_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/txtLeftButton'][@text='Cancel']";
		public static final String EMAIL_TITLE = "//android.widget.TextView[@resource-id='"+v+":id/tvDescEmailTitle']";
		public static final String EMAIL_HOLDER_ICON = "//android.widget.ImageView[@resource-id='"+v+":id/ivEmailHolder']";
		public static final String EMAIL_ADDRESS= "//android.widget.TextView[@resource-id='"+v+":id/tvEmailAddress']";
		public static final String EMAIL_USED_DESC = "//android.widget.TextView[@resource-id='"+v+":id/tvEmailUsedDesc']";
		public static final String CONTINUE_BUTTON = "//android.widget.Button[@resource-id='"+v+":id/btnContinue'][@text='Continue']";
		public static final String EMAIL_EDIT_TEXT = "//android.widget.EditText[@resource-id='"+v+":id/etEmailAddress']";
	}
	
	public static class SweepstakesPasswordScreenPath{
		public static final String CANCEL_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/txtLeftButton'][@text='Cancel']";
		public static final String PASSWORD_TITLE = "//android.widget.TextView[@resource-id='"+v+":id/tvGolferTitle']";
		public static final String PASSWORD_HOLDER_ICON = "//android.widget.ImageView[@resource-id='"+v+"id/ivGolferHolder']";
		public static final String PASSWORD_ADDRESS= "//android.widget.TextView[@resource-id='"+v+":id/tvPassword']";
		public static final String PASSWORD_USED_DESC = "//android.widget.TextView[@resource-id='"+v+":id/tvGolferDesc']";
		public static final String CONTINUE_BUTTON = "//android.widget.Button[@resource-id='"+v+":id/btnContinue'][@text='Continue']";
		public static final String PASSWORD_EDIT_TEXT = "//android.widget.EditText[@resource-id='"+v+":id/etPassword']";
	}
	
	public static class SweepstakesWhoAreYouScreenPath{
		public static final String WHO_ARE_YOU_TEXT = "//android.widget.TextView[@text='Who are you?']";
		public static final String DESC_TITLE = "//android.widget.TextView[@resource-id='"+v+":id/personal_des_tv']";
		public static final String PASSWORD_HOLDER_ICON = "//android.widget.ImageView[@resource-id='"+v+"id/ivGolferHolder']";
		public static final String CONTINUE_BUTTON = "//android.widget.Button[@resource-id='"+v+":id/btnContinue'][@text='Continue']";
		public static final String SUBMIT_BUTTON = "//android.widget.Button[@resource-id='"+v+":id/btn_submit'][@text='Submit']";
		public static final String OK_BUTTON = "//android.widget.Button[@resource-id='android:id/button1'][@text='OK']";
		
		public static final String FIRST_NAME_EDIT_TEXT = "//android.widget.EditText[@resource-id='"+v+":id/first_name_et']";
		public static final String LAST_NAME_EDIT_TEXT = "//android.widget.EditText[@resource-id='"+v+":id/last_name_et']";
		public static final String ZIP_CODE_EDIT_TEXT = "//android.widget.EditText[@resource-id='"+v+":id/zipcode_et']";
		public static final String SKILL_LEVEL_EDIT_TEXT = "//android.widget.EditText[@resource-id='"+v+":id/skill_level_et']";
		public static final String FREQUENCY_EDIT_TEXT = "//android.widget.EditText[@resource-id='"+v+":id/frequency_et']";
		public static final String HANDICAP_EDIT_TEXT = "//android.widget.EditText[@resource-id='"+v+":id/handicap_et']";
		public static final String BEGI_EDIT_TEXT = "//android.widget.EditText[@resource-id='android:id/numberpicker_input'][@text='Beginner']";
		
		public static final String FIRST_NAME_TEXT= "//android.widget.TextView[@resource-id='"+v+":id/first_name_tv'][@text='First Name']";
		public static final String LAST_NAME_TEXT= "//android.widget.TextView[@resource-id='"+v+":id/last_name_tv'][@text='Last Name']";
		public static final String ZIP_CODE_TEXT= "//android.widget.TextView[@resource-id='"+v+":id/zip_code_tv'][@text='Zip Code']";
		public static final String SKILL_LEVEL_TEXT= "//android.widget.TextView[@resource-id='"+v+":id/skill_level_tv'][@text='Skill Level']";
		public static final String FREQUENCY_TEXT= "//android.widget.TextView[@resource-id='"+v+":id/frequency_tv'][@text='Frequency']";
		public static final String HANDICAP_TEXT= "//android.widget.TextView[@resource-id='"+v+":id/handicap_tv'][@text='Handicap']";
		
		public static final String GO_HOME_BUTTON = "//android.widget.Button[@resource-id='"+v+":id/btnSignMeUp'][@text='Go Home']";
		public static final String ENTERED_BUTTON = "//android.widget.Button[@resource-id='"+v+":id/btnSignMeUp'][@text='Entered']";
	}
	
	public static class LoginScreenPath{
		public static final String EMAIL_EDIT_FIELD = "//android.widget.EditText[@resource-id='"+v+":id/signIn_email_edittext']";
		public static final String PASSWORD_EDIT_FIELD = "//android.widget.EditText[@resource-id='"+v+":id/signIn_password_edittext']";
		public static final String LOGIN_SIGN_IN_BUTTON = "//android.widget.Button[@resource-id='"+v+":id/signIn_btnView']";
	}
	
	
}