package java.gen.package_name;

import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class CursorIds implements Validatable {

	@SerializedName("previous_cursor")
	public Integer previousCursor = null;

	@SerializedName("users")
	public List<Integer> users = null;

	@SerializedName("previous_cursor_str")
	public String previousCursorStr = null;

	@SerializedName("next_cursor")
	public Integer nextCursor = null;

	@SerializedName("next_cursor_str")
	public String nextCursorStr = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CursorIds cursorIds = (CursorIds) o;
		return (this.previousCursor == null
				? cursorIds.previousCursor == null
				: this.previousCursor.equals(cursorIds.previousCursor))
				&& (this.users == null ? cursorIds.users == null : this.users
						.equals(cursorIds.users))
				&& (this.previousCursorStr == null
						? cursorIds.previousCursorStr == null
						: this.previousCursorStr
								.equals(cursorIds.previousCursorStr))
				&& (this.nextCursor == null
						? cursorIds.nextCursor == null
						: this.nextCursor.equals(cursorIds.nextCursor))
				&& (this.nextCursorStr == null
						? cursorIds.nextCursorStr == null
						: this.nextCursorStr.equals(cursorIds.nextCursorStr));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31
				* result
				+ (this.previousCursor == null ? 0 : this.previousCursor
						.hashCode());
		result = 31 * result + (this.users == null ? 0 : this.users.hashCode());
		result = 31
				* result
				+ (this.previousCursorStr == null ? 0 : this.previousCursorStr
						.hashCode());
		result = 31 * result
				+ (this.nextCursor == null ? 0 : this.nextCursor.hashCode());
		result = 31
				* result
				+ (this.nextCursorStr == null ? 0 : this.nextCursorStr
						.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CursorIds {\n");

		sb.append("  previousCursor: ").append(previousCursor).append("\n");
		sb.append("  users: ").append(users).append("\n");
		sb.append("  previousCursorStr: ").append(previousCursorStr)
				.append("\n");
		sb.append("  nextCursor: ").append(nextCursor).append("\n");
		sb.append("  nextCursorStr: ").append(nextCursorStr).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(previousCursor)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(users)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(previousCursorStr)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(nextCursor)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(nextCursorStr)

		.valid()) {
			return false;
		}

		return true;
	}
}
