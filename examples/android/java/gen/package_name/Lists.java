package java.gen.package_name;

import java.gen.package_name.Users;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Lists implements Validatable {

	@SerializedName("created_at")
	public String createdAt = null;

	@SerializedName("slug")
	public String slug = null;

	@SerializedName("name")
	public String name = null;

	@SerializedName("description")
	public String description = null;

	@SerializedName("mode")
	public String mode = null;

	@SerializedName("following")
	public Boolean following = null;

	@SerializedName("user")
	public Users user = null;

	@SerializedName("member_count")
	public Integer memberCount = null;

	@SerializedName("id_str")
	public String idStr = null;

	@SerializedName("subscriber_count")
	public Integer subscriberCount = null;

	@SerializedName("id")
	public Integer id = null;

	@SerializedName("uri")
	public String uri = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Lists lists = (Lists) o;
		return (this.createdAt == null
				? lists.createdAt == null
				: this.createdAt.equals(lists.createdAt))
				&& (this.slug == null ? lists.slug == null : this.slug
						.equals(lists.slug))
				&& (this.name == null ? lists.name == null : this.name
						.equals(lists.name))
				&& (this.description == null
						? lists.description == null
						: this.description.equals(lists.description))
				&& (this.mode == null ? lists.mode == null : this.mode
						.equals(lists.mode))
				&& (this.following == null
						? lists.following == null
						: this.following.equals(lists.following))
				&& (this.user == null ? lists.user == null : this.user
						.equals(lists.user))
				&& (this.memberCount == null
						? lists.memberCount == null
						: this.memberCount.equals(lists.memberCount))
				&& (this.idStr == null ? lists.idStr == null : this.idStr
						.equals(lists.idStr))
				&& (this.subscriberCount == null
						? lists.subscriberCount == null
						: this.subscriberCount.equals(lists.subscriberCount))
				&& (this.id == null ? lists.id == null : this.id
						.equals(lists.id))
				&& (this.uri == null ? lists.uri == null : this.uri
						.equals(lists.uri));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.createdAt == null ? 0 : this.createdAt.hashCode());
		result = 31 * result + (this.slug == null ? 0 : this.slug.hashCode());
		result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
		result = 31 * result
				+ (this.description == null ? 0 : this.description.hashCode());
		result = 31 * result + (this.mode == null ? 0 : this.mode.hashCode());
		result = 31 * result
				+ (this.following == null ? 0 : this.following.hashCode());
		result = 31 * result + (this.user == null ? 0 : this.user.hashCode());
		result = 31 * result
				+ (this.memberCount == null ? 0 : this.memberCount.hashCode());
		result = 31 * result + (this.idStr == null ? 0 : this.idStr.hashCode());
		result = 31
				* result
				+ (this.subscriberCount == null ? 0 : this.subscriberCount
						.hashCode());
		result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
		result = 31 * result + (this.uri == null ? 0 : this.uri.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Lists {\n");

		sb.append("  createdAt: ").append(createdAt).append("\n");
		sb.append("  slug: ").append(slug).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  mode: ").append(mode).append("\n");
		sb.append("  following: ").append(following).append("\n");
		sb.append("  user: ").append(user).append("\n");
		sb.append("  memberCount: ").append(memberCount).append("\n");
		sb.append("  idStr: ").append(idStr).append("\n");
		sb.append("  subscriberCount: ").append(subscriberCount).append("\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  uri: ").append(uri).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(createdAt)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(slug)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(name)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(description)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(mode)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(following)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(user)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(memberCount)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(idStr)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(subscriberCount)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(id)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(uri)

		.valid()) {
			return false;
		}

		return true;
	}
}
