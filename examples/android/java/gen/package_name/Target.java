package java.gen.package_name;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Target implements Validatable {

	@SerializedName("id_str")
	public String idStr = null;

	@SerializedName("id")
	public Integer id = null;

	@SerializedName("followed_by")
	public Boolean followedBy = null;

	@SerializedName("screen_name")
	public String screenName = null;

	@SerializedName("following")
	public Boolean following = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Target target = (Target) o;
		return (this.idStr == null ? target.idStr == null : this.idStr
				.equals(target.idStr))
				&& (this.id == null ? target.id == null : this.id
						.equals(target.id))
				&& (this.followedBy == null
						? target.followedBy == null
						: this.followedBy.equals(target.followedBy))
				&& (this.screenName == null
						? target.screenName == null
						: this.screenName.equals(target.screenName))
				&& (this.following == null
						? target.following == null
						: this.following.equals(target.following));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (this.idStr == null ? 0 : this.idStr.hashCode());
		result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
		result = 31 * result
				+ (this.followedBy == null ? 0 : this.followedBy.hashCode());
		result = 31 * result
				+ (this.screenName == null ? 0 : this.screenName.hashCode());
		result = 31 * result
				+ (this.following == null ? 0 : this.following.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Target {\n");

		sb.append("  idStr: ").append(idStr).append("\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  followedBy: ").append(followedBy).append("\n");
		sb.append("  screenName: ").append(screenName).append("\n");
		sb.append("  following: ").append(following).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(idStr)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(id)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(followedBy)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(screenName)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(following)

		.valid()) {
			return false;
		}

		return true;
	}
}
