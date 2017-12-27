package java.gen.package_name;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Sleep implements Validatable {

	@SerializedName("end_time")
	public String endTime = null;

	@SerializedName("enabled")
	public Boolean enabled = null;

	@SerializedName("start_time")
	public String startTime = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Sleep sleep = (Sleep) o;
		return (this.endTime == null ? sleep.endTime == null : this.endTime
				.equals(sleep.endTime))
				&& (this.enabled == null ? sleep.enabled == null : this.enabled
						.equals(sleep.enabled))
				&& (this.startTime == null
						? sleep.startTime == null
						: this.startTime.equals(sleep.startTime));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.endTime == null ? 0 : this.endTime.hashCode());
		result = 31 * result
				+ (this.enabled == null ? 0 : this.enabled.hashCode());
		result = 31 * result
				+ (this.startTime == null ? 0 : this.startTime.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Sleep {\n");

		sb.append("  endTime: ").append(endTime).append("\n");
		sb.append("  enabled: ").append(enabled).append("\n");
		sb.append("  startTime: ").append(startTime).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(endTime)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(enabled)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(startTime)

		.valid()) {
			return false;
		}

		return true;
	}
}
