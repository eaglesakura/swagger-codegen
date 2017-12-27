package java.gen.package_name;

import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Hashtags implements Validatable {

	@SerializedName("indices")
	public List<Integer> indices = null;

	@SerializedName("text")
	public String text = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Hashtags hashtags = (Hashtags) o;
		return (this.indices == null ? hashtags.indices == null : this.indices
				.equals(hashtags.indices))
				&& (this.text == null ? hashtags.text == null : this.text
						.equals(hashtags.text));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.indices == null ? 0 : this.indices.hashCode());
		result = 31 * result + (this.text == null ? 0 : this.text.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Hashtags {\n");

		sb.append("  indices: ").append(indices).append("\n");
		sb.append("  text: ").append(text).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(indices)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(text)

		.valid()) {
			return false;
		}

		return true;
	}
}
