package com.feed.feedo.utils;

import android.content.Context;
import com.bumptech.glide.RequestManager;
import com.feed.feedo.R;

public class Constant {
    public static final int REQUEST_CODE_ASK_MULTIPLE_PERMISSIONS = 100;

    public static final String BASE_FOLDER_PATH = "GUIDE";
    public static final String TEMP_PROFILE_PIC = "temp001.dat";
    public static final String TEMP_SHARE_IMAGE = "temp002.jpeg";

    public static final String PREF_NAME = "Tourism";
    public static final String SEVEN_DAY_AFTER = "seven_day_after";
    public static final String KEY_DISTANCE_VALUE = "distance_value";
    public static final String DASHBOARD_DATA = "DashboardData";

    public static final String TYPE_1 = "Type 1";
    public static final String TYPE_2 = "Type 2";
    public static final String TYPE_3 = "Type 3";
    public static final String TYPE_4 = "Type 4";
    public static final String TYPE_5 = "Type 5";
    public static final String TYPE_6 = "Type 6";
    public static final String TYPE_7 = "Type 7";
    public static final String TYPE_8 = "Type 8";
    public static final String TYPE_9 = "Type 9";
    public static final String LAYOUT_NAME = "LayoutName";
    public static final String PUSH_TYPE = "PushType";
    public static final String KEY = "Key";
    public static final String PUSH_GET_LAYOUT = "GetLayout";
    public static final String DELETE = "Delete";
    public static final String PERCENT_COMPLETE = "PercentComplete";

    public static final String BROADCAST_DOWNLOAD_IMAGE = "com.tact.uptourism.imagedownload";
    public static final String BROADCAST_START_STOP_DOWNLOADING = "com.tact.uptourism.ImageReceiver";
    public static final String BROADCAST_SEND_LOCATION = "com.tact.uptourism.SendLocationReceiver";


    public static final String MSG_DOWNLOADING_DATA = "Downloading Content";
    public static final String TITLE_CONFIRM_REMOVE = "Confirm Remove";
    public static final String MSG_CONFIRM_REMOVE_DESTINATION = "Are you sure to remove this destination from offline ?";
    public static final String IS_FROM_OFFLINE = "IsFromOffline";
    public static final String MSG_CANCEL_DOWNLOADING = "Are you sure to cancel downloading";

    public static final String TITLE_CONFIRM_CANCEL = "Confirm Cancel";
    public static final String DOWNLOADING_CONTENT_TITLE = "DownloadingContentTitle";
    public static final String DOWNLOADING_MAIN_IMAGE_PATH = "DownloadingImagePath";
    public static final String DOWNLOADING_SMALL_IMAGE_PATH = "SmallImagePath";
    public static final int DOWNLOAD_IMAGE_NOTIFICATION_ID = 10;
    public static final String DESTINATION_DATA = "DestinationData";
    public static final String DESTINATION_IMG_URL = "DestinationImgUrl";
    public static final String PAUSE_DOWNLOADING_DUE_TO_NO_INTERENT = "PauseDownloading";
    public static final String TAB_KEYWORD = "TabKeyword";
    public static final String REVIEW = "Review";
    public static final String METHOD_INSERT_REVIEW = "insertReview";
    public static final String MSG_REVIEW_ADDED = "Succesfully Reviewed";
    public static final String REFERENCE_ID = "ReferenceId";
    public static final String REFERENCE_TYPE = "ReferenceType";
    public static final String MSG_SIGNIN_FOR_REVIEW = "You need to sign in to comment on this destination.";
    public static final String MSG_NEED_PERMISSION = "We need permission to perform Signin";
    public static final String CONTACTS_DATA = "ContactData";
    public static final String IS_PERMISSION_POPUP_SHOWN = "IsPermissionShown";
    public static final String MSG_PERMISION_DENIED_ADD_CALENDAR = "Permission denied to add event in calendar";
    public static final String MSG_PERMISION_DENIED_CALL = "Permission denied to make call";
    public static final String MSG_PERMISION_DENIED_GPS = "Permission denied to get current location";
    public static final String MSG_PERMISSION_DENIED = "Permission denied";
    public static final String RADIUS = "Radius";
    public static final String METHOD_GET_NEARYBY_GUIDES = "GetNearByGuides";
    public static final String METHOD_GET_GUIDE_DESTINATIONS = "GetGuideDestinations";
    public static final String DESTINATIONS = "Destinations";
    public static final String DESTINATION_ID = "DestinationId";
    public static final String METHOD_GET_GUIDES_BY_DESTINATION = "GetGuidesByDestinations";
    public static final String PLAYSTORE_SHARING_URL = "http://goo.gl/LFpWp8";
    public static final String DATA = "Data";
    public static final String TITLE_CONFIRM_DOWNLOAD = "Confirm Download";
    public static final String FILENAME_PROFILE_PICTURE = "ProfilePic.jpeg";

    // Strings
    public static final String PROFILE_PIC_PATH = "ProfilePic";
    public static final String METHOD_NAME = "MethodName";
    public static final String USER_ID = "UserId";
    public static final String USER_DETAIL_ID = "UserDetailId";
    public static final String PLACE_ID = "PlaceId";
    public static final String RATING = "Rating";
    public static final String IS_DESTINATION = "IsDestination";
    public static final String HAS_BACK = "HasBack";
    public static final String ACTIVITY_PROFILE = "Profile";
    public static final String USER_RATING = "UserRating";
    public static final String PUSHTYPE_ACTIVITY_ADVERT = "Activity Advertisement";
    public static final String POLICE_NO = "100";
    public static final String HOSPITAL_NO = "108";
    public static final String UP_TOURISM = "UP Tourism";
    public static final String PLAN_VACATION = "PlanVaction";
    public static final String RESULT_CANCEL = "Cancel";
    public static final String NO_CONTENT_FOUND = "No Content Found";
    public static final String KEY_CURRENCY_CONVERTER = "currency_converter";
    public static final String IS_WIDE = "is_wider";
    public static final String ACTIVITY_NAME = "activityname";
    public static final String KEY_IS_APP_LOCKED = "isAppBlocked";
    public static final String APP_BLOCK = "AppBlock";
    public static final String APP_UPDATE = "AppUpdate";
    public static final String ADS_DATA = "AdData";
    public static final String PUSHMANAGER_ID = "PushManagerId";
    public static final String FULL_ADVERTISMENT = "Full Advertisement";
    public static final String VIDEO_NAME = "tourism.dat";
    public static final String VIDEO_PATH = "video_path";
    public static final String VIDEO_URL = "video_url";
    public static final String DISPLAY_IN_APP = "In App";
    public static final String PUSHNOTIFICATION_ID = "pushnotifyId";
    public static final String AD_SHOWN_DATE = "AdShownDate";
    public static final String BROADCAST_ADS = "com.tact.recieveads";
    public static final String IS_OFFICER_CONTACT = "isOFficerContact";
    public static final String METHOD_GET_CONTACT_NUMBER = "getContactNumbers";
    public static final String URL_PRIVACY_POLICY = "http://uptourism.gov.in/post/privacy-policy";
    public static final String URL_COPYRIGHT_POLICY = "http://uptourism.gov.in/post/copyright-policy";
    public static final String TAG = "UPTourism";
    public static final String GOOGLE_SENDER_ID = "316324019380";
    // AUTH TYPE;
    public static final String AUTHTYPE_FACEBOOK = "fb";
    public static final String AUTHTYPE_GOOGLE = "google";
    // API TYPE
    public static final short WEB_SERIVCE = 1;
    public static final short POST = 0;
    // SERVER LINK INFO
    public static final String SERVER_URL_New = "http://103.194.88.237:5520/VaaaN/Api/Complaint/";
    public static final String SERVER_URL_Previous = "http://api-atms.azurewebsites.net/api/v1/Complaint/";

    //Messages
    public static final String METHOD_SIGNIN = "signIn";
    public static final String METHOD_SIGNUP = "signUp";
    public static final String METHOD_TRACK_USER = "TrackUser";
    public static final String METHOD_MERGE_USER_AUTH = "mergeUserAuth";
    public static final String METHOD_REGISTER_DEVICE = "registerDevice";
    public static final String METHOD_GETEXPERIENCES = "getExperiences";
    public static final String METHOD_GETEXPERIENCE_CONTENT = "getExperienceContent";
    public static final String METHOD_GETDESTINATIONS = "getDestinations";
    public static final String METHOD_GETDESTINATIONSCONTENT = "getDestinationContent";
    public static final String METHOD_GETEXPLORE = "getExplore";
    public static final String METHOD_GETEXPLORE_CONTENT = "getExploreContent";
    public static final String METHOD_GETVIDEOS = "getVideos";
    public static final String METHOD_GET_POI_PLACEDETAILS = "getPlaceOfInterestDetails";
    public static final String METHOD_GET_GALLERYIMAGES = "getImageGallery";
    public static final String METHOD_GET_TAGIMAGES = "getImages";
    public static final String METHOD_GETEVENTS = "getEvents";
    public static final String METHOD_GETEVENT_DETAIL = "getEventDetails";
    public static final String METHOD_GET_WHATSNEW = "getWhatsNew";
    public static final String METHOD_INSERT_USER_RATING = "InsertUserRating";
    public static final String METHOD_ABOUT_UP = "aboutUP";
    public static final String METHOD_ABOUT_UP_DETAILS = "aboutUPDetails";
    public static final String METHOD_GET_HERITAGE_ARC = "getHeritageArc";
    public static final String METHOD_GET_HERITAGE_ARC_PLACE_DETAIL = "getHeritageArcPlaceDetails";
    public static final String METHOD_GET_PUSHID_RESPONSE = "getPushIdResponse";
    public static final String METHOD_GET_USER_RATING = "getUserRating";
    public static final String METHOD_GET_LAYOUT = "getLayout";
    public static final String METHOD_SEARCH = "search";
    public static final String METHOD_GET_ALL_PLACES_OF_DESTINATION = "getAllPlacesOfDestination";
    public static final String METHOD_GET_DESTINATION_DATA_FOR_MAP = "getDestinationDatasForMap";
    // POSSIBLE RESULT FROM SERVER WHEN LOGIN
    public static final String RESULT_NOTEXIST = "-1";
    public static final String RESULT_ALREADYEXIST = "0";
    public static final String RESULT_OK = "1";
    public static final String IS_SKIPPED = "isNotFirstTime";
    public static final String USER_IMAGE = "UserImage";
    public static final String KEY_CATTYPE = "cat_type";

    // Useful Constants
    public static final String KEY_CAT = "cat";
    public static final String KEYWORD = "Keyword";
    // PARAMETER
    public static final String Id = "Id";
    public static final String FIRST_NAME = "FirstName";
    public static final String LAST_NAME = "LastName";
    public static final String AUTHTYPE = "AuthType";
    public static final String EMAIL = "Email";
    public static final String SOCIAL_ID = "SocialId";
    public static final String RESULT = "Result";
    public static final String MOBILE = "Mobile";
    public static final String COUNTRY = "Country";
    public static final String GENDER = "Gender";
    public static final String FACEBOOK_ID = "FacebookId";
    public static final String GOOGLE_ID = "GoogleId";
    public static final String LANGUAGE_ID = "LanguageId";
    public static final String DEVICE_ID = "DeviceId";
    public static final String NETWORK_PROVIDER = "NetworkProvider";
    public static final String LATITUDE = "Latitude";
    public static final String LONGITUDE = "Longitude";
    public static final String USER = "User";
    public static final String DEVICE_TYPE = "DeviceType";
    public static final String NOTIFICATION_ID = "NotificationId";
    public static final int REQUEST_GET_DATA = 100;
    public static final String IS_LOGGEDIN = "Isloggedin";
    public static final String CONTENT_ID = "ContentId";
    public static final String VIDEO_URI = "VideoUri";
    public static final String SEEK_TO = "SeekTo";
    public static final String VIDEO_ID = "VideoId";
    public static final String PARENT_NAME = "ParentName";
    public static final String TAG_NAME = "TagName";
    public static final String DATE_FORMAT = "dd-MMM-yyyy";
    public static final String DATE_FORMAT_SERVER = "yyyy-MM-dd'T'hh:mm:ss";
    public static final String DOWNLOADING_IMAGE_INDEX = "DownloadingImageIndex";
    public static final String IS_IMAGE_DOWNLOADING = "IsImageDownloading";
    public static final String DOWNLOADING_IMAGE_TOTAL = "DownloadingImageTotal";
    public static final String DOWNLOADING_IMAGES = "DownloadingImages";
    public static final String Index = "Index";
    public static final String KEY_BOOKING_DETAIL = "booking_detail";
    public static final String ABOUT_DATA = "<div>Embedded in the heart of India is Uttar Pradesh, a land where cultures have evolved and religions emerged. The greatness of Uttar Pradesh lies not only in this confluence, but also in the emergence of cultural and religious traditions along some of the greatest rivers in the Indian sub-continent – the Ganga and the Yamuna.&nbsp;<br/>  Thousands of Tourists visit Uttar Pradesh every year and take menu_search the everlasting experience of rich and varied tradition across the state.<br/>In order to facilitate access to state tourism information and boost tourist activities, Uttar Pradesh Tourism Department has launched this application.<br/>It will serve as personal guide for all tourists and also help users gain insights into destinations, monuments, hidden treasures and events happening across the state.<br/>The features of the application extends from providing basic information about the state, its rich heritage and culture to booking tours and travel directly from the mobile application. Following features enrich the overall tourist experience in the application.<br/><ul><li>Find places of interest and tourist attractions, culture and history of a particular city.</li><li>Share destinations and monuments over social media and directly to friends and family using mobile native sharing feature.</li><li>A personal travel guide while your stay in the state. Users can plan their trip, mark places to visit, make bookings via their mobile phone.</li><li>Information about public utilities like restaurants, ATM’s, hospitals etc. easily available on the go.</li><li>Get around the city using integrated map based navigation feature.</li><li>SOS feature for emergency contacts.</li><li>Users can manage their account and your account and rate and review a place of interest after visiting.</li><li>View upcoming events in the state.</li><li>Marking favorite places to save them for offline viewing.</li></ul></div><div><br></div><div>Powered by - <b><a target=\"_blank\" style=\"color:#000000\" href=\"http://trendsetterz.co.in\">Trendsetterz IT Services</a></b> through <b>Shreetron India Ltd</b></div>";
    public static final String COUNTRY_JSON = "[{\"currency_code\":\"AUD\",\"country_Name\":\"Australian Dollar\",\"Country_Flag_URL\":\"aud\"},{\"currency_code\":\"INR\",\"country_Name\":\"India\",\"Country_Flag_URL\":\"inr\"},{\"currency_code\":\"BGN\",\"country_Name\":\"Bulgarian Lev\",\"Country_Flag_URL\":\"bgn\"},{\"currency_code\":\"BRL\",\"country_Name\":\"Brazillian Real\",\"Country_Flag_URL\":\"brl\"},{\"currency_code\":\"CAD\",\"country_Name\":\"Canadian Dollar\",\"Country_Flag_URL\":\"cad\"},{\"currency_code\":\"CHF\",\"country_Name\":\"Swiss Franc\",\"Country_Flag_URL\":\"chf\"},{\"currency_code\":\"CNY\",\"country_Name\":\"Chinese Yuan\",\"Country_Flag_URL\":\"cny\"},{\"currency_code\":\"CZK\",\"country_Name\":\"Czech Koruna\",\"Country_Flag_URL\":\"czk\"},{\"currency_code\":\"DKK\",\"country_Name\":\"Danish Krone\",\"Country_Flag_URL\":\"dkk\"},{\"currency_code\":\"GBP\",\"country_Name\":\"British Pound\",\"Country_Flag_URL\":\"gbp\"},{\"currency_code\":\"HKD\",\"country_Name\":\"Hong Kong Dollar\",\"Country_Flag_URL\":\"hkd\"},{\"currency_code\":\"HRK\",\"country_Name\":\"Croatian Kuna\",\"Country_Flag_URL\":\"hrk\"},{\"currency_code\":\"HUF\",\"country_Name\":\"Hungarian Forint\",\"Country_Flag_URL\":\"huf\"},{\"currency_code\":\"IDR\",\"country_Name\":\"Indonesian Rupiah\",\"Country_Flag_URL\":\"idr\"},{\"currency_code\":\"ILS\",\"country_Name\":\"Israeli Shekel\",\"Country_Flag_URL\":\"ils\"},{\"currency_code\":\"JPY\",\"country_Name\":\"Japanese Yen\",\"Country_Flag_URL\":\"jpy\"},{\"currency_code\":\"KRW\",\"country_Name\":\"South Korean Won\",\"Country_Flag_URL\":\"krw\"},{\"currency_code\":\"MXN\",\"country_Name\":\"Mexican Peso\",\"Country_Flag_URL\":\"mxn\"},{\"currency_code\":\"MYR\",\"country_Name\":\"Malaysian Ringgit\",\"Country_Flag_URL\":\"myr\"},{\"currency_code\":\"NOK\",\"country_Name\":\"Norwegian Krone\",\"Country_Flag_URL\":\"nok\"},{\"currency_code\":\"NZD\",\"country_Name\":\"New Zealand Dollar\",\"Country_Flag_URL\":\"nzd\"},{\"currency_code\":\"PHP\",\"country_Name\":\"Phillippine Peso\",\"Country_Flag_URL\":\"php\"},{\"currency_code\":\"PLN\",\"country_Name\":\"Polish Zloty\",\"Country_Flag_URL\":\"pln\"},{\"currency_code\":\"RON\",\"country_Name\":\"Romanian New Leu\",\"Country_Flag_URL\":\"ron\"},{\"currency_code\":\"RUB\",\"country_Name\":\"Russian Rouble\",\"Country_Flag_URL\":\"rub\"},{\"currency_code\":\"SEK\",\"country_Name\":\"Swedish Krona\",\"Country_Flag_URL\":\"sek\"},{\"currency_code\":\"SGD\",\"country_Name\":\"Singapore Dollar\",\"Country_Flag_URL\":\"sgd\"},{\"currency_code\":\"THB\",\"country_Name\":\"Thai Baht\",\"Country_Flag_URL\":\"thb\"},{\"currency_code\":\"TRY\",\"country_Name\":\"Turkish Lira\",\"Country_Flag_URL\":\"rub\"},{\"currency_code\":\"USD\",\"country_Name\":\"United States Dollar\",\"Country_Flag_URL\":\"usd\"},{\"currency_code\":\"ZAR\",\"country_Name\":\"South African Rand\",\"Country_Flag_URL\":\"zar\"},{\"currency_code\":\"EUR\",\"country_Name\":\"Euro\",\"Country_Flag_URL\":\"eur\"}]";
    public static final String KEY_CURRENT_INDEX = "curr_index";
    public static final String TITLE = "title";
    public static final String DESCRIPTION = "description";
    public static final String AUDIO_FILE_PATH = "audio_file_path";
    public static final String AGRA_FOLDER_NAME = "AGRA_V1";
    public static final String LUCKNOW_FOLDER_NAME = "LUCKNOW_V1";
    public static final String VARANASI_FOLDER_NAME = "VARANASI_V1";
    public static final String INSIGHT_BASE_URL = "https://uptourism.blob.core.windows.net/place-agumentedreality/";
    //public static final String INSIGHT_BASE_URL = "https://up-tourism.azurewebsites.net/place-augmentedreality/";
    public static final String LUCKNOW_FILE_SERVER_PATH = "Lucknow.zip";
    public static final String AGRA_FILE_SERVER_PATH = "Agra.zip";
    public static final String VARANASI_FILE_SERVER_PATH = "Varanasi.zip";
    public static final String DOWNLOADING_URL = "DownloadingUrl";
    public static final String DOWNLOADING_FILE_NAME = "DownloadingFileName";
    public static final String BROADCAST_DOWNLOAD_PROGRESS = "com.tact.uptourismar.downloadprogress";
    public static final String BROADCAST_DOWNLOAD_START_PAUSE = "com.tact.uptourismar.downloadstartpausereceiver";
    public static final int DOWNLOAD_PAUSED = 1;
    public static final int DOWNLOAD_INPROGRESS = 2;
    public static final int DOWNLOAD_COMPLETED = 3;
    public static final String DOWNLOAD_STATUS = "DownloadStatus";
    public static final String START_DOWNLAODING = "StartDownloading";
    public static final String RESUME_DOWNLOADING = "ResumeDownloading";
    public static final String TASK_TOKEN = "TaskToken";
    public static final String IS_CONTENT_DOWNLOADING = "IsContentDownloading";
    public static final String ISPOI = "ispoi";
    public static final String ISPOS = "ispos";
    public static final String IMAGE_BASE_URL = "http://az793854.vo.msecnd.net/image/";
    public static final String FONT_PATH = "fonts/RobotoRegular.ttf";
    // Downloading VIdeo Constant
    public static final String DOWNLOADING_REGION = "Downloading Region";
    public static final String LUCKNOW = "Lucknow";
    public static final String AGRA = "Agra";
    public static final String VARANASI = "Varanasi";
    public static final String LUCKNOW_CITY_LENS_OFFLINE_DATA = "lucknow_city_lens_offline_data";
    public static final String AGRA_CITY_LENS_OFFLINE_DATA = "agra_city_lens_offline_data";
    public static final String VARANASI_CITY_LENS_OFFLINE_DATA = "varanasi_city_lens_offline_data";
    public static final String ACTIVITY_WHATS_NEW = "Whats New";
    public static final String KEY_ISLOGIN = "isLogIn";
    public static final String SELECTED_LANGUAGE_ID = "selected_lang";
    public static final String SERVER_URL = "http://incindiaguide.azurewebsites.net/api/RSBY/";
    public static final String KEY_INTERN_ID = "InternId";
    public static final String METHOD_GET_TRAINING_DATA = "GetTrainingDatas";
    public static final String METHOD_SYNC_QUIZDATA = "SyncQuizData";
    // API TYPE
    public static final short GET = 1;
    public static final String KEY_CLIENT_ID = "client_id";
    public static final String KEY_DISPLAY_NAME = "display_name";
    public static final String KEY_LOGO = "logo";
    public static final String KEY_USER_ID = "user_id";
    public static final String KEY_USER_NAME = "user_name";
    public static final String KEY_USER_PASSWORD = "user_password";
    public static final String KEY_MOBILE_NUMBER = "mobile_number";
    public static final String KEY_CUSTOMER_NAME = "custumer_name";
    public static final String KEY_CUSTOMER_MOBILE = "custumer_mobile";
    public static final String KEY_CUSTOMER_DOB = "custumer_dob";
    public static final String KEY_CUSTOMER_DOA = "custumer_doa";
    public static final String KEY_CUSTOMER_GENDER = "custumer_gender";
    public static final String KEY_QUIZ_JSON = "quiz_json";
    public static final String KEY_BACKGROUND_IMAGE_URL = "background_image";
    public static final String KEY_QUESTIONS_ID = "question_id";
    public static final String KEY_OPTIONS_ID = "options_id";
    public static final String[] LANG_CODE = {"en", "hi"};

    public static int DEFAULT_PROGRESS_COLOR = R.color.splash_background;
    // public static Picasso Picaso;
    public static RequestManager Glide;
    public static int[] color_id = {R.color.tile0, R.color.tile1, R.color.tile2, R.color.tile3, R.color.tile4, R.color.tile5, R.color.tile6, R.color.tile7, R.color.tile8, R.color.tile9, R.color.tile10, R.color.tile11, R.color.tile12, R.color.tile13, R.color.tile14, R.color.tile15};
    public static String RATE = "Rate";
    public static String ClICKED_REGION = "clicked_region";

    public static final String SELECTED_LANGUAGE = "selectedLang";
}
