package java.gen.package_name;

import java.gen.package_name.Source;
import java.gen.package_name.Targets;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Friendship implements Validatable {

	@SerializedName("relationship")
	public Targets relationship = null;

	@SerializedName("source")
	public Source source = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Friendship friendship = (Friendship) o;
		return (this.relationship == null
				? friendship.relationship == null
				: this.relationship.equals(friendship.relationship))
				&& (this.source == null
						? friendship.source == null
						: this.source.equals(friendship.source));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31
				* result
				+ (this.relationship == null ? 0 : this.relationship.hashCode());
		result = 31 * result
				+ (this.source == null ? 0 : this.source.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Friendship {\n");

		sb.append("  relationship: ").append(relationship).append("\n");
		sb.append("  source: ").append(source).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(relationship)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(source)

		.valid()) {
			return false;
		}

		return true;
	}
}
