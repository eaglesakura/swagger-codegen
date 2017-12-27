package java.gen.package_name;

import java.gen.package_name.Contributors;
import java.gen.package_name.Coordinates;
import java.gen.package_name.Entities;
import java.gen.package_name.Places;
import java.gen.package_name.Tweets;
import java.gen.package_name.Users;
import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Tweets implements Validatable {

	@SerializedName("contributors")
	public List<Contributors> contributors = null;

	@SerializedName("coordinates")
	public Coordinates coordinates = null;

	@SerializedName("created_at")
	public String createdAt = null;

	@SerializedName("current_user_retweet")
	public Tweets currentUserRetweet = null;

	@SerializedName("entities")
	public Entities entities = null;

	@SerializedName("favorite_count")
	public Integer favoriteCount = null;

	@SerializedName("favorited")
	public Boolean favorited = null;

	@SerializedName("filter_level")
	public String filterLevel = null;

	@SerializedName("id")
	public Integer id = null;

	@SerializedName("id_str")
	public String idStr = null;

	@SerializedName("in_reply_to_screen_name")
	public String inReplyToScreenName = null;

	@SerializedName("in_reply_to_status_id")
	public Integer inReplyToStatusId = null;

	@SerializedName("in_reply_to_status_id_str")
	public String inReplyToStatusIdStr = null;

	@SerializedName("in_reply_to_user_id")
	public Integer inReplyToUserId = null;

	@SerializedName("in_reply_to_user_id_str")
	public String inReplyToUserIdStr = null;

	@SerializedName("lang")
	public String lang = null;

	@SerializedName("place")
	public Places place = null;

	@SerializedName("possibly_sensitive")
	public Boolean possiblySensitive = null;

	@SerializedName("quoted_status_id")
	public Integer quotedStatusId = null;

	@SerializedName("quoted_status_id_str")
	public String quotedStatusIdStr = null;

	@SerializedName("quoted_status")
	public Tweets quotedStatus = null;

	@SerializedName("scopes")
	public Object scopes = null;

	@SerializedName("retweet_count")
	public Integer retweetCount = null;

	@SerializedName("retweeted")
	public Boolean retweeted = null;

	@SerializedName("retweeted_status")
	public Tweets retweetedStatus = null;

	@SerializedName("source")
	public String source = null;

	@SerializedName("text")
	public String text = null;

	@SerializedName("truncated")
	public String truncated = null;

	@SerializedName("user")
	public Users user = null;

	@SerializedName("withheld_copyright")
	public Boolean withheldCopyright = null;

	@SerializedName("withheld_countries")
	public List<String> withheldCountries = null;

	@SerializedName("withheld_scope")
	public String withheldScope = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tweets tweets = (Tweets) o;
		return (this.contributors == null
				? tweets.contributors == null
				: this.contributors.equals(tweets.contributors))
				&& (this.coordinates == null
						? tweets.coordinates == null
						: this.coordinates.equals(tweets.coordinates))
				&& (this.createdAt == null
						? tweets.createdAt == null
						: this.createdAt.equals(tweets.createdAt))
				&& (this.currentUserRetweet == null
						? tweets.currentUserRetweet == null
						: this.currentUserRetweet
								.equals(tweets.currentUserRetweet))
				&& (this.entities == null
						? tweets.entities == null
						: this.entities.equals(tweets.entities))
				&& (this.favoriteCount == null
						? tweets.favoriteCount == null
						: this.favoriteCount.equals(tweets.favoriteCount))
				&& (this.favorited == null
						? tweets.favorited == null
						: this.favorited.equals(tweets.favorited))
				&& (this.filterLevel == null
						? tweets.filterLevel == null
						: this.filterLevel.equals(tweets.filterLevel))
				&& (this.id == null ? tweets.id == null : this.id
						.equals(tweets.id))
				&& (this.idStr == null ? tweets.idStr == null : this.idStr
						.equals(tweets.idStr))
				&& (this.inReplyToScreenName == null
						? tweets.inReplyToScreenName == null
						: this.inReplyToScreenName
								.equals(tweets.inReplyToScreenName))
				&& (this.inReplyToStatusId == null
						? tweets.inReplyToStatusId == null
						: this.inReplyToStatusId
								.equals(tweets.inReplyToStatusId))
				&& (this.inReplyToStatusIdStr == null
						? tweets.inReplyToStatusIdStr == null
						: this.inReplyToStatusIdStr
								.equals(tweets.inReplyToStatusIdStr))
				&& (this.inReplyToUserId == null
						? tweets.inReplyToUserId == null
						: this.inReplyToUserId.equals(tweets.inReplyToUserId))
				&& (this.inReplyToUserIdStr == null
						? tweets.inReplyToUserIdStr == null
						: this.inReplyToUserIdStr
								.equals(tweets.inReplyToUserIdStr))
				&& (this.lang == null ? tweets.lang == null : this.lang
						.equals(tweets.lang))
				&& (this.place == null ? tweets.place == null : this.place
						.equals(tweets.place))
				&& (this.possiblySensitive == null
						? tweets.possiblySensitive == null
						: this.possiblySensitive
								.equals(tweets.possiblySensitive))
				&& (this.quotedStatusId == null
						? tweets.quotedStatusId == null
						: this.quotedStatusId.equals(tweets.quotedStatusId))
				&& (this.quotedStatusIdStr == null
						? tweets.quotedStatusIdStr == null
						: this.quotedStatusIdStr
								.equals(tweets.quotedStatusIdStr))
				&& (this.quotedStatus == null
						? tweets.quotedStatus == null
						: this.quotedStatus.equals(tweets.quotedStatus))
				&& (this.scopes == null ? tweets.scopes == null : this.scopes
						.equals(tweets.scopes))
				&& (this.retweetCount == null
						? tweets.retweetCount == null
						: this.retweetCount.equals(tweets.retweetCount))
				&& (this.retweeted == null
						? tweets.retweeted == null
						: this.retweeted.equals(tweets.retweeted))
				&& (this.retweetedStatus == null
						? tweets.retweetedStatus == null
						: this.retweetedStatus.equals(tweets.retweetedStatus))
				&& (this.source == null ? tweets.source == null : this.source
						.equals(tweets.source))
				&& (this.text == null ? tweets.text == null : this.text
						.equals(tweets.text))
				&& (this.truncated == null
						? tweets.truncated == null
						: this.truncated.equals(tweets.truncated))
				&& (this.user == null ? tweets.user == null : this.user
						.equals(tweets.user))
				&& (this.withheldCopyright == null
						? tweets.withheldCopyright == null
						: this.withheldCopyright
								.equals(tweets.withheldCopyright))
				&& (this.withheldCountries == null
						? tweets.withheldCountries == null
						: this.withheldCountries
								.equals(tweets.withheldCountries))
				&& (this.withheldScope == null
						? tweets.withheldScope == null
						: this.withheldScope.equals(tweets.withheldScope));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31
				* result
				+ (this.contributors == null ? 0 : this.contributors.hashCode());
		result = 31 * result
				+ (this.coordinates == null ? 0 : this.coordinates.hashCode());
		result = 31 * result
				+ (this.createdAt == null ? 0 : this.createdAt.hashCode());
		result = 31
				* result
				+ (this.currentUserRetweet == null
						? 0
						: this.currentUserRetweet.hashCode());
		result = 31 * result
				+ (this.entities == null ? 0 : this.entities.hashCode());
		result = 31
				* result
				+ (this.favoriteCount == null ? 0 : this.favoriteCount
						.hashCode());
		result = 31 * result
				+ (this.favorited == null ? 0 : this.favorited.hashCode());
		result = 31 * result
				+ (this.filterLevel == null ? 0 : this.filterLevel.hashCode());
		result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
		result = 31 * result + (this.idStr == null ? 0 : this.idStr.hashCode());
		result = 31
				* result
				+ (this.inReplyToScreenName == null
						? 0
						: this.inReplyToScreenName.hashCode());
		result = 31
				* result
				+ (this.inReplyToStatusId == null ? 0 : this.inReplyToStatusId
						.hashCode());
		result = 31
				* result
				+ (this.inReplyToStatusIdStr == null
						? 0
						: this.inReplyToStatusIdStr.hashCode());
		result = 31
				* result
				+ (this.inReplyToUserId == null ? 0 : this.inReplyToUserId
						.hashCode());
		result = 31
				* result
				+ (this.inReplyToUserIdStr == null
						? 0
						: this.inReplyToUserIdStr.hashCode());
		result = 31 * result + (this.lang == null ? 0 : this.lang.hashCode());
		result = 31 * result + (this.place == null ? 0 : this.place.hashCode());
		result = 31
				* result
				+ (this.possiblySensitive == null ? 0 : this.possiblySensitive
						.hashCode());
		result = 31
				* result
				+ (this.quotedStatusId == null ? 0 : this.quotedStatusId
						.hashCode());
		result = 31
				* result
				+ (this.quotedStatusIdStr == null ? 0 : this.quotedStatusIdStr
						.hashCode());
		result = 31
				* result
				+ (this.quotedStatus == null ? 0 : this.quotedStatus.hashCode());
		result = 31 * result
				+ (this.scopes == null ? 0 : this.scopes.hashCode());
		result = 31
				* result
				+ (this.retweetCount == null ? 0 : this.retweetCount.hashCode());
		result = 31 * result
				+ (this.retweeted == null ? 0 : this.retweeted.hashCode());
		result = 31
				* result
				+ (this.retweetedStatus == null ? 0 : this.retweetedStatus
						.hashCode());
		result = 31 * result
				+ (this.source == null ? 0 : this.source.hashCode());
		result = 31 * result + (this.text == null ? 0 : this.text.hashCode());
		result = 31 * result
				+ (this.truncated == null ? 0 : this.truncated.hashCode());
		result = 31 * result + (this.user == null ? 0 : this.user.hashCode());
		result = 31
				* result
				+ (this.withheldCopyright == null ? 0 : this.withheldCopyright
						.hashCode());
		result = 31
				* result
				+ (this.withheldCountries == null ? 0 : this.withheldCountries
						.hashCode());
		result = 31
				* result
				+ (this.withheldScope == null ? 0 : this.withheldScope
						.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tweets {\n");

		sb.append("  contributors: ").append(contributors).append("\n");
		sb.append("  coordinates: ").append(coordinates).append("\n");
		sb.append("  createdAt: ").append(createdAt).append("\n");
		sb.append("  currentUserRetweet: ").append(currentUserRetweet)
				.append("\n");
		sb.append("  entities: ").append(entities).append("\n");
		sb.append("  favoriteCount: ").append(favoriteCount).append("\n");
		sb.append("  favorited: ").append(favorited).append("\n");
		sb.append("  filterLevel: ").append(filterLevel).append("\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  idStr: ").append(idStr).append("\n");
		sb.append("  inReplyToScreenName: ").append(inReplyToScreenName)
				.append("\n");
		sb.append("  inReplyToStatusId: ").append(inReplyToStatusId)
				.append("\n");
		sb.append("  inReplyToStatusIdStr: ").append(inReplyToStatusIdStr)
				.append("\n");
		sb.append("  inReplyToUserId: ").append(inReplyToUserId).append("\n");
		sb.append("  inReplyToUserIdStr: ").append(inReplyToUserIdStr)
				.append("\n");
		sb.append("  lang: ").append(lang).append("\n");
		sb.append("  place: ").append(place).append("\n");
		sb.append("  possiblySensitive: ").append(possiblySensitive)
				.append("\n");
		sb.append("  quotedStatusId: ").append(quotedStatusId).append("\n");
		sb.append("  quotedStatusIdStr: ").append(quotedStatusIdStr)
				.append("\n");
		sb.append("  quotedStatus: ").append(quotedStatus).append("\n");
		sb.append("  scopes: ").append(scopes).append("\n");
		sb.append("  retweetCount: ").append(retweetCount).append("\n");
		sb.append("  retweeted: ").append(retweeted).append("\n");
		sb.append("  retweetedStatus: ").append(retweetedStatus).append("\n");
		sb.append("  source: ").append(source).append("\n");
		sb.append("  text: ").append(text).append("\n");
		sb.append("  truncated: ").append(truncated).append("\n");
		sb.append("  user: ").append(user).append("\n");
		sb.append("  withheldCopyright: ").append(withheldCopyright)
				.append("\n");
		sb.append("  withheldCountries: ").append(withheldCountries)
				.append("\n");
		sb.append("  withheldScope: ").append(withheldScope).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(contributors)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(coordinates)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(createdAt)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(currentUserRetweet)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(entities)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(favoriteCount)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(favorited)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(filterLevel)

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
		if (!new ParameterValidator(inReplyToScreenName)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(inReplyToStatusId)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(inReplyToStatusIdStr)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(inReplyToUserId)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(inReplyToUserIdStr)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(lang)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(place)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(possiblySensitive)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(quotedStatusId)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(quotedStatusIdStr)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(quotedStatus)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(scopes)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(retweetCount)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(retweeted)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(retweetedStatus)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(source)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(text)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(truncated)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(user)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(withheldCopyright)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(withheldCountries)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(withheldScope)

		.valid()) {
			return false;
		}

		return true;
	}
}
