package golang_package_name

// generated by lightweight-swagger-codegen@eaglesakura

import (
	"encoding/json"
	"github.com/eaglesakura/swagger-go-core"
	"net/http"
)

//
type CursorUsers struct {
	PreviousCursor *int32 `json:"previous_cursor,omitempty"`

	Users *UsersArray `json:"users,omitempty"`

	PreviousCursorStr *string `json:"previous_cursor_str,omitempty"`

	NextCursor *int32 `json:"next_cursor,omitempty"`

	NextCursorStr *string `json:"next_cursor_str,omitempty"`
}

// encode to json
func (it CursorUsers) String() string {
	buf, _ := json.Marshal(it)
	return string(buf)
}

type CursorUsersArray []CursorUsers

func (it *CursorUsers) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.PreviousCursor, it.PreviousCursor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Users, it.Users == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.PreviousCursorStr, it.PreviousCursorStr == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.NextCursor, it.NextCursor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.NextCursorStr, it.NextCursorStr == nil).
		Valid(factory) {
		return false
	}

	return true
}

func (it *CursorUsers) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}

func (arr *CursorUsersArray) Valid(factory swagger.ValidatorFactory) bool {
	for _, it := range *arr {
		if !factory.NewValidator(it.PreviousCursor, it.PreviousCursor == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.Users, it.Users == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.PreviousCursorStr, it.PreviousCursorStr == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.NextCursor, it.NextCursor == nil).
			Valid(factory) {
			return false
		}
		if !factory.NewValidator(it.NextCursorStr, it.NextCursorStr == nil).
			Valid(factory) {
			return false
		}
	}
	return true
}

func (it *CursorUsersArray) WriteResponse(writer http.ResponseWriter, producer swagger.Producer) {
	writer.WriteHeader(200)
	if err := producer.Produce(writer, it); err != nil {
		panic(err) // let the recovery middleware deal with this
	}
}
