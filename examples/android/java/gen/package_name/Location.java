package java.gen.package_name;

import java.gen.package_name.PlaceType;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Location implements Validatable {

	@SerializedName("name")
	public String name = null;

	@SerializedName("placeType")
	public PlaceType placeType = null;

	@SerializedName("woeid")
	public Integer woeid = null;

	@SerializedName("country")
	public String country = null;

	@SerializedName("url")
	public String url = null;

	@SerializedName("countryCode")
	public String countryCode = null;

	@SerializedName("parentid")
	public Integer parentid = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Location location = (Location) o;
		return (this.name == null ? location.name == null : this.name
				.equals(location.name))
				&& (this.placeType == null
						? location.placeType == null
						: this.placeType.equals(location.placeType))
				&& (this.woeid == null ? location.woeid == null : this.woeid
						.equals(location.woeid))
				&& (this.country == null
						? location.country == null
						: this.country.equals(location.country))
				&& (this.url == null ? location.url == null : this.url
						.equals(location.url))
				&& (this.countryCode == null
						? location.countryCode == null
						: this.countryCode.equals(location.countryCode))
				&& (this.parentid == null
						? location.parentid == null
						: this.parentid.equals(location.parentid));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
		result = 31 * result
				+ (this.placeType == null ? 0 : this.placeType.hashCode());
		result = 31 * result + (this.woeid == null ? 0 : this.woeid.hashCode());
		result = 31 * result
				+ (this.country == null ? 0 : this.country.hashCode());
		result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
		result = 31 * result
				+ (this.countryCode == null ? 0 : this.countryCode.hashCode());
		result = 31 * result
				+ (this.parentid == null ? 0 : this.parentid.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Location {\n");

		sb.append("  name: ").append(name).append("\n");
		sb.append("  placeType: ").append(placeType).append("\n");
		sb.append("  woeid: ").append(woeid).append("\n");
		sb.append("  country: ").append(country).append("\n");
		sb.append("  url: ").append(url).append("\n");
		sb.append("  countryCode: ").append(countryCode).append("\n");
		sb.append("  parentid: ").append(parentid).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(name)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(placeType)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(woeid)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(country)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(url)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(countryCode)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(parentid)

		.valid()) {
			return false;
		}

		return true;
	}
}
