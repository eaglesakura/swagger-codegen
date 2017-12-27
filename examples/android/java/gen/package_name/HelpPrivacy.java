package java.gen.package_name;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class HelpPrivacy implements Validatable {

	@SerializedName("privacy")
	public String privacy = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HelpPrivacy helpPrivacy = (HelpPrivacy) o;
		return (this.privacy == null
				? helpPrivacy.privacy == null
				: this.privacy.equals(helpPrivacy.privacy));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.privacy == null ? 0 : this.privacy.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HelpPrivacy {\n");

		sb.append("  privacy: ").append(privacy).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(privacy)

		.valid()) {
			return false;
		}

		return true;
	}
}
