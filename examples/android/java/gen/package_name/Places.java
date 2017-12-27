package java.gen.package_name;

import java.gen.package_name.BoundingBox;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Places implements Validatable {

	@SerializedName("attributes")
	public Object attributes = null;

	@SerializedName("bounding_box")
	public BoundingBox boundingBox = null;

	@SerializedName("country")
	public String country = null;

	@SerializedName("country_code")
	public String countryCode = null;

	@SerializedName("full_name")
	public String fullName = null;

	@SerializedName("id")
	public String id = null;

	@SerializedName("name")
	public String name = null;

	@SerializedName("place_type")
	public String placeType = null;

	@SerializedName("url")
	public String url = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Places places = (Places) o;
		return (this.attributes == null
				? places.attributes == null
				: this.attributes.equals(places.attributes))
				&& (this.boundingBox == null
						? places.boundingBox == null
						: this.boundingBox.equals(places.boundingBox))
				&& (this.country == null
						? places.country == null
						: this.country.equals(places.country))
				&& (this.countryCode == null
						? places.countryCode == null
						: this.countryCode.equals(places.countryCode))
				&& (this.fullName == null
						? places.fullName == null
						: this.fullName.equals(places.fullName))
				&& (this.id == null ? places.id == null : this.id
						.equals(places.id))
				&& (this.name == null ? places.name == null : this.name
						.equals(places.name))
				&& (this.placeType == null
						? places.placeType == null
						: this.placeType.equals(places.placeType))
				&& (this.url == null ? places.url == null : this.url
						.equals(places.url));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.attributes == null ? 0 : this.attributes.hashCode());
		result = 31 * result
				+ (this.boundingBox == null ? 0 : this.boundingBox.hashCode());
		result = 31 * result
				+ (this.country == null ? 0 : this.country.hashCode());
		result = 31 * result
				+ (this.countryCode == null ? 0 : this.countryCode.hashCode());
		result = 31 * result
				+ (this.fullName == null ? 0 : this.fullName.hashCode());
		result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
		result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
		result = 31 * result
				+ (this.placeType == null ? 0 : this.placeType.hashCode());
		result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Places {\n");

		sb.append("  attributes: ").append(attributes).append("\n");
		sb.append("  boundingBox: ").append(boundingBox).append("\n");
		sb.append("  country: ").append(country).append("\n");
		sb.append("  countryCode: ").append(countryCode).append("\n");
		sb.append("  fullName: ").append(fullName).append("\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  placeType: ").append(placeType).append("\n");
		sb.append("  url: ").append(url).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(attributes)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(boundingBox)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(country)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(countryCode)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(fullName)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(id)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(name)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(placeType)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(url)

		.valid()) {
			return false;
		}

		return true;
	}
}
