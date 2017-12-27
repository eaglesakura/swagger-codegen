package java.gen.package_name;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Query implements Validatable {

	@SerializedName("created_at")
	public String createdAt = null;

	@SerializedName("id")
	public Integer id = null;

	@SerializedName("id_str")
	public String idStr = null;

	@SerializedName("name")
	public String name = null;

	@SerializedName("position")
	public String position = null;

	@SerializedName("query")
	public String query = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Query query = (Query) o;
		return (this.createdAt == null
				? query.createdAt == null
				: this.createdAt.equals(query.createdAt))
				&& (this.id == null ? query.id == null : this.id
						.equals(query.id))
				&& (this.idStr == null ? query.idStr == null : this.idStr
						.equals(query.idStr))
				&& (this.name == null ? query.name == null : this.name
						.equals(query.name))
				&& (this.position == null
						? query.position == null
						: this.position.equals(query.position))
				&& (this.query == null ? query.query == null : this.query
						.equals(query.query));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.createdAt == null ? 0 : this.createdAt.hashCode());
		result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
		result = 31 * result + (this.idStr == null ? 0 : this.idStr.hashCode());
		result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
		result = 31 * result
				+ (this.position == null ? 0 : this.position.hashCode());
		result = 31 * result + (this.query == null ? 0 : this.query.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Query {\n");

		sb.append("  createdAt: ").append(createdAt).append("\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  idStr: ").append(idStr).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  position: ").append(position).append("\n");
		sb.append("  query: ").append(query).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(createdAt)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(id)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(idStr)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(name)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(position)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(query)

		.valid()) {
			return false;
		}

		return true;
	}
}
