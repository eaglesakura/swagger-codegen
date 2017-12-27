package java.gen.package_name;

import java.gen.package_name.Entities;
import java.gen.package_name.Users;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class Messages implements Validatable {

	@SerializedName("created_at")
	public String createdAt = null;

	@SerializedName("entities")
	public Entities entities = null;

	@SerializedName("id")
	public Integer id = null;

	@SerializedName("id_string")
	public String idString = null;

	@SerializedName("recipient")
	public Users recipient = null;

	@SerializedName("recipient_id")
	public Integer recipientId = null;

	@SerializedName("recipient_screen_name")
	public String recipientScreenName = null;

	@SerializedName("sender")
	public Users sender = null;

	@SerializedName("sender_id")
	public Integer senderId = null;

	@SerializedName("sender_screen_name")
	public String senderScreenName = null;

	@SerializedName("text")
	public String text = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Messages messages = (Messages) o;
		return (this.createdAt == null
				? messages.createdAt == null
				: this.createdAt.equals(messages.createdAt))
				&& (this.entities == null
						? messages.entities == null
						: this.entities.equals(messages.entities))
				&& (this.id == null ? messages.id == null : this.id
						.equals(messages.id))
				&& (this.idString == null
						? messages.idString == null
						: this.idString.equals(messages.idString))
				&& (this.recipient == null
						? messages.recipient == null
						: this.recipient.equals(messages.recipient))
				&& (this.recipientId == null
						? messages.recipientId == null
						: this.recipientId.equals(messages.recipientId))
				&& (this.recipientScreenName == null
						? messages.recipientScreenName == null
						: this.recipientScreenName
								.equals(messages.recipientScreenName))
				&& (this.sender == null ? messages.sender == null : this.sender
						.equals(messages.sender))
				&& (this.senderId == null
						? messages.senderId == null
						: this.senderId.equals(messages.senderId))
				&& (this.senderScreenName == null
						? messages.senderScreenName == null
						: this.senderScreenName
								.equals(messages.senderScreenName))
				&& (this.text == null ? messages.text == null : this.text
						.equals(messages.text));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (this.createdAt == null ? 0 : this.createdAt.hashCode());
		result = 31 * result
				+ (this.entities == null ? 0 : this.entities.hashCode());
		result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
		result = 31 * result
				+ (this.idString == null ? 0 : this.idString.hashCode());
		result = 31 * result
				+ (this.recipient == null ? 0 : this.recipient.hashCode());
		result = 31 * result
				+ (this.recipientId == null ? 0 : this.recipientId.hashCode());
		result = 31
				* result
				+ (this.recipientScreenName == null
						? 0
						: this.recipientScreenName.hashCode());
		result = 31 * result
				+ (this.sender == null ? 0 : this.sender.hashCode());
		result = 31 * result
				+ (this.senderId == null ? 0 : this.senderId.hashCode());
		result = 31
				* result
				+ (this.senderScreenName == null ? 0 : this.senderScreenName
						.hashCode());
		result = 31 * result + (this.text == null ? 0 : this.text.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Messages {\n");

		sb.append("  createdAt: ").append(createdAt).append("\n");
		sb.append("  entities: ").append(entities).append("\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  idString: ").append(idString).append("\n");
		sb.append("  recipient: ").append(recipient).append("\n");
		sb.append("  recipientId: ").append(recipientId).append("\n");
		sb.append("  recipientScreenName: ").append(recipientScreenName)
				.append("\n");
		sb.append("  sender: ").append(sender).append("\n");
		sb.append("  senderId: ").append(senderId).append("\n");
		sb.append("  senderScreenName: ").append(senderScreenName).append("\n");
		sb.append("  text: ").append(text).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(createdAt)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(entities)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(id)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(idString)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(recipient)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(recipientId)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(recipientScreenName)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(sender)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(senderId)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(senderScreenName)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(text)

		.valid()) {
			return false;
		}

		return true;
	}
}
