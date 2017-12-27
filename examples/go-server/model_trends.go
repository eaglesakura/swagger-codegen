package golang_package_name

// generated by lightweight-swagger-codegen@eaglesakura

import (
	"encoding/json"
	"github.com/eaglesakura/swagger-go-core"
	"net/http"
)

//
type Trends struct {
	Events *string `json:"events,omitempty"`

	Name *string `json:"name,omitempty"`

	PromotedContent *string `json:"promoted_content,omitempty"`

	Query *string `json:"query,omitempty"`

	Url *string `json:"url,omitempty"`
}

// encode to json
func (it Trends) String() string {
	buf, _ := json.Marshal(it)
	return string(buf)
}

type TrendsArray []Trends

func (it *Trends) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Events, it.Events == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Name, it.Name == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.PromotedContent, it.PromotedContent == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Query, it.Query == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Url, it.Url == nil).
		Valid(factory) {
		return false
	}

	return true
}

func (it *Trends) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}

func (arr *TrendsArray) Valid(factory swagger.ValidatorFactory) bool {
	for _, it := range *arr {
		if !factory.NewValidator(it.Events, it.Events == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Name, it.Name == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.PromotedContent, it.PromotedContent == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Query, it.Query == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Url, it.Url == nil).
			Valid(factory) {
			return false
		}
	}
	return true
}

func (it *TrendsArray) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}