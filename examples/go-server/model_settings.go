package golang_package_name

// generated by lightweight-swagger-codegen@eaglesakura

import (
	"encoding/json"
	"github.com/eaglesakura/swagger-go-core"
	"net/http"
)

//
type Settings struct {
	SleepTime *Sleep `json:"sleep_time,omitempty"`

	UseCookiePersonalization *bool `json:"use_cookie_personalization,omitempty"`

	TrendLocation *LocationArray `json:"trend_location,omitempty"`

	Language *string `json:"language,omitempty"`

	DiscoverableByEmail *bool `json:"discoverable_by_email,omitempty"`

	AlwaysUseHttps *bool `json:"always_use_https,omitempty"`

	Protected *bool `json:"protected,omitempty"`

	GeoEnabled *bool `json:"geo_enabled,omitempty"`

	ShowAllInlineMedia *bool `json:"show_all_inline_media,omitempty"`

	ScreenName *string `json:"screen_name,omitempty"`
}

// encode to json
func (it Settings) String() string {
	buf, _ := json.Marshal(it)
	return string(buf)
}

type SettingsArray []Settings

func (it *Settings) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.SleepTime, it.SleepTime == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UseCookiePersonalization, it.UseCookiePersonalization == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.TrendLocation, it.TrendLocation == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Language, it.Language == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.DiscoverableByEmail, it.DiscoverableByEmail == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.AlwaysUseHttps, it.AlwaysUseHttps == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Protected, it.Protected == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.GeoEnabled, it.GeoEnabled == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ShowAllInlineMedia, it.ShowAllInlineMedia == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}

	return true
}

func (it *Settings) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}

func (arr *SettingsArray) Valid(factory swagger.ValidatorFactory) bool {
	for _, it := range *arr {
		if !factory.NewValidator(it.SleepTime, it.SleepTime == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.UseCookiePersonalization, it.UseCookiePersonalization == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.TrendLocation, it.TrendLocation == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Language, it.Language == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.DiscoverableByEmail, it.DiscoverableByEmail == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.AlwaysUseHttps, it.AlwaysUseHttps == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Protected, it.Protected == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.GeoEnabled, it.GeoEnabled == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.ShowAllInlineMedia, it.ShowAllInlineMedia == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
			Valid(factory) {
			return false
		}
	}
	return true
}

func (it *SettingsArray) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}
