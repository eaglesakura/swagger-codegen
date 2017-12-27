package java.gen.package_name;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Size implements Validatable {

	@SerializedName("h")
	public Integer h = null;

	@SerializedName("resize")
	public String resize = null;

	@SerializedName("w")
	public Integer w = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Size size = (Size) o;
		return (this.h == null ? size.h == null : this.h.equals(size.h))
				&& (this.resize == null ? size.resize == null : this.resize
						.equals(size.resize))
				&& (this.w == null ? size.w == null : this.w.equals(size.w));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (this.h == null ? 0 : this.h.hashCode());
		result = 31 * result
				+ (this.resize == null ? 0 : this.resize.hashCode());
		result = 31 * result + (this.w == null ? 0 : this.w.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Size {\n");

		sb.append("  h: ").append(h).append("\n");
		sb.append("  resize: ").append(resize).append("\n");
		sb.append("  w: ").append(w).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(h)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(resize)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(w)

		.valid()) {
			return false;
		}

		return true;
	}
}
