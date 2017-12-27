package java.gen.package_name;

import java.gen.package_name.Entities;
import java.gen.package_name.Tweets;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Users implements Validatable {

	@SerializedName("contributors_enabled")
	public Boolean contributorsEnabled = null;

	@SerializedName("created_at")
	public String createdAt = null;

	@SerializedName("default_profile")
	public Boolean defaultProfile = null;

	@SerializedName("default_profile_image")
	public Boolean defaultProfileImage = null;

	@SerializedName("description")
	public String description = null;

	@SerializedName("entities")
	public Entities entities = null;

	@SerializedName("favorites_count")
	public Integer favoritesCount = null;

	@SerializedName("follow_request_sent")
	public Boolean followRequestSent = null;

	@SerializedName("following")
	public Boolean following = null;

	@SerializedName("followers_count")
	public Integer followersCount = null;

	@SerializedName("friends_count")
	public Integer friendsCount = null;

	@SerializedName("geo_enabled")
	public Boolean geoEnabled = null;

	@SerializedName("id")
	public Integer id = null;

	@SerializedName("id_str")
	public String idStr = null;

	@SerializedName("is_translator")
	public Boolean isTranslator = null;

	@SerializedName("lang")
	public String lang = null;

	@SerializedName("listed_count")
	public Integer listedCount = null;

	@SerializedName("location")
	public String location = null;

	@SerializedName("name")
	public String name = null;

	@SerializedName("notifications")
	public Boolean notifications = null;

	@SerializedName("profile_background_color")
	public String profileBackgroundColor = null;

	@SerializedName("profile_background_image_url")
	public String profileBackgroundImageUrl = null;

	@SerializedName("profile_background_image_url_https")
	public String profileBackgroundImageUrlHttps = null;

	@SerializedName("profile_background_tile")
	public String profileBackgroundTile = null;

	@SerializedName("profile_banner_url")
	public String profileBannerUrl = null;

	@SerializedName("profile_image_url")
	public String profileImageUrl = null;

	@SerializedName("profile_image_url_https")
	public String profileImageUrlHttps = null;

	@SerializedName("profile_link_color")
	public String profileLinkColor = null;

	@SerializedName("profile_sidebar_border_color")
	public String profileSidebarBorderColor = null;

	@SerializedName("profile_sidebar_fill_color")
	public String profileSidebarFillColor = null;

	@SerializedName("profile_text_color")
	public String profileTextColor = null;

	@SerializedName("profile_use_background_image")
	public Boolean profileUseBackgroundImage = null;

	@SerializedName("protected")
	public Boolean _protected = null;

	@SerializedName("screen_name")
	public String screenName = null;

	@SerializedName("show_all_inline_media")
	public Boolean showAllInlineMedia = null;

	@SerializedName("status")
	public Tweets status = null;

	@SerializedName("statuses_count")
	public Integer statusesCount = null;

	@SerializedName("time_zone")
	public String timeZone = null;

	@SerializedName("url")
	public String url = null;

	@SerializedName("utc_offset")
	public Integer utcOffset = null;

	@SerializedName("verified")
	public Boolean verified = null;

	@SerializedName("withheld_in_countries")
	public String withheldInCountries = null;

	@SerializedName("withheld_scope")
	public String withheldScope = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Users users = (Users) o;
		return (this.contributorsEnabled == null
				? users.contributorsEnabled == null
				: this.contributorsEnabled.equals(users.contributorsEnabled))
				&& (this.createdAt == null
						? users.createdAt == null
						: this.createdAt.equals(users.createdAt))
				&& (this.defaultProfile == null
						? users.defaultProfile == null
						: this.defaultProfile.equals(users.defaultProfile))
				&& (this.defaultProfileImage == null
						? users.defaultProfileImage == null
						: this.defaultProfileImage
								.equals(users.defaultProfileImage))
				&& (this.description == null
						? users.description == null
						: this.description.equals(users.description))
				&& (this.entities == null
						? users.entities == null
						: this.entities.equals(users.entities))
				&& (this.favoritesCount == null
						? users.favoritesCount == null
						: this.favoritesCount.equals(users.favoritesCount))
				&& (this.followRequestSent == null
						? users.followRequestSent == null
						: this.followRequestSent
								.equals(users.followRequestSent))
				&& (this.following == null
						? users.following == null
						: this.following.equals(users.following))
				&& (this.followersCount == null
						? users.followersCount == null
						: this.followersCount.equals(users.followersCount))
				&& (this.friendsCount == null
						? users.friendsCount == null
						: this.friendsCount.equals(users.friendsCount))
				&& (this.geoEnabled == null
						? users.geoEnabled == null
						: this.geoEnabled.equals(users.geoEnabled))
				&& (this.id == null ? users.id == null : this.id
						.equals(users.id))
				&& (this.idStr == null ? users.idStr == null : this.idStr
						.equals(users.idStr))
				&& (this.isTranslator == null
						? users.isTranslator == null
						: this.isTranslator.equals(users.isTranslator))
				&& (this.lang == null ? users.lang == null : this.lang
						.equals(users.lang))
				&& (this.listedCount == null
						? users.listedCount == null
						: this.listedCount.equals(users.listedCount))
				&& (this.location == null
						? users.location == null
						: this.location.equals(users.location))
				&& (this.name == null ? users.name == null : this.name
						.equals(users.name))
				&& (this.notifications == null
						? users.notifications == null
						: this.notifications.equals(users.notifications))
				&& (this.profileBackgroundColor == null
						? users.profileBackgroundColor == null
						: this.profileBackgroundColor
								.equals(users.profileBackgroundColor))
				&& (this.profileBackgroundImageUrl == null
						? users.profileBackgroundImageUrl == null
						: this.profileBackgroundImageUrl
								.equals(users.profileBackgroundImageUrl))
				&& (this.profileBackgroundImageUrlHttps == null
						? users.profileBackgroundImageUrlHttps == null
						: this.profileBackgroundImageUrlHttps
								.equals(users.profileBackgroundImageUrlHttps))
				&& (this.profileBackgroundTile == null
						? users.profileBackgroundTile == null
						: this.profileBackgroundTile
								.equals(users.profileBackgroundTile))
				&& (this.profileBannerUrl == null
						? users.profileBannerUrl == null
						: this.profileBannerUrl.equals(users.profileBannerUrl))
				&& (this.profileImageUrl == null
						? users.profileImageUrl == null
						: this.profileImageUrl.equals(users.profileImageUrl))
				&& (this.profileImageUrlHttps == null
						? users.profileImageUrlHttps == null
						: this.profileImageUrlHttps
								.equals(users.profileImageUrlHttps))
				&& (this.profileLinkColor == null
						? users.profileLinkColor == null
						: this.profileLinkColor.equals(users.profileLinkColor))
				&& (this.profileSidebarBorderColor == null
						? users.profileSidebarBorderColor == null
						: this.profileSidebarBorderColor
								.equals(users.profileSidebarBorderColor))
				&& (this.profileSidebarFillColor == null
						? users.profileSidebarFillColor == null
						: this.profileSidebarFillColor
								.equals(users.profileSidebarFillColor))
				&& (this.profileTextColor == null
						? users.profileTextColor == null
						: this.profileTextColor.equals(users.profileTextColor))
				&& (this.profileUseBackgroundImage == null
						? users.profileUseBackgroundImage == null
						: this.profileUseBackgroundImage
								.equals(users.profileUseBackgroundImage))
				&& (this._protected == null
						? users._protected == null
						: this._protected.equals(users._protected))
				&& (this.screenName == null
						? users.screenName == null
						: this.screenName.equals(users.screenName))
				&& (this.showAllInlineMedia == null
						? users.showAllInlineMedia == null
						: this.showAllInlineMedia
								.equals(users.showAllInlineMedia))
				&& (this.status == null ? users.status == null : this.status
						.equals(users.status))
				&& (this.statusesCount == null
						? users.statusesCount == null
						: this.statusesCount.equals(users.statusesCount))
				&& (this.timeZone == null
						? users.timeZone == null
						: this.timeZone.equals(users.timeZone))
				&& (this.url == null ? users.url == null : this.url
						.equals(users.url))
				&& (this.utcOffset == null
						? users.utcOffset == null
						: this.utcOffset.equals(users.utcOffset))
				&& (this.verified == null
						? users.verified == null
						: this.verified.equals(users.verified))
				&& (this.withheldInCountries == null
						? users.withheldInCountries == null
						: this.withheldInCountries
								.equals(users.withheldInCountries))
				&& (this.withheldScope == null
						? users.withheldScope == null
						: this.withheldScope.equals(users.withheldScope));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31
				* result
				+ (this.contributorsEnabled == null
						? 0
						: this.contributorsEnabled.hashCode());
		result = 31 * result
				+ (this.createdAt == null ? 0 : this.createdAt.hashCode());
		result = 31
				* result
				+ (this.defaultProfile == null ? 0 : this.defaultProfile
						.hashCode());
		result = 31
				* result
				+ (this.defaultProfileImage == null
						? 0
						: this.defaultProfileImage.hashCode());
		result = 31 * result
				+ (this.description == null ? 0 : this.description.hashCode());
		result = 31 * result
				+ (this.entities == null ? 0 : this.entities.hashCode());
		result = 31
				* result
				+ (this.favoritesCount == null ? 0 : this.favoritesCount
						.hashCode());
		result = 31
				* result
				+ (this.followRequestSent == null ? 0 : this.followRequestSent
						.hashCode());
		result = 31 * result
				+ (this.following == null ? 0 : this.following.hashCode());
		result = 31
				* result
				+ (this.followersCount == null ? 0 : this.followersCount
						.hashCode());
		result = 31
				* result
				+ (this.friendsCount == null ? 0 : this.friendsCount.hashCode());
		result = 31 * result
				+ (this.geoEnabled == null ? 0 : this.geoEnabled.hashCode());
		result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
		result = 31 * result + (this.idStr == null ? 0 : this.idStr.hashCode());
		result = 31
				* result
				+ (this.isTranslator == null ? 0 : this.isTranslator.hashCode());
		result = 31 * result + (this.lang == null ? 0 : this.lang.hashCode());
		result = 31 * result
				+ (this.listedCount == null ? 0 : this.listedCount.hashCode());
		result = 31 * result
				+ (this.location == null ? 0 : this.location.hashCode());
		result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
		result = 31
				* result
				+ (this.notifications == null ? 0 : this.notifications
						.hashCode());
		result = 31
				* result
				+ (this.profileBackgroundColor == null
						? 0
						: this.profileBackgroundColor.hashCode());
		result = 31
				* result
				+ (this.profileBackgroundImageUrl == null
						? 0
						: this.profileBackgroundImageUrl.hashCode());
		result = 31
				* result
				+ (this.profileBackgroundImageUrlHttps == null
						? 0
						: this.profileBackgroundImageUrlHttps.hashCode());
		result = 31
				* result
				+ (this.profileBackgroundTile == null
						? 0
						: this.profileBackgroundTile.hashCode());
		result = 31
				* result
				+ (this.profileBannerUrl == null ? 0 : this.profileBannerUrl
						.hashCode());
		result = 31
				* result
				+ (this.profileImageUrl == null ? 0 : this.profileImageUrl
						.hashCode());
		result = 31
				* result
				+ (this.profileImageUrlHttps == null
						? 0
						: this.profileImageUrlHttps.hashCode());
		result = 31
				* result
				+ (this.profileLinkColor == null ? 0 : this.profileLinkColor
						.hashCode());
		result = 31
				* result
				+ (this.profileSidebarBorderColor == null
						? 0
						: this.profileSidebarBorderColor.hashCode());
		result = 31
				* result
				+ (this.profileSidebarFillColor == null
						? 0
						: this.profileSidebarFillColor.hashCode());
		result = 31
				* result
				+ (this.profileTextColor == null ? 0 : this.profileTextColor
						.hashCode());
		result = 31
				* result
				+ (this.profileUseBackgroundImage == null
						? 0
						: this.profileUseBackgroundImage.hashCode());
		result = 31 * result
				+ (this._protected == null ? 0 : this._protected.hashCode());
		result = 31 * result
				+ (this.screenName == null ? 0 : this.screenName.hashCode());
		result = 31
				* result
				+ (this.showAllInlineMedia == null
						? 0
						: this.showAllInlineMedia.hashCode());
		result = 31 * result
				+ (this.status == null ? 0 : this.status.hashCode());
		result = 31
				* result
				+ (this.statusesCount == null ? 0 : this.statusesCount
						.hashCode());
		result = 31 * result
				+ (this.timeZone == null ? 0 : this.timeZone.hashCode());
		result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
		result = 31 * result
				+ (this.utcOffset == null ? 0 : this.utcOffset.hashCode());
		result = 31 * result
				+ (this.verified == null ? 0 : this.verified.hashCode());
		result = 31
				* result
				+ (this.withheldInCountries == null
						? 0
						: this.withheldInCountries.hashCode());
		result = 31
				* result
				+ (this.withheldScope == null ? 0 : this.withheldScope
						.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Users {\n");

		sb.append("  contributorsEnabled: ").append(contributorsEnabled)
				.append("\n");
		sb.append("  createdAt: ").append(createdAt).append("\n");
		sb.append("  defaultProfile: ").append(defaultProfile).append("\n");
		sb.append("  defaultProfileImage: ").append(defaultProfileImage)
				.append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  entities: ").append(entities).append("\n");
		sb.append("  favoritesCount: ").append(favoritesCount).append("\n");
		sb.append("  followRequestSent: ").append(followRequestSent)
				.append("\n");
		sb.append("  following: ").append(following).append("\n");
		sb.append("  followersCount: ").append(followersCount).append("\n");
		sb.append("  friendsCount: ").append(friendsCount).append("\n");
		sb.append("  geoEnabled: ").append(geoEnabled).append("\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  idStr: ").append(idStr).append("\n");
		sb.append("  isTranslator: ").append(isTranslator).append("\n");
		sb.append("  lang: ").append(lang).append("\n");
		sb.append("  listedCount: ").append(listedCount).append("\n");
		sb.append("  location: ").append(location).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  notifications: ").append(notifications).append("\n");
		sb.append("  profileBackgroundColor: ").append(profileBackgroundColor)
				.append("\n");
		sb.append("  profileBackgroundImageUrl: ")
				.append(profileBackgroundImageUrl).append("\n");
		sb.append("  profileBackgroundImageUrlHttps: ")
				.append(profileBackgroundImageUrlHttps).append("\n");
		sb.append("  profileBackgroundTile: ").append(profileBackgroundTile)
				.append("\n");
		sb.append("  profileBannerUrl: ").append(profileBannerUrl).append("\n");
		sb.append("  profileImageUrl: ").append(profileImageUrl).append("\n");
		sb.append("  profileImageUrlHttps: ").append(profileImageUrlHttps)
				.append("\n");
		sb.append("  profileLinkColor: ").append(profileLinkColor).append("\n");
		sb.append("  profileSidebarBorderColor: ")
				.append(profileSidebarBorderColor).append("\n");
		sb.append("  profileSidebarFillColor: ")
				.append(profileSidebarFillColor).append("\n");
		sb.append("  profileTextColor: ").append(profileTextColor).append("\n");
		sb.append("  profileUseBackgroundImage: ")
				.append(profileUseBackgroundImage).append("\n");
		sb.append("  _protected: ").append(_protected).append("\n");
		sb.append("  screenName: ").append(screenName).append("\n");
		sb.append("  showAllInlineMedia: ").append(showAllInlineMedia)
				.append("\n");
		sb.append("  status: ").append(status).append("\n");
		sb.append("  statusesCount: ").append(statusesCount).append("\n");
		sb.append("  timeZone: ").append(timeZone).append("\n");
		sb.append("  url: ").append(url).append("\n");
		sb.append("  utcOffset: ").append(utcOffset).append("\n");
		sb.append("  verified: ").append(verified).append("\n");
		sb.append("  withheldInCountries: ").append(withheldInCountries)
				.append("\n");
		sb.append("  withheldScope: ").append(withheldScope).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(contributorsEnabled)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(createdAt)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(defaultProfile)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(defaultProfileImage)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(description)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(entities)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(favoritesCount)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(followRequestSent)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(following)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(followersCount)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(friendsCount)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(geoEnabled)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(id)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(idStr)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(isTranslator)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(lang)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(listedCount)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(location)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(name)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(notifications)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(profileBackgroundColor)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(profileBackgroundImageUrl)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(profileBackgroundImageUrlHttps)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(profileBackgroundTile)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(profileBannerUrl)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(profileImageUrl)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(profileImageUrlHttps)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(profileLinkColor)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(profileSidebarBorderColor)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(profileSidebarFillColor)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(profileTextColor)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(profileUseBackgroundImage)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(_protected)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(screenName)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(showAllInlineMedia)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(status)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(statusesCount)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(timeZone)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(url)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(utcOffset)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(verified)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(withheldInCountries)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(withheldScope)

		.valid()) {
			return false;
		}

		return true;
	}
}
