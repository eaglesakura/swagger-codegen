package java.gen.package_name;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Contributors implements Validatable {

	@SerializedName("id")
	public Integer id = null;

	@SerializedName("id_str")
	public String idStr = null;

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
		Contributors contributors = (Contributors) o;
		return (this.id == null ? contributors.id == null : this.id
				.equals(contributors.id))
				&& (this.idStr == null
						? contributors.idStr == null
						: this.idStr.equals(contributors.idStr))
				&& (this.screenName == null
						? contributors.screenName == null
						: this.screenName.equals(contributors.screenName));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
		result = 31 * result + (this.idStr == null ? 0 : this.idStr.hashCode());
		result = 31 * result
				+ (this.screenName == null ? 0 : this.screenName.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Contributors {\n");

		sb.append("  id: ").append(id).append("\n");
		sb.append("  idStr: ").append(idStr).append("\n");
		sb.append("  screenName: ").append(screenName).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(id)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(idStr)

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
