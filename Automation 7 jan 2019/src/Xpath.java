


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
		public static final String CALENDAR_SUNDAY_TEXT = "//android.widget.TextView[@text='Sun']";
		public static final String CALENDAR_MONDAY_TEXT = "//android.widget.TextView[@text='Mon']";
		public static final String CALENDAR_TUESDAY_TEXT = "//android.widget.TextView[@text='Tue']";
		public static final String CALENDAR_WENESDAY_TEXT = "//android.widget.TextView[@text='Wed']";
		public static final String CALENDAR_THURSDAY_TEXT = "//android.widget.TextView[@text='Thu']";
		public static final String CALENDAR_FRIDAY_TEXT = "//android.widget.TextView[@text='Fri']";
		public static final String CALENDAR_SATURDAY_TEXT = "//android.widget.TextView[@text='Sat']";
		
		public static final String NEXT_MONTH_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/tv_NextMonth']";
		public static final String BOOK_TEE_TIME_NEW_DATE_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/tv_Date']";
		
		public static final String HOW_MANY_PLAYER_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/players_screen_title'][@text='How many players?']";
		public static final String PLAYER_ONE = "//android.widget.TextView[@resource-id='"+v+":id/players_screen_single_player_view'][@text='One Player']";
		public static final String PLAYER_TWO = "//android.widget.TextView[@resource-id='"+v+":id/players_screen_two_player_view'][@text='Two Players']";
		public static final String PLAYER_THREE = "//android.widget.TextView[@resource-id='"+v+":id/players_screen_three_player_view'][@text='Three Players']";
		public static final String PLAYER_FOUR = "//android.widget.TextView[@resource-id='"+v+":id/players_screen_four_player_view'][@text='Four Players']";
		public static final String PLAYER_ALL = "//android.widget.TextView[@resource-id='"+v+":id/players_screen_all_player_view'][@text='All']";
		public static final String DONE_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/done'][@text='Done']";
		
		public static final String DALLAS_CITY_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/item_search_name'][@text='Dallas, TX']";
		
		public static final String CITY_HEADER_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/collapsing_header_text'][@text='Dallas, TX']";
		
		public static final String FAV_HEADER_ICON = "//android.widget.ImageView[@resource-id='"+v+":id/collapsing_header_fav_btn']";
		public static final String ALERT_HEADER_ICON = "//android.widget.ImageView[@resource-id='"+v+":id/collapsing_header_price_btn']";
		public static final String FILTER_HEADER_ICON = "//android.widget.ImageView[@resource-id='"+v+":id/filter_menu']";
		public static final String CITY_MAP_VIEW_BUTTON = "//android.widget.Button[@resource-id='"+v+":id/cvMapViewTab'][@text='Map view']";
		public static final String CITY_LIST_VIEW_BUTTON = "//android.widget.Button[@resource-id='"+v+":id/cvMapViewTab'][@text='List view']";
		public static final String MAP_VIEW_PAGER = "//android.support.v4.view.ViewPager[@resource-id='"+v+":id/cityListViewPager']";

		
	}
	
	public static class LoginScreenPath{
		
		public static final String LOGIN_EMAIL_EDIT_TEXT = "//android.widget.EditText[@resource-id='"+v+":id/signIn_email_edittext']";
		public static final String LOGIN_PASSWORD_EDIT_TEXT = "//android.widget.EditText[@resource-id='"+v+":id/signIn_password_edittext']";
		public static final String LOGIN_SHOW_TEXT = "//android.widget.EditText[@resource-id='"+v+":id/signIn_password_edittext']";
		public static final String LOGIN_SIGN_IN_BUTTON = "//android.widget.Button[@resource-id='"+v+":id/signIn_btnView']";
		
		public static final String CITY_DISTANCE_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/tvCourseDistance']";
		public static final String CITY_STARTING_FROM_TEXT = "//android.widget.TextView[@resource-id='"+v+":id/list_item_starting_label']";
	}
	
	
}