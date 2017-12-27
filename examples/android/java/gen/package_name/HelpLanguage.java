package java.gen.package_name;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class HelpLanguage implements Validatable {

	@SerializedName("code")
	public String code = null;

	@SerializedName("status")
	public String status = null;

	@SerializedName("name")
	public String name = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HelpLanguage helpLanguage = (HelpLanguage) o;
		return (this.code == null ? helpLanguage.code == null : this.code
				.equals(helpLanguage.code))
				&& (this.status == null
						? helpLanguage.status == null
						: this.status.equals(helpLanguage.status))
				&& (this.name == null ? helpLanguage.name == null : this.name
						.equals(helpLanguage.name));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (this.code == null ? 0 : this.code.hashCode());
		result = 31 * result
				+ (this.status == null ? 0 : this.status.hashCode());
		result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HelpLanguage {\n");

		sb.append("  code: ").append(code).append("\n");
		sb.append("  status: ").append(status).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(code)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(status)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(name)

		.valid()) {
			return false;
		}

		return true;
	}
}
