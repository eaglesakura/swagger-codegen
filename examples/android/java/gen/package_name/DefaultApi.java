package java.gen.package_name;

import java.gen.package_name.*;

import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.math.*;

import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class DefaultApi {
	String basePath = "/1.1";

	public void setBasePath(@NonNull String basePath) {
		this.basePath = basePath;
	}

	@NonNull
	public String getBasePath() {
		return basePath;
	}

	@NonNull
	protected String parameterToString(@Nullable Object obj) {
		return SwaggerUtil.parameterToString(obj);
	}

	@NonNull
	protected DataPayload toFormPayload(Map<String, String> form) {
		return SwaggerUtil.newFormPayload(form);
	}

	@NonNull
	protected DataPayload toJsonPayload(Object obj) {
		return SwaggerUtil.newJsonPayload(obj);
	}

	@NonNull
	protected String escapeString(Object obj) {
		return SwaggerUtil.escapeString(obj);
	}

	/**
	 * returns settings for user returns settings for user
	 */
	public static class AccountSettingsGetRequest {
	}

	/**
	 * returns settings for user returns settings for user
	 * 
	 * @return Settings
	 */
	public Settings accountSettingsGet(SwaggerHttpClient _client,
			AccountSettingsGetRequest _request) throws IOException {

		// create path and map variables
		String localVarPath = "/account/settings".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		return (Settings) SwaggerUtil.fetch(_client, "", Settings.class,
				Settings[].class);
	}

	/**
	 * updates user&#39;s settings updates user&#39;s settings
	 */
	public static class AccountSettingsPostRequest {
		/**
		 * the Yahoo! Where On Earth ID to user as defaul tend location
		 */
		@Nullable
		public String trendLocationWoeid;

		/**
		 * enables/disables sleep time, silencing notifications
		 */
		@Nullable
		public String sleepTimeEnabled;

		/**
		 * the hour that sleep time should begin if enabled
		 */
		@Nullable
		public String startSleepTime;

		/**
		 * the hour that sleep time should end if enabled
		 */
		@Nullable
		public String endSleepTime;

		/**
		 * timezone dates and times should be displayed in
		 */
		@Nullable
		public String timeZone;

		/**
		 * language which Twitter should render in for the user
		 */
		@Nullable
		public String lang;

	}

	/**
	 * updates user&#39;s settings updates user&#39;s settings
	 * 
	 * @return Settings
	 */
	public Settings accountSettingsPost(SwaggerHttpClient _client,
			AccountSettingsPostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.trendLocationWoeid)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'trendLocationWoeid' when calling accountSettingsPost");
		}
		if (!new ParameterValidator(_request.sleepTimeEnabled)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'sleepTimeEnabled' when calling accountSettingsPost");
		}
		if (!new ParameterValidator(_request.startSleepTime)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'startSleepTime' when calling accountSettingsPost");
		}
		if (!new ParameterValidator(_request.endSleepTime)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'endSleepTime' when calling accountSettingsPost");
		}
		if (!new ParameterValidator(_request.timeZone)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'timeZone' when calling accountSettingsPost");
		}
		if (!new ParameterValidator(_request.lang)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'lang' when calling accountSettingsPost");
		}

		// create path and map variables
		String localVarPath = "/account/settings".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("trend_location_woeid",
				parameterToString(_request.trendLocationWoeid));
		_client.addQueryParam("sleep_time_enabled",
				parameterToString(_request.sleepTimeEnabled));
		_client.addQueryParam("start_sleep_time",
				parameterToString(_request.startSleepTime));
		_client.addQueryParam("end_sleep_time",
				parameterToString(_request.endSleepTime));
		_client.addQueryParam("time_zone", parameterToString(_request.timeZone));
		_client.addQueryParam("lang", parameterToString(_request.lang));

		return (Settings) SwaggerUtil.fetch(_client, "", Settings.class,
				Settings[].class);
	}

	/**
	 * sets which device Twitter delivers updates to for user sets which device
	 * Twitter delivers updates to for user
	 */
	public static class AccountUpdateDeliveryDevicePostRequest {
		/**
		 * must be one of sms, none
		 */
		@NonNull
		public String device;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

	}

	/**
	 * sets which device Twitter delivers updates to for user sets which device
	 * Twitter delivers updates to for user
	 * 
	 * @return Settings
	 */
	public Settings accountUpdateDeliveryDevicePost(SwaggerHttpClient _client,
			AccountUpdateDeliveryDevicePostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.device).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'device' when calling accountUpdateDeliveryDevicePost");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling accountUpdateDeliveryDevicePost");
		}

		// create path and map variables
		String localVarPath = "/account/update_delivery_device".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("device", parameterToString(_request.device));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));

		return (Settings) SwaggerUtil.fetch(_client, "", Settings.class,
				Settings[].class);
	}

	/**
	 * updates user&#39;s profile background image updates user&#39;s profile
	 * background image
	 */
	public static class AccountUpdateProfileBackgroundImagePostRequest {
		/**
		 * image to replace background image of profile
		 */
		@NonNull
		public FileContent file;

		/**
		 * whether or not to tile background image
		 */
		@Nullable
		public String tile;

		/**
		 * display background image or not
		 */
		@Nullable
		public String use;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

		/**
		 * whether or not to include status in returned user objects
		 */
		@Nullable
		public String skipStatus;

	}

	/**
	 * updates user&#39;s profile background image updates user&#39;s profile
	 * background image
	 * 
	 * @return Settings
	 */
	public Settings accountUpdateProfileBackgroundImagePost(
			SwaggerHttpClient _client,
			AccountUpdateProfileBackgroundImagePostRequest _request)
			throws IOException {
		if (!new ParameterValidator(_request.file).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'file' when calling accountUpdateProfileBackgroundImagePost");
		}
		if (!new ParameterValidator(_request.tile)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'tile' when calling accountUpdateProfileBackgroundImagePost");
		}
		if (!new ParameterValidator(_request.use)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'use' when calling accountUpdateProfileBackgroundImagePost");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling accountUpdateProfileBackgroundImagePost");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling accountUpdateProfileBackgroundImagePost");
		}

		// create path and map variables
		String localVarPath = "/account/update_profile_background_image"
				.replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("tile", parameterToString(_request.tile));
		_client.addQueryParam("use", parameterToString(_request.use));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));

		return (Settings) SwaggerUtil.fetch(_client, "", Settings.class,
				Settings[].class);
	}

	/**
	 * sets one or more hex values that controls color scheme sets one or more
	 * hex values that controls color scheme
	 */
	public static class AccountUpdateProfileColorsPostRequest {
		/**
		 * profile background color
		 */
		@Nullable
		public String profileBackgroundColor;

		/**
		 * profile link color
		 */
		@Nullable
		public String profileLinkColor;

		/**
		 * profile sidebar&#39;s border color
		 */
		@Nullable
		public String profileSidebarBorderColor;

		/**
		 * profile&#39;s sidebar background color
		 */
		@Nullable
		public String profileSidebarFillColor;

		/**
		 * profile text color
		 */
		@Nullable
		public String profileTextColor;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

		/**
		 * whether or not to include statuses
		 */
		@Nullable
		public String skipStatus;

	}

	/**
	 * sets one or more hex values that controls color scheme sets one or more
	 * hex values that controls color scheme
	 * 
	 * @return Settings
	 */
	public Settings accountUpdateProfileColorsPost(SwaggerHttpClient _client,
			AccountUpdateProfileColorsPostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.profileBackgroundColor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'profileBackgroundColor' when calling accountUpdateProfileColorsPost");
		}
		if (!new ParameterValidator(_request.profileLinkColor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'profileLinkColor' when calling accountUpdateProfileColorsPost");
		}
		if (!new ParameterValidator(_request.profileSidebarBorderColor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'profileSidebarBorderColor' when calling accountUpdateProfileColorsPost");
		}
		if (!new ParameterValidator(_request.profileSidebarFillColor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'profileSidebarFillColor' when calling accountUpdateProfileColorsPost");
		}
		if (!new ParameterValidator(_request.profileTextColor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'profileTextColor' when calling accountUpdateProfileColorsPost");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling accountUpdateProfileColorsPost");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling accountUpdateProfileColorsPost");
		}

		// create path and map variables
		String localVarPath = "/account/update_profile_colors".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("profile_background_color",
				parameterToString(_request.profileBackgroundColor));
		_client.addQueryParam("profile_link_color",
				parameterToString(_request.profileLinkColor));
		_client.addQueryParam("profile_sidebar_border_color",
				parameterToString(_request.profileSidebarBorderColor));
		_client.addQueryParam("profile_sidebar_fill_color",
				parameterToString(_request.profileSidebarFillColor));
		_client.addQueryParam("profile_text_color",
				parameterToString(_request.profileTextColor));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));

		return (Settings) SwaggerUtil.fetch(_client, "", Settings.class,
				Settings[].class);
	}

	/**
	 * updates user&#39;s profile image updates user&#39;s profile image
	 */
	public static class AccountUpdateProfileImagePostRequest {
		/**
		 * image to be set as profile image
		 */
		@NonNull
		public FileContent image;

		/**
		 * whether or not to include statuses
		 */
		@Nullable
		public String skipStatus;

	}

	/**
	 * updates user&#39;s profile image updates user&#39;s profile image
	 * 
	 * @return Settings
	 */
	public Settings accountUpdateProfileImagePost(SwaggerHttpClient _client,
			AccountUpdateProfileImagePostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.image).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'image' when calling accountUpdateProfileImagePost");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling accountUpdateProfileImagePost");
		}

		// create path and map variables
		String localVarPath = "/account/update_profile_image".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));

		return (Settings) SwaggerUtil.fetch(_client, "", Settings.class,
				Settings[].class);
	}

	/**
	 * sets values that users ar eable to set under Account tab sets values that
	 * users ar eable to set under Account tab
	 */
	public static class AccountUpdateProfilePostRequest {
		/**
		 * full name of profile
		 */
		@Nullable
		public String name;

		/**
		 * url associated with profile
		 */
		@Nullable
		public String url;

		/**
		 * city or country describing where user of account is.
		 */
		@Nullable
		public String location;

		/**
		 * a description of user owning account
		 */
		@Nullable
		public String description;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

		/**
		 * whether or not to include statuses in response
		 */
		@Nullable
		public String skipStatus;

	}

	/**
	 * sets values that users ar eable to set under Account tab sets values that
	 * users ar eable to set under Account tab
	 * 
	 * @return Settings
	 */
	public Settings accountUpdateProfilePost(SwaggerHttpClient _client,
			AccountUpdateProfilePostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.name)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'name' when calling accountUpdateProfilePost");
		}
		if (!new ParameterValidator(_request.url)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'url' when calling accountUpdateProfilePost");
		}
		if (!new ParameterValidator(_request.location)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'location' when calling accountUpdateProfilePost");
		}
		if (!new ParameterValidator(_request.description)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'description' when calling accountUpdateProfilePost");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling accountUpdateProfilePost");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling accountUpdateProfilePost");
		}

		// create path and map variables
		String localVarPath = "/account/update_profile".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("name", parameterToString(_request.name));
		_client.addQueryParam("url", parameterToString(_request.url));
		_client.addQueryParam("location", parameterToString(_request.location));
		_client.addQueryParam("description",
				parameterToString(_request.description));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));

		return (Settings) SwaggerUtil.fetch(_client, "", Settings.class,
				Settings[].class);
	}

	/**
	 * 
	 * Returns the current rate limits for methods belonging to the specified
	 * resource families
	 */
	public static class ApplicationRateLimitStatusGetRequest {
		/**
		 * A comma-separated list of resource families you want to know the
		 * current rate limit disposition for
		 */
		@Nullable
		public List<String> resources;

	}

	/**
	 * 
	 * Returns the current rate limits for methods belonging to the specified
	 * resource families
	 * 
	 * @return void
	 */
	public Object applicationRateLimitStatusGet(SwaggerHttpClient _client,
			ApplicationRateLimitStatusGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.resources)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'resources' when calling applicationRateLimitStatusGet");
		}

		// create path and map variables
		String localVarPath = "/application/rate_limit_status".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("resources",
				parameterToString(_request.resources));

		return SwaggerUtil.fetch(_client, "", Object.class, Object[].class);
	}

	/**
	 * blocks the specified user blocks the specified user
	 */
	public static class BlocksCreatePostRequest {
		/**
		 * screen name of user to be blocked
		 */
		@NonNull
		public String screenName;

		/**
		 * ID of user to be blocked
		 */
		@NonNull
		public String userId;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

		/**
		 * whether or not to skip statuses
		 */
		@Nullable
		public String skipStatus;

	}

	/**
	 * blocks the specified user blocks the specified user
	 * 
	 * @return Users
	 */
	public Users blocksCreatePost(SwaggerHttpClient _client,
			BlocksCreatePostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.screenName).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling blocksCreatePost");
		}
		if (!new ParameterValidator(_request.userId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling blocksCreatePost");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling blocksCreatePost");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling blocksCreatePost");
		}

		// create path and map variables
		String localVarPath = "/blocks/create".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));

		return (Users) SwaggerUtil.fetch(_client, "", Users.class,
				Users[].class);
	}

	/**
	 * un-blocks the specified user un-blocks the specified user
	 */
	public static class BlocksDestroyPostRequest {
		/**
		 * screen name of user to be un-blocked
		 */
		@NonNull
		public String screenName;

		/**
		 * ID of user to be un-blocked
		 */
		@NonNull
		public String userId;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

		/**
		 * whether or not to skip statuses
		 */
		@Nullable
		public String skipStatus;

	}

	/**
	 * un-blocks the specified user un-blocks the specified user
	 * 
	 * @return Users
	 */
	public Users blocksDestroyPost(SwaggerHttpClient _client,
			BlocksDestroyPostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.screenName).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling blocksDestroyPost");
		}
		if (!new ParameterValidator(_request.userId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling blocksDestroyPost");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling blocksDestroyPost");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling blocksDestroyPost");
		}

		// create path and map variables
		String localVarPath = "/blocks/destroy".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));

		return (Users) SwaggerUtil.fetch(_client, "", Users.class,
				Users[].class);
	}

	/**
	 * returns array of numeric user ids of blocked users returns array of
	 * numeric user ids of blocked users
	 */
	public static class BlocksIdsGetRequest {
		/**
		 * returns array of numeric IDs as string IDs
		 */
		@Nullable
		public String stringifyIds;

		/**
		 * breaks up block of user IDs into pages
		 */
		@Nullable
		public String cursor;

	}

	/**
	 * returns array of numeric user ids of blocked users returns array of
	 * numeric user ids of blocked users
	 * 
	 * @return CursorUsers
	 */
	public CursorUsers blocksIdsGet(SwaggerHttpClient _client,
			BlocksIdsGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.stringifyIds)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'stringifyIds' when calling blocksIdsGet");
		}
		if (!new ParameterValidator(_request.cursor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'cursor' when calling blocksIdsGet");
		}

		// create path and map variables
		String localVarPath = "/blocks/ids".replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("stringify_ids",
				parameterToString(_request.stringifyIds));
		_client.addQueryParam("cursor", parameterToString(_request.cursor));

		return (CursorUsers) SwaggerUtil.fetch(_client, "", CursorUsers.class,
				CursorUsers[].class);
	}

	/**
	 * disallows retweets and device notifications from a user disallows
	 * retweets and device notifications from a user
	 */
	public static class BlocksListGetRequest {
		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

		/**
		 * whether or not to include statuses in response
		 */
		@Nullable
		public String skipStatus;

		/**
		 * breaks block of user to be broken up into pages
		 */
		@Nullable
		public String cursor;

	}

	/**
	 * disallows retweets and device notifications from a user disallows
	 * retweets and device notifications from a user
	 * 
	 * @return CursorUsers
	 */
	public CursorUsers blocksListGet(SwaggerHttpClient _client,
			BlocksListGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling blocksListGet");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling blocksListGet");
		}
		if (!new ParameterValidator(_request.cursor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'cursor' when calling blocksListGet");
		}

		// create path and map variables
		String localVarPath = "/blocks/list".replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));
		_client.addQueryParam("cursor", parameterToString(_request.cursor));

		return (CursorUsers) SwaggerUtil.fetch(_client, "", CursorUsers.class,
				CursorUsers[].class);
	}

	/**
	 * 
	 * destroys direct messages specified in required ID
	 */
	public static class DirectMessagesDestroyPostRequest {
		/**
		 * ID of direct message to delete
		 */
		@NonNull
		public String id;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

	}

	/**
	 * 
	 * destroys direct messages specified in required ID
	 * 
	 * @return Messages
	 */
	public Messages directMessagesDestroyPost(SwaggerHttpClient _client,
			DirectMessagesDestroyPostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.id).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'id' when calling directMessagesDestroyPost");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling directMessagesDestroyPost");
		}

		// create path and map variables
		String localVarPath = "/direct_messages/destroy".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("id", parameterToString(_request.id));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));

		return (Messages) SwaggerUtil.fetch(_client, "", Messages.class,
				Messages[].class);
	}

	/**
	 * 
	 * return 20 most recent direct messages sent to user
	 */
	public static class DirectMessagesGetRequest {
		/**
		 * return results with ID greater than specified
		 */
		@Nullable
		public String sinceId;

		/**
		 * returns results with an ID less than/equal to specified ID
		 */
		@Nullable
		public String maxId;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

		/**
		 * whether or not to include status
		 */
		@Nullable
		public String skipStatus;

	}

	/**
	 * 
	 * return 20 most recent direct messages sent to user
	 * 
	 * @return List<Messages>
	 */
	public List<Messages> directMessagesGet(SwaggerHttpClient _client,
			DirectMessagesGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.sinceId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'sinceId' when calling directMessagesGet");
		}
		if (!new ParameterValidator(_request.maxId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'maxId' when calling directMessagesGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling directMessagesGet");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling directMessagesGet");
		}

		// create path and map variables
		String localVarPath = "/direct_messages".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("since_id", parameterToString(_request.sinceId));
		_client.addQueryParam("max_id", parameterToString(_request.maxId));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));

		return (List<Messages>) SwaggerUtil.fetch(_client, "array",
				Messages.class, Messages[].class);
	}

	/**
	 * 
	 * sends a new direct message to specified user
	 */
	public static class DirectMessagesNewPostRequest {
		/**
		 * description
		 */
		@NonNull
		public String userId;

		/**
		 * text of your direct message
		 */
		@NonNull
		public String text;

		/**
		 * screen name of user receiving message
		 */
		@Nullable
		public String screenName;

	}

	/**
	 * 
	 * sends a new direct message to specified user
	 * 
	 * @return Messages
	 */
	public Messages directMessagesNewPost(SwaggerHttpClient _client,
			DirectMessagesNewPostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.userId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling directMessagesNewPost");
		}
		if (!new ParameterValidator(_request.text).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'text' when calling directMessagesNewPost");
		}
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling directMessagesNewPost");
		}

		// create path and map variables
		String localVarPath = "/direct_messages/new".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("text", parameterToString(_request.text));

		return (Messages) SwaggerUtil.fetch(_client, "", Messages.class,
				Messages[].class);
	}

	/**
	 * 
	 * return 20 most recent direct messages sent
	 */
	public static class DirectMessagesSentGetRequest {
		/**
             * 
             */
		@Nullable
		public String sinceId;

		/**
             * 
             */
		@Nullable
		public String maxId;

		/**
             * 
             */
		@Nullable
		public String count;

		/**
             * 
             */
		@Nullable
		public String page;

		/**
             * 
             */
		@Nullable
		public String includeEntities;

	}

	/**
	 * 
	 * return 20 most recent direct messages sent
	 * 
	 * @return List<Messages>
	 */
	public List<Messages> directMessagesSentGet(SwaggerHttpClient _client,
			DirectMessagesSentGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.sinceId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'sinceId' when calling directMessagesSentGet");
		}
		if (!new ParameterValidator(_request.maxId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'maxId' when calling directMessagesSentGet");
		}
		if (!new ParameterValidator(_request.count)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'count' when calling directMessagesSentGet");
		}
		if (!new ParameterValidator(_request.page)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'page' when calling directMessagesSentGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling directMessagesSentGet");
		}

		// create path and map variables
		String localVarPath = "/direct_messages/sent".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("since_id", parameterToString(_request.sinceId));
		_client.addQueryParam("max_id", parameterToString(_request.maxId));
		_client.addQueryParam("count", parameterToString(_request.count));
		_client.addQueryParam("page", parameterToString(_request.page));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));

		return (List<Messages>) SwaggerUtil.fetch(_client, "array",
				Messages.class, Messages[].class);
	}

	/**
	 * 
	 * returns a single direct message specified by an id
	 */
	public static class DirectMessagesShowGetRequest {
		/**
		 * ID of direct message
		 */
		@NonNull
		public String id;

	}

	/**
	 * 
	 * returns a single direct message specified by an id
	 * 
	 * @return List<Messages>
	 */
	public List<Messages> directMessagesShowGet(SwaggerHttpClient _client,
			DirectMessagesShowGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.id).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'id' when calling directMessagesShowGet");
		}

		// create path and map variables
		String localVarPath = "/direct_messages/show".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("id", parameterToString(_request.id));

		return (List<Messages>) SwaggerUtil.fetch(_client, "array",
				Messages.class, Messages[].class);
	}

	/**
	 * 
	 * returns a cursored collection of user IDs following the user
	 */
	public static class FollowersIdsGetRequest {
		/**
		 * ID of user for whom to return results for
		 */
		@Nullable
		public String userId;

		/**
		 * screen name of user for whom to return results for
		 */
		@Nullable
		public String screenName;

		/**
		 * causes list of connections to be broken in pages
		 */
		@Nullable
		public String cursor;

		/**
		 * IDs converted to strings
		 */
		@Nullable
		public String stringifyIds;

		/**
		 * number of IDs to attempt retrieval of
		 */
		@Nullable
		public String count;

	}

	/**
	 * 
	 * returns a cursored collection of user IDs following the user
	 * 
	 * @return CursorIds
	 */
	public CursorIds followersIdsGet(SwaggerHttpClient _client,
			FollowersIdsGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.userId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling followersIdsGet");
		}
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling followersIdsGet");
		}
		if (!new ParameterValidator(_request.cursor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'cursor' when calling followersIdsGet");
		}
		if (!new ParameterValidator(_request.stringifyIds)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'stringifyIds' when calling followersIdsGet");
		}
		if (!new ParameterValidator(_request.count)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'count' when calling followersIdsGet");
		}

		// create path and map variables
		String localVarPath = "/followers/ids".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("cursor", parameterToString(_request.cursor));
		_client.addQueryParam("stringify_ids",
				parameterToString(_request.stringifyIds));
		_client.addQueryParam("count", parameterToString(_request.count));

		return (CursorIds) SwaggerUtil.fetch(_client, "", CursorIds.class,
				CursorIds[].class);
	}

	/**
	 * 
	 * returns a cursored collection of user IDs followed by user
	 */
	public static class FriendsIdsGetRequest {
		/**
		 * ID of user for whom to return results for
		 */
		@Nullable
		public String userId;

		/**
		 * screen name of user for whom to return results for
		 */
		@Nullable
		public String screenName;

		/**
		 * causes list of connections to be broken in pages
		 */
		@Nullable
		public String cursor;

		/**
		 * IDs converted to strings
		 */
		@Nullable
		public String stringifyIds;

		/**
		 * number of IDs to attempt retrieval of
		 */
		@Nullable
		public String count;

	}

	/**
	 * 
	 * returns a cursored collection of user IDs followed by user
	 * 
	 * @return CursorIds
	 */
	public CursorIds friendsIdsGet(SwaggerHttpClient _client,
			FriendsIdsGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.userId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling friendsIdsGet");
		}
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling friendsIdsGet");
		}
		if (!new ParameterValidator(_request.cursor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'cursor' when calling friendsIdsGet");
		}
		if (!new ParameterValidator(_request.stringifyIds)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'stringifyIds' when calling friendsIdsGet");
		}
		if (!new ParameterValidator(_request.count)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'count' when calling friendsIdsGet");
		}

		// create path and map variables
		String localVarPath = "/friends/ids".replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("cursor", parameterToString(_request.cursor));
		_client.addQueryParam("stringify_ids",
				parameterToString(_request.stringifyIds));
		_client.addQueryParam("count", parameterToString(_request.count));

		return (CursorIds) SwaggerUtil.fetch(_client, "", CursorIds.class,
				CursorIds[].class);
	}

	/**
	 * 
	 * allows users to follow user sepcified by ID
	 */
	public static class FriendshipsCreatePostRequest {
		/**
		 * screen name of user for whom to befriend
		 */
		@Nullable
		public String screenName;

		/**
		 * ID of user for whom to befriend
		 */
		@Nullable
		public String userId;

		/**
		 * enable notifications for target user
		 */
		@Nullable
		public String follow;

	}

	/**
	 * 
	 * allows users to follow user sepcified by ID
	 * 
	 * @return Users
	 */
	public Users friendshipsCreatePost(SwaggerHttpClient _client,
			FriendshipsCreatePostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling friendshipsCreatePost");
		}
		if (!new ParameterValidator(_request.userId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling friendshipsCreatePost");
		}
		if (!new ParameterValidator(_request.follow)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'follow' when calling friendshipsCreatePost");
		}

		// create path and map variables
		String localVarPath = "/friendships/create".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("follow", parameterToString(_request.follow));

		return (Users) SwaggerUtil.fetch(_client, "", Users.class,
				Users[].class);
	}

	/**
	 * 
	 * allows user to unfollow user psecified by ID
	 */
	public static class FriendshipsDestroyPostRequest {
		/**
		 * screen name of user for whom to befriend
		 */
		@NonNull
		public String screenName;

		/**
		 * ID of user for whom to befriend
		 */
		@NonNull
		public String userId;

	}

	/**
	 * 
	 * allows user to unfollow user psecified by ID
	 * 
	 * @return Users
	 */
	public Users friendshipsDestroyPost(SwaggerHttpClient _client,
			FriendshipsDestroyPostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.screenName).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling friendshipsDestroyPost");
		}
		if (!new ParameterValidator(_request.userId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling friendshipsDestroyPost");
		}

		// create path and map variables
		String localVarPath = "/friendships/destroy".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));

		return (Users) SwaggerUtil.fetch(_client, "", Users.class,
				Users[].class);
	}

	/**
	 * 
	 * returns collection of IDs of users with pending follow request
	 */
	public static class FriendshipsIncomingGetRequest {
		/**
		 * causes list of connections to be broken in pages
		 */
		@Nullable
		public String cursor;

		/**
		 * IDs converted to strings
		 */
		@Nullable
		public String stringifyIds;

	}

	/**
	 * 
	 * returns collection of IDs of users with pending follow request
	 * 
	 * @return CursorIds
	 */
	public CursorIds friendshipsIncomingGet(SwaggerHttpClient _client,
			FriendshipsIncomingGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.cursor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'cursor' when calling friendshipsIncomingGet");
		}
		if (!new ParameterValidator(_request.stringifyIds)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'stringifyIds' when calling friendshipsIncomingGet");
		}

		// create path and map variables
		String localVarPath = "/friendships/incoming".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("cursor", parameterToString(_request.cursor));
		_client.addQueryParam("stringify_ids",
				parameterToString(_request.stringifyIds));

		return (CursorIds) SwaggerUtil.fetch(_client, "", CursorIds.class,
				CursorIds[].class);
	}

	/**
	 * 
	 * returns collection of IDs of users with pending follow request from the
	 * user
	 */
	public static class FriendshipsOutgoingGetRequest {
		/**
		 * causes list of connections to be broken in pages
		 */
		@Nullable
		public String cursor;

		/**
		 * IDs converted to strings
		 */
		@Nullable
		public String stringifyIds;

	}

	/**
	 * 
	 * returns collection of IDs of users with pending follow request from the
	 * user
	 * 
	 * @return CursorIds
	 */
	public CursorIds friendshipsOutgoingGet(SwaggerHttpClient _client,
			FriendshipsOutgoingGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.cursor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'cursor' when calling friendshipsOutgoingGet");
		}
		if (!new ParameterValidator(_request.stringifyIds)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'stringifyIds' when calling friendshipsOutgoingGet");
		}

		// create path and map variables
		String localVarPath = "/friendships/outgoing".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("cursor", parameterToString(_request.cursor));
		_client.addQueryParam("stringify_ids",
				parameterToString(_request.stringifyIds));

		return (CursorIds) SwaggerUtil.fetch(_client, "", CursorIds.class,
				CursorIds[].class);
	}

	/**
	 * 
	 * returns detailed info about relationship between two users
	 */
	public static class FriendshipsShowGetRequest {
		/**
		 * user id of target user
		 */
		@NonNull
		public String targetId;

		/**
		 * screen name of target user
		 */
		@NonNull
		public String targetScreenName;

		/**
		 * user id of subject user
		 */
		@Nullable
		public String sourceId;

		/**
		 * screen_name of subject user
		 */
		@Nullable
		public String sourceScreenName;

	}

	/**
	 * 
	 * returns detailed info about relationship between two users
	 * 
	 * @return Friendship
	 */
	public Friendship friendshipsShowGet(SwaggerHttpClient _client,
			FriendshipsShowGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.targetId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'targetId' when calling friendshipsShowGet");
		}
		if (!new ParameterValidator(_request.targetScreenName).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'targetScreenName' when calling friendshipsShowGet");
		}
		if (!new ParameterValidator(_request.sourceId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'sourceId' when calling friendshipsShowGet");
		}
		if (!new ParameterValidator(_request.sourceScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'sourceScreenName' when calling friendshipsShowGet");
		}

		// create path and map variables
		String localVarPath = "/friendships/show".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("source_id", parameterToString(_request.sourceId));
		_client.addQueryParam("source_screen_name",
				parameterToString(_request.sourceScreenName));
		_client.addQueryParam("target_id", parameterToString(_request.targetId));
		_client.addQueryParam("target_screen_name",
				parameterToString(_request.targetScreenName));

		return (Friendship) SwaggerUtil.fetch(_client, "", Friendship.class,
				Friendship[].class);
	}

	/**
	 * 
	 * Allows one to enable or disable settings for specified user
	 */
	public static class FriendshipsUpdatePostRequest {
		/**
		 * screen name of user for whom to befriend
		 */
		@NonNull
		public String screenName;

		/**
		 * ID of user for whom to befriend
		 */
		@NonNull
		public String userId;

		/**
		 * enable/disable device notifications for user
		 */
		@NonNull
		public String device;

		/**
		 * enable/disable retweets from target user
		 */
		@NonNull
		public String retweets;

	}

	/**
	 * 
	 * Allows one to enable or disable settings for specified user
	 * 
	 * @return Friendship
	 */
	public Friendship friendshipsUpdatePost(SwaggerHttpClient _client,
			FriendshipsUpdatePostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.screenName).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling friendshipsUpdatePost");
		}
		if (!new ParameterValidator(_request.userId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling friendshipsUpdatePost");
		}
		if (!new ParameterValidator(_request.device).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'device' when calling friendshipsUpdatePost");
		}
		if (!new ParameterValidator(_request.retweets).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'retweets' when calling friendshipsUpdatePost");
		}

		// create path and map variables
		String localVarPath = "/friendships/update".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("device", parameterToString(_request.device));
		_client.addQueryParam("retweets", parameterToString(_request.retweets));

		return (Friendship) SwaggerUtil.fetch(_client, "", Friendship.class,
				Friendship[].class);
	}

	/**
	 * 
	 * Returns all the information about a know place
	 */
	public static class GeoIdPlaceIdGetRequest {
		/**
		 * A place in the world
		 */
		@NonNull
		public String placeId;

	}

	/**
	 * 
	 * Returns all the information about a know place
	 * 
	 * @return List<Places>
	 */
	public List<Places> geoIdPlaceIdGet(SwaggerHttpClient _client,
			GeoIdPlaceIdGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.placeId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'placeId' when calling geoIdPlaceIdGet");
		}

		// create path and map variables
		String localVarPath = "/geo/id/{place_id}".replaceAll("\\{format\\}",
				"json").replaceAll("\\{" + "place_id" + "\\}",
				escapeString(_request.placeId));
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		return (List<Places>) SwaggerUtil.fetch(_client, "array", Places.class,
				Places[].class);
	}

	/**
	 * 
	 * Create a new place object at the given latitude and logitude
	 */
	public static class GeoPlacesGetRequest {
		/**
		 * The latitude to search around
		 */
		@NonNull
		public String lat;

		/**
		 * The longtitude to search around
		 */
		@NonNull
		public String _long;

		/**
		 * The name a place is known as
		 */
		@NonNull
		public String name;

		/**
		 * The token found in the response from geo/similar_places
		 */
		@NonNull
		public String token;

		/**
		 * This is the place_id which you would like to restrict the search
		 * results to
		 */
		@Nullable
		public String containedWithin;

		/**
		 * This parameter searches for places which have this givven street
		 * address
		 */
		@Nullable
		public String attributestreetAddress;

		/**
		 * If supplied, the responses will use the JSON format with a callback
		 * of the given name
		 */
		@Nullable
		public String callback;

	}

	/**
	 * 
	 * Create a new place object at the given latitude and logitude
	 * 
	 * @return Places
	 */
	public Places geoPlacesGet(SwaggerHttpClient _client,
			GeoPlacesGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.lat).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'lat' when calling geoPlacesGet");
		}
		if (!new ParameterValidator(_request._long).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter '_long' when calling geoPlacesGet");
		}
		if (!new ParameterValidator(_request.name).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'name' when calling geoPlacesGet");
		}
		if (!new ParameterValidator(_request.token).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'token' when calling geoPlacesGet");
		}
		if (!new ParameterValidator(_request.containedWithin)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'containedWithin' when calling geoPlacesGet");
		}
		if (!new ParameterValidator(_request.attributestreetAddress)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'attributestreetAddress' when calling geoPlacesGet");
		}
		if (!new ParameterValidator(_request.callback)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'callback' when calling geoPlacesGet");
		}

		// create path and map variables
		String localVarPath = "/geo/places".replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("lat", parameterToString(_request.lat));
		_client.addQueryParam("long", parameterToString(_request._long));
		_client.addQueryParam("name", parameterToString(_request.name));
		_client.addQueryParam("token", parameterToString(_request.token));
		_client.addQueryParam("contained_within",
				parameterToString(_request.containedWithin));
		_client.addQueryParam("attribute:street_address",
				parameterToString(_request.attributestreetAddress));
		_client.addQueryParam("callback", parameterToString(_request.callback));

		return (Places) SwaggerUtil.fetch(_client, "", Places.class,
				Places[].class);
	}

	/**
	 * 
	 * Given a latitude and a longitude, searches for up to 20 places that can
	 * be used as a place_id when updatting a status
	 */
	public static class GeoReverseGeoncodeGetRequest {
		/**
		 * The latitude to search around
		 */
		@NonNull
		public String lat;

		/**
		 * The longtitude to search around
		 */
		@NonNull
		public String _long;

		/**
		 * A hint on region in which to search
		 */
		@Nullable
		public String accuracy;

		/**
		 * This is the minimal granularity of place types to return
		 */
		@Nullable
		public String granularity;

		/**
		 * A hint as to the number of results to return
		 */
		@Nullable
		public String maxResults;

		/**
		 * If supplied, the responses will use the JSON format with a callback
		 * of the given name
		 */
		@Nullable
		public String callback;

	}

	/**
	 * 
	 * Given a latitude and a longitude, searches for up to 20 places that can
	 * be used as a place_id when updatting a status
	 * 
	 * @return List<Places>
	 */
	public List<Places> geoReverseGeoncodeGet(SwaggerHttpClient _client,
			GeoReverseGeoncodeGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.lat).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'lat' when calling geoReverseGeoncodeGet");
		}
		if (!new ParameterValidator(_request._long).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter '_long' when calling geoReverseGeoncodeGet");
		}
		if (!new ParameterValidator(_request.accuracy)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'accuracy' when calling geoReverseGeoncodeGet");
		}
		if (!new ParameterValidator(_request.granularity)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'granularity' when calling geoReverseGeoncodeGet");
		}
		if (!new ParameterValidator(_request.maxResults)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'maxResults' when calling geoReverseGeoncodeGet");
		}
		if (!new ParameterValidator(_request.callback)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'callback' when calling geoReverseGeoncodeGet");
		}

		// create path and map variables
		String localVarPath = "/geo/reverse_geoncode".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("lat", parameterToString(_request.lat));
		_client.addQueryParam("long", parameterToString(_request._long));
		_client.addQueryParam("accuracy", parameterToString(_request.accuracy));
		_client.addQueryParam("granularity",
				parameterToString(_request.granularity));
		_client.addQueryParam("max_results",
				parameterToString(_request.maxResults));
		_client.addQueryParam("callback", parameterToString(_request.callback));

		return (List<Places>) SwaggerUtil.fetch(_client, "array", Places.class,
				Places[].class);
	}

	/**
	 * 
	 * Search for places that can be attached to a statuses/updates
	 */
	public static class GeoSearchGetRequest {
		/**
		 * The latitude to search around
		 */
		@NonNull
		public String lat;

		/**
		 * The longtitude to search around
		 */
		@NonNull
		public String _long;

		/**
		 * Free-form text to match against while executing a geo-based query
		 */
		@NonNull
		public String query;

		/**
		 * An Ip address
		 */
		@NonNull
		public String ip;

		/**
		 * A hint on region in which to search
		 */
		@Nullable
		public String accuracy;

		/**
		 * This is the minimal granularity of place types to return
		 */
		@Nullable
		public String granularity;

		/**
		 * This is the place_id which you would like to restrict the search
		 * results to
		 */
		@Nullable
		public String containedWithin;

		/**
		 * This parameter searches for places which have this givven street
		 * address
		 */
		@Nullable
		public String attributestreetAddress;

		/**
		 * If supplied, the responses will use the JSON format with a callback
		 * of the given name
		 */
		@Nullable
		public String callback;

	}

	/**
	 * 
	 * Search for places that can be attached to a statuses/updates
	 * 
	 * @return List<Places>
	 */
	public List<Places> geoSearchGet(SwaggerHttpClient _client,
			GeoSearchGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.lat).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'lat' when calling geoSearchGet");
		}
		if (!new ParameterValidator(_request._long).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter '_long' when calling geoSearchGet");
		}
		if (!new ParameterValidator(_request.query).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'query' when calling geoSearchGet");
		}
		if (!new ParameterValidator(_request.ip).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ip' when calling geoSearchGet");
		}
		if (!new ParameterValidator(_request.accuracy)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'accuracy' when calling geoSearchGet");
		}
		if (!new ParameterValidator(_request.granularity)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'granularity' when calling geoSearchGet");
		}
		if (!new ParameterValidator(_request.containedWithin)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'containedWithin' when calling geoSearchGet");
		}
		if (!new ParameterValidator(_request.attributestreetAddress)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'attributestreetAddress' when calling geoSearchGet");
		}
		if (!new ParameterValidator(_request.callback)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'callback' when calling geoSearchGet");
		}

		// create path and map variables
		String localVarPath = "/geo/search".replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("lat", parameterToString(_request.lat));
		_client.addQueryParam("long", parameterToString(_request._long));
		_client.addQueryParam("query", parameterToString(_request.query));
		_client.addQueryParam("ip", parameterToString(_request.ip));
		_client.addQueryParam("accuracy", parameterToString(_request.accuracy));
		_client.addQueryParam("granularity",
				parameterToString(_request.granularity));
		_client.addQueryParam("contained_within",
				parameterToString(_request.containedWithin));
		_client.addQueryParam("attribute:street_address",
				parameterToString(_request.attributestreetAddress));
		_client.addQueryParam("callback", parameterToString(_request.callback));

		return (List<Places>) SwaggerUtil.fetch(_client, "array", Places.class,
				Places[].class);
	}

	/**
	 * 
	 * Locates places near the given coordinates which are similar in name
	 */
	public static class GeoSimilarPlacesGetRequest {
		/**
		 * The latitude to search around
		 */
		@NonNull
		public String lat;

		/**
		 * The longtitude to search around
		 */
		@NonNull
		public String _long;

		/**
		 * The name a place is known as
		 */
		@NonNull
		public String name;

		/**
		 * This is the place_id which you would like to restrict the search
		 * results to
		 */
		@Nullable
		public String containedWithin;

		/**
		 * This parameter searches for places which have this givven street
		 * address
		 */
		@Nullable
		public String attributestreetAddress;

		/**
		 * If supplied, the responses will use the JSON format with a callback
		 * of the given name
		 */
		@Nullable
		public String callback;

	}

	/**
	 * 
	 * Locates places near the given coordinates which are similar in name
	 * 
	 * @return List<Places>
	 */
	public List<Places> geoSimilarPlacesGet(SwaggerHttpClient _client,
			GeoSimilarPlacesGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.lat).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'lat' when calling geoSimilarPlacesGet");
		}
		if (!new ParameterValidator(_request._long).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter '_long' when calling geoSimilarPlacesGet");
		}
		if (!new ParameterValidator(_request.name).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'name' when calling geoSimilarPlacesGet");
		}
		if (!new ParameterValidator(_request.containedWithin)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'containedWithin' when calling geoSimilarPlacesGet");
		}
		if (!new ParameterValidator(_request.attributestreetAddress)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'attributestreetAddress' when calling geoSimilarPlacesGet");
		}
		if (!new ParameterValidator(_request.callback)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'callback' when calling geoSimilarPlacesGet");
		}

		// create path and map variables
		String localVarPath = "/geo/similar_places".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("lat", parameterToString(_request.lat));
		_client.addQueryParam("long", parameterToString(_request._long));
		_client.addQueryParam("name", parameterToString(_request.name));
		_client.addQueryParam("contained_within",
				parameterToString(_request.containedWithin));
		_client.addQueryParam("attribute:street_address",
				parameterToString(_request.attributestreetAddress));
		_client.addQueryParam("callback", parameterToString(_request.callback));

		return (List<Places>) SwaggerUtil.fetch(_client, "array", Places.class,
				Places[].class);
	}

	/**
	 * 
	 * Returns the current configuration used by Twitter including twitter.com
	 * slugs which are not usernames
	 */
	public static class HelpConfigurationGetRequest {
	}

	/**
	 * 
	 * Returns the current configuration used by Twitter including twitter.com
	 * slugs which are not usernames
	 * 
	 * @return HelpConfig
	 */
	public HelpConfig helpConfigurationGet(SwaggerHttpClient _client,
			HelpConfigurationGetRequest _request) throws IOException {

		// create path and map variables
		String localVarPath = "/help/configuration".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		return (HelpConfig) SwaggerUtil.fetch(_client, "", HelpConfig.class,
				HelpConfig[].class);
	}

	/**
	 * 
	 * Returns the list of languages supported by Twitter along with the
	 * language code supported by Twitter
	 */
	public static class HelpLanguagesGetRequest {
	}

	/**
	 * 
	 * Returns the list of languages supported by Twitter along with the
	 * language code supported by Twitter
	 * 
	 * @return List<HelpLanguage>
	 */
	public List<HelpLanguage> helpLanguagesGet(SwaggerHttpClient _client,
			HelpLanguagesGetRequest _request) throws IOException {

		// create path and map variables
		String localVarPath = "/help/languages".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		return (List<HelpLanguage>) SwaggerUtil.fetch(_client, "array",
				HelpLanguage.class, HelpLanguage[].class);
	}

	/**
	 * 
	 * Returns Twitter&#39;s privacy policy
	 */
	public static class HelpPrivacyGetRequest {
	}

	/**
	 * 
	 * Returns Twitter&#39;s privacy policy
	 * 
	 * @return HelpPrivacy
	 */
	public HelpPrivacy helpPrivacyGet(SwaggerHttpClient _client,
			HelpPrivacyGetRequest _request) throws IOException {

		// create path and map variables
		String localVarPath = "/help/privacy"
				.replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		return (HelpPrivacy) SwaggerUtil.fetch(_client, "", HelpPrivacy.class,
				HelpPrivacy[].class);
	}

	/**
	 * 
	 * Returns the Twitter Terms of Service
	 */
	public static class HelpTosGetRequest {
	}

	/**
	 * 
	 * Returns the Twitter Terms of Service
	 * 
	 * @return HelpTos
	 */
	public HelpTos helpTosGet(SwaggerHttpClient _client,
			HelpTosGetRequest _request) throws IOException {

		// create path and map variables
		String localVarPath = "/help/tos".replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		return (HelpTos) SwaggerUtil.fetch(_client, "", HelpTos.class,
				HelpTos[].class);
	}

	/**
	 * 
	 * Returns list of members create
	 */
	public static class ListMembersCreatePostRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list being requested by a slug
		 */
		@NonNull
		public String slug;

		/**
		 * The screen name of the user for whom to remove from the list
		 */
		@Nullable
		public String screenName;

		/**
		 * The screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The user ID of the user who owns the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

	}

	/**
	 * 
	 * Returns list of members create
	 * 
	 * @return void
	 */
	public Object listMembersCreatePost(SwaggerHttpClient _client,
			ListMembersCreatePostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listMembersCreatePost");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listMembersCreatePost");
		}
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling listMembersCreatePost");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listMembersCreatePost");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listMembersCreatePost");
		}

		// create path and map variables
		String localVarPath = "/list/members/create".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));

		return SwaggerUtil.fetch(_client, "", Object.class, Object[].class);
	}

	/**
	 * 
	 * Returns lists of destroy all
	 */
	public static class ListMembersDestroyAllGetRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list being requested by a slug
		 */
		@NonNull
		public String slug;

		/**
		 * The id of the user for whom to remove from the list
		 */
		@Nullable
		public String userId;

		/**
		 * The screen name of the user for whom to remove from the list
		 */
		@Nullable
		public String screenName;

		/**
		 * The screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The user ID of the user who owns the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

	}

	/**
	 * 
	 * Returns lists of destroy all
	 * 
	 * @return CursorLists
	 */
	public CursorLists listMembersDestroyAllGet(SwaggerHttpClient _client,
			ListMembersDestroyAllGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listMembersDestroyAllGet");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listMembersDestroyAllGet");
		}
		if (!new ParameterValidator(_request.userId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling listMembersDestroyAllGet");
		}
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling listMembersDestroyAllGet");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listMembersDestroyAllGet");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listMembersDestroyAllGet");
		}

		// create path and map variables
		String localVarPath = "/list/members/destroy_all".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));

		return (CursorLists) SwaggerUtil.fetch(_client, "", CursorLists.class,
				CursorLists[].class);
	}

	/**
	 * 
	 * Returns the members of the specified list
	 */
	public static class ListMembersGetRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list being requested by a slug
		 */
		@NonNull
		public String slug;

		/**
		 * The screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The user ID of the user who owns the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

		/**
		 * Wehn set to either true, t or 1
		 */
		@Nullable
		public String includeEntities;

		/**
		 * When set to either true, t or 1
		 */
		@Nullable
		public String skipStatus;

		/**
		 * Breaks the results into pages
		 */
		@Nullable
		public String cursor;

	}

	/**
	 * 
	 * Returns the members of the specified list
	 * 
	 * @return Users
	 */
	public Users listMembersGet(SwaggerHttpClient _client,
			ListMembersGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listMembersGet");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listMembersGet");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listMembersGet");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listMembersGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling listMembersGet");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling listMembersGet");
		}
		if (!new ParameterValidator(_request.cursor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'cursor' when calling listMembersGet");
		}

		// create path and map variables
		String localVarPath = "/list/members"
				.replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));
		_client.addQueryParam("cursor", parameterToString(_request.cursor));

		return (Users) SwaggerUtil.fetch(_client, "", Users.class,
				Users[].class);
	}

	/**
	 * 
	 * Check if the specified user is a member of the specified list
	 */
	public static class ListMembersShowGetRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list being requested by a slug
		 */
		@NonNull
		public String slug;

		/**
		 * The id of the user for whom to remove from the list
		 */
		@Nullable
		public String userId;

		/**
		 * The screen name of the user for whom to remove from the list
		 */
		@Nullable
		public String screenName;

		/**
		 * The screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The user ID of the user who owns the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

		/**
		 * Wehn set to either true, t or 1
		 */
		@Nullable
		public String includeEntities;

		/**
		 * When set to either true, t or 1
		 */
		@Nullable
		public String skipStatus;

	}

	/**
	 * 
	 * Check if the specified user is a member of the specified list
	 * 
	 * @return Users
	 */
	public Users listMembersShowGet(SwaggerHttpClient _client,
			ListMembersShowGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listMembersShowGet");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listMembersShowGet");
		}
		if (!new ParameterValidator(_request.userId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling listMembersShowGet");
		}
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling listMembersShowGet");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listMembersShowGet");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listMembersShowGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling listMembersShowGet");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling listMembersShowGet");
		}

		// create path and map variables
		String localVarPath = "/list/members/show".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));

		return (Users) SwaggerUtil.fetch(_client, "", Users.class,
				Users[].class);
	}

	/**
	 * 
	 * Returns list of create
	 */
	public static class ListsCreatePostRequest {
		/**
		 * The name for the list
		 */
		@Nullable
		public String name;

		/**
		 * Whether your list is public or private
		 */
		@Nullable
		public String mode;

		/**
		 * The description to give the list
		 */
		@Nullable
		public String description;

	}

	/**
	 * 
	 * Returns list of create
	 * 
	 * @return Lists
	 */
	public Lists listsCreatePost(SwaggerHttpClient _client,
			ListsCreatePostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.name)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'name' when calling listsCreatePost");
		}
		if (!new ParameterValidator(_request.mode)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'mode' when calling listsCreatePost");
		}
		if (!new ParameterValidator(_request.description)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'description' when calling listsCreatePost");
		}

		// create path and map variables
		String localVarPath = "/lists/create"
				.replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("name", parameterToString(_request.name));
		_client.addQueryParam("mode", parameterToString(_request.mode));
		_client.addQueryParam("description",
				parameterToString(_request.description));

		return (Lists) SwaggerUtil.fetch(_client, "", Lists.class,
				Lists[].class);
	}

	/**
	 * 
	 * Returns list of destroy
	 */
	public static class ListsDestroyPostRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list being requested by a slug
		 */
		@NonNull
		public String slug;

		/**
		 * The screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The user ID of the user who owns the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

	}

	/**
	 * 
	 * Returns list of destroy
	 * 
	 * @return Lists
	 */
	public Lists listsDestroyPost(SwaggerHttpClient _client,
			ListsDestroyPostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listsDestroyPost");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listsDestroyPost");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listsDestroyPost");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listsDestroyPost");
		}

		// create path and map variables
		String localVarPath = "/lists/destroy".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));

		return (Lists) SwaggerUtil.fetch(_client, "", Lists.class,
				Lists[].class);
	}

	/**
	 * 
	 * Return all lists the authenticating or specified user subscribes to,
	 * including their own.
	 */
	public static class ListsListGetRequest {
		/**
		 * The screen name of the user for whom to return results for
		 */
		@NonNull
		public String screenName;

		/**
		 * The ID of the user for whom to return results for
		 */
		@NonNull
		public String userId;

	}

	/**
	 * 
	 * Return all lists the authenticating or specified user subscribes to,
	 * including their own.
	 * 
	 * @return List<Lists>
	 */
	public List<Lists> listsListGet(SwaggerHttpClient _client,
			ListsListGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.screenName).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling listsListGet");
		}
		if (!new ParameterValidator(_request.userId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling listsListGet");
		}

		// create path and map variables
		String localVarPath = "/lists/list".replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));

		return (List<Lists>) SwaggerUtil.fetch(_client, "array", Lists.class,
				Lists[].class);
	}

	/**
	 * 
	 * Returns lists of members create_all
	 */
	public static class ListsMembersCreateAllGetRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list being requested by a slug
		 */
		@NonNull
		public String slug;

		/**
		 * the screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The user ID of the user who owns the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

		/**
		 * The id of the user for whom to remove from the list
		 */
		@Nullable
		public String userId;

		/**
		 * The screen name of the user for whom to remove from the list
		 */
		@Nullable
		public String screenName;

	}

	/**
	 * 
	 * Returns lists of members create_all
	 * 
	 * @return void
	 */
	public Object listsMembersCreateAllGet(SwaggerHttpClient _client,
			ListsMembersCreateAllGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listsMembersCreateAllGet");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listsMembersCreateAllGet");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listsMembersCreateAllGet");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listsMembersCreateAllGet");
		}
		if (!new ParameterValidator(_request.userId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling listsMembersCreateAllGet");
		}
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling listsMembersCreateAllGet");
		}

		// create path and map variables
		String localVarPath = "/lists/members/create_all".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));

		return SwaggerUtil.fetch(_client, "", Object.class, Object[].class);
	}

	/**
	 * 
	 * Returns the list of memebers destroy
	 */
	public static class ListsMembersDestroyGetRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list by its slug instrad of its numerical id
		 */
		@NonNull
		public String slug;

		/**
		 * The screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The id of the user for whom to remove from the list
		 */
		@Nullable
		public String userId;

		/**
		 * The screen name of the user for whom to remove from the list
		 */
		@Nullable
		public String screenName;

		/**
		 * The is of the user who wons the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

	}

	/**
	 * 
	 * Returns the list of memebers destroy
	 * 
	 * @return void
	 */
	public Object listsMembersDestroyGet(SwaggerHttpClient _client,
			ListsMembersDestroyGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listsMembersDestroyGet");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listsMembersDestroyGet");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listsMembersDestroyGet");
		}
		if (!new ParameterValidator(_request.userId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling listsMembersDestroyGet");
		}
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling listsMembersDestroyGet");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listsMembersDestroyGet");
		}

		// create path and map variables
		String localVarPath = "/lists/members/destroy".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));

		return SwaggerUtil.fetch(_client, "", Object.class, Object[].class);
	}

	/**
	 * 
	 * Returns the lists of the specified user has been added to
	 */
	public static class ListsMembershipsGetRequest {
		/**
		 * The id of the user for whom to return results for
		 */
		@Nullable
		public String userId;

		/**
		 * The screen name of the user for whom to return results for
		 */
		@Nullable
		public String screenName;

		/**
		 * Breaks the results into pages
		 */
		@Nullable
		public String cursor;

		/**
		 * When set to true, t or 1, will return just lists the authenticating
		 * user owns
		 */
		@Nullable
		public String filterToOwnedLists;

	}

	/**
	 * 
	 * Returns the lists of the specified user has been added to
	 * 
	 * @return CursorLists
	 */
	public CursorLists listsMembershipsGet(SwaggerHttpClient _client,
			ListsMembershipsGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.userId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling listsMembershipsGet");
		}
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling listsMembershipsGet");
		}
		if (!new ParameterValidator(_request.cursor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'cursor' when calling listsMembershipsGet");
		}
		if (!new ParameterValidator(_request.filterToOwnedLists)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'filterToOwnedLists' when calling listsMembershipsGet");
		}

		// create path and map variables
		String localVarPath = "/lists/memberships".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("cursor", parameterToString(_request.cursor));
		_client.addQueryParam("filter_to_owned_lists",
				parameterToString(_request.filterToOwnedLists));

		return (CursorLists) SwaggerUtil.fetch(_client, "", CursorLists.class,
				CursorLists[].class);
	}

	/**
	 * 
	 * Returns list of show
	 */
	public static class ListsShowGetRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list being requested by a slug
		 */
		@NonNull
		public String slug;

		/**
		 * The screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The user ID of the user who owns the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

	}

	/**
	 * 
	 * Returns list of show
	 * 
	 * @return Lists
	 */
	public Lists listsShowGet(SwaggerHttpClient _client,
			ListsShowGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listsShowGet");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listsShowGet");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listsShowGet");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listsShowGet");
		}

		// create path and map variables
		String localVarPath = "/lists/show".replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));

		return (Lists) SwaggerUtil.fetch(_client, "", Lists.class,
				Lists[].class);
	}

	/**
	 * 
	 * Returns a timeline of tweets authored by memebers of the specified list
	 */
	public static class ListsStatusesGetRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list by its slug instead of its numerical id
		 */
		@NonNull
		public String slug;

		/**
		 * The screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The user ID of the user who owns the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

		/**
		 * Returns results with an ID greater than the sepcified ID
		 */
		@Nullable
		public String sinceId;

		/**
		 * Returns results with an ID less than or equal to the specified ID
		 */
		@Nullable
		public String maxId;

		/**
		 * Specifies the number of results to retrieve per page
		 */
		@Nullable
		public String count;

		/**
		 * Entities are ON by default
		 */
		@Nullable
		public String includeEntities;

		/**
		 * When set to either true, t or 1, the list timeline will contain
		 * native retweets in addition to the standard stream of tweets
		 */
		@Nullable
		public String includeRts;

	}

	/**
	 * 
	 * Returns a timeline of tweets authored by memebers of the specified list
	 * 
	 * @return List<Tweets>
	 */
	public List<Tweets> listsStatusesGet(SwaggerHttpClient _client,
			ListsStatusesGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listsStatusesGet");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listsStatusesGet");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listsStatusesGet");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listsStatusesGet");
		}
		if (!new ParameterValidator(_request.sinceId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'sinceId' when calling listsStatusesGet");
		}
		if (!new ParameterValidator(_request.maxId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'maxId' when calling listsStatusesGet");
		}
		if (!new ParameterValidator(_request.count)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'count' when calling listsStatusesGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling listsStatusesGet");
		}
		if (!new ParameterValidator(_request.includeRts)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeRts' when calling listsStatusesGet");
		}

		// create path and map variables
		String localVarPath = "/lists/statuses".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));
		_client.addQueryParam("since_id", parameterToString(_request.sinceId));
		_client.addQueryParam("max_id", parameterToString(_request.maxId));
		_client.addQueryParam("count", parameterToString(_request.count));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("include_rts",
				parameterToString(_request.includeRts));

		return (List<Tweets>) SwaggerUtil.fetch(_client, "array", Tweets.class,
				Tweets[].class);
	}

	/**
	 * 
	 * Subscribes the authenticated user to the specified list
	 */
	public static class ListsSubscribersCreatePostRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list being requested by a slug
		 */
		@NonNull
		public String slug;

		/**
		 * the screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The user ID of the user who owns the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

	}

	/**
	 * 
	 * Subscribes the authenticated user to the specified list
	 * 
	 * @return Lists
	 */
	public Lists listsSubscribersCreatePost(SwaggerHttpClient _client,
			ListsSubscribersCreatePostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listsSubscribersCreatePost");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listsSubscribersCreatePost");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listsSubscribersCreatePost");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listsSubscribersCreatePost");
		}

		// create path and map variables
		String localVarPath = "/lists/subscribers/create".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));

		return (Lists) SwaggerUtil.fetch(_client, "", Lists.class,
				Lists[].class);
	}

	/**
	 * 
	 * Returns list of subscribers destroy
	 */
	public static class ListsSubscribersDestroyGetRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list being requested by a slug
		 */
		@NonNull
		public String slug;

		/**
		 * the screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The user ID of the user who owns the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

	}

	/**
	 * 
	 * Returns list of subscribers destroy
	 * 
	 * @return void
	 */
	public Object listsSubscribersDestroyGet(SwaggerHttpClient _client,
			ListsSubscribersDestroyGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listsSubscribersDestroyGet");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listsSubscribersDestroyGet");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listsSubscribersDestroyGet");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listsSubscribersDestroyGet");
		}

		// create path and map variables
		String localVarPath = "/lists/subscribers/destroy".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));

		return SwaggerUtil.fetch(_client, "", Object.class, Object[].class);
	}

	/**
	 * 
	 * Returns the subscribers of the specified list
	 */
	public static class ListsSubscribersGetRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list by its slug insted of its numerical id
		 */
		@NonNull
		public String slug;

		/**
		 * the screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The user ID of the user who owns the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

		/**
		 * Breaks the results into pages
		 */
		@Nullable
		public String cursor;

		/**
		 * Wehn set to either true, t or 1
		 */
		@Nullable
		public String includeEntities;

		/**
		 * When set to either true, t or 1
		 */
		@Nullable
		public String skipStatus;

	}

	/**
	 * 
	 * Returns the subscribers of the specified list
	 * 
	 * @return CursorLists
	 */
	public CursorLists listsSubscribersGet(SwaggerHttpClient _client,
			ListsSubscribersGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listsSubscribersGet");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listsSubscribersGet");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listsSubscribersGet");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listsSubscribersGet");
		}
		if (!new ParameterValidator(_request.cursor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'cursor' when calling listsSubscribersGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling listsSubscribersGet");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling listsSubscribersGet");
		}

		// create path and map variables
		String localVarPath = "/lists/subscribers".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));
		_client.addQueryParam("cursor", parameterToString(_request.cursor));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));

		return (CursorLists) SwaggerUtil.fetch(_client, "", CursorLists.class,
				CursorLists[].class);
	}

	/**
	 * 
	 * Check if the specified user is a subscriber of the specified list
	 */
	public static class ListsSubscribersShowGetRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list being requested by a slug
		 */
		@NonNull
		public String slug;

		/**
		 * The screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The id of the user for whom to remove from the list
		 */
		@Nullable
		public String userId;

		/**
		 * The screen name of the user for whom to remove from the list
		 */
		@Nullable
		public String screenName;

		/**
		 * The is of the user who wons the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

		/**
		 * Wehn set to either true, t or 1
		 */
		@Nullable
		public String includeEntities;

		/**
		 * When set to either true, t or 1
		 */
		@Nullable
		public String skipStatus;

	}

	/**
	 * 
	 * Check if the specified user is a subscriber of the specified list
	 * 
	 * @return Users
	 */
	public Users listsSubscribersShowGet(SwaggerHttpClient _client,
			ListsSubscribersShowGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listsSubscribersShowGet");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listsSubscribersShowGet");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listsSubscribersShowGet");
		}
		if (!new ParameterValidator(_request.userId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling listsSubscribersShowGet");
		}
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling listsSubscribersShowGet");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listsSubscribersShowGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling listsSubscribersShowGet");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling listsSubscribersShowGet");
		}

		// create path and map variables
		String localVarPath = "/lists/subscribers/show".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));

		return (Users) SwaggerUtil.fetch(_client, "", Users.class,
				Users[].class);
	}

	/**
	 * 
	 * Returns list of subscriptions
	 */
	public static class ListsSubscriptionsGetRequest {
		/**
		 * The screen name of the user
		 */
		@Nullable
		public String screenName;

		/**
		 * The id of the user for whom to return results for
		 */
		@Nullable
		public String userId;

		/**
		 * The amount of results to return per page
		 */
		@Nullable
		public String count;

		/**
		 * Breaks the results into pages
		 */
		@Nullable
		public String cursor;

	}

	/**
	 * 
	 * Returns list of subscriptions
	 * 
	 * @return CursorLists
	 */
	public CursorLists listsSubscriptionsGet(SwaggerHttpClient _client,
			ListsSubscriptionsGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling listsSubscriptionsGet");
		}
		if (!new ParameterValidator(_request.userId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling listsSubscriptionsGet");
		}
		if (!new ParameterValidator(_request.count)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'count' when calling listsSubscriptionsGet");
		}
		if (!new ParameterValidator(_request.cursor)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'cursor' when calling listsSubscriptionsGet");
		}

		// create path and map variables
		String localVarPath = "/lists/subscriptions".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("count", parameterToString(_request.count));
		_client.addQueryParam("cursor", parameterToString(_request.cursor));

		return (CursorLists) SwaggerUtil.fetch(_client, "", CursorLists.class,
				CursorLists[].class);
	}

	/**
	 * 
	 * Returns lists of updates
	 */
	public static class ListsUpdatePostRequest {
		/**
		 * The numerical id of the list
		 */
		@NonNull
		public String listId;

		/**
		 * You can identify a list being requested by a slug
		 */
		@NonNull
		public String slug;

		/**
		 * The screen name of the user who owns the list being requested by a
		 * slug
		 */
		@Nullable
		public String ownerScreenName;

		/**
		 * The user ID of the user who owns the list being requested by a slug
		 */
		@Nullable
		public String ownerId;

		/**
		 * The name for the list
		 */
		@Nullable
		public String name;

		/**
		 * Whether your list is public or private
		 */
		@Nullable
		public String mode;

		/**
		 * The description to give the list
		 */
		@Nullable
		public String description;

	}

	/**
	 * 
	 * Returns lists of updates
	 * 
	 * @return void
	 */
	public Object listsUpdatePost(SwaggerHttpClient _client,
			ListsUpdatePostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.listId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'listId' when calling listsUpdatePost");
		}
		if (!new ParameterValidator(_request.slug).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'slug' when calling listsUpdatePost");
		}
		if (!new ParameterValidator(_request.ownerScreenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerScreenName' when calling listsUpdatePost");
		}
		if (!new ParameterValidator(_request.ownerId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'ownerId' when calling listsUpdatePost");
		}
		if (!new ParameterValidator(_request.name)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'name' when calling listsUpdatePost");
		}
		if (!new ParameterValidator(_request.mode)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'mode' when calling listsUpdatePost");
		}
		if (!new ParameterValidator(_request.description)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'description' when calling listsUpdatePost");
		}

		// create path and map variables
		String localVarPath = "/lists/update"
				.replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("list_id", parameterToString(_request.listId));
		_client.addQueryParam("slug", parameterToString(_request.slug));
		_client.addQueryParam("owner_screen_name",
				parameterToString(_request.ownerScreenName));
		_client.addQueryParam("owner_id", parameterToString(_request.ownerId));
		_client.addQueryParam("name", parameterToString(_request.name));
		_client.addQueryParam("mode", parameterToString(_request.mode));
		_client.addQueryParam("description",
				parameterToString(_request.description));

		return SwaggerUtil.fetch(_client, "", Object.class, Object[].class);
	}

	/**
	 * 
	 * Create a new saved search for the authenticated user
	 */
	public static class SavedSearchesCreatePostRequest {
		/**
		 * The query of the search the user would like to save
		 */
		@NonNull
		public String query;

	}

	/**
	 * 
	 * Create a new saved search for the authenticated user
	 * 
	 * @return Query
	 */
	public Query savedSearchesCreatePost(SwaggerHttpClient _client,
			SavedSearchesCreatePostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.query).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'query' when calling savedSearchesCreatePost");
		}

		// create path and map variables
		String localVarPath = "/saved_searches/create".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("query", parameterToString(_request.query));

		return (Query) SwaggerUtil.fetch(_client, "", Query.class,
				Query[].class);
	}

	/**
	 * 
	 * Destroy a saved search for the authenticating user
	 */
	public static class SavedSearchesDestroyIdPostRequest {
		/**
		 * The id of the saved search
		 */
		@NonNull
		public String id;

	}

	/**
	 * 
	 * Destroy a saved search for the authenticating user
	 * 
	 * @return Query
	 */
	public Query savedSearchesDestroyIdPost(SwaggerHttpClient _client,
			SavedSearchesDestroyIdPostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.id).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'id' when calling savedSearchesDestroyIdPost");
		}

		// create path and map variables
		String localVarPath = "/saved_searches/destroy/{id}".replaceAll(
				"\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",
				escapeString(_request.id));
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		return (Query) SwaggerUtil.fetch(_client, "", Query.class,
				Query[].class);
	}

	/**
	 * 
	 * Returns the authenticated user&#39;s saved search queries
	 */
	public static class SavedSearchesListGetRequest {
	}

	/**
	 * 
	 * Returns the authenticated user&#39;s saved search queries
	 * 
	 * @return List<Query>
	 */
	public List<Query> savedSearchesListGet(SwaggerHttpClient _client,
			SavedSearchesListGetRequest _request) throws IOException {

		// create path and map variables
		String localVarPath = "/saved_searches/list".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		return (List<Query>) SwaggerUtil.fetch(_client, "array", Query.class,
				Query[].class);
	}

	/**
	 * 
	 * Retrieve the information for the saved search represented by the given id
	 */
	public static class SavedSearchesShowIdGetRequest {
		/**
		 * The id of the saved search
		 */
		@NonNull
		public String id;

	}

	/**
	 * 
	 * Retrieve the information for the saved search represented by the given id
	 * 
	 * @return Query
	 */
	public Query savedSearchesShowIdGet(SwaggerHttpClient _client,
			SavedSearchesShowIdGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.id).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'id' when calling savedSearchesShowIdGet");
		}

		// create path and map variables
		String localVarPath = "/saved_searches/show/{id}".replaceAll(
				"\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",
				escapeString(_request.id));
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		return (Query) SwaggerUtil.fetch(_client, "", Query.class,
				Query[].class);
	}

	/**
	 * 
	 * returns collection of relevant Tweets matching query
	 */
	public static class SearchTweetsGetRequest {
		/**
		 * URL-encoded search query of 500 characters max
		 */
		@NonNull
		public String q;

		/**
		 * returns tweets by users located within given radius
		 */
		@Nullable
		public String geocode;

		/**
		 * restricts tweets to a given language
		 */
		@Nullable
		public String lang;

		/**
		 * language of query you are sending
		 */
		@Nullable
		public String locale;

		/**
		 * specifies type of search results you prefer
		 */
		@Nullable
		public String resultType;

		/**
		 * number of tweets to return
		 */
		@Nullable
		public String count;

		/**
		 * returns tweets created before given date
		 */
		@Nullable
		public String until;

		/**
		 * return results with ID greater than specified
		 */
		@Nullable
		public String sinceId;

		/**
		 * returns results with an ID less than/equal to specified ID
		 */
		@Nullable
		public String maxId;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

		/**
		 * response will use the callback with given name
		 */
		@Nullable
		public String callback;

	}

	/**
	 * 
	 * returns collection of relevant Tweets matching query
	 * 
	 * @return List<Tweets>
	 */
	public List<Tweets> searchTweetsGet(SwaggerHttpClient _client,
			SearchTweetsGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.q).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'q' when calling searchTweetsGet");
		}
		if (!new ParameterValidator(_request.geocode)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'geocode' when calling searchTweetsGet");
		}
		if (!new ParameterValidator(_request.lang)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'lang' when calling searchTweetsGet");
		}
		if (!new ParameterValidator(_request.locale)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'locale' when calling searchTweetsGet");
		}
		if (!new ParameterValidator(_request.resultType)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'resultType' when calling searchTweetsGet");
		}
		if (!new ParameterValidator(_request.count)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'count' when calling searchTweetsGet");
		}
		if (!new ParameterValidator(_request.until)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'until' when calling searchTweetsGet");
		}
		if (!new ParameterValidator(_request.sinceId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'sinceId' when calling searchTweetsGet");
		}
		if (!new ParameterValidator(_request.maxId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'maxId' when calling searchTweetsGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling searchTweetsGet");
		}
		if (!new ParameterValidator(_request.callback)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'callback' when calling searchTweetsGet");
		}

		// create path and map variables
		String localVarPath = "/search/tweets".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("q", parameterToString(_request.q));
		_client.addQueryParam("geocode", parameterToString(_request.geocode));
		_client.addQueryParam("lang", parameterToString(_request.lang));
		_client.addQueryParam("locale", parameterToString(_request.locale));
		_client.addQueryParam("result_type",
				parameterToString(_request.resultType));
		_client.addQueryParam("count", parameterToString(_request.count));
		_client.addQueryParam("until", parameterToString(_request.until));
		_client.addQueryParam("since_id", parameterToString(_request.sinceId));
		_client.addQueryParam("max_id", parameterToString(_request.maxId));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("callback", parameterToString(_request.callback));

		return (List<Tweets>) SwaggerUtil.fetch(_client, "array", Tweets.class,
				Tweets[].class);
	}

	/**
	 * 
	 * Destroys the status specified by the required ID parameter
	 */
	public static class StatusesDestroyIdPostRequest {
		/**
		 * The numerical ID of the desired status
		 */
		@NonNull
		public String id;

		/**
		 * When set to either true, t or 1, each tweet returned in a timeline
		 * will include a user object
		 */
		@Nullable
		public String trimUser;

	}

	/**
	 * 
	 * Destroys the status specified by the required ID parameter
	 * 
	 * @return Tweets
	 */
	public Tweets statusesDestroyIdPost(SwaggerHttpClient _client,
			StatusesDestroyIdPostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.id).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'id' when calling statusesDestroyIdPost");
		}
		if (!new ParameterValidator(_request.trimUser)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'trimUser' when calling statusesDestroyIdPost");
		}

		// create path and map variables
		String localVarPath = "/statuses/destroy/{id}".replaceAll(
				"\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",
				escapeString(_request.id));
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("trim_user", parameterToString(_request.trimUser));

		return (Tweets) SwaggerUtil.fetch(_client, "", Tweets.class,
				Tweets[].class);
	}

	/**
	 * 
	 * Returns a collection of the most recent Tweets
	 */
	public static class StatusesHomeTimelineGetRequest {
		/**
		 * Returns result with an ID greater than the specified ID
		 */
		@Nullable
		public String sinceId;

		/**
		 * Returns results with an ID less than or equal to the specified ID
		 */
		@Nullable
		public String maxId;

		/**
		 * When set to either true, t or 1, each tweet returned in a timeline
		 * will include a user object
		 */
		@Nullable
		public String trimUser;

		/**
		 * This paramters will prevent from appearing in the returned timeline
		 */
		@Nullable
		public Boolean excludeReplies;

		/**
		 * This paramters enhances the contributors element of the status
		 * response to include the screen_name of the contributor
		 */
		@Nullable
		public Boolean contributorDetails;

	}

	/**
	 * 
	 * Returns a collection of the most recent Tweets
	 * 
	 * @return List<Tweets>
	 */
	public List<Tweets> statusesHomeTimelineGet(SwaggerHttpClient _client,
			StatusesHomeTimelineGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.sinceId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'sinceId' when calling statusesHomeTimelineGet");
		}
		if (!new ParameterValidator(_request.maxId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'maxId' when calling statusesHomeTimelineGet");
		}
		if (!new ParameterValidator(_request.trimUser)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'trimUser' when calling statusesHomeTimelineGet");
		}
		if (!new ParameterValidator(_request.excludeReplies)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'excludeReplies' when calling statusesHomeTimelineGet");
		}
		if (!new ParameterValidator(_request.contributorDetails)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'contributorDetails' when calling statusesHomeTimelineGet");
		}

		// create path and map variables
		String localVarPath = "/statuses/home_timeline".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("since_id", parameterToString(_request.sinceId));
		_client.addQueryParam("max_id", parameterToString(_request.maxId));
		_client.addQueryParam("trim_user", parameterToString(_request.trimUser));
		_client.addQueryParam("exclude_replies",
				parameterToString(_request.excludeReplies));
		_client.addQueryParam("contributor_details",
				parameterToString(_request.contributorDetails));

		return (List<Tweets>) SwaggerUtil.fetch(_client, "array", Tweets.class,
				Tweets[].class);
	}

	/**
	 * 
	 * Returns the 20 most recent mentions for the authenticating user
	 */
	public static class StatusesMentionsTimelineGetRequest {
		/**
		 * Specifies the number of tweets to try and retrieve
		 */
		@Nullable
		public String count;

		/**
		 * Returns result with an ID greater than the specified ID
		 */
		@Nullable
		public String sinceId;

		/**
		 * Returns results with an ID less than or equal to the specified ID
		 */
		@Nullable
		public String maxId;

		/**
		 * When set to either true, t or 1, each tweet returned in a timeline
		 * will include a user object
		 */
		@Nullable
		public String trimUser;

		/**
		 * This parameter enhances the contributors element of the status
		 * response
		 */
		@Nullable
		public String contributorDetails;

		/**
		 * The entities node will be disincluded when set to false
		 */
		@Nullable
		public String includeEntities;

	}

	/**
	 * 
	 * Returns the 20 most recent mentions for the authenticating user
	 * 
	 * @return List<Tweets>
	 */
	public List<Tweets> statusesMentionsTimelineGet(SwaggerHttpClient _client,
			StatusesMentionsTimelineGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.count)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'count' when calling statusesMentionsTimelineGet");
		}
		if (!new ParameterValidator(_request.sinceId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'sinceId' when calling statusesMentionsTimelineGet");
		}
		if (!new ParameterValidator(_request.maxId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'maxId' when calling statusesMentionsTimelineGet");
		}
		if (!new ParameterValidator(_request.trimUser)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'trimUser' when calling statusesMentionsTimelineGet");
		}
		if (!new ParameterValidator(_request.contributorDetails)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'contributorDetails' when calling statusesMentionsTimelineGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling statusesMentionsTimelineGet");
		}

		// create path and map variables
		String localVarPath = "/statuses/mentions_timeline".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("count", parameterToString(_request.count));
		_client.addQueryParam("since_id", parameterToString(_request.sinceId));
		_client.addQueryParam("max_id", parameterToString(_request.maxId));
		_client.addQueryParam("trim_user", parameterToString(_request.trimUser));
		_client.addQueryParam("contributor_details",
				parameterToString(_request.contributorDetails));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));

		return (List<Tweets>) SwaggerUtil.fetch(_client, "array", Tweets.class,
				Tweets[].class);
	}

	/**
	 * 
	 * Returns information allowing the creation of an embedded representation
	 */
	public static class StatusesOembedGetRequest {
		/**
		 * The tweet/status id to return embed code for
		 */
		@NonNull
		public String id;

		/**
		 * The encoded URL of the Tweet status to be embedded
		 */
		@NonNull
		public String url;

		/**
		 * The maximum width in pixels that the embed should be rendered at
		 */
		@Nullable
		public String maxwidth;

		/**
		 * Specifies whether the embedded tweet should automatically show the
		 * original message in the case that the embedded Tweet is a reply
		 */
		@Nullable
		public String hideMedia;

		/**
		 * Specifies whether the embedded Tweet html should include a
		 * &#39;script&#39; element pointing to widgets.js
		 */
		@Nullable
		public String hideThread;

		/**
		 * Specifies whether the embedded Tweet should be left aligned
		 */
		@Nullable
		public String align;

		/**
		 * A value for the TWT related parameters
		 */
		@Nullable
		public String related;

		/**
		 * Languages code for the rendered embed
		 */
		@Nullable
		public String lang;

	}

	/**
	 * 
	 * Returns information allowing the creation of an embedded representation
	 * 
	 * @return Tweets
	 */
	public Tweets statusesOembedGet(SwaggerHttpClient _client,
			StatusesOembedGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.id).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'id' when calling statusesOembedGet");
		}
		if (!new ParameterValidator(_request.url).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'url' when calling statusesOembedGet");
		}
		if (!new ParameterValidator(_request.maxwidth)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'maxwidth' when calling statusesOembedGet");
		}
		if (!new ParameterValidator(_request.hideMedia)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'hideMedia' when calling statusesOembedGet");
		}
		if (!new ParameterValidator(_request.hideThread)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'hideThread' when calling statusesOembedGet");
		}
		if (!new ParameterValidator(_request.align)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'align' when calling statusesOembedGet");
		}
		if (!new ParameterValidator(_request.related)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'related' when calling statusesOembedGet");
		}
		if (!new ParameterValidator(_request.lang)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'lang' when calling statusesOembedGet");
		}

		// create path and map variables
		String localVarPath = "/statuses/oembed".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("id", parameterToString(_request.id));
		_client.addQueryParam("url", parameterToString(_request.url));
		_client.addQueryParam("maxwidth", parameterToString(_request.maxwidth));
		_client.addQueryParam("hide_media",
				parameterToString(_request.hideMedia));
		_client.addQueryParam("hide_thread",
				parameterToString(_request.hideThread));
		_client.addQueryParam("align", parameterToString(_request.align));
		_client.addQueryParam("related", parameterToString(_request.related));
		_client.addQueryParam("lang", parameterToString(_request.lang));

		return (Tweets) SwaggerUtil.fetch(_client, "", Tweets.class,
				Tweets[].class);
	}

	/**
	 * 
	 * Retruns a collection of the 100 most recent retweets of the tweet
	 * specified by the id
	 */
	public static class StatusesRetweetsIdGetRequest {
		/**
		 * The numerical ID of the desired status
		 */
		@NonNull
		public String id;

		/**
		 * Specifies the number of tweets to try and retrieve
		 */
		@Nullable
		public String count;

		/**
		 * When set to either true, t or 1, each tweet returned in a timeline
		 * will include a user object
		 */
		@Nullable
		public String trimUser;

	}

	/**
	 * 
	 * Retruns a collection of the 100 most recent retweets of the tweet
	 * specified by the id
	 * 
	 * @return List<Tweets>
	 */
	public List<Tweets> statusesRetweetsIdGet(SwaggerHttpClient _client,
			StatusesRetweetsIdGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.id).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'id' when calling statusesRetweetsIdGet");
		}
		if (!new ParameterValidator(_request.count)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'count' when calling statusesRetweetsIdGet");
		}
		if (!new ParameterValidator(_request.trimUser)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'trimUser' when calling statusesRetweetsIdGet");
		}

		// create path and map variables
		String localVarPath = "/statuses/retweets/{id}".replaceAll(
				"\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",
				escapeString(_request.id));
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("count", parameterToString(_request.count));
		_client.addQueryParam("trim_user", parameterToString(_request.trimUser));

		return (List<Tweets>) SwaggerUtil.fetch(_client, "array", Tweets.class,
				Tweets[].class);
	}

	/**
	 * 
	 * Retweens a tweet
	 */
	public static class StatusesRetweetsIdPostRequest {
		/**
		 * The numerical ID of the desired status
		 */
		@NonNull
		public String id;

		/**
		 * When set to either true, t or 1, each tweet returned in a timeline
		 * will include a user object
		 */
		@Nullable
		public String trimUser;

	}

	/**
	 * 
	 * Retweens a tweet
	 * 
	 * @return Tweets
	 */
	public Tweets statusesRetweetsIdPost(SwaggerHttpClient _client,
			StatusesRetweetsIdPostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.id).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'id' when calling statusesRetweetsIdPost");
		}
		if (!new ParameterValidator(_request.trimUser)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'trimUser' when calling statusesRetweetsIdPost");
		}

		// create path and map variables
		String localVarPath = "/statuses/retweets/{id}".replaceAll(
				"\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",
				escapeString(_request.id));
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("trim_user", parameterToString(_request.trimUser));

		return (Tweets) SwaggerUtil.fetch(_client, "", Tweets.class,
				Tweets[].class);
	}

	/**
	 * 
	 * Retruns a single Tweet
	 */
	public static class StatusesShowIdGetRequest {
		/**
		 * The numerical ID of the desired status
		 */
		@NonNull
		public String id;

		/**
		 * When set to either true, t or 1, any Tweets returned that have been
		 * retweeted by the authenticating
		 */
		@NonNull
		public String includeMyRetweet;

		/**
		 * When set to either true, t or 1, each tweet returned in a timeline
		 * will include a user object
		 */
		@Nullable
		public String trimUser;

		/**
		 * The entities node will be disincluded when set to false
		 */
		@Nullable
		public String includeEntities;

	}

	/**
	 * 
	 * Retruns a single Tweet
	 * 
	 * @return Tweets
	 */
	public Tweets statusesShowIdGet(SwaggerHttpClient _client,
			StatusesShowIdGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.id).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'id' when calling statusesShowIdGet");
		}
		if (!new ParameterValidator(_request.includeMyRetweet).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeMyRetweet' when calling statusesShowIdGet");
		}
		if (!new ParameterValidator(_request.trimUser)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'trimUser' when calling statusesShowIdGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling statusesShowIdGet");
		}

		// create path and map variables
		String localVarPath = "/statuses/show/{id}".replaceAll("\\{format\\}",
				"json").replaceAll("\\{" + "id" + "\\}",
				escapeString(_request.id));
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("trim_user", parameterToString(_request.trimUser));
		_client.addQueryParam("include_my_retweet",
				parameterToString(_request.includeMyRetweet));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));

		return (Tweets) SwaggerUtil.fetch(_client, "", Tweets.class,
				Tweets[].class);
	}

	/**
	 * 
	 * Updates the authenticating user&#39;s status
	 */
	public static class StatusesUpdatePostRequest {
		/**
		 * The text of your status update
		 */
		@NonNull
		public String status;

		/**
		 * The ID of an existing status
		 */
		@Nullable
		public String inReplyToStatusId;

		/**
		 * The latitude of the location
		 */
		@Nullable
		public String lat;

		/**
		 * The longitude of the location
		 */
		@Nullable
		public String _long;

		/**
		 * A place in the world
		 */
		@Nullable
		public String placeId;

		/**
		 * Whether or not to put a pin on the exact coordinates a tweet
		 */
		@Nullable
		public String displayCoordinates;

		/**
		 * When set to either true, t or 1, each tweet returned in a timeline
		 * will include a user object
		 */
		@Nullable
		public String trimUser;

	}

	/**
	 * 
	 * Updates the authenticating user&#39;s status
	 * 
	 * @return Tweets
	 */
	public Tweets statusesUpdatePost(SwaggerHttpClient _client,
			StatusesUpdatePostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.status).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'status' when calling statusesUpdatePost");
		}
		if (!new ParameterValidator(_request.inReplyToStatusId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'inReplyToStatusId' when calling statusesUpdatePost");
		}
		if (!new ParameterValidator(_request.lat)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'lat' when calling statusesUpdatePost");
		}
		if (!new ParameterValidator(_request._long)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter '_long' when calling statusesUpdatePost");
		}
		if (!new ParameterValidator(_request.placeId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'placeId' when calling statusesUpdatePost");
		}
		if (!new ParameterValidator(_request.displayCoordinates)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'displayCoordinates' when calling statusesUpdatePost");
		}
		if (!new ParameterValidator(_request.trimUser)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'trimUser' when calling statusesUpdatePost");
		}

		// create path and map variables
		String localVarPath = "/statuses/update".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("status", parameterToString(_request.status));
		_client.addQueryParam("in_reply_to_status_id",
				parameterToString(_request.inReplyToStatusId));
		_client.addQueryParam("lat", parameterToString(_request.lat));
		_client.addQueryParam("long", parameterToString(_request._long));
		_client.addQueryParam("place_id", parameterToString(_request.placeId));
		_client.addQueryParam("display_coordinates",
				parameterToString(_request.displayCoordinates));
		_client.addQueryParam("trim_user", parameterToString(_request.trimUser));

		return (Tweets) SwaggerUtil.fetch(_client, "", Tweets.class,
				Tweets[].class);
	}

	/**
	 * 
	 * Returns a collection of the most recent Tweets posted by the User
	 */
	public static class StatusesUserTimelineGetRequest {
		/**
		 * Specifies the number of tweets to try and retrieve
		 */
		@Nullable
		public String count;

		/**
		 * Returns result with an ID greater than the specified ID
		 */
		@Nullable
		public String sinceId;

		/**
		 * Returns results with an ID less than or equal to the specified ID
		 */
		@Nullable
		public String maxId;

		/**
		 * When set to either true, t or 1, each tweet returned in a timeline
		 * will include a user object
		 */
		@Nullable
		public String trimUser;

		/**
		 * This paramters will prevent from appearing in the returned timeline
		 */
		@Nullable
		public Boolean excludeReplies;

		/**
		 * This paramters enhances the contributors element of the status
		 * response to include the screen_name of the contributor
		 */
		@Nullable
		public Boolean contributorDetails;

		/**
		 * When set to false, the timeline will strip any native retweet
		 */
		@Nullable
		public Boolean includeRts;

	}

	/**
	 * 
	 * Returns a collection of the most recent Tweets posted by the User
	 * 
	 * @return List<Tweets>
	 */
	public List<Tweets> statusesUserTimelineGet(SwaggerHttpClient _client,
			StatusesUserTimelineGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.count)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'count' when calling statusesUserTimelineGet");
		}
		if (!new ParameterValidator(_request.sinceId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'sinceId' when calling statusesUserTimelineGet");
		}
		if (!new ParameterValidator(_request.maxId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'maxId' when calling statusesUserTimelineGet");
		}
		if (!new ParameterValidator(_request.trimUser)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'trimUser' when calling statusesUserTimelineGet");
		}
		if (!new ParameterValidator(_request.excludeReplies)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'excludeReplies' when calling statusesUserTimelineGet");
		}
		if (!new ParameterValidator(_request.contributorDetails)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'contributorDetails' when calling statusesUserTimelineGet");
		}
		if (!new ParameterValidator(_request.includeRts)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeRts' when calling statusesUserTimelineGet");
		}

		// create path and map variables
		String localVarPath = "/statuses/user_timeline".replaceAll(
				"\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("count", parameterToString(_request.count));
		_client.addQueryParam("since_id", parameterToString(_request.sinceId));
		_client.addQueryParam("max_id", parameterToString(_request.maxId));
		_client.addQueryParam("trim_user", parameterToString(_request.trimUser));
		_client.addQueryParam("exclude_replies",
				parameterToString(_request.excludeReplies));
		_client.addQueryParam("contributor_details",
				parameterToString(_request.contributorDetails));
		_client.addQueryParam("include_rts",
				parameterToString(_request.includeRts));

		return (List<Tweets>) SwaggerUtil.fetch(_client, "array", Tweets.class,
				Tweets[].class);
	}

	/**
	 * 
	 * Returns the availability
	 */
	public static class TrendsAvailableGetRequest {
	}

	/**
	 * 
	 * Returns the availability
	 * 
	 * @return List<Location>
	 */
	public List<Location> trendsAvailableGet(SwaggerHttpClient _client,
			TrendsAvailableGetRequest _request) throws IOException {

		// create path and map variables
		String localVarPath = "/trends/available".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		return (List<Location>) SwaggerUtil.fetch(_client, "array",
				Location.class, Location[].class);
	}

	/**
	 * 
	 * Returns the location that Twitter has trending topic information for
	 */
	public static class TrendsClosestGetRequest {
		/**
		 * If provided with a long parameter the available trend locations wil
		 * be stored by distance
		 */
		@NonNull
		public String lat;

		/**
		 * If provided with a lat parameters the available trend locations will
		 * be sorted by distance
		 */
		@NonNull
		public String _long;

	}

	/**
	 * 
	 * Returns the location that Twitter has trending topic information for
	 * 
	 * @return List<Location>
	 */
	public List<Location> trendsClosestGet(SwaggerHttpClient _client,
			TrendsClosestGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.lat).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'lat' when calling trendsClosestGet");
		}
		if (!new ParameterValidator(_request._long).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter '_long' when calling trendsClosestGet");
		}

		// create path and map variables
		String localVarPath = "/trends/closest".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("lat", parameterToString(_request.lat));
		_client.addQueryParam("long", parameterToString(_request._long));

		return (List<Location>) SwaggerUtil.fetch(_client, "array",
				Location.class, Location[].class);
	}

	/**
	 * 
	 * Returns the top 10 trending topics for a specific WOEID
	 */
	public static class TrendsPlaceGetRequest {
		/**
		 * The yahoo where on earch id
		 */
		@NonNull
		public String id;

		/**
		 * Setting this equal to hashtages will remove all hashtages from the
		 * trends list
		 */
		@NonNull
		public String exclude;

	}

	/**
	 * 
	 * Returns the top 10 trending topics for a specific WOEID
	 * 
	 * @return TrendInfo
	 */
	public TrendInfo trendsPlaceGet(SwaggerHttpClient _client,
			TrendsPlaceGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.id).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'id' when calling trendsPlaceGet");
		}
		if (!new ParameterValidator(_request.exclude).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'exclude' when calling trendsPlaceGet");
		}

		// create path and map variables
		String localVarPath = "/trends/place"
				.replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("id", parameterToString(_request.id));
		_client.addQueryParam("exclude", parameterToString(_request.exclude));

		return (TrendInfo) SwaggerUtil.fetch(_client, "", TrendInfo.class,
				TrendInfo[].class);
	}

	/**
	 * collection of users specified user can contribute to collection of users
	 * specified user can contribute to
	 */
	public static class UsersContributeesGetRequest {
		/**
		 * screen name of user that is contributed to
		 */
		@NonNull
		public String screenName;

		/**
		 * ID of user to that is contributed to
		 */
		@NonNull
		public String userId;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

		/**
		 * whether or not to skip statuses
		 */
		@Nullable
		public String skipStatus;

	}

	/**
	 * collection of users specified user can contribute to collection of users
	 * specified user can contribute to
	 * 
	 * @return List<Users>
	 */
	public List<Users> usersContributeesGet(SwaggerHttpClient _client,
			UsersContributeesGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.screenName).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling usersContributeesGet");
		}
		if (!new ParameterValidator(_request.userId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling usersContributeesGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling usersContributeesGet");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling usersContributeesGet");
		}

		// create path and map variables
		String localVarPath = "/users/contributees".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));

		return (List<Users>) SwaggerUtil.fetch(_client, "array", Users.class,
				Users[].class);
	}

	/**
	 * collection of users that can contribute to specified account collection
	 * of users that can contribute to specified account
	 */
	public static class UsersContributorsGetRequest {
		/**
		 * screen name of user contributing
		 */
		@NonNull
		public String screenName;

		/**
		 * ID of user contributing
		 */
		@NonNull
		public String userId;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

		/**
		 * whether or not to skip statuses
		 */
		@Nullable
		public String skipStatus;

	}

	/**
	 * collection of users that can contribute to specified account collection
	 * of users that can contribute to specified account
	 * 
	 * @return List<Users>
	 */
	public List<Users> usersContributorsGet(SwaggerHttpClient _client,
			UsersContributorsGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.screenName).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling usersContributorsGet");
		}
		if (!new ParameterValidator(_request.userId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling usersContributorsGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling usersContributorsGet");
		}
		if (!new ParameterValidator(_request.skipStatus)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'skipStatus' when calling usersContributorsGet");
		}

		// create path and map variables
		String localVarPath = "/users/contributors".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));
		_client.addQueryParam("skip_status",
				parameterToString(_request.skipStatus));

		return (List<Users>) SwaggerUtil.fetch(_client, "array", Users.class,
				Users[].class);
	}

	/**
	 * returns fully-hydrated user objects up to 100 returns fully-hydrated user
	 * objects up to 100
	 */
	public static class UsersLookupGetRequest {
		/**
		 * screen name of user to lookup
		 */
		@Nullable
		public String screenName;

		/**
		 * ID of user to lookup
		 */
		@Nullable
		public String userId;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

	}

	/**
	 * returns fully-hydrated user objects up to 100 returns fully-hydrated user
	 * objects up to 100
	 * 
	 * @return List<Users>
	 */
	public List<Users> usersLookupGet(SwaggerHttpClient _client,
			UsersLookupGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling usersLookupGet");
		}
		if (!new ParameterValidator(_request.userId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling usersLookupGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling usersLookupGet");
		}

		// create path and map variables
		String localVarPath = "/users/lookup"
				.replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));

		return (List<Users>) SwaggerUtil.fetch(_client, "array", Users.class,
				Users[].class);
	}

	/**
	 * 
	 * Returna users report spam
	 */
	public static class UsersReportSpamPostRequest {
		/**
		 * The ID or screen_name of the user you want to report as a spammer
		 */
		@Nullable
		public String screenName;

		/**
		 * The ID of the user you want to report as a spammer
		 */
		@Nullable
		public String userId;

	}

	/**
	 * 
	 * Returna users report spam
	 * 
	 * @return Users
	 */
	public Users usersReportSpamPost(SwaggerHttpClient _client,
			UsersReportSpamPostRequest _request) throws IOException {
		if (!new ParameterValidator(_request.screenName)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling usersReportSpamPost");
		}
		if (!new ParameterValidator(_request.userId)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling usersReportSpamPost");
		}

		// create path and map variables
		String localVarPath = "/users/report_spam".replaceAll("\\{format\\}",
				"json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("POST");

		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));

		return (Users) SwaggerUtil.fetch(_client, "", Users.class,
				Users[].class);
	}

	/**
	 * simple relevance-based user search simple relevance-based user search
	 */
	public static class UsersSearchGetRequest {
		/**
		 * the search query to run against people search
		 */
		@NonNull
		public String q;

		/**
		 * specifies the page of results to receive
		 */
		@Nullable
		public String page;

		/**
		 * number of people to return per page
		 */
		@Nullable
		public String count;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

	}

	/**
	 * simple relevance-based user search simple relevance-based user search
	 * 
	 * @return List<Users>
	 */
	public List<Users> usersSearchGet(SwaggerHttpClient _client,
			UsersSearchGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.q).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'q' when calling usersSearchGet");
		}
		if (!new ParameterValidator(_request.page)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'page' when calling usersSearchGet");
		}
		if (!new ParameterValidator(_request.count)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'count' when calling usersSearchGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling usersSearchGet");
		}

		// create path and map variables
		String localVarPath = "/users/search"
				.replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("q", parameterToString(_request.q));
		_client.addQueryParam("page", parameterToString(_request.page));
		_client.addQueryParam("count", parameterToString(_request.count));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));

		return (List<Users>) SwaggerUtil.fetch(_client, "array", Users.class,
				Users[].class);
	}

	/**
	 * returns a variety of info about specified user returns a variety of info
	 * about specified user
	 */
	public static class UsersShowGetRequest {
		/**
		 * screen name of user to be shown
		 */
		@NonNull
		public String screenName;

		/**
		 * ID of user to be shown
		 */
		@NonNull
		public String userId;

		/**
		 * whether or not to include entities
		 */
		@Nullable
		public String includeEntities;

	}

	/**
	 * returns a variety of info about specified user returns a variety of info
	 * about specified user
	 * 
	 * @return Users
	 */
	public Users usersShowGet(SwaggerHttpClient _client,
			UsersShowGetRequest _request) throws IOException {
		if (!new ParameterValidator(_request.screenName).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'screenName' when calling usersShowGet");
		}
		if (!new ParameterValidator(_request.userId).required(true)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'userId' when calling usersShowGet");
		}
		if (!new ParameterValidator(_request.includeEntities)

		.valid()) {
			throw new ParameterValidateFailedException(
					"Missing the required parameter 'includeEntities' when calling usersShowGet");
		}

		// create path and map variables
		String localVarPath = "/users/show".replaceAll("\\{format\\}", "json");
		_client.setApiPath(SwaggerUtil.addPath(this.basePath, localVarPath));
		_client.setMethod("GET");

		_client.addQueryParam("screen_name",
				parameterToString(_request.screenName));
		_client.addQueryParam("user_id", parameterToString(_request.userId));
		_client.addQueryParam("include_entities",
				parameterToString(_request.includeEntities));

		return (Users) SwaggerUtil.fetch(_client, "", Users.class,
				Users[].class);
	}
}
