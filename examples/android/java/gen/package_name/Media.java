package java.gen.package_name;

import java.gen.package_name.Sizes;
import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Media implements Validatable {

	@SerializedName("display_url")
	public String displayUrl = null;

	@SerializedName("expanded_url")
	public String expandedUrl = null;

	@SerializedName("id")
	public Integer id = null;

	@SerializedName("id_str")
	public String idStr = null;

	@SerializedName("indices")
	public List<Integer> indices = null;

	@SerializedName("media_url")
	public String mediaUrl = null;

	@SerializedName("media_url_https")
	public String mediaUrlHttps = null;

	@SerializedName("sizes")
	public Sizes sizes = null;

	@SerializedName("source_status_id")
	public Integer sourceStatusId = null;

	@SerializedName("source_status_id_str")
	public Integer sourceStatusIdStr = null;

	@SerializedName("type")
	public String type = null;

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
		Media media = (Media) o;
		return (this.displayUrl == null
				? media.displayUrl == null
				: this.displayUrl.equals(media.displayUrl))
				&& (this.expandedUrl == null
						? media.expandedUrl == null
						: this.expandedUrl.equals(media.expandedUrl))
				&& (this.id == null ? media.id == null : this.id
						.equals(media.id))
				&& (this.idStr == null ? media.idStr == null : this.idStr
						.equals(media.idStr))
				&& (this.indices == null ? media.indices == null : this.indices
						.equals(media.indices))
				&& (this.mediaUrl == null
						? media.mediaUrl == null
						: this.mediaUrl.equals(media.mediaUrl))
				&& (this.mediaUrlHttps == null
						? media.mediaUrlHttps == null
						: this.mediaUrlHttps.equals(media.mediaUrlHttps))
				&& (this.sizes == null ? media.sizes == null : this.sizes
						.equals(media.sizes))
				&& (this.sourceStatusId == null
						? media.sourceStatusId == null
						: this.sourceStatusId.equals(media.sourceStatusId))
				&& (this.sourceStatusIdStr == null
						? media.sourceStatusIdStr == null
						: this.sourceStatusIdStr
								.equals(media.sourceStatusIdStr))
				&& (this.type == null ? media.type == null : this.type
						.equals(media.type))
				&& (this.url == null ? media.url == null : this.url
						.equals(media.url));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.displayUrl == null ? 0 : this.displayUrl.hashCode());
		result = 31 * result
				+ (this.expandedUrl == null ? 0 : this.expandedUrl.hashCode());
		result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
		result = 31 * result + (this.idStr == null ? 0 : this.idStr.hashCode());
		result = 31 * result
				+ (this.indices == null ? 0 : this.indices.hashCode());
		result = 31 * result
				+ (this.mediaUrl == null ? 0 : this.mediaUrl.hashCode());
		result = 31
				* result
				+ (this.mediaUrlHttps == null ? 0 : this.mediaUrlHttps
						.hashCode());
		result = 31 * result + (this.sizes == null ? 0 : this.sizes.hashCode());
		result = 31
				* result
				+ (this.sourceStatusId == null ? 0 : this.sourceStatusId
						.hashCode());
		result = 31
				* result
				+ (this.sourceStatusIdStr == null ? 0 : this.sourceStatusIdStr
						.hashCode());
		result = 31 * result + (this.type == null ? 0 : this.type.hashCode());
		result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Media {\n");

		sb.append("  displayUrl: ").append(displayUrl).append("\n");
		sb.append("  expandedUrl: ").append(expandedUrl).append("\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  idStr: ").append(idStr).append("\n");
		sb.append("  indices: ").append(indices).append("\n");
		sb.append("  mediaUrl: ").append(mediaUrl).append("\n");
		sb.append("  mediaUrlHttps: ").append(mediaUrlHttps).append("\n");
		sb.append("  sizes: ").append(sizes).append("\n");
		sb.append("  sourceStatusId: ").append(sourceStatusId).append("\n");
		sb.append("  sourceStatusIdStr: ").append(sourceStatusIdStr)
				.append("\n");
		sb.append("  type: ").append(type).append("\n");
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
		if (!new ParameterValidator(id)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(idStr)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(indices)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(mediaUrl)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(mediaUrlHttps)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(sizes)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(sourceStatusId)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(sourceStatusIdStr)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(type)

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
