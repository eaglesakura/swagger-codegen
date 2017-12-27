package java.gen.package_name;

import java.gen.package_name.Target;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Targets implements Validatable {

	@SerializedName("target")
	public Target target = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Targets targets = (Targets) o;
		return (this.target == null ? targets.target == null : this.target
				.equals(targets.target));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.target == null ? 0 : this.target.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Targets {\n");

		sb.append("  target: ").append(target).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(target)

		.valid()) {
			return false;
		}

		return true;
	}
}
