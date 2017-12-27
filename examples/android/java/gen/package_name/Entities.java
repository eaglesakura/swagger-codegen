package java.gen.package_name;

import java.gen.package_name.Hashtags;
import java.gen.package_name.Media;
import java.gen.package_name.URL;
import java.gen.package_name.UserMention;
import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Entities implements Validatable {

	@SerializedName("hashtags")
	public List<Hashtags> hashtags = null;

	@SerializedName("media")
	public List<Media> media = null;

	@SerializedName("urls")
	public List<URL> urls = null;

	@SerializedName("user_mentions")
	public List<UserMention> userMentions = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Entities entities = (Entities) o;
		return (this.hashtags == null
				? entities.hashtags == null
				: this.hashtags.equals(entities.hashtags))
				&& (this.media == null ? entities.media == null : this.media
						.equals(entities.media))
				&& (this.urls == null ? entities.urls == null : this.urls
						.equals(entities.urls))
				&& (this.userMentions == null
						? entities.userMentions == null
						: this.userMentions.equals(entities.userMentions));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.hashtags == null ? 0 : this.hashtags.hashCode());
		result = 31 * result + (this.media == null ? 0 : this.media.hashCode());
		result = 31 * result + (this.urls == null ? 0 : this.urls.hashCode());
		result = 31
				* result
				+ (this.userMentions == null ? 0 : this.userMentions.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Entities {\n");

		sb.append("  hashtags: ").append(hashtags).append("\n");
		sb.append("  media: ").append(media).append("\n");
		sb.append("  urls: ").append(urls).append("\n");
		sb.append("  userMentions: ").append(userMentions).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(hashtags)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(media)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(urls)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(userMentions)

		.valid()) {
			return false;
		}

		return true;
	}
}
