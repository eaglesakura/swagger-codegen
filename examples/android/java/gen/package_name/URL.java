package java.gen.package_name;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class URL implements Validatable {

	@SerializedName("display_url")
	public String displayUrl = null;

	@SerializedName("expanded_url")
	public String expandedUrl = null;

	@SerializedName("indices")
	public String indices = null;

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
		URL URL = (URL) o;
		return (this.displayUrl == null
				? URL.displayUrl == null
				: this.displayUrl.equals(URL.displayUrl))
				&& (this.expandedUrl == null
						? URL.expandedUrl == null
						: this.expandedUrl.equals(URL.expandedUrl))
				&& (this.indices == null ? URL.indices == null : this.indices
						.equals(URL.indices))
				&& (this.url == null ? URL.url == null : this.url
						.equals(URL.url));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.displayUrl == null ? 0 : this.displayUrl.hashCode());
		result = 31 * result
				+ (this.expandedUrl == null ? 0 : this.expandedUrl.hashCode());
		result = 31 * result
				+ (this.indices == null ? 0 : this.indices.hashCode());
		result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class URL {\n");

		sb.append("  displayUrl: ").append(displayUrl).append("\n");
		sb.append("  expandedUrl: ").append(expandedUrl).append("\n");
		sb.append("  indices: ").append(indices).append("\n");
		sb.append("  url: ").append(url).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(displayUrl)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(expandedUrl)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(indices)

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
