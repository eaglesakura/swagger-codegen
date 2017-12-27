package java.gen.package_name;

import java.gen.package_name.Users;
import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class CursorUsers implements Validatable {

	@SerializedName("previous_cursor")
	public Integer previousCursor = null;

	@SerializedName("users")
	public List<Users> users = null;

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
		CursorUsers cursorUsers = (CursorUsers) o;
		return (this.previousCursor == null
				? cursorUsers.previousCursor == null
				: this.previousCursor.equals(cursorUsers.previousCursor))
				&& (this.users == null ? cursorUsers.users == null : this.users
						.equals(cursorUsers.users))
				&& (this.previousCursorStr == null
						? cursorUsers.previousCursorStr == null
						: this.previousCursorStr
								.equals(cursorUsers.previousCursorStr))
				&& (this.nextCursor == null
						? cursorUsers.nextCursor == null
						: this.nextCursor.equals(cursorUsers.nextCursor))
				&& (this.nextCursorStr == null
						? cursorUsers.nextCursorStr == null
						: this.nextCursorStr.equals(cursorUsers.nextCursorStr));
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
		sb.append("class CursorUsers {\n");

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
