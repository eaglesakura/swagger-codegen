package java.gen.package_name;

import java.gen.package_name.Location;
import java.gen.package_name.Trends;
import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class TrendInfo implements Validatable {

	@SerializedName("as_of")
	public String asOf = null;

	@SerializedName("created_at")
	public String createdAt = null;

	@SerializedName("locations")
	public List<Location> locations = null;

	@SerializedName("trends")
	public List<Trends> trends = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TrendInfo trendInfo = (TrendInfo) o;
		return (this.asOf == null ? trendInfo.asOf == null : this.asOf
				.equals(trendInfo.asOf))
				&& (this.createdAt == null
						? trendInfo.createdAt == null
						: this.createdAt.equals(trendInfo.createdAt))
				&& (this.locations == null
						? trendInfo.locations == null
						: this.locations.equals(trendInfo.locations))
				&& (this.trends == null
						? trendInfo.trends == null
						: this.trends.equals(trendInfo.trends));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (this.asOf == null ? 0 : this.asOf.hashCode());
		result = 31 * result
				+ (this.createdAt == null ? 0 : this.createdAt.hashCode());
		result = 31 * result
				+ (this.locations == null ? 0 : this.locations.hashCode());
		result = 31 * result
				+ (this.trends == null ? 0 : this.trends.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TrendInfo {\n");

		sb.append("  asOf: ").append(asOf).append("\n");
		sb.append("  createdAt: ").append(createdAt).append("\n");
		sb.append("  locations: ").append(locations).append("\n");
		sb.append("  trends: ").append(trends).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(asOf)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(createdAt)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(locations)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(trends)

		.valid()) {
			return false;
		}

		return true;
	}
}
