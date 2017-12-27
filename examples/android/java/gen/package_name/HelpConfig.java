package java.gen.package_name;

import java.gen.package_name.Sizes;
import java.util.*;

import java.math.*;
import com.google.gson.annotations.*;
import android.support.annotation.*;
import com.eaglesakura.swagger.*;

public class HelpConfig implements Validatable {

	@SerializedName("dm_text_character_limit")
	public Integer dmTextCharacterLimit = null;

	@SerializedName("characters_reserved_per_media")
	public Integer charactersReservedPerMedia = null;

	@SerializedName("max_media_per_upload")
	public Integer maxMediaPerUpload = null;

	@SerializedName("non_username_paths")
	public List<String> nonUsernamePaths = null;

	@SerializedName("photo_size_limit")
	public Integer photoSizeLimit = null;

	@SerializedName("photo_sizes")
	public Sizes photoSizes = null;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HelpConfig helpConfig = (HelpConfig) o;
		return (this.dmTextCharacterLimit == null
				? helpConfig.dmTextCharacterLimit == null
				: this.dmTextCharacterLimit
						.equals(helpConfig.dmTextCharacterLimit))
				&& (this.charactersReservedPerMedia == null
						? helpConfig.charactersReservedPerMedia == null
						: this.charactersReservedPerMedia
								.equals(helpConfig.charactersReservedPerMedia))
				&& (this.maxMediaPerUpload == null
						? helpConfig.maxMediaPerUpload == null
						: this.maxMediaPerUpload
								.equals(helpConfig.maxMediaPerUpload))
				&& (this.nonUsernamePaths == null
						? helpConfig.nonUsernamePaths == null
						: this.nonUsernamePaths
								.equals(helpConfig.nonUsernamePaths))
				&& (this.photoSizeLimit == null
						? helpConfig.photoSizeLimit == null
						: this.photoSizeLimit.equals(helpConfig.photoSizeLimit))
				&& (this.photoSizes == null
						? helpConfig.photoSizes == null
						: this.photoSizes.equals(helpConfig.photoSizes));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31
				* result
				+ (this.dmTextCharacterLimit == null
						? 0
						: this.dmTextCharacterLimit.hashCode());
		result = 31
				* result
				+ (this.charactersReservedPerMedia == null
						? 0
						: this.charactersReservedPerMedia.hashCode());
		result = 31
				* result
				+ (this.maxMediaPerUpload == null ? 0 : this.maxMediaPerUpload
						.hashCode());
		result = 31
				* result
				+ (this.nonUsernamePaths == null ? 0 : this.nonUsernamePaths
						.hashCode());
		result = 31
				* result
				+ (this.photoSizeLimit == null ? 0 : this.photoSizeLimit
						.hashCode());
		result = 31 * result
				+ (this.photoSizes == null ? 0 : this.photoSizes.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HelpConfig {\n");

		sb.append("  dmTextCharacterLimit: ").append(dmTextCharacterLimit)
				.append("\n");
		sb.append("  charactersReservedPerMedia: ")
				.append(charactersReservedPerMedia).append("\n");
		sb.append("  maxMediaPerUpload: ").append(maxMediaPerUpload)
				.append("\n");
		sb.append("  nonUsernamePaths: ").append(nonUsernamePaths).append("\n");
		sb.append("  photoSizeLimit: ").append(photoSizeLimit).append("\n");
		sb.append("  photoSizes: ").append(photoSizes).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@Override
	public boolean valid() {
		if (!new ParameterValidator(dmTextCharacterLimit)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(charactersReservedPerMedia)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(maxMediaPerUpload)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(nonUsernamePaths)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(photoSizeLimit)

		.valid()) {
			return false;
		}
		if (!new ParameterValidator(photoSizes)

		.valid()) {
			return false;
		}

		return true;
	}
}
