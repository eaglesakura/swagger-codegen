package java.gen.package_name;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class HelpTos implements Validatable {

	@SerializedName("Tos")
	public String tos = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HelpTos helpTos = (HelpTos) o;
		return (this.tos == null ? helpTos.tos == null : this.tos
				.equals(helpTos.tos));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (this.tos == null ? 0 : this.tos.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HelpTos {\n");

		sb.append("  tos: ").append(tos).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(tos)

		.valid()) {
			return false;
		}

		return true;
	}
}
