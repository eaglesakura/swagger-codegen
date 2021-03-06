package golang_package_name

// generated by lightweight-swagger-codegen@eaglesakura

import (
	"encoding/json"
	"github.com/eaglesakura/swagger-go-core"
	"net/http"
)

//
type Location struct {
	Name *string `json:"name,omitempty"`

	PlaceType *PlaceType `json:"placeType,omitempty"`

	Woeid *int32 `json:"woeid,omitempty"`

	Country *string `json:"country,omitempty"`

	Url *string `json:"url,omitempty"`

	CountryCode *string `json:"countryCode,omitempty"`

	Parentid *int32 `json:"parentid,omitempty"`
}

// encode to json
func (it Location) String() string {
	buf, _ := json.Marshal(it)
	return string(buf)
}

type LocationArray []Location

func (it *Location) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Name, it.Name == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.PlaceType, it.PlaceType == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Woeid, it.Woeid == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Country, it.Country == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Url, it.Url == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.CountryCode, it.CountryCode == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Parentid, it.Parentid == nil).
		Valid(factory) {
		return false
	}

	return true
}

func (it *Location) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}

func (arr *LocationArray) Valid(factory swagger.ValidatorFactory) bool {
	for _, it := range *arr {
		if !factory.NewValidator(it.Name, it.Name == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.PlaceType, it.PlaceType == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Woeid, it.Woeid == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Country, it.Country == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Url, it.Url == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.CountryCode, it.CountryCode == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Parentid, it.Parentid == nil).
			Valid(factory) {
			return false
		}
	}
	return true
}

func (it *LocationArray) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}
