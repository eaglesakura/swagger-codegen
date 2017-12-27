package java.gen.package_name;

import java.gen.package_name.Size;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Sizes implements Validatable {

	@SerializedName("thumb")
	public Size thumb = null;

	@SerializedName("large")
	public Size large = null;

	@SerializedName("medium")
	public Size medium = null;

	@SerializedName("small")
	public Size small = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Sizes sizes = (Sizes) o;
		return (this.thumb == null ? sizes.thumb == null : this.thumb
				.equals(sizes.thumb))
				&& (this.large == null ? sizes.large == null : this.large
						.equals(sizes.large))
				&& (this.medium == null ? sizes.medium == null : this.medium
						.equals(sizes.medium))
				&& (this.small == null ? sizes.small == null : this.small
						.equals(sizes.small));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (this.thumb == null ? 0 : this.thumb.hashCode());
		result = 31 * result + (this.large == null ? 0 : this.large.hashCode());
		result = 31 * result
				+ (this.medium == null ? 0 : this.medium.hashCode());
		result = 31 * result + (this.small == null ? 0 : this.small.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Sizes {\n");

		sb.append("  thumb: ").append(thumb).append("\n");
		sb.append("  large: ").append(large).append("\n");
		sb.append("  medium: ").append(medium).append("\n");
		sb.append("  small: ").append(small).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(thumb)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(large)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(medium)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(small)

		.valid()) {
			return false;
		}

		return true;
	}
}
