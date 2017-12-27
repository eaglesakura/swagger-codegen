package java.gen.package_name;

import java.gen.package_name.Lists;
import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class CursorLists implements Validatable {

	@SerializedName("previous_cursor")
	public Integer previousCursor = null;

	@SerializedName("lists")
	public List<Lists> lists = null;

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
		CursorLists cursorLists = (CursorLists) o;
		return (this.previousCursor == null
				? cursorLists.previousCursor == null
				: this.previousCursor.equals(cursorLists.previousCursor))
				&& (this.lists == null ? cursorLists.lists == null : this.lists
						.equals(cursorLists.lists))
				&& (this.previousCursorStr == null
						? cursorLists.previousCursorStr == null
						: this.previousCursorStr
								.equals(cursorLists.previousCursorStr))
				&& (this.nextCursor == null
						? cursorLists.nextCursor == null
						: this.nextCursor.equals(cursorLists.nextCursor))
				&& (this.nextCursorStr == null
						? cursorLists.nextCursorStr == null
						: this.nextCursorStr.equals(cursorLists.nextCursorStr));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31
				* result
				+ (this.previousCursor == null ? 0 : this.previousCursor
						.hashCode());
		result = 31 * result + (this.lists == null ? 0 : this.lists.hashCode());
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
		sb.append("class CursorLists {\n");

		sb.append("  previousCursor: ").append(previousCursor).append("\n");
		sb.append("  lists: ").append(lists).append("\n");
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
		if (!new ParameterValidator(lists)

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
