package java.gen.package_name;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Trends implements Validatable {

	@SerializedName("events")
	public String events = null;

	@SerializedName("name")
	public String name = null;

	@SerializedName("promoted_content")
	public String promotedContent = null;

	@SerializedName("query")
	public String query = null;

	@SerializedName("url")
	public String url = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Trends trends = (Trends) o;
		return (this.events == null ? trends.events == null : this.events
				.equals(trends.events))
				&& (this.name == null ? trends.name == null : this.name
						.equals(trends.name))
				&& (this.promotedContent == null
						? trends.promotedContent == null
						: this.promotedContent.equals(trends.promotedContent))
				&& (this.query == null ? trends.query == null : this.query
						.equals(trends.query))
				&& (this.url == null ? trends.url == null : this.url
						.equals(trends.url));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.events == null ? 0 : this.events.hashCode());
		result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
		result = 31
				* result
				+ (this.promotedContent == null ? 0 : this.promotedContent
						.hashCode());
		result = 31 * result + (this.query == null ? 0 : this.query.hashCode());
		result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Trends {\n");

		sb.append("  events: ").append(events).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  promotedContent: ").append(promotedContent).append("\n");
		sb.append("  query: ").append(query).append("\n");
		sb.append("  url: ").append(url).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(events)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(name)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(promotedContent)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(query)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(url)

		.valid()) {
			return false;
		}

		return true;
	}
}
