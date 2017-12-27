package java.gen.package_name;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class PlaceType implements Validatable {

	@SerializedName("name")
	public String name = null;

	@SerializedName("code")
	public Integer code = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PlaceType placeType = (PlaceType) o;
		return (this.name == null ? placeType.name == null : this.name
				.equals(placeType.name))
				&& (this.code == null ? placeType.code == null : this.code
						.equals(placeType.code));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
		result = 31 * result + (this.code == null ? 0 : this.code.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PlaceType {\n");

		sb.append("  name: ").append(name).append("\n");
		sb.append("  code: ").append(code).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(name)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(code)

		.valid()) {
			return false;
		}

		return true;
	}
}
