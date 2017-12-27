package java.gen.package_name;

import java.math.BigDecimal;
import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class BoundingBox implements Validatable {

	@SerializedName("coordinates")
	public List<List<BigDecimal>> coordinates = null;

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
		BoundingBox boundingBox = (BoundingBox) o;
		return (this.coordinates == null
				? boundingBox.coordinates == null
				: this.coordinates.equals(boundingBox.coordinates))
				&& (this.type == null ? boundingBox.type == null : this.type
						.equals(boundingBox.type));
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
		sb.append("class BoundingBox {\n");

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
