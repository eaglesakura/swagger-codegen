package golang_package_name

// generated by lightweight-swagger-codegen@eaglesakura

import (
	"encoding/json"
	"github.com/eaglesakura/swagger-go-core"
	"net/http"
)

//
type Messages struct {
	CreatedAt *string `json:"created_at,omitempty"`

	Entities *Entities `json:"entities,omitempty"`

	Id *int32 `json:"id,omitempty"`

	IdString *string `json:"id_string,omitempty"`

	Recipient *Users `json:"recipient,omitempty"`

	RecipientId *int32 `json:"recipient_id,omitempty"`

	RecipientScreenName *string `json:"recipient_screen_name,omitempty"`

	Sender *Users `json:"sender,omitempty"`

	SenderId *int32 `json:"sender_id,omitempty"`

	SenderScreenName *string `json:"sender_screen_name,omitempty"`

	Text *string `json:"text,omitempty"`
}

// encode to json
func (it Messages) String() string {
	buf, _ := json.Marshal(it)
	return string(buf)
}

type MessagesArray []Messages

func (it *Messages) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.CreatedAt, it.CreatedAt == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Entities, it.Entities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Id, it.Id == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IdString, it.IdString == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Recipient, it.Recipient == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.RecipientId, it.RecipientId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.RecipientScreenName, it.RecipientScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Sender, it.Sender == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SenderId, it.SenderId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SenderScreenName, it.SenderScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Text, it.Text == nil).
		Valid(factory) {
		return false
	}

	return true
}

func (it *Messages) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}

func (arr *MessagesArray) Valid(factory swagger.ValidatorFactory) bool {
	for _, it := range *arr {
		if !factory.NewValidator(it.CreatedAt, it.CreatedAt == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Entities, it.Entities == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Id, it.Id == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.IdString, it.IdString == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Recipient, it.Recipient == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.RecipientId, it.RecipientId == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.RecipientScreenName, it.RecipientScreenName == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Sender, it.Sender == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.SenderId, it.SenderId == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.SenderScreenName, it.SenderScreenName == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Text, it.Text == nil).
			Valid(factory) {
			return false
		}
	}
	return true
}

func (it *MessagesArray) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}