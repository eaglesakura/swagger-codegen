package java.gen.package_name;

import java.math.BigDecimal;
import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Coordinates implements Validatable {

	@SerializedName("coordinates")
	public List<BigDecimal> coordinates = null;

	@SerializedName("type")
	public String type = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Coordinates coordinates = (Coordinates) o;
		return (this.coordinates == null
				? coordinates.coordinates == null
				: this.coordinates.equals(coordinates.coordinates))
				&& (this.type == null ? coordinates.type == null : this.type
						.equals(coordinates.type));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.coordinates == null ? 0 : this.coordinates.hashCode());
		result = 31 * result + (this.type == null ? 0 : this.type.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Coordinates {\n");

		sb.append("  coordinates: ").append(coordinates).append("\n");
		sb.append("  type: ").append(type).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(coordinates)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(type)

		.valid()) {
			return false;
		}

		return true;
	}
}
