


public class Xpath {
	private static String v= "com.supremegolf.app";
	public static class HomeScreenPath{
		public static final String HOME_TITLE = "//android.widget.TextView[@resource-id='"+v+":id/tvToolbarTitle']";
		public static final String WEATHER_ICON = "//android.widget.ImageView[@resource-id='"+v+":id/ivWeather']";
		public static final String BOOK_TEE_TIME_SECTION = "//android.widget.ImageView[@resource-id='"+v+":id/ivTeeTime_bg']";
		public static final String PLAY_ON_THE_COURSE_SECTION = "//android.widget.ImageView[@resource-id='"+v+":id/ivCourse_bg']";
		public static final String FIND_A_PRO_SECTION = "//android.widget.ImageView[@resource-id='"+v+":id/ivPro_bg']";
		public static final String ALLOW_BUTTON = "//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']";
		
		public static final String WEATHER_CLOSE_ICON = "//android.widget.TextView[@resource-id='"+v+":id/onBackPressed']";
		
		public static final String BOOK_TEE_TIME_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/tv_header_title'][@text='Book Tee Times']";
		public static final String BOOK_TEE_TIME_SEARCH_EDIT_TEXT = "//android.widget.EditText[@resource-id='"+v+":id/searchAutoComplete'][@text='Any name, course, or city']";
		public static final String BOOK_TEE_TIME_DATE_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/tv_Date'][@text='Date: Today']";
		public static final String BOOK_TEE_TIME_PLAYER_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/tv_PlayerSelector'][@text='Players: All']";
		public static final String BOOK_TEE_TIME_SEARCH_BUTTON = "//android.widget.Button[@resource-id='"+v+":id/btn_onSearch'][@text='Search']";
		
		public static final String BOOK_TEE_TIME_CROSS = "//android.widget.ImageView[@resource-id='"+v+":id/ivClear']";
		public static final String BOOK_TEE_TIME_EDIT_TEXT_BACK_ARROW = "//android.widget.ImageView[@resource-id='"+v+":id/ivSearch']";
		public static final String TOP_TEE_TIME_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/deals_screen_header'][@text='Today’s Top Tee Times']";		
	}
	
	
}