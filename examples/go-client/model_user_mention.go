package golang_package_name

// generated by lightweight-swagger-codegen@eaglesakura

import (
	"encoding/json"
	"github.com/eaglesakura/swagger-go-core"
	"net/http"
)

//
type UserMention struct {
	Id *int32 `json:"id,omitempty"`

	IdStr *string `json:"id_str,omitempty"`

	Indices *[]int32 `json:"indices,omitempty"`

	Name *string `json:"name,omitempty"`

	ScreenName *string `json:"screen_name,omitempty"`
}

// encode to json
func (it UserMention) String() string {
	buf, _ := json.Marshal(it)
	return string(buf)
}

type UserMentionArray []UserMention

func (it *UserMention) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Id, it.Id == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IdStr, it.IdStr == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Indices, it.Indices == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Name, it.Name == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}

	return true
}

func (it *UserMention) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}

func (arr *UserMentionArray) Valid(factory swagger.ValidatorFactory) bool {
	for _, it := range *arr {
		if !factory.NewValidator(it.Id, it.Id == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.IdStr, it.IdStr == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Indices, it.Indices == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Name, it.Name == nil).
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

func (it *UserMentionArray) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}
