package golang_package_name

// generated by lightweight-swagger-codegen@eaglesakura

import (
	"encoding/json"
	"github.com/eaglesakura/swagger-go-core"
	"net/http"
)

//
type Targets struct {
	Target *Target `json:"target,omitempty"`
}

// encode to json
func (it Targets) String() string {
	buf, _ := json.Marshal(it)
	return string(buf)
}

type TargetsArray []Targets

func (it *Targets) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Target, it.Target == nil).
		Valid(factory) {
		return false
	}

	return true
}

func (it *Targets) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}

func (arr *TargetsArray) Valid(factory swagger.ValidatorFactory) bool {
	for _, it := range *arr {
		if !factory.NewValidator(it.Target, it.Target == nil).
			Valid(factory) {
			return false
		}
	}
	return true
}

func (it *TargetsArray) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}
