package java.gen.package_name;

import java.gen.package_name.Location;
import java.gen.package_name.Sleep;
import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Settings implements Validatable {

	@SerializedName("sleep_time")
	public Sleep sleepTime = null;

	@SerializedName("use_cookie_personalization")
	public Boolean useCookiePersonalization = null;

	@SerializedName("trend_location")
	public List<Location> trendLocation = null;

	@SerializedName("language")
	public String language = null;

	@SerializedName("discoverable_by_email")
	public Boolean discoverableByEmail = null;

	@SerializedName("always_use_https")
	public Boolean alwaysUseHttps = null;

	@SerializedName("protected")
	public Boolean _protected = null;

	@SerializedName("geo_enabled")
	public Boolean geoEnabled = null;

	@SerializedName("show_all_inline_media")
	public Boolean showAllInlineMedia = null;

	@SerializedName("screen_name")
	public String screenName = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Settings settings = (Settings) o;
		return (this.sleepTime == null
				? settings.sleepTime == null
				: this.sleepTime.equals(settings.sleepTime))
				&& (this.useCookiePersonalization == null
						? settings.useCookiePersonalization == null
						: this.useCookiePersonalization
								.equals(settings.useCookiePersonalization))
				&& (this.trendLocation == null
						? settings.trendLocation == null
						: this.trendLocation.equals(settings.trendLocation))
				&& (this.language == null
						? settings.language == null
						: this.language.equals(settings.language))
				&& (this.discoverableByEmail == null
						? settings.discoverableByEmail == null
						: this.discoverableByEmail
								.equals(settings.discoverableByEmail))
				&& (this.alwaysUseHttps == null
						? settings.alwaysUseHttps == null
						: this.alwaysUseHttps.equals(settings.alwaysUseHttps))
				&& (this._protected == null
						? settings._protected == null
						: this._protected.equals(settings._protected))
				&& (this.geoEnabled == null
						? settings.geoEnabled == null
						: this.geoEnabled.equals(settings.geoEnabled))
				&& (this.showAllInlineMedia == null
						? settings.showAllInlineMedia == null
						: this.showAllInlineMedia
								.equals(settings.showAllInlineMedia))
				&& (this.screenName == null
						? settings.screenName == null
						: this.screenName.equals(settings.screenName));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.sleepTime == null ? 0 : this.sleepTime.hashCode());
		result = 31
				* result
				+ (this.useCookiePersonalization == null
						? 0
						: this.useCookiePersonalization.hashCode());
		result = 31
				* result
				+ (this.trendLocation == null ? 0 : this.trendLocation
						.hashCode());
		result = 31 * result
				+ (this.language == null ? 0 : this.language.hashCode());
		result = 31
				* result
				+ (this.discoverableByEmail == null
						? 0
						: this.discoverableByEmail.hashCode());
		result = 31
				* result
				+ (this.alwaysUseHttps == null ? 0 : this.alwaysUseHttps
						.hashCode());
		result = 31 * result
				+ (this._protected == null ? 0 : this._protected.hashCode());
		result = 31 * result
				+ (this.geoEnabled == null ? 0 : this.geoEnabled.hashCode());
		result = 31
				* result
				+ (this.showAllInlineMedia == null
						? 0
						: this.showAllInlineMedia.hashCode());
		result = 31 * result
				+ (this.screenName == null ? 0 : this.screenName.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Settings {\n");

		sb.append("  sleepTime: ").append(sleepTime).append("\n");
		sb.append("  useCookiePersonalization: ")
				.append(useCookiePersonalization).append("\n");
		sb.append("  trendLocation: ").append(trendLocation).append("\n");
		sb.append("  language: ").append(language).append("\n");
		sb.append("  discoverableByEmail: ").append(discoverableByEmail)
				.append("\n");
		sb.append("  alwaysUseHttps: ").append(alwaysUseHttps).append("\n");
		sb.append("  _protected: ").append(_protected).append("\n");
		sb.append("  geoEnabled: ").append(geoEnabled).append("\n");
		sb.append("  showAllInlineMedia: ").append(showAllInlineMedia)
				.append("\n");
		sb.append("  screenName: ").append(screenName).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(sleepTime)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(useCookiePersonalization)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(trendLocation)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(language)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(discoverableByEmail)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(alwaysUseHttps)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(_protected)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(geoEnabled)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(showAllInlineMedia)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(screenName)

		.valid()) {
			return false;
		}

		return true;
	}
}
