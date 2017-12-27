package java.gen.package_name;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Source implements Validatable {

	@SerializedName("can_dm")
	public Boolean canDm = null;

	@SerializedName("blocking")
	public Boolean blocking = null;

	@SerializedName("id_str")
	public Boolean idStr = null;

	@SerializedName("all_replies")
	public Boolean allReplies = null;

	@SerializedName("want_retweets")
	public Boolean wantRetweets = null;

	@SerializedName("id")
	public Integer id = null;

	@SerializedName("marked_spam")
	public Boolean markedSpam = null;

	@SerializedName("followed_by")
	public Boolean followedBy = null;

	@SerializedName("notifications_enable")
	public Boolean notificationsEnable = null;

	@SerializedName("screen_name")
	public String screenName = null;

	@SerializedName("following")
	public Boolean following = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Source source = (Source) o;
		return (this.canDm == null ? source.canDm == null : this.canDm
				.equals(source.canDm))
				&& (this.blocking == null
						? source.blocking == null
						: this.blocking.equals(source.blocking))
				&& (this.idStr == null ? source.idStr == null : this.idStr
						.equals(source.idStr))
				&& (this.allReplies == null
						? source.allReplies == null
						: this.allReplies.equals(source.allReplies))
				&& (this.wantRetweets == null
						? source.wantRetweets == null
						: this.wantRetweets.equals(source.wantRetweets))
				&& (this.id == null ? source.id == null : this.id
						.equals(source.id))
				&& (this.markedSpam == null
						? source.markedSpam == null
						: this.markedSpam.equals(source.markedSpam))
				&& (this.followedBy == null
						? source.followedBy == null
						: this.followedBy.equals(source.followedBy))
				&& (this.notificationsEnable == null
						? source.notificationsEnable == null
						: this.notificationsEnable
								.equals(source.notificationsEnable))
				&& (this.screenName == null
						? source.screenName == null
						: this.screenName.equals(source.screenName))
				&& (this.following == null
						? source.following == null
						: this.following.equals(source.following));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + (this.canDm == null ? 0 : this.canDm.hashCode());
		result = 31 * result
				+ (this.blocking == null ? 0 : this.blocking.hashCode());
		result = 31 * result + (this.idStr == null ? 0 : this.idStr.hashCode());
		result = 31 * result
				+ (this.allReplies == null ? 0 : this.allReplies.hashCode());
		result = 31
				* result
				+ (this.wantRetweets == null ? 0 : this.wantRetweets.hashCode());
		result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
		result = 31 * result
				+ (this.markedSpam == null ? 0 : this.markedSpam.hashCode());
		result = 31 * result
				+ (this.followedBy == null ? 0 : this.followedBy.hashCode());
		result = 31
				* result
				+ (this.notificationsEnable == null
						? 0
						: this.notificationsEnable.hashCode());
		result = 31 * result
				+ (this.screenName == null ? 0 : this.screenName.hashCode());
		result = 31 * result
				+ (this.following == null ? 0 : this.following.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Source {\n");

		sb.append("  canDm: ").append(canDm).append("\n");
		sb.append("  blocking: ").append(blocking).append("\n");
		sb.append("  idStr: ").append(idStr).append("\n");
		sb.append("  allReplies: ").append(allReplies).append("\n");
		sb.append("  wantRetweets: ").append(wantRetweets).append("\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  markedSpam: ").append(markedSpam).append("\n");
		sb.append("  followedBy: ").append(followedBy).append("\n");
		sb.append("  notificationsEnable: ").append(notificationsEnable)
				.append("\n");
		sb.append("  screenName: ").append(screenName).append("\n");
		sb.append("  following: ").append(following).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(canDm)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(blocking)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(idStr)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(allReplies)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(wantRetweets)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(id)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(markedSpam)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(followedBy)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(notificationsEnable)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(screenName)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(following)

		.valid()) {
			return false;
		}

		return true;
	}
}
