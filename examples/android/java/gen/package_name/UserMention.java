package java.gen.package_name;

import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class UserMention implements Validatable {

	@SerializedName("id")
	public Integer id = null;

	@SerializedName("id_str")
	public String idStr = null;

	@SerializedName("indices")
	public List<Integer> indices = null;

	@SerializedName("name")
	public String name = null;

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
		UserMention userMention = (UserMention) o;
		return (this.id == null ? userMention.id == null : this.id
				.equals(userMention.id))
				&& (this.idStr == null ? userMention.idStr == null : this.idStr
						.equals(userMention.idStr))
				&& (this.indices == null
						? userMention.indices == null
						: this.indices.equals(userMention.indices))
				&& (this.name == null ? userMention.name == null : this.name
						.equals(userMention.name))
				&& (this.screenName == null
						? userMention.screenName == null
						: this.screenName.equals(userMention.screenName));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
		result = 31 * result + (this.idStr == null ? 0 : this.idStr.hashCode());
		result = 31 * result
				+ (this.indices == null ? 0 : this.indices.hashCode());
		result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
		result = 31 * result
				+ (this.screenName == null ? 0 : this.screenName.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserMention {\n");

		sb.append("  id: ").append(id).append("\n");
		sb.append("  idStr: ").append(idStr).append("\n");
		sb.append("  indices: ").append(indices).append("\n");
		sb.append("  name: ").append(name).append("\n");
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
		if (!new ParameterValidator(indices)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(name)

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
