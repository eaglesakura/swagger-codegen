package golang_package_name

import (
	"github.com/eaglesakura/swagger-go-core"
	"github.com/eaglesakura/swagger-go-core/errors"
	"net/http"
	"strings"
)

type AccountSettingsGetParams struct {
}

/*
returns settings for user

returns settings for user
 return: Settings
*/
type AccountSettingsGetHandler func(context swagger.RequestContext, params *AccountSettingsGetParams) swagger.Responder

func (it *AccountSettingsGetParams) Valid(factory swagger.ValidatorFactory) bool {

	return true
}

// Bind from request
func NewAccountSettingsGetParams(binder swagger.RequestBinder) (*AccountSettingsGetParams, error) {
	result := &AccountSettingsGetParams{}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type AccountSettingsPostParams struct {
	// the Yahoo! Where On Earth ID to user as defaul tend location
	TrendLocationWoeid *string
	// enables/disables sleep time, silencing notifications
	SleepTimeEnabled *string
	// the hour that sleep time should begin if enabled
	StartSleepTime *string
	// the hour that sleep time should end if enabled
	EndSleepTime *string
	// timezone dates and times should be displayed in
	TimeZone *string
	// language which Twitter should render in for the user
	Lang *string
}

/*
updates user&#39;s settings

updates user&#39;s settings
 param: TrendLocationWoeid the Yahoo! Where On Earth ID to user as defaul tend location
 param: SleepTimeEnabled enables/disables sleep time, silencing notifications
 param: StartSleepTime the hour that sleep time should begin if enabled
 param: EndSleepTime the hour that sleep time should end if enabled
 param: TimeZone timezone dates and times should be displayed in
 param: Lang language which Twitter should render in for the user
 return: Settings
*/
type AccountSettingsPostHandler func(context swagger.RequestContext, params *AccountSettingsPostParams) swagger.Responder

func (it *AccountSettingsPostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.TrendLocationWoeid, it.TrendLocationWoeid == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SleepTimeEnabled, it.SleepTimeEnabled == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.StartSleepTime, it.StartSleepTime == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.EndSleepTime, it.EndSleepTime == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.TimeZone, it.TimeZone == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Lang, it.Lang == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewAccountSettingsPostParams(binder swagger.RequestBinder) (*AccountSettingsPostParams, error) {
	result := &AccountSettingsPostParams{}

	if err := binder.BindQuery("trend_location_woeid", "string", &result.TrendLocationWoeid); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("sleep_time_enabled", "string", &result.SleepTimeEnabled); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("start_sleep_time", "string", &result.StartSleepTime); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("end_sleep_time", "string", &result.EndSleepTime); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("time_zone", "string", &result.TimeZone); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("lang", "string", &result.Lang); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type AccountUpdateDeliveryDevicePostParams struct {
	// must be one of sms, none
	Device *string
	// whether or not to include entities
	IncludeEntities *string
}

/*
sets which device Twitter delivers updates to for user

sets which device Twitter delivers updates to for user
 param: Device must be one of sms, none
 param: IncludeEntities whether or not to include entities
 return: Settings
*/
type AccountUpdateDeliveryDevicePostHandler func(context swagger.RequestContext, params *AccountUpdateDeliveryDevicePostParams) swagger.Responder

func (it *AccountUpdateDeliveryDevicePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Device, it.Device == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewAccountUpdateDeliveryDevicePostParams(binder swagger.RequestBinder) (*AccountUpdateDeliveryDevicePostParams, error) {
	result := &AccountUpdateDeliveryDevicePostParams{}

	if err := binder.BindQuery("device", "string", &result.Device); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type AccountUpdateProfileBackgroundImagePostParams struct {
	// image to replace background image of profile
	File *[]byte
	// whether or not to tile background image
	Tile *string
	// display background image or not
	Use *string
	// whether or not to include entities
	IncludeEntities *string
	// whether or not to include status in returned user objects
	SkipStatus *string
}

/*
updates user&#39;s profile background image

updates user&#39;s profile background image
 param: File image to replace background image of profile
 param: Tile whether or not to tile background image
 param: Use display background image or not
 param: IncludeEntities whether or not to include entities
 param: SkipStatus whether or not to include status in returned user objects
 return: Settings
*/
type AccountUpdateProfileBackgroundImagePostHandler func(context swagger.RequestContext, params *AccountUpdateProfileBackgroundImagePostParams) swagger.Responder

func (it *AccountUpdateProfileBackgroundImagePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.File, it.File == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Tile, it.Tile == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Use, it.Use == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewAccountUpdateProfileBackgroundImagePostParams(binder swagger.RequestBinder) (*AccountUpdateProfileBackgroundImagePostParams, error) {
	result := &AccountUpdateProfileBackgroundImagePostParams{}

	if err := binder.BindQuery("tile", "string", &result.Tile); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("use", "string", &result.Use); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}

	if err := binder.BindForm("file", "[]byte", &result.File); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type AccountUpdateProfileColorsPostParams struct {
	// profile background color
	ProfileBackgroundColor *string
	// profile link color
	ProfileLinkColor *string
	// profile sidebar&#39;s border color
	ProfileSidebarBorderColor *string
	// profile&#39;s sidebar background color
	ProfileSidebarFillColor *string
	// profile text color
	ProfileTextColor *string
	// whether or not to include entities
	IncludeEntities *string
	// whether or not to include statuses
	SkipStatus *string
}

/*
sets one or more hex values that controls color scheme

sets one or more hex values that controls color scheme
 param: ProfileBackgroundColor profile background color
 param: ProfileLinkColor profile link color
 param: ProfileSidebarBorderColor profile sidebar&#39;s border color
 param: ProfileSidebarFillColor profile&#39;s sidebar background color
 param: ProfileTextColor profile text color
 param: IncludeEntities whether or not to include entities
 param: SkipStatus whether or not to include statuses
 return: Settings
*/
type AccountUpdateProfileColorsPostHandler func(context swagger.RequestContext, params *AccountUpdateProfileColorsPostParams) swagger.Responder

func (it *AccountUpdateProfileColorsPostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ProfileBackgroundColor, it.ProfileBackgroundColor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ProfileLinkColor, it.ProfileLinkColor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ProfileSidebarBorderColor, it.ProfileSidebarBorderColor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ProfileSidebarFillColor, it.ProfileSidebarFillColor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ProfileTextColor, it.ProfileTextColor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewAccountUpdateProfileColorsPostParams(binder swagger.RequestBinder) (*AccountUpdateProfileColorsPostParams, error) {
	result := &AccountUpdateProfileColorsPostParams{}

	if err := binder.BindQuery("profile_background_color", "string", &result.ProfileBackgroundColor); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("profile_link_color", "string", &result.ProfileLinkColor); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("profile_sidebar_border_color", "string", &result.ProfileSidebarBorderColor); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("profile_sidebar_fill_color", "string", &result.ProfileSidebarFillColor); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("profile_text_color", "string", &result.ProfileTextColor); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type AccountUpdateProfileImagePostParams struct {
	// image to be set as profile image
	Image *[]byte
	// whether or not to include statuses
	SkipStatus *string
}

/*
updates user&#39;s profile image

updates user&#39;s profile image
 param: Image image to be set as profile image
 param: SkipStatus whether or not to include statuses
 return: Settings
*/
type AccountUpdateProfileImagePostHandler func(context swagger.RequestContext, params *AccountUpdateProfileImagePostParams) swagger.Responder

func (it *AccountUpdateProfileImagePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Image, it.Image == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewAccountUpdateProfileImagePostParams(binder swagger.RequestBinder) (*AccountUpdateProfileImagePostParams, error) {
	result := &AccountUpdateProfileImagePostParams{}

	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}

	if err := binder.BindForm("image", "[]byte", &result.Image); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type AccountUpdateProfilePostParams struct {
	// full name of profile
	Name *string
	// url associated with profile
	Url *string
	// city or country describing where user of account is.
	Location *string
	// a description of user owning account
	Description *string
	// whether or not to include entities
	IncludeEntities *string
	// whether or not to include statuses in response
	SkipStatus *string
}

/*
sets values that users ar eable to set under Account tab

sets values that users ar eable to set under Account tab
 param: Name full name of profile
 param: Url url associated with profile
 param: Location city or country describing where user of account is.
 param: Description a description of user owning account
 param: IncludeEntities whether or not to include entities
 param: SkipStatus whether or not to include statuses in response
 return: Settings
*/
type AccountUpdateProfilePostHandler func(context swagger.RequestContext, params *AccountUpdateProfilePostParams) swagger.Responder

func (it *AccountUpdateProfilePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Name, it.Name == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Url, it.Url == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Location, it.Location == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Description, it.Description == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewAccountUpdateProfilePostParams(binder swagger.RequestBinder) (*AccountUpdateProfilePostParams, error) {
	result := &AccountUpdateProfilePostParams{}

	if err := binder.BindQuery("name", "string", &result.Name); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("url", "string", &result.Url); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("location", "string", &result.Location); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("description", "string", &result.Description); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ApplicationRateLimitStatusGetParams struct {
	// A comma-separated list of resource families you want to know the current rate limit disposition for
	Resources *[]string
}

/*


Returns the current rate limits for methods belonging to the specified resource families
 param: Resources A comma-separated list of resource families you want to know the current rate limit disposition for
 return: void
*/
type ApplicationRateLimitStatusGetHandler func(context swagger.RequestContext, params *ApplicationRateLimitStatusGetParams) swagger.Responder

func (it *ApplicationRateLimitStatusGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Resources, it.Resources == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewApplicationRateLimitStatusGetParams(binder swagger.RequestBinder) (*ApplicationRateLimitStatusGetParams, error) {
	result := &ApplicationRateLimitStatusGetParams{}

	if err := binder.BindQuery("resources", "[]string", &result.Resources); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type BlocksCreatePostParams struct {
	// screen name of user to be blocked
	ScreenName *string
	// ID of user to be blocked
	UserId *string
	// whether or not to include entities
	IncludeEntities *string
	// whether or not to skip statuses
	SkipStatus *string
}

/*
blocks the specified user

blocks the specified user
 param: ScreenName screen name of user to be blocked
 param: UserId ID of user to be blocked
 param: IncludeEntities whether or not to include entities
 param: SkipStatus whether or not to skip statuses
 return: Users
*/
type BlocksCreatePostHandler func(context swagger.RequestContext, params *BlocksCreatePostParams) swagger.Responder

func (it *BlocksCreatePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewBlocksCreatePostParams(binder swagger.RequestBinder) (*BlocksCreatePostParams, error) {
	result := &BlocksCreatePostParams{}

	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type BlocksDestroyPostParams struct {
	// screen name of user to be un-blocked
	ScreenName *string
	// ID of user to be un-blocked
	UserId *string
	// whether or not to include entities
	IncludeEntities *string
	// whether or not to skip statuses
	SkipStatus *string
}

/*
un-blocks the specified user

un-blocks the specified user
 param: ScreenName screen name of user to be un-blocked
 param: UserId ID of user to be un-blocked
 param: IncludeEntities whether or not to include entities
 param: SkipStatus whether or not to skip statuses
 return: Users
*/
type BlocksDestroyPostHandler func(context swagger.RequestContext, params *BlocksDestroyPostParams) swagger.Responder

func (it *BlocksDestroyPostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewBlocksDestroyPostParams(binder swagger.RequestBinder) (*BlocksDestroyPostParams, error) {
	result := &BlocksDestroyPostParams{}

	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type BlocksIdsGetParams struct {
	// returns array of numeric IDs as string IDs
	StringifyIds *string
	// breaks up block of user IDs into pages
	Cursor *string
}

/*
returns array of numeric user ids of blocked users

returns array of numeric user ids of blocked users
 param: StringifyIds returns array of numeric IDs as string IDs
 param: Cursor breaks up block of user IDs into pages
 return: CursorUsers
*/
type BlocksIdsGetHandler func(context swagger.RequestContext, params *BlocksIdsGetParams) swagger.Responder

func (it *BlocksIdsGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.StringifyIds, it.StringifyIds == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Cursor, it.Cursor == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewBlocksIdsGetParams(binder swagger.RequestBinder) (*BlocksIdsGetParams, error) {
	result := &BlocksIdsGetParams{}

	if err := binder.BindQuery("stringify_ids", "string", &result.StringifyIds); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("cursor", "string", &result.Cursor); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type BlocksListGetParams struct {
	// whether or not to include entities
	IncludeEntities *string
	// whether or not to include statuses in response
	SkipStatus *string
	// breaks block of user to be broken up into pages
	Cursor *string
}

/*
disallows retweets and device notifications from a user

disallows retweets and device notifications from a user
 param: IncludeEntities whether or not to include entities
 param: SkipStatus whether or not to include statuses in response
 param: Cursor breaks block of user to be broken up into pages
 return: CursorUsers
*/
type BlocksListGetHandler func(context swagger.RequestContext, params *BlocksListGetParams) swagger.Responder

func (it *BlocksListGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Cursor, it.Cursor == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewBlocksListGetParams(binder swagger.RequestBinder) (*BlocksListGetParams, error) {
	result := &BlocksListGetParams{}

	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("cursor", "string", &result.Cursor); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type DirectMessagesDestroyPostParams struct {
	// ID of direct message to delete
	Id *string
	// whether or not to include entities
	IncludeEntities *string
}

/*


destroys direct messages specified in required ID
 param: Id ID of direct message to delete
 param: IncludeEntities whether or not to include entities
 return: Messages
*/
type DirectMessagesDestroyPostHandler func(context swagger.RequestContext, params *DirectMessagesDestroyPostParams) swagger.Responder

func (it *DirectMessagesDestroyPostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Id, it.Id == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewDirectMessagesDestroyPostParams(binder swagger.RequestBinder) (*DirectMessagesDestroyPostParams, error) {
	result := &DirectMessagesDestroyPostParams{}

	if err := binder.BindQuery("id", "string", &result.Id); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type DirectMessagesGetParams struct {
	// return results with ID greater than specified
	SinceId *string
	// returns results with an ID less than/equal to specified ID
	MaxId *string
	// whether or not to include entities
	IncludeEntities *string
	// whether or not to include status
	SkipStatus *string
}

/*


return 20 most recent direct messages sent to user
 param: SinceId return results with ID greater than specified
 param: MaxId returns results with an ID less than/equal to specified ID
 param: IncludeEntities whether or not to include entities
 param: SkipStatus whether or not to include status
 return: MessagesArray
*/
type DirectMessagesGetHandler func(context swagger.RequestContext, params *DirectMessagesGetParams) swagger.Responder

func (it *DirectMessagesGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.SinceId, it.SinceId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.MaxId, it.MaxId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewDirectMessagesGetParams(binder swagger.RequestBinder) (*DirectMessagesGetParams, error) {
	result := &DirectMessagesGetParams{}

	if err := binder.BindQuery("since_id", "string", &result.SinceId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("max_id", "string", &result.MaxId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type DirectMessagesNewPostParams struct {
	// description
	UserId *string
	// text of your direct message
	Text *string
	// screen name of user receiving message
	ScreenName *string
}

/*


sends a new direct message to specified user
 param: UserId description
 param: Text text of your direct message
 param: ScreenName screen name of user receiving message
 return: Messages
*/
type DirectMessagesNewPostHandler func(context swagger.RequestContext, params *DirectMessagesNewPostParams) swagger.Responder

func (it *DirectMessagesNewPostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.UserId, it.UserId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Text, it.Text == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewDirectMessagesNewPostParams(binder swagger.RequestBinder) (*DirectMessagesNewPostParams, error) {
	result := &DirectMessagesNewPostParams{}

	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("text", "string", &result.Text); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type DirectMessagesSentGetParams struct {
	//
	SinceId *string
	//
	MaxId *string
	//
	Count *string
	//
	Page *string
	//
	IncludeEntities *string
}

/*


return 20 most recent direct messages sent
 param: SinceId
 param: MaxId
 param: Count
 param: Page
 param: IncludeEntities
 return: MessagesArray
*/
type DirectMessagesSentGetHandler func(context swagger.RequestContext, params *DirectMessagesSentGetParams) swagger.Responder

func (it *DirectMessagesSentGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.SinceId, it.SinceId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.MaxId, it.MaxId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Count, it.Count == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Page, it.Page == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewDirectMessagesSentGetParams(binder swagger.RequestBinder) (*DirectMessagesSentGetParams, error) {
	result := &DirectMessagesSentGetParams{}

	if err := binder.BindQuery("since_id", "string", &result.SinceId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("max_id", "string", &result.MaxId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("count", "string", &result.Count); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("page", "string", &result.Page); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type DirectMessagesShowGetParams struct {
	// ID of direct message
	Id *string
}

/*


returns a single direct message specified by an id
 param: Id ID of direct message
 return: MessagesArray
*/
type DirectMessagesShowGetHandler func(context swagger.RequestContext, params *DirectMessagesShowGetParams) swagger.Responder

func (it *DirectMessagesShowGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Id, it.Id == nil).Required(true).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewDirectMessagesShowGetParams(binder swagger.RequestBinder) (*DirectMessagesShowGetParams, error) {
	result := &DirectMessagesShowGetParams{}

	if err := binder.BindQuery("id", "string", &result.Id); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type FollowersIdsGetParams struct {
	// ID of user for whom to return results for
	UserId *string
	// screen name of user for whom to return results for
	ScreenName *string
	// causes list of connections to be broken in pages
	Cursor *string
	// IDs converted to strings
	StringifyIds *string
	// number of IDs to attempt retrieval of
	Count *string
}

/*


returns a cursored collection of user IDs following the user
 param: UserId ID of user for whom to return results for
 param: ScreenName screen name of user for whom to return results for
 param: Cursor causes list of connections to be broken in pages
 param: StringifyIds IDs converted to strings
 param: Count number of IDs to attempt retrieval of
 return: CursorIds
*/
type FollowersIdsGetHandler func(context swagger.RequestContext, params *FollowersIdsGetParams) swagger.Responder

func (it *FollowersIdsGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.UserId, it.UserId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Cursor, it.Cursor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.StringifyIds, it.StringifyIds == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Count, it.Count == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewFollowersIdsGetParams(binder swagger.RequestBinder) (*FollowersIdsGetParams, error) {
	result := &FollowersIdsGetParams{}

	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("cursor", "string", &result.Cursor); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("stringify_ids", "string", &result.StringifyIds); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("count", "string", &result.Count); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type FriendsIdsGetParams struct {
	// ID of user for whom to return results for
	UserId *string
	// screen name of user for whom to return results for
	ScreenName *string
	// causes list of connections to be broken in pages
	Cursor *string
	// IDs converted to strings
	StringifyIds *string
	// number of IDs to attempt retrieval of
	Count *string
}

/*


returns a cursored collection of user IDs followed by user
 param: UserId ID of user for whom to return results for
 param: ScreenName screen name of user for whom to return results for
 param: Cursor causes list of connections to be broken in pages
 param: StringifyIds IDs converted to strings
 param: Count number of IDs to attempt retrieval of
 return: CursorIds
*/
type FriendsIdsGetHandler func(context swagger.RequestContext, params *FriendsIdsGetParams) swagger.Responder

func (it *FriendsIdsGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.UserId, it.UserId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Cursor, it.Cursor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.StringifyIds, it.StringifyIds == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Count, it.Count == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewFriendsIdsGetParams(binder swagger.RequestBinder) (*FriendsIdsGetParams, error) {
	result := &FriendsIdsGetParams{}

	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("cursor", "string", &result.Cursor); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("stringify_ids", "string", &result.StringifyIds); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("count", "string", &result.Count); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type FriendshipsCreatePostParams struct {
	// screen name of user for whom to befriend
	ScreenName *string
	// ID of user for whom to befriend
	UserId *string
	// enable notifications for target user
	Follow *string
}

/*


allows users to follow user sepcified by ID
 param: ScreenName screen name of user for whom to befriend
 param: UserId ID of user for whom to befriend
 param: Follow enable notifications for target user
 return: Users
*/
type FriendshipsCreatePostHandler func(context swagger.RequestContext, params *FriendshipsCreatePostParams) swagger.Responder

func (it *FriendshipsCreatePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Follow, it.Follow == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewFriendshipsCreatePostParams(binder swagger.RequestBinder) (*FriendshipsCreatePostParams, error) {
	result := &FriendshipsCreatePostParams{}

	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("follow", "string", &result.Follow); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type FriendshipsDestroyPostParams struct {
	// screen name of user for whom to befriend
	ScreenName *string
	// ID of user for whom to befriend
	UserId *string
}

/*


allows user to unfollow user psecified by ID
 param: ScreenName screen name of user for whom to befriend
 param: UserId ID of user for whom to befriend
 return: Users
*/
type FriendshipsDestroyPostHandler func(context swagger.RequestContext, params *FriendshipsDestroyPostParams) swagger.Responder

func (it *FriendshipsDestroyPostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).Required(true).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewFriendshipsDestroyPostParams(binder swagger.RequestBinder) (*FriendshipsDestroyPostParams, error) {
	result := &FriendshipsDestroyPostParams{}

	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type FriendshipsIncomingGetParams struct {
	// causes list of connections to be broken in pages
	Cursor *string
	// IDs converted to strings
	StringifyIds *string
}

/*


returns collection of IDs of users with pending follow request
 param: Cursor causes list of connections to be broken in pages
 param: StringifyIds IDs converted to strings
 return: CursorIds
*/
type FriendshipsIncomingGetHandler func(context swagger.RequestContext, params *FriendshipsIncomingGetParams) swagger.Responder

func (it *FriendshipsIncomingGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Cursor, it.Cursor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.StringifyIds, it.StringifyIds == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewFriendshipsIncomingGetParams(binder swagger.RequestBinder) (*FriendshipsIncomingGetParams, error) {
	result := &FriendshipsIncomingGetParams{}

	if err := binder.BindQuery("cursor", "string", &result.Cursor); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("stringify_ids", "string", &result.StringifyIds); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type FriendshipsOutgoingGetParams struct {
	// causes list of connections to be broken in pages
	Cursor *string
	// IDs converted to strings
	StringifyIds *string
}

/*


returns collection of IDs of users with pending follow request from the user
 param: Cursor causes list of connections to be broken in pages
 param: StringifyIds IDs converted to strings
 return: CursorIds
*/
type FriendshipsOutgoingGetHandler func(context swagger.RequestContext, params *FriendshipsOutgoingGetParams) swagger.Responder

func (it *FriendshipsOutgoingGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Cursor, it.Cursor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.StringifyIds, it.StringifyIds == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewFriendshipsOutgoingGetParams(binder swagger.RequestBinder) (*FriendshipsOutgoingGetParams, error) {
	result := &FriendshipsOutgoingGetParams{}

	if err := binder.BindQuery("cursor", "string", &result.Cursor); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("stringify_ids", "string", &result.StringifyIds); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type FriendshipsShowGetParams struct {
	// user id of target user
	TargetId *string
	// screen name of target user
	TargetScreenName *string
	// user id of subject user
	SourceId *string
	// screen_name of subject user
	SourceScreenName *string
}

/*


returns detailed info about relationship between two users
 param: TargetId user id of target user
 param: TargetScreenName screen name of target user
 param: SourceId user id of subject user
 param: SourceScreenName screen_name of subject user
 return: Friendship
*/
type FriendshipsShowGetHandler func(context swagger.RequestContext, params *FriendshipsShowGetParams) swagger.Responder

func (it *FriendshipsShowGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.TargetId, it.TargetId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.TargetScreenName, it.TargetScreenName == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SourceId, it.SourceId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SourceScreenName, it.SourceScreenName == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewFriendshipsShowGetParams(binder swagger.RequestBinder) (*FriendshipsShowGetParams, error) {
	result := &FriendshipsShowGetParams{}

	if err := binder.BindQuery("source_id", "string", &result.SourceId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("source_screen_name", "string", &result.SourceScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("target_id", "string", &result.TargetId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("target_screen_name", "string", &result.TargetScreenName); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type FriendshipsUpdatePostParams struct {
	// screen name of user for whom to befriend
	ScreenName *string
	// ID of user for whom to befriend
	UserId *string
	// enable/disable device notifications for user
	Device *string
	// enable/disable retweets from target user
	Retweets *string
}

/*


Allows one to enable or disable settings for specified user
 param: ScreenName screen name of user for whom to befriend
 param: UserId ID of user for whom to befriend
 param: Device enable/disable device notifications for user
 param: Retweets enable/disable retweets from target user
 return: Friendship
*/
type FriendshipsUpdatePostHandler func(context swagger.RequestContext, params *FriendshipsUpdatePostParams) swagger.Responder

func (it *FriendshipsUpdatePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Device, it.Device == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Retweets, it.Retweets == nil).Required(true).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewFriendshipsUpdatePostParams(binder swagger.RequestBinder) (*FriendshipsUpdatePostParams, error) {
	result := &FriendshipsUpdatePostParams{}

	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("device", "string", &result.Device); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("retweets", "string", &result.Retweets); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type GeoIdPlaceIdGetParams struct {
	// A place in the world
	PlaceId *string
}

/*


Returns all the information about a know place
 param: PlaceId A place in the world
 return: PlacesArray
*/
type GeoIdPlaceIdGetHandler func(context swagger.RequestContext, params *GeoIdPlaceIdGetParams) swagger.Responder

func (it *GeoIdPlaceIdGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.PlaceId, it.PlaceId == nil).Required(true).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewGeoIdPlaceIdGetParams(binder swagger.RequestBinder) (*GeoIdPlaceIdGetParams, error) {
	result := &GeoIdPlaceIdGetParams{}

	if err := binder.BindPath("place_id", "string", &result.PlaceId); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type GeoPlacesGetParams struct {
	// The latitude to search around
	Lat *string
	// The longtitude to search around
	Long *string
	// The name a place is known as
	Name *string
	// The token found in the response from geo/similar_places
	Token *string
	// This is the place_id which you would like to restrict the search results to
	ContainedWithin *string
	// This parameter searches for places which have this givven street address
	AttributestreetAddress *string
	// If supplied, the responses will use the JSON format with a callback of the given name
	Callback *string
}

/*


Create a new place object at the given latitude and logitude
 param: Lat The latitude to search around
 param: Long The longtitude to search around
 param: Name The name a place is known as
 param: Token The token found in the response from geo/similar_places
 param: ContainedWithin This is the place_id which you would like to restrict the search results to
 param: AttributestreetAddress This parameter searches for places which have this givven street address
 param: Callback If supplied, the responses will use the JSON format with a callback of the given name
 return: Places
*/
type GeoPlacesGetHandler func(context swagger.RequestContext, params *GeoPlacesGetParams) swagger.Responder

func (it *GeoPlacesGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Lat, it.Lat == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Long, it.Long == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Name, it.Name == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Token, it.Token == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ContainedWithin, it.ContainedWithin == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.AttributestreetAddress, it.AttributestreetAddress == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Callback, it.Callback == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewGeoPlacesGetParams(binder swagger.RequestBinder) (*GeoPlacesGetParams, error) {
	result := &GeoPlacesGetParams{}

	if err := binder.BindQuery("lat", "string", &result.Lat); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("long", "string", &result.Long); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("name", "string", &result.Name); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("token", "string", &result.Token); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("contained_within", "string", &result.ContainedWithin); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("attribute:street_address", "string", &result.AttributestreetAddress); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("callback", "string", &result.Callback); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type GeoReverseGeoncodeGetParams struct {
	// The latitude to search around
	Lat *string
	// The longtitude to search around
	Long *string
	// A hint on region in which to search
	Accuracy *string
	// This is the minimal granularity of place types to return
	Granularity *string
	// A hint as to the number of results to return
	MaxResults *string
	// If supplied, the responses will use the JSON format with a callback of the given name
	Callback *string
}

/*


Given a latitude and a longitude, searches for up to 20 places that can be used as a place_id when updatting a status
 param: Lat The latitude to search around
 param: Long The longtitude to search around
 param: Accuracy A hint on region in which to search
 param: Granularity This is the minimal granularity of place types to return
 param: MaxResults A hint as to the number of results to return
 param: Callback If supplied, the responses will use the JSON format with a callback of the given name
 return: PlacesArray
*/
type GeoReverseGeoncodeGetHandler func(context swagger.RequestContext, params *GeoReverseGeoncodeGetParams) swagger.Responder

func (it *GeoReverseGeoncodeGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Lat, it.Lat == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Long, it.Long == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Accuracy, it.Accuracy == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Granularity, it.Granularity == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.MaxResults, it.MaxResults == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Callback, it.Callback == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewGeoReverseGeoncodeGetParams(binder swagger.RequestBinder) (*GeoReverseGeoncodeGetParams, error) {
	result := &GeoReverseGeoncodeGetParams{}

	if err := binder.BindQuery("lat", "string", &result.Lat); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("long", "string", &result.Long); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("accuracy", "string", &result.Accuracy); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("granularity", "string", &result.Granularity); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("max_results", "string", &result.MaxResults); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("callback", "string", &result.Callback); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type GeoSearchGetParams struct {
	// The latitude to search around
	Lat *string
	// The longtitude to search around
	Long *string
	// Free-form text to match against while executing a geo-based query
	Query *string
	// An Ip address
	Ip *string
	// A hint on region in which to search
	Accuracy *string
	// This is the minimal granularity of place types to return
	Granularity *string
	// This is the place_id which you would like to restrict the search results to
	ContainedWithin *string
	// This parameter searches for places which have this givven street address
	AttributestreetAddress *string
	// If supplied, the responses will use the JSON format with a callback of the given name
	Callback *string
}

/*


Search for places that can be attached to a statuses/updates
 param: Lat The latitude to search around
 param: Long The longtitude to search around
 param: Query Free-form text to match against while executing a geo-based query
 param: Ip An Ip address
 param: Accuracy A hint on region in which to search
 param: Granularity This is the minimal granularity of place types to return
 param: ContainedWithin This is the place_id which you would like to restrict the search results to
 param: AttributestreetAddress This parameter searches for places which have this givven street address
 param: Callback If supplied, the responses will use the JSON format with a callback of the given name
 return: PlacesArray
*/
type GeoSearchGetHandler func(context swagger.RequestContext, params *GeoSearchGetParams) swagger.Responder

func (it *GeoSearchGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Lat, it.Lat == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Long, it.Long == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Query, it.Query == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Ip, it.Ip == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Accuracy, it.Accuracy == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Granularity, it.Granularity == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ContainedWithin, it.ContainedWithin == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.AttributestreetAddress, it.AttributestreetAddress == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Callback, it.Callback == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewGeoSearchGetParams(binder swagger.RequestBinder) (*GeoSearchGetParams, error) {
	result := &GeoSearchGetParams{}

	if err := binder.BindQuery("lat", "string", &result.Lat); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("long", "string", &result.Long); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("query", "string", &result.Query); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("ip", "string", &result.Ip); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("accuracy", "string", &result.Accuracy); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("granularity", "string", &result.Granularity); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("contained_within", "string", &result.ContainedWithin); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("attribute:street_address", "string", &result.AttributestreetAddress); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("callback", "string", &result.Callback); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type GeoSimilarPlacesGetParams struct {
	// The latitude to search around
	Lat *string
	// The longtitude to search around
	Long *string
	// The name a place is known as
	Name *string
	// This is the place_id which you would like to restrict the search results to
	ContainedWithin *string
	// This parameter searches for places which have this givven street address
	AttributestreetAddress *string
	// If supplied, the responses will use the JSON format with a callback of the given name
	Callback *string
}

/*


Locates places near the given coordinates which are similar in name
 param: Lat The latitude to search around
 param: Long The longtitude to search around
 param: Name The name a place is known as
 param: ContainedWithin This is the place_id which you would like to restrict the search results to
 param: AttributestreetAddress This parameter searches for places which have this givven street address
 param: Callback If supplied, the responses will use the JSON format with a callback of the given name
 return: PlacesArray
*/
type GeoSimilarPlacesGetHandler func(context swagger.RequestContext, params *GeoSimilarPlacesGetParams) swagger.Responder

func (it *GeoSimilarPlacesGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Lat, it.Lat == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Long, it.Long == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Name, it.Name == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ContainedWithin, it.ContainedWithin == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.AttributestreetAddress, it.AttributestreetAddress == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Callback, it.Callback == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewGeoSimilarPlacesGetParams(binder swagger.RequestBinder) (*GeoSimilarPlacesGetParams, error) {
	result := &GeoSimilarPlacesGetParams{}

	if err := binder.BindQuery("lat", "string", &result.Lat); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("long", "string", &result.Long); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("name", "string", &result.Name); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("contained_within", "string", &result.ContainedWithin); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("attribute:street_address", "string", &result.AttributestreetAddress); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("callback", "string", &result.Callback); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type HelpConfigurationGetParams struct {
}

/*


Returns the current configuration used by Twitter including twitter.com slugs which are not usernames
 return: HelpConfig
*/
type HelpConfigurationGetHandler func(context swagger.RequestContext, params *HelpConfigurationGetParams) swagger.Responder

func (it *HelpConfigurationGetParams) Valid(factory swagger.ValidatorFactory) bool {

	return true
}

// Bind from request
func NewHelpConfigurationGetParams(binder swagger.RequestBinder) (*HelpConfigurationGetParams, error) {
	result := &HelpConfigurationGetParams{}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type HelpLanguagesGetParams struct {
}

/*


Returns the list of languages supported by Twitter along with the language code supported by Twitter
 return: HelpLanguageArray
*/
type HelpLanguagesGetHandler func(context swagger.RequestContext, params *HelpLanguagesGetParams) swagger.Responder

func (it *HelpLanguagesGetParams) Valid(factory swagger.ValidatorFactory) bool {

	return true
}

// Bind from request
func NewHelpLanguagesGetParams(binder swagger.RequestBinder) (*HelpLanguagesGetParams, error) {
	result := &HelpLanguagesGetParams{}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type HelpPrivacyGetParams struct {
}

/*


Returns Twitter&#39;s privacy policy
 return: HelpPrivacy
*/
type HelpPrivacyGetHandler func(context swagger.RequestContext, params *HelpPrivacyGetParams) swagger.Responder

func (it *HelpPrivacyGetParams) Valid(factory swagger.ValidatorFactory) bool {

	return true
}

// Bind from request
func NewHelpPrivacyGetParams(binder swagger.RequestBinder) (*HelpPrivacyGetParams, error) {
	result := &HelpPrivacyGetParams{}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type HelpTosGetParams struct {
}

/*


Returns the Twitter Terms of Service
 return: HelpTos
*/
type HelpTosGetHandler func(context swagger.RequestContext, params *HelpTosGetParams) swagger.Responder

func (it *HelpTosGetParams) Valid(factory swagger.ValidatorFactory) bool {

	return true
}

// Bind from request
func NewHelpTosGetParams(binder swagger.RequestBinder) (*HelpTosGetParams, error) {
	result := &HelpTosGetParams{}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListMembersCreatePostParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list being requested by a slug
	Slug *string
	// The screen name of the user for whom to remove from the list
	ScreenName *string
	// The screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The user ID of the user who owns the list being requested by a slug
	OwnerId *string
}

/*


Returns list of members create
 param: ListId The numerical id of the list
 param: Slug You can identify a list being requested by a slug
 param: ScreenName The screen name of the user for whom to remove from the list
 param: OwnerScreenName The screen name of the user who owns the list being requested by a slug
 param: OwnerId The user ID of the user who owns the list being requested by a slug
 return: void
*/
type ListMembersCreatePostHandler func(context swagger.RequestContext, params *ListMembersCreatePostParams) swagger.Responder

func (it *ListMembersCreatePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListMembersCreatePostParams(binder swagger.RequestBinder) (*ListMembersCreatePostParams, error) {
	result := &ListMembersCreatePostParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListMembersDestroyAllGetParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list being requested by a slug
	Slug *string
	// The id of the user for whom to remove from the list
	UserId *string
	// The screen name of the user for whom to remove from the list
	ScreenName *string
	// The screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The user ID of the user who owns the list being requested by a slug
	OwnerId *string
}

/*


Returns lists of destroy all
 param: ListId The numerical id of the list
 param: Slug You can identify a list being requested by a slug
 param: UserId The id of the user for whom to remove from the list
 param: ScreenName The screen name of the user for whom to remove from the list
 param: OwnerScreenName The screen name of the user who owns the list being requested by a slug
 param: OwnerId The user ID of the user who owns the list being requested by a slug
 return: CursorLists
*/
type ListMembersDestroyAllGetHandler func(context swagger.RequestContext, params *ListMembersDestroyAllGetParams) swagger.Responder

func (it *ListMembersDestroyAllGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListMembersDestroyAllGetParams(binder swagger.RequestBinder) (*ListMembersDestroyAllGetParams, error) {
	result := &ListMembersDestroyAllGetParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListMembersGetParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list being requested by a slug
	Slug *string
	// The screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The user ID of the user who owns the list being requested by a slug
	OwnerId *string
	// Wehn set to either true, t or 1
	IncludeEntities *string
	// When set to either true, t or 1
	SkipStatus *string
	// Breaks the results into pages
	Cursor *string
}

/*


Returns the members of the specified list
 param: ListId The numerical id of the list
 param: Slug You can identify a list being requested by a slug
 param: OwnerScreenName The screen name of the user who owns the list being requested by a slug
 param: OwnerId The user ID of the user who owns the list being requested by a slug
 param: IncludeEntities Wehn set to either true, t or 1
 param: SkipStatus When set to either true, t or 1
 param: Cursor Breaks the results into pages
 return: Users
*/
type ListMembersGetHandler func(context swagger.RequestContext, params *ListMembersGetParams) swagger.Responder

func (it *ListMembersGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Cursor, it.Cursor == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListMembersGetParams(binder swagger.RequestBinder) (*ListMembersGetParams, error) {
	result := &ListMembersGetParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("cursor", "string", &result.Cursor); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListMembersShowGetParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list being requested by a slug
	Slug *string
	// The id of the user for whom to remove from the list
	UserId *string
	// The screen name of the user for whom to remove from the list
	ScreenName *string
	// The screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The user ID of the user who owns the list being requested by a slug
	OwnerId *string
	// Wehn set to either true, t or 1
	IncludeEntities *string
	// When set to either true, t or 1
	SkipStatus *string
}

/*


Check if the specified user is a member of the specified list
 param: ListId The numerical id of the list
 param: Slug You can identify a list being requested by a slug
 param: UserId The id of the user for whom to remove from the list
 param: ScreenName The screen name of the user for whom to remove from the list
 param: OwnerScreenName The screen name of the user who owns the list being requested by a slug
 param: OwnerId The user ID of the user who owns the list being requested by a slug
 param: IncludeEntities Wehn set to either true, t or 1
 param: SkipStatus When set to either true, t or 1
 return: Users
*/
type ListMembersShowGetHandler func(context swagger.RequestContext, params *ListMembersShowGetParams) swagger.Responder

func (it *ListMembersShowGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListMembersShowGetParams(binder swagger.RequestBinder) (*ListMembersShowGetParams, error) {
	result := &ListMembersShowGetParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsCreatePostParams struct {
	// The name for the list
	Name *string
	// Whether your list is public or private
	Mode *string
	// The description to give the list
	Description *string
}

/*


Returns list of create
 param: Name The name for the list
 param: Mode Whether your list is public or private
 param: Description The description to give the list
 return: Lists
*/
type ListsCreatePostHandler func(context swagger.RequestContext, params *ListsCreatePostParams) swagger.Responder

func (it *ListsCreatePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Name, it.Name == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Mode, it.Mode == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Description, it.Description == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsCreatePostParams(binder swagger.RequestBinder) (*ListsCreatePostParams, error) {
	result := &ListsCreatePostParams{}

	if err := binder.BindQuery("name", "string", &result.Name); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("mode", "string", &result.Mode); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("description", "string", &result.Description); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsDestroyPostParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list being requested by a slug
	Slug *string
	// The screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The user ID of the user who owns the list being requested by a slug
	OwnerId *string
}

/*


Returns list of destroy
 param: ListId The numerical id of the list
 param: Slug You can identify a list being requested by a slug
 param: OwnerScreenName The screen name of the user who owns the list being requested by a slug
 param: OwnerId The user ID of the user who owns the list being requested by a slug
 return: Lists
*/
type ListsDestroyPostHandler func(context swagger.RequestContext, params *ListsDestroyPostParams) swagger.Responder

func (it *ListsDestroyPostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsDestroyPostParams(binder swagger.RequestBinder) (*ListsDestroyPostParams, error) {
	result := &ListsDestroyPostParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsListGetParams struct {
	// The screen name of the user for whom to return results for
	ScreenName *string
	// The ID of the user for whom to return results for
	UserId *string
}

/*


Return all lists the authenticating or specified user subscribes to, including their own.
 param: ScreenName The screen name of the user for whom to return results for
 param: UserId The ID of the user for whom to return results for
 return: ListsArray
*/
type ListsListGetHandler func(context swagger.RequestContext, params *ListsListGetParams) swagger.Responder

func (it *ListsListGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).Required(true).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsListGetParams(binder swagger.RequestBinder) (*ListsListGetParams, error) {
	result := &ListsListGetParams{}

	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsMembersCreateAllGetParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list being requested by a slug
	Slug *string
	// the screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The user ID of the user who owns the list being requested by a slug
	OwnerId *string
	// The id of the user for whom to remove from the list
	UserId *string
	// The screen name of the user for whom to remove from the list
	ScreenName *string
}

/*


Returns lists of members create_all
 param: ListId The numerical id of the list
 param: Slug You can identify a list being requested by a slug
 param: OwnerScreenName the screen name of the user who owns the list being requested by a slug
 param: OwnerId The user ID of the user who owns the list being requested by a slug
 param: UserId The id of the user for whom to remove from the list
 param: ScreenName The screen name of the user for whom to remove from the list
 return: void
*/
type ListsMembersCreateAllGetHandler func(context swagger.RequestContext, params *ListsMembersCreateAllGetParams) swagger.Responder

func (it *ListsMembersCreateAllGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsMembersCreateAllGetParams(binder swagger.RequestBinder) (*ListsMembersCreateAllGetParams, error) {
	result := &ListsMembersCreateAllGetParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsMembersDestroyGetParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list by its slug instrad of its numerical id
	Slug *string
	// The screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The id of the user for whom to remove from the list
	UserId *string
	// The screen name of the user for whom to remove from the list
	ScreenName *string
	// The is of the user who wons the list being requested by a slug
	OwnerId *string
}

/*


Returns the list of memebers destroy
 param: ListId The numerical id of the list
 param: Slug You can identify a list by its slug instrad of its numerical id
 param: OwnerScreenName The screen name of the user who owns the list being requested by a slug
 param: UserId The id of the user for whom to remove from the list
 param: ScreenName The screen name of the user for whom to remove from the list
 param: OwnerId The is of the user who wons the list being requested by a slug
 return: void
*/
type ListsMembersDestroyGetHandler func(context swagger.RequestContext, params *ListsMembersDestroyGetParams) swagger.Responder

func (it *ListsMembersDestroyGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsMembersDestroyGetParams(binder swagger.RequestBinder) (*ListsMembersDestroyGetParams, error) {
	result := &ListsMembersDestroyGetParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsMembershipsGetParams struct {
	// The id of the user for whom to return results for
	UserId *string
	// The screen name of the user for whom to return results for
	ScreenName *string
	// Breaks the results into pages
	Cursor *string
	// When set to true, t or 1, will return just lists the authenticating user owns
	FilterToOwnedLists *string
}

/*


Returns the lists of the specified user has been added to
 param: UserId The id of the user for whom to return results for
 param: ScreenName The screen name of the user for whom to return results for
 param: Cursor Breaks the results into pages
 param: FilterToOwnedLists When set to true, t or 1, will return just lists the authenticating user owns
 return: CursorLists
*/
type ListsMembershipsGetHandler func(context swagger.RequestContext, params *ListsMembershipsGetParams) swagger.Responder

func (it *ListsMembershipsGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.UserId, it.UserId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Cursor, it.Cursor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.FilterToOwnedLists, it.FilterToOwnedLists == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsMembershipsGetParams(binder swagger.RequestBinder) (*ListsMembershipsGetParams, error) {
	result := &ListsMembershipsGetParams{}

	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("cursor", "string", &result.Cursor); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("filter_to_owned_lists", "string", &result.FilterToOwnedLists); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsShowGetParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list being requested by a slug
	Slug *string
	// The screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The user ID of the user who owns the list being requested by a slug
	OwnerId *string
}

/*


Returns list of show
 param: ListId The numerical id of the list
 param: Slug You can identify a list being requested by a slug
 param: OwnerScreenName The screen name of the user who owns the list being requested by a slug
 param: OwnerId The user ID of the user who owns the list being requested by a slug
 return: Lists
*/
type ListsShowGetHandler func(context swagger.RequestContext, params *ListsShowGetParams) swagger.Responder

func (it *ListsShowGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsShowGetParams(binder swagger.RequestBinder) (*ListsShowGetParams, error) {
	result := &ListsShowGetParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsStatusesGetParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list by its slug instead of its numerical id
	Slug *string
	// The screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The user ID of the user who owns the list being requested by a slug
	OwnerId *string
	// Returns results with an ID greater than the sepcified ID
	SinceId *string
	// Returns results with an ID less than or equal to the specified ID
	MaxId *string
	// Specifies the number of results to retrieve per page
	Count *string
	// Entities are ON by default
	IncludeEntities *string
	// When set to either true, t or 1, the list timeline will contain native retweets in addition to the standard stream of tweets
	IncludeRts *string
}

/*


Returns a timeline of tweets authored by memebers of the specified list
 param: ListId The numerical id of the list
 param: Slug You can identify a list by its slug instead of its numerical id
 param: OwnerScreenName The screen name of the user who owns the list being requested by a slug
 param: OwnerId The user ID of the user who owns the list being requested by a slug
 param: SinceId Returns results with an ID greater than the sepcified ID
 param: MaxId Returns results with an ID less than or equal to the specified ID
 param: Count Specifies the number of results to retrieve per page
 param: IncludeEntities Entities are ON by default
 param: IncludeRts When set to either true, t or 1, the list timeline will contain native retweets in addition to the standard stream of tweets
 return: TweetsArray
*/
type ListsStatusesGetHandler func(context swagger.RequestContext, params *ListsStatusesGetParams) swagger.Responder

func (it *ListsStatusesGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SinceId, it.SinceId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.MaxId, it.MaxId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Count, it.Count == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeRts, it.IncludeRts == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsStatusesGetParams(binder swagger.RequestBinder) (*ListsStatusesGetParams, error) {
	result := &ListsStatusesGetParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("since_id", "string", &result.SinceId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("max_id", "string", &result.MaxId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("count", "string", &result.Count); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_rts", "string", &result.IncludeRts); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsSubscribersCreatePostParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list being requested by a slug
	Slug *string
	// the screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The user ID of the user who owns the list being requested by a slug
	OwnerId *string
}

/*


Subscribes the authenticated user to the specified list
 param: ListId The numerical id of the list
 param: Slug You can identify a list being requested by a slug
 param: OwnerScreenName the screen name of the user who owns the list being requested by a slug
 param: OwnerId The user ID of the user who owns the list being requested by a slug
 return: Lists
*/
type ListsSubscribersCreatePostHandler func(context swagger.RequestContext, params *ListsSubscribersCreatePostParams) swagger.Responder

func (it *ListsSubscribersCreatePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsSubscribersCreatePostParams(binder swagger.RequestBinder) (*ListsSubscribersCreatePostParams, error) {
	result := &ListsSubscribersCreatePostParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsSubscribersDestroyGetParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list being requested by a slug
	Slug *string
	// the screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The user ID of the user who owns the list being requested by a slug
	OwnerId *string
}

/*


Returns list of subscribers destroy
 param: ListId The numerical id of the list
 param: Slug You can identify a list being requested by a slug
 param: OwnerScreenName the screen name of the user who owns the list being requested by a slug
 param: OwnerId The user ID of the user who owns the list being requested by a slug
 return: void
*/
type ListsSubscribersDestroyGetHandler func(context swagger.RequestContext, params *ListsSubscribersDestroyGetParams) swagger.Responder

func (it *ListsSubscribersDestroyGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsSubscribersDestroyGetParams(binder swagger.RequestBinder) (*ListsSubscribersDestroyGetParams, error) {
	result := &ListsSubscribersDestroyGetParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsSubscribersGetParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list by its slug insted of its numerical id
	Slug *string
	// the screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The user ID of the user who owns the list being requested by a slug
	OwnerId *string
	// Breaks the results into pages
	Cursor *string
	// Wehn set to either true, t or 1
	IncludeEntities *string
	// When set to either true, t or 1
	SkipStatus *string
}

/*


Returns the subscribers of the specified list
 param: ListId The numerical id of the list
 param: Slug You can identify a list by its slug insted of its numerical id
 param: OwnerScreenName the screen name of the user who owns the list being requested by a slug
 param: OwnerId The user ID of the user who owns the list being requested by a slug
 param: Cursor Breaks the results into pages
 param: IncludeEntities Wehn set to either true, t or 1
 param: SkipStatus When set to either true, t or 1
 return: CursorLists
*/
type ListsSubscribersGetHandler func(context swagger.RequestContext, params *ListsSubscribersGetParams) swagger.Responder

func (it *ListsSubscribersGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Cursor, it.Cursor == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsSubscribersGetParams(binder swagger.RequestBinder) (*ListsSubscribersGetParams, error) {
	result := &ListsSubscribersGetParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("cursor", "string", &result.Cursor); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsSubscribersShowGetParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list being requested by a slug
	Slug *string
	// The screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The id of the user for whom to remove from the list
	UserId *string
	// The screen name of the user for whom to remove from the list
	ScreenName *string
	// The is of the user who wons the list being requested by a slug
	OwnerId *string
	// Wehn set to either true, t or 1
	IncludeEntities *string
	// When set to either true, t or 1
	SkipStatus *string
}

/*


Check if the specified user is a subscriber of the specified list
 param: ListId The numerical id of the list
 param: Slug You can identify a list being requested by a slug
 param: OwnerScreenName The screen name of the user who owns the list being requested by a slug
 param: UserId The id of the user for whom to remove from the list
 param: ScreenName The screen name of the user for whom to remove from the list
 param: OwnerId The is of the user who wons the list being requested by a slug
 param: IncludeEntities Wehn set to either true, t or 1
 param: SkipStatus When set to either true, t or 1
 return: Users
*/
type ListsSubscribersShowGetHandler func(context swagger.RequestContext, params *ListsSubscribersShowGetParams) swagger.Responder

func (it *ListsSubscribersShowGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsSubscribersShowGetParams(binder swagger.RequestBinder) (*ListsSubscribersShowGetParams, error) {
	result := &ListsSubscribersShowGetParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsSubscriptionsGetParams struct {
	// The screen name of the user
	ScreenName *string
	// The id of the user for whom to return results for
	UserId *string
	// The amount of results to return per page
	Count *string
	// Breaks the results into pages
	Cursor *string
}

/*


Returns list of subscriptions
 param: ScreenName The screen name of the user
 param: UserId The id of the user for whom to return results for
 param: Count The amount of results to return per page
 param: Cursor Breaks the results into pages
 return: CursorLists
*/
type ListsSubscriptionsGetHandler func(context swagger.RequestContext, params *ListsSubscriptionsGetParams) swagger.Responder

func (it *ListsSubscriptionsGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Count, it.Count == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Cursor, it.Cursor == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsSubscriptionsGetParams(binder swagger.RequestBinder) (*ListsSubscriptionsGetParams, error) {
	result := &ListsSubscriptionsGetParams{}

	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("count", "string", &result.Count); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("cursor", "string", &result.Cursor); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type ListsUpdatePostParams struct {
	// The numerical id of the list
	ListId *string
	// You can identify a list being requested by a slug
	Slug *string
	// The screen name of the user who owns the list being requested by a slug
	OwnerScreenName *string
	// The user ID of the user who owns the list being requested by a slug
	OwnerId *string
	// The name for the list
	Name *string
	// Whether your list is public or private
	Mode *string
	// The description to give the list
	Description *string
}

/*


Returns lists of updates
 param: ListId The numerical id of the list
 param: Slug You can identify a list being requested by a slug
 param: OwnerScreenName The screen name of the user who owns the list being requested by a slug
 param: OwnerId The user ID of the user who owns the list being requested by a slug
 param: Name The name for the list
 param: Mode Whether your list is public or private
 param: Description The description to give the list
 return: void
*/
type ListsUpdatePostHandler func(context swagger.RequestContext, params *ListsUpdatePostParams) swagger.Responder

func (it *ListsUpdatePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ListId, it.ListId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Slug, it.Slug == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerScreenName, it.OwnerScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.OwnerId, it.OwnerId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Name, it.Name == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Mode, it.Mode == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Description, it.Description == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewListsUpdatePostParams(binder swagger.RequestBinder) (*ListsUpdatePostParams, error) {
	result := &ListsUpdatePostParams{}

	if err := binder.BindQuery("list_id", "string", &result.ListId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("slug", "string", &result.Slug); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_screen_name", "string", &result.OwnerScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("owner_id", "string", &result.OwnerId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("name", "string", &result.Name); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("mode", "string", &result.Mode); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("description", "string", &result.Description); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type SavedSearchesCreatePostParams struct {
	// The query of the search the user would like to save
	Query *string
}

/*


Create a new saved search for the authenticated user
 param: Query The query of the search the user would like to save
 return: Query
*/
type SavedSearchesCreatePostHandler func(context swagger.RequestContext, params *SavedSearchesCreatePostParams) swagger.Responder

func (it *SavedSearchesCreatePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Query, it.Query == nil).Required(true).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewSavedSearchesCreatePostParams(binder swagger.RequestBinder) (*SavedSearchesCreatePostParams, error) {
	result := &SavedSearchesCreatePostParams{}

	if err := binder.BindQuery("query", "string", &result.Query); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type SavedSearchesDestroyIdPostParams struct {
	// The id of the saved search
	Id *string
}

/*


Destroy a saved search for the authenticating user
 param: Id The id of the saved search
 return: Query
*/
type SavedSearchesDestroyIdPostHandler func(context swagger.RequestContext, params *SavedSearchesDestroyIdPostParams) swagger.Responder

func (it *SavedSearchesDestroyIdPostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Id, it.Id == nil).Required(true).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewSavedSearchesDestroyIdPostParams(binder swagger.RequestBinder) (*SavedSearchesDestroyIdPostParams, error) {
	result := &SavedSearchesDestroyIdPostParams{}

	if err := binder.BindPath("id", "string", &result.Id); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type SavedSearchesListGetParams struct {
}

/*


Returns the authenticated user&#39;s saved search queries
 return: QueryArray
*/
type SavedSearchesListGetHandler func(context swagger.RequestContext, params *SavedSearchesListGetParams) swagger.Responder

func (it *SavedSearchesListGetParams) Valid(factory swagger.ValidatorFactory) bool {

	return true
}

// Bind from request
func NewSavedSearchesListGetParams(binder swagger.RequestBinder) (*SavedSearchesListGetParams, error) {
	result := &SavedSearchesListGetParams{}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type SavedSearchesShowIdGetParams struct {
	// The id of the saved search
	Id *string
}

/*


Retrieve the information for the saved search represented by the given id
 param: Id The id of the saved search
 return: Query
*/
type SavedSearchesShowIdGetHandler func(context swagger.RequestContext, params *SavedSearchesShowIdGetParams) swagger.Responder

func (it *SavedSearchesShowIdGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Id, it.Id == nil).Required(true).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewSavedSearchesShowIdGetParams(binder swagger.RequestBinder) (*SavedSearchesShowIdGetParams, error) {
	result := &SavedSearchesShowIdGetParams{}

	if err := binder.BindPath("id", "string", &result.Id); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type SearchTweetsGetParams struct {
	// URL-encoded search query of 500 characters max
	Q *string
	// returns tweets by users located within given radius
	Geocode *string
	// restricts tweets to a given language
	Lang *string
	// language of query you are sending
	Locale *string
	// specifies type of search results you prefer
	ResultType *string
	// number of tweets to return
	Count *string
	// returns tweets created before given date
	Until *string
	// return results with ID greater than specified
	SinceId *string
	// returns results with an ID less than/equal to specified ID
	MaxId *string
	// whether or not to include entities
	IncludeEntities *string
	// response will use the callback with given name
	Callback *string
}

/*


returns collection of relevant Tweets matching query
 param: Q URL-encoded search query of 500 characters max
 param: Geocode returns tweets by users located within given radius
 param: Lang restricts tweets to a given language
 param: Locale language of query you are sending
 param: ResultType specifies type of search results you prefer
 param: Count number of tweets to return
 param: Until returns tweets created before given date
 param: SinceId return results with ID greater than specified
 param: MaxId returns results with an ID less than/equal to specified ID
 param: IncludeEntities whether or not to include entities
 param: Callback response will use the callback with given name
 return: TweetsArray
*/
type SearchTweetsGetHandler func(context swagger.RequestContext, params *SearchTweetsGetParams) swagger.Responder

func (it *SearchTweetsGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Q, it.Q == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Geocode, it.Geocode == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Lang, it.Lang == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Locale, it.Locale == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ResultType, it.ResultType == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Count, it.Count == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Until, it.Until == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SinceId, it.SinceId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.MaxId, it.MaxId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Callback, it.Callback == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewSearchTweetsGetParams(binder swagger.RequestBinder) (*SearchTweetsGetParams, error) {
	result := &SearchTweetsGetParams{}

	if err := binder.BindQuery("q", "string", &result.Q); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("geocode", "string", &result.Geocode); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("lang", "string", &result.Lang); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("locale", "string", &result.Locale); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("result_type", "string", &result.ResultType); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("count", "string", &result.Count); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("until", "string", &result.Until); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("since_id", "string", &result.SinceId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("max_id", "string", &result.MaxId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("callback", "string", &result.Callback); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type StatusesDestroyIdPostParams struct {
	// The numerical ID of the desired status
	Id *string
	// When set to either true, t or 1, each tweet returned in a timeline will include a user object
	TrimUser *string
}

/*


Destroys the status specified by the required ID parameter
 param: Id The numerical ID of the desired status
 param: TrimUser When set to either true, t or 1, each tweet returned in a timeline will include a user object
 return: Tweets
*/
type StatusesDestroyIdPostHandler func(context swagger.RequestContext, params *StatusesDestroyIdPostParams) swagger.Responder

func (it *StatusesDestroyIdPostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Id, it.Id == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.TrimUser, it.TrimUser == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewStatusesDestroyIdPostParams(binder swagger.RequestBinder) (*StatusesDestroyIdPostParams, error) {
	result := &StatusesDestroyIdPostParams{}

	if err := binder.BindPath("id", "string", &result.Id); err != nil {
		return nil, err
	}

	if err := binder.BindQuery("trim_user", "string", &result.TrimUser); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type StatusesHomeTimelineGetParams struct {
	// Returns result with an ID greater than the specified ID
	SinceId *string
	// Returns results with an ID less than or equal to the specified ID
	MaxId *string
	// When set to either true, t or 1, each tweet returned in a timeline will include a user object
	TrimUser *string
	// This paramters will prevent from appearing in the returned timeline
	ExcludeReplies *bool
	// This paramters enhances the contributors element of the status response to include the screen_name of the contributor
	ContributorDetails *bool
}

/*


Returns a collection of the most recent Tweets
 param: SinceId Returns result with an ID greater than the specified ID
 param: MaxId Returns results with an ID less than or equal to the specified ID
 param: TrimUser When set to either true, t or 1, each tweet returned in a timeline will include a user object
 param: ExcludeReplies This paramters will prevent from appearing in the returned timeline
 param: ContributorDetails This paramters enhances the contributors element of the status response to include the screen_name of the contributor
 return: TweetsArray
*/
type StatusesHomeTimelineGetHandler func(context swagger.RequestContext, params *StatusesHomeTimelineGetParams) swagger.Responder

func (it *StatusesHomeTimelineGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.SinceId, it.SinceId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.MaxId, it.MaxId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.TrimUser, it.TrimUser == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ExcludeReplies, it.ExcludeReplies == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ContributorDetails, it.ContributorDetails == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewStatusesHomeTimelineGetParams(binder swagger.RequestBinder) (*StatusesHomeTimelineGetParams, error) {
	result := &StatusesHomeTimelineGetParams{}

	if err := binder.BindQuery("since_id", "string", &result.SinceId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("max_id", "string", &result.MaxId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("trim_user", "string", &result.TrimUser); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("exclude_replies", "bool", &result.ExcludeReplies); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("contributor_details", "bool", &result.ContributorDetails); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type StatusesMentionsTimelineGetParams struct {
	// Specifies the number of tweets to try and retrieve
	Count *string
	// Returns result with an ID greater than the specified ID
	SinceId *string
	// Returns results with an ID less than or equal to the specified ID
	MaxId *string
	// When set to either true, t or 1, each tweet returned in a timeline will include a user object
	TrimUser *string
	// This parameter enhances the contributors element of the status response
	ContributorDetails *string
	// The entities node will be disincluded when set to false
	IncludeEntities *string
}

/*


Returns the 20 most recent mentions for the authenticating user
 param: Count Specifies the number of tweets to try and retrieve
 param: SinceId Returns result with an ID greater than the specified ID
 param: MaxId Returns results with an ID less than or equal to the specified ID
 param: TrimUser When set to either true, t or 1, each tweet returned in a timeline will include a user object
 param: ContributorDetails This parameter enhances the contributors element of the status response
 param: IncludeEntities The entities node will be disincluded when set to false
 return: TweetsArray
*/
type StatusesMentionsTimelineGetHandler func(context swagger.RequestContext, params *StatusesMentionsTimelineGetParams) swagger.Responder

func (it *StatusesMentionsTimelineGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Count, it.Count == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SinceId, it.SinceId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.MaxId, it.MaxId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.TrimUser, it.TrimUser == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ContributorDetails, it.ContributorDetails == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewStatusesMentionsTimelineGetParams(binder swagger.RequestBinder) (*StatusesMentionsTimelineGetParams, error) {
	result := &StatusesMentionsTimelineGetParams{}

	if err := binder.BindQuery("count", "string", &result.Count); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("since_id", "string", &result.SinceId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("max_id", "string", &result.MaxId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("trim_user", "string", &result.TrimUser); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("contributor_details", "string", &result.ContributorDetails); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type StatusesOembedGetParams struct {
	// The tweet/status id to return embed code for
	Id *string
	// The encoded URL of the Tweet status to be embedded
	Url *string
	// The maximum width in pixels that the embed should be rendered at
	Maxwidth *string
	// Specifies whether the embedded tweet should automatically show the original message in the case that the embedded Tweet is a reply
	HideMedia *string
	// Specifies whether the embedded Tweet html should include a &#39;script&#39; element pointing to widgets.js
	HideThread *string
	// Specifies whether the embedded Tweet should be left aligned
	Align *string
	// A value for the TWT related parameters
	Related *string
	// Languages code for the rendered embed
	Lang *string
}

/*


Returns information allowing the creation of an embedded representation
 param: Id The tweet/status id to return embed code for
 param: Url The encoded URL of the Tweet status to be embedded
 param: Maxwidth The maximum width in pixels that the embed should be rendered at
 param: HideMedia Specifies whether the embedded tweet should automatically show the original message in the case that the embedded Tweet is a reply
 param: HideThread Specifies whether the embedded Tweet html should include a &#39;script&#39; element pointing to widgets.js
 param: Align Specifies whether the embedded Tweet should be left aligned
 param: Related A value for the TWT related parameters
 param: Lang Languages code for the rendered embed
 return: Tweets
*/
type StatusesOembedGetHandler func(context swagger.RequestContext, params *StatusesOembedGetParams) swagger.Responder

func (it *StatusesOembedGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Id, it.Id == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Url, it.Url == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Maxwidth, it.Maxwidth == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.HideMedia, it.HideMedia == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.HideThread, it.HideThread == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Align, it.Align == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Related, it.Related == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Lang, it.Lang == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewStatusesOembedGetParams(binder swagger.RequestBinder) (*StatusesOembedGetParams, error) {
	result := &StatusesOembedGetParams{}

	if err := binder.BindQuery("id", "string", &result.Id); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("url", "string", &result.Url); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("maxwidth", "string", &result.Maxwidth); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("hide_media", "string", &result.HideMedia); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("hide_thread", "string", &result.HideThread); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("align", "string", &result.Align); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("related", "string", &result.Related); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("lang", "string", &result.Lang); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type StatusesRetweetsIdGetParams struct {
	// The numerical ID of the desired status
	Id *string
	// Specifies the number of tweets to try and retrieve
	Count *string
	// When set to either true, t or 1, each tweet returned in a timeline will include a user object
	TrimUser *string
}

/*


Retruns a collection of the 100 most recent retweets of the tweet specified by the id
 param: Id The numerical ID of the desired status
 param: Count Specifies the number of tweets to try and retrieve
 param: TrimUser When set to either true, t or 1, each tweet returned in a timeline will include a user object
 return: TweetsArray
*/
type StatusesRetweetsIdGetHandler func(context swagger.RequestContext, params *StatusesRetweetsIdGetParams) swagger.Responder

func (it *StatusesRetweetsIdGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Id, it.Id == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Count, it.Count == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.TrimUser, it.TrimUser == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewStatusesRetweetsIdGetParams(binder swagger.RequestBinder) (*StatusesRetweetsIdGetParams, error) {
	result := &StatusesRetweetsIdGetParams{}

	if err := binder.BindPath("id", "string", &result.Id); err != nil {
		return nil, err
	}

	if err := binder.BindQuery("count", "string", &result.Count); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("trim_user", "string", &result.TrimUser); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type StatusesRetweetsIdPostParams struct {
	// The numerical ID of the desired status
	Id *string
	// When set to either true, t or 1, each tweet returned in a timeline will include a user object
	TrimUser *string
}

/*


Retweens a tweet
 param: Id The numerical ID of the desired status
 param: TrimUser When set to either true, t or 1, each tweet returned in a timeline will include a user object
 return: Tweets
*/
type StatusesRetweetsIdPostHandler func(context swagger.RequestContext, params *StatusesRetweetsIdPostParams) swagger.Responder

func (it *StatusesRetweetsIdPostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Id, it.Id == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.TrimUser, it.TrimUser == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewStatusesRetweetsIdPostParams(binder swagger.RequestBinder) (*StatusesRetweetsIdPostParams, error) {
	result := &StatusesRetweetsIdPostParams{}

	if err := binder.BindPath("id", "string", &result.Id); err != nil {
		return nil, err
	}

	if err := binder.BindQuery("trim_user", "string", &result.TrimUser); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type StatusesShowIdGetParams struct {
	// The numerical ID of the desired status
	Id *string
	// When set to either true, t or 1, any Tweets returned that have been retweeted by the authenticating
	IncludeMyRetweet *string
	// When set to either true, t or 1, each tweet returned in a timeline will include a user object
	TrimUser *string
	// The entities node will be disincluded when set to false
	IncludeEntities *string
}

/*


Retruns a single Tweet
 param: Id The numerical ID of the desired status
 param: IncludeMyRetweet When set to either true, t or 1, any Tweets returned that have been retweeted by the authenticating
 param: TrimUser When set to either true, t or 1, each tweet returned in a timeline will include a user object
 param: IncludeEntities The entities node will be disincluded when set to false
 return: Tweets
*/
type StatusesShowIdGetHandler func(context swagger.RequestContext, params *StatusesShowIdGetParams) swagger.Responder

func (it *StatusesShowIdGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Id, it.Id == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeMyRetweet, it.IncludeMyRetweet == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.TrimUser, it.TrimUser == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewStatusesShowIdGetParams(binder swagger.RequestBinder) (*StatusesShowIdGetParams, error) {
	result := &StatusesShowIdGetParams{}

	if err := binder.BindPath("id", "string", &result.Id); err != nil {
		return nil, err
	}

	if err := binder.BindQuery("trim_user", "string", &result.TrimUser); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_my_retweet", "string", &result.IncludeMyRetweet); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type StatusesUpdatePostParams struct {
	// The text of your status update
	Status *string
	// The ID of an existing status
	InReplyToStatusId *string
	// The latitude of the location
	Lat *string
	// The longitude of the location
	Long *string
	// A place in the world
	PlaceId *string
	// Whether or not to put a pin on the exact coordinates a tweet
	DisplayCoordinates *string
	// When set to either true, t or 1, each tweet returned in a timeline will include a user object
	TrimUser *string
}

/*


Updates the authenticating user&#39;s status
 param: Status The text of your status update
 param: InReplyToStatusId The ID of an existing status
 param: Lat The latitude of the location
 param: Long The longitude of the location
 param: PlaceId A place in the world
 param: DisplayCoordinates Whether or not to put a pin on the exact coordinates a tweet
 param: TrimUser When set to either true, t or 1, each tweet returned in a timeline will include a user object
 return: Tweets
*/
type StatusesUpdatePostHandler func(context swagger.RequestContext, params *StatusesUpdatePostParams) swagger.Responder

func (it *StatusesUpdatePostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Status, it.Status == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.InReplyToStatusId, it.InReplyToStatusId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Lat, it.Lat == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Long, it.Long == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.PlaceId, it.PlaceId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.DisplayCoordinates, it.DisplayCoordinates == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.TrimUser, it.TrimUser == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewStatusesUpdatePostParams(binder swagger.RequestBinder) (*StatusesUpdatePostParams, error) {
	result := &StatusesUpdatePostParams{}

	if err := binder.BindQuery("status", "string", &result.Status); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("in_reply_to_status_id", "string", &result.InReplyToStatusId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("lat", "string", &result.Lat); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("long", "string", &result.Long); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("place_id", "string", &result.PlaceId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("display_coordinates", "string", &result.DisplayCoordinates); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("trim_user", "string", &result.TrimUser); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type StatusesUserTimelineGetParams struct {
	// Specifies the number of tweets to try and retrieve
	Count *string
	// Returns result with an ID greater than the specified ID
	SinceId *string
	// Returns results with an ID less than or equal to the specified ID
	MaxId *string
	// When set to either true, t or 1, each tweet returned in a timeline will include a user object
	TrimUser *string
	// This paramters will prevent from appearing in the returned timeline
	ExcludeReplies *bool
	// This paramters enhances the contributors element of the status response to include the screen_name of the contributor
	ContributorDetails *bool
	// When set to false, the timeline will strip any native retweet
	IncludeRts *bool
}

/*


Returns a collection of the most recent Tweets posted by the User
 param: Count Specifies the number of tweets to try and retrieve
 param: SinceId Returns result with an ID greater than the specified ID
 param: MaxId Returns results with an ID less than or equal to the specified ID
 param: TrimUser When set to either true, t or 1, each tweet returned in a timeline will include a user object
 param: ExcludeReplies This paramters will prevent from appearing in the returned timeline
 param: ContributorDetails This paramters enhances the contributors element of the status response to include the screen_name of the contributor
 param: IncludeRts When set to false, the timeline will strip any native retweet
 return: TweetsArray
*/
type StatusesUserTimelineGetHandler func(context swagger.RequestContext, params *StatusesUserTimelineGetParams) swagger.Responder

func (it *StatusesUserTimelineGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Count, it.Count == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SinceId, it.SinceId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.MaxId, it.MaxId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.TrimUser, it.TrimUser == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ExcludeReplies, it.ExcludeReplies == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.ContributorDetails, it.ContributorDetails == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeRts, it.IncludeRts == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewStatusesUserTimelineGetParams(binder swagger.RequestBinder) (*StatusesUserTimelineGetParams, error) {
	result := &StatusesUserTimelineGetParams{}

	if err := binder.BindQuery("count", "string", &result.Count); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("since_id", "string", &result.SinceId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("max_id", "string", &result.MaxId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("trim_user", "string", &result.TrimUser); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("exclude_replies", "bool", &result.ExcludeReplies); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("contributor_details", "bool", &result.ContributorDetails); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_rts", "bool", &result.IncludeRts); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type TrendsAvailableGetParams struct {
}

/*


Returns the availability
 return: LocationArray
*/
type TrendsAvailableGetHandler func(context swagger.RequestContext, params *TrendsAvailableGetParams) swagger.Responder

func (it *TrendsAvailableGetParams) Valid(factory swagger.ValidatorFactory) bool {

	return true
}

// Bind from request
func NewTrendsAvailableGetParams(binder swagger.RequestBinder) (*TrendsAvailableGetParams, error) {
	result := &TrendsAvailableGetParams{}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type TrendsClosestGetParams struct {
	// If provided with a long parameter the available trend locations wil be stored by distance
	Lat *string
	// If provided with a lat parameters the available trend locations will be sorted by distance
	Long *string
}

/*


Returns the location that Twitter has trending topic information for
 param: Lat If provided with a long parameter the available trend locations wil be stored by distance
 param: Long If provided with a lat parameters the available trend locations will be sorted by distance
 return: LocationArray
*/
type TrendsClosestGetHandler func(context swagger.RequestContext, params *TrendsClosestGetParams) swagger.Responder

func (it *TrendsClosestGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Lat, it.Lat == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Long, it.Long == nil).Required(true).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewTrendsClosestGetParams(binder swagger.RequestBinder) (*TrendsClosestGetParams, error) {
	result := &TrendsClosestGetParams{}

	if err := binder.BindQuery("lat", "string", &result.Lat); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("long", "string", &result.Long); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type TrendsPlaceGetParams struct {
	// The yahoo where on earch id
	Id *string
	// Setting this equal to hashtages will remove all hashtages from the trends list
	Exclude *string
}

/*


Returns the top 10 trending topics for a specific WOEID
 param: Id The yahoo where on earch id
 param: Exclude Setting this equal to hashtages will remove all hashtages from the trends list
 return: TrendInfo
*/
type TrendsPlaceGetHandler func(context swagger.RequestContext, params *TrendsPlaceGetParams) swagger.Responder

func (it *TrendsPlaceGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Id, it.Id == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Exclude, it.Exclude == nil).Required(true).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewTrendsPlaceGetParams(binder swagger.RequestBinder) (*TrendsPlaceGetParams, error) {
	result := &TrendsPlaceGetParams{}

	if err := binder.BindQuery("id", "string", &result.Id); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("exclude", "string", &result.Exclude); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type UsersContributeesGetParams struct {
	// screen name of user that is contributed to
	ScreenName *string
	// ID of user to that is contributed to
	UserId *string
	// whether or not to include entities
	IncludeEntities *string
	// whether or not to skip statuses
	SkipStatus *string
}

/*
collection of users specified user can contribute to

collection of users specified user can contribute to
 param: ScreenName screen name of user that is contributed to
 param: UserId ID of user to that is contributed to
 param: IncludeEntities whether or not to include entities
 param: SkipStatus whether or not to skip statuses
 return: UsersArray
*/
type UsersContributeesGetHandler func(context swagger.RequestContext, params *UsersContributeesGetParams) swagger.Responder

func (it *UsersContributeesGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewUsersContributeesGetParams(binder swagger.RequestBinder) (*UsersContributeesGetParams, error) {
	result := &UsersContributeesGetParams{}

	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type UsersContributorsGetParams struct {
	// screen name of user contributing
	ScreenName *string
	// ID of user contributing
	UserId *string
	// whether or not to include entities
	IncludeEntities *string
	// whether or not to skip statuses
	SkipStatus *string
}

/*
collection of users that can contribute to specified account

collection of users that can contribute to specified account
 param: ScreenName screen name of user contributing
 param: UserId ID of user contributing
 param: IncludeEntities whether or not to include entities
 param: SkipStatus whether or not to skip statuses
 return: UsersArray
*/
type UsersContributorsGetHandler func(context swagger.RequestContext, params *UsersContributorsGetParams) swagger.Responder

func (it *UsersContributorsGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.SkipStatus, it.SkipStatus == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewUsersContributorsGetParams(binder swagger.RequestBinder) (*UsersContributorsGetParams, error) {
	result := &UsersContributorsGetParams{}

	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("skip_status", "string", &result.SkipStatus); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type UsersLookupGetParams struct {
	// screen name of user to lookup
	ScreenName *string
	// ID of user to lookup
	UserId *string
	// whether or not to include entities
	IncludeEntities *string
}

/*
returns fully-hydrated user objects up to 100

returns fully-hydrated user objects up to 100
 param: ScreenName screen name of user to lookup
 param: UserId ID of user to lookup
 param: IncludeEntities whether or not to include entities
 return: UsersArray
*/
type UsersLookupGetHandler func(context swagger.RequestContext, params *UsersLookupGetParams) swagger.Responder

func (it *UsersLookupGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewUsersLookupGetParams(binder swagger.RequestBinder) (*UsersLookupGetParams, error) {
	result := &UsersLookupGetParams{}

	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type UsersReportSpamPostParams struct {
	// The ID or screen_name of the user you want to report as a spammer
	ScreenName *string
	// The ID of the user you want to report as a spammer
	UserId *string
}

/*


Returna users report spam
 param: ScreenName The ID or screen_name of the user you want to report as a spammer
 param: UserId The ID of the user you want to report as a spammer
 return: Users
*/
type UsersReportSpamPostHandler func(context swagger.RequestContext, params *UsersReportSpamPostParams) swagger.Responder

func (it *UsersReportSpamPostParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewUsersReportSpamPostParams(binder swagger.RequestBinder) (*UsersReportSpamPostParams, error) {
	result := &UsersReportSpamPostParams{}

	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type UsersSearchGetParams struct {
	// the search query to run against people search
	Q *string
	// specifies the page of results to receive
	Page *string
	// number of people to return per page
	Count *string
	// whether or not to include entities
	IncludeEntities *string
}

/*
simple relevance-based user search

simple relevance-based user search
 param: Q the search query to run against people search
 param: Page specifies the page of results to receive
 param: Count number of people to return per page
 param: IncludeEntities whether or not to include entities
 return: UsersArray
*/
type UsersSearchGetHandler func(context swagger.RequestContext, params *UsersSearchGetParams) swagger.Responder

func (it *UsersSearchGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.Q, it.Q == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Page, it.Page == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.Count, it.Count == nil).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewUsersSearchGetParams(binder swagger.RequestBinder) (*UsersSearchGetParams, error) {
	result := &UsersSearchGetParams{}

	if err := binder.BindQuery("q", "string", &result.Q); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("page", "string", &result.Page); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("count", "string", &result.Count); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type UsersShowGetParams struct {
	// screen name of user to be shown
	ScreenName *string
	// ID of user to be shown
	UserId *string
	// whether or not to include entities
	IncludeEntities *string
}

/*
returns a variety of info about specified user

returns a variety of info about specified user
 param: ScreenName screen name of user to be shown
 param: UserId ID of user to be shown
 param: IncludeEntities whether or not to include entities
 return: Users
*/
type UsersShowGetHandler func(context swagger.RequestContext, params *UsersShowGetParams) swagger.Responder

func (it *UsersShowGetParams) Valid(factory swagger.ValidatorFactory) bool {
	if !factory.NewValidator(it.ScreenName, it.ScreenName == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.UserId, it.UserId == nil).Required(true).
		Valid(factory) {
		return false
	}
	if !factory.NewValidator(it.IncludeEntities, it.IncludeEntities == nil).
		Valid(factory) {
		return false
	}

	return true
}

// Bind from request
func NewUsersShowGetParams(binder swagger.RequestBinder) (*UsersShowGetParams, error) {
	result := &UsersShowGetParams{}

	if err := binder.BindQuery("screen_name", "string", &result.ScreenName); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("user_id", "string", &result.UserId); err != nil {
		return nil, err
	}
	if err := binder.BindQuery("include_entities", "string", &result.IncludeEntities); err != nil {
		return nil, err
	}

	if !result.Valid(binder) {
		return nil, errors.New(400 /* Bad Request */, "Parameter validate error")
	}

	return result, nil
}

type DefaultApiController struct {
	AccountSettingsGet swagger.HandleRequest

	AccountSettingsPost swagger.HandleRequest

	AccountUpdateDeliveryDevicePost swagger.HandleRequest

	AccountUpdateProfileBackgroundImagePost swagger.HandleRequest

	AccountUpdateProfileColorsPost swagger.HandleRequest

	AccountUpdateProfileImagePost swagger.HandleRequest

	AccountUpdateProfilePost swagger.HandleRequest

	ApplicationRateLimitStatusGet swagger.HandleRequest

	BlocksCreatePost swagger.HandleRequest

	BlocksDestroyPost swagger.HandleRequest

	BlocksIdsGet swagger.HandleRequest

	BlocksListGet swagger.HandleRequest

	DirectMessagesDestroyPost swagger.HandleRequest

	DirectMessagesGet swagger.HandleRequest

	DirectMessagesNewPost swagger.HandleRequest

	DirectMessagesSentGet swagger.HandleRequest

	DirectMessagesShowGet swagger.HandleRequest

	FollowersIdsGet swagger.HandleRequest

	FriendsIdsGet swagger.HandleRequest

	FriendshipsCreatePost swagger.HandleRequest

	FriendshipsDestroyPost swagger.HandleRequest

	FriendshipsIncomingGet swagger.HandleRequest

	FriendshipsOutgoingGet swagger.HandleRequest

	FriendshipsShowGet swagger.HandleRequest

	FriendshipsUpdatePost swagger.HandleRequest

	GeoIdPlaceIdGet swagger.HandleRequest

	GeoPlacesGet swagger.HandleRequest

	GeoReverseGeoncodeGet swagger.HandleRequest

	GeoSearchGet swagger.HandleRequest

	GeoSimilarPlacesGet swagger.HandleRequest

	HelpConfigurationGet swagger.HandleRequest

	HelpLanguagesGet swagger.HandleRequest

	HelpPrivacyGet swagger.HandleRequest

	HelpTosGet swagger.HandleRequest

	ListMembersCreatePost swagger.HandleRequest

	ListMembersDestroyAllGet swagger.HandleRequest

	ListMembersGet swagger.HandleRequest

	ListMembersShowGet swagger.HandleRequest

	ListsCreatePost swagger.HandleRequest

	ListsDestroyPost swagger.HandleRequest

	ListsListGet swagger.HandleRequest

	ListsMembersCreateAllGet swagger.HandleRequest

	ListsMembersDestroyGet swagger.HandleRequest

	ListsMembershipsGet swagger.HandleRequest

	ListsShowGet swagger.HandleRequest

	ListsStatusesGet swagger.HandleRequest

	ListsSubscribersCreatePost swagger.HandleRequest

	ListsSubscribersDestroyGet swagger.HandleRequest

	ListsSubscribersGet swagger.HandleRequest

	ListsSubscribersShowGet swagger.HandleRequest

	ListsSubscriptionsGet swagger.HandleRequest

	ListsUpdatePost swagger.HandleRequest

	SavedSearchesCreatePost swagger.HandleRequest

	SavedSearchesDestroyIdPost swagger.HandleRequest

	SavedSearchesListGet swagger.HandleRequest

	SavedSearchesShowIdGet swagger.HandleRequest

	SearchTweetsGet swagger.HandleRequest

	StatusesDestroyIdPost swagger.HandleRequest

	StatusesHomeTimelineGet swagger.HandleRequest

	StatusesMentionsTimelineGet swagger.HandleRequest

	StatusesOembedGet swagger.HandleRequest

	StatusesRetweetsIdGet swagger.HandleRequest

	StatusesRetweetsIdPost swagger.HandleRequest

	StatusesShowIdGet swagger.HandleRequest

	StatusesUpdatePost swagger.HandleRequest

	StatusesUserTimelineGet swagger.HandleRequest

	TrendsAvailableGet swagger.HandleRequest

	TrendsClosestGet swagger.HandleRequest

	TrendsPlaceGet swagger.HandleRequest

	UsersContributeesGet swagger.HandleRequest

	UsersContributorsGet swagger.HandleRequest

	UsersLookupGet swagger.HandleRequest

	UsersReportSpamPost swagger.HandleRequest

	UsersSearchGet swagger.HandleRequest

	UsersShowGet swagger.HandleRequest
}

func NewDefaultApiController() *DefaultApiController {
	result := &DefaultApiController{}

	result.AccountSettingsGet.Path = "/1.1/account/settings"
	result.AccountSettingsGet.Method = strings.ToUpper("Get")
	result.HandleAccountSettingsGet(func(context swagger.RequestContext, params *AccountSettingsGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl AccountSettingsGet"))
	})

	result.AccountSettingsPost.Path = "/1.1/account/settings"
	result.AccountSettingsPost.Method = strings.ToUpper("Post")
	result.HandleAccountSettingsPost(func(context swagger.RequestContext, params *AccountSettingsPostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl AccountSettingsPost"))
	})

	result.AccountUpdateDeliveryDevicePost.Path = "/1.1/account/update_delivery_device"
	result.AccountUpdateDeliveryDevicePost.Method = strings.ToUpper("Post")
	result.HandleAccountUpdateDeliveryDevicePost(func(context swagger.RequestContext, params *AccountUpdateDeliveryDevicePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl AccountUpdateDeliveryDevicePost"))
	})

	result.AccountUpdateProfileBackgroundImagePost.Path = "/1.1/account/update_profile_background_image"
	result.AccountUpdateProfileBackgroundImagePost.Method = strings.ToUpper("Post")
	result.HandleAccountUpdateProfileBackgroundImagePost(func(context swagger.RequestContext, params *AccountUpdateProfileBackgroundImagePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl AccountUpdateProfileBackgroundImagePost"))
	})

	result.AccountUpdateProfileColorsPost.Path = "/1.1/account/update_profile_colors"
	result.AccountUpdateProfileColorsPost.Method = strings.ToUpper("Post")
	result.HandleAccountUpdateProfileColorsPost(func(context swagger.RequestContext, params *AccountUpdateProfileColorsPostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl AccountUpdateProfileColorsPost"))
	})

	result.AccountUpdateProfileImagePost.Path = "/1.1/account/update_profile_image"
	result.AccountUpdateProfileImagePost.Method = strings.ToUpper("Post")
	result.HandleAccountUpdateProfileImagePost(func(context swagger.RequestContext, params *AccountUpdateProfileImagePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl AccountUpdateProfileImagePost"))
	})

	result.AccountUpdateProfilePost.Path = "/1.1/account/update_profile"
	result.AccountUpdateProfilePost.Method = strings.ToUpper("Post")
	result.HandleAccountUpdateProfilePost(func(context swagger.RequestContext, params *AccountUpdateProfilePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl AccountUpdateProfilePost"))
	})

	result.ApplicationRateLimitStatusGet.Path = "/1.1/application/rate_limit_status"
	result.ApplicationRateLimitStatusGet.Method = strings.ToUpper("Get")
	result.HandleApplicationRateLimitStatusGet(func(context swagger.RequestContext, params *ApplicationRateLimitStatusGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ApplicationRateLimitStatusGet"))
	})

	result.BlocksCreatePost.Path = "/1.1/blocks/create"
	result.BlocksCreatePost.Method = strings.ToUpper("Post")
	result.HandleBlocksCreatePost(func(context swagger.RequestContext, params *BlocksCreatePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl BlocksCreatePost"))
	})

	result.BlocksDestroyPost.Path = "/1.1/blocks/destroy"
	result.BlocksDestroyPost.Method = strings.ToUpper("Post")
	result.HandleBlocksDestroyPost(func(context swagger.RequestContext, params *BlocksDestroyPostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl BlocksDestroyPost"))
	})

	result.BlocksIdsGet.Path = "/1.1/blocks/ids"
	result.BlocksIdsGet.Method = strings.ToUpper("Get")
	result.HandleBlocksIdsGet(func(context swagger.RequestContext, params *BlocksIdsGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl BlocksIdsGet"))
	})

	result.BlocksListGet.Path = "/1.1/blocks/list"
	result.BlocksListGet.Method = strings.ToUpper("Get")
	result.HandleBlocksListGet(func(context swagger.RequestContext, params *BlocksListGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl BlocksListGet"))
	})

	result.DirectMessagesDestroyPost.Path = "/1.1/direct_messages/destroy"
	result.DirectMessagesDestroyPost.Method = strings.ToUpper("Post")
	result.HandleDirectMessagesDestroyPost(func(context swagger.RequestContext, params *DirectMessagesDestroyPostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl DirectMessagesDestroyPost"))
	})

	result.DirectMessagesGet.Path = "/1.1/direct_messages"
	result.DirectMessagesGet.Method = strings.ToUpper("Get")
	result.HandleDirectMessagesGet(func(context swagger.RequestContext, params *DirectMessagesGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl DirectMessagesGet"))
	})

	result.DirectMessagesNewPost.Path = "/1.1/direct_messages/new"
	result.DirectMessagesNewPost.Method = strings.ToUpper("Post")
	result.HandleDirectMessagesNewPost(func(context swagger.RequestContext, params *DirectMessagesNewPostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl DirectMessagesNewPost"))
	})

	result.DirectMessagesSentGet.Path = "/1.1/direct_messages/sent"
	result.DirectMessagesSentGet.Method = strings.ToUpper("Get")
	result.HandleDirectMessagesSentGet(func(context swagger.RequestContext, params *DirectMessagesSentGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl DirectMessagesSentGet"))
	})

	result.DirectMessagesShowGet.Path = "/1.1/direct_messages/show"
	result.DirectMessagesShowGet.Method = strings.ToUpper("Get")
	result.HandleDirectMessagesShowGet(func(context swagger.RequestContext, params *DirectMessagesShowGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl DirectMessagesShowGet"))
	})

	result.FollowersIdsGet.Path = "/1.1/followers/ids"
	result.FollowersIdsGet.Method = strings.ToUpper("Get")
	result.HandleFollowersIdsGet(func(context swagger.RequestContext, params *FollowersIdsGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl FollowersIdsGet"))
	})

	result.FriendsIdsGet.Path = "/1.1/friends/ids"
	result.FriendsIdsGet.Method = strings.ToUpper("Get")
	result.HandleFriendsIdsGet(func(context swagger.RequestContext, params *FriendsIdsGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl FriendsIdsGet"))
	})

	result.FriendshipsCreatePost.Path = "/1.1/friendships/create"
	result.FriendshipsCreatePost.Method = strings.ToUpper("Post")
	result.HandleFriendshipsCreatePost(func(context swagger.RequestContext, params *FriendshipsCreatePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl FriendshipsCreatePost"))
	})

	result.FriendshipsDestroyPost.Path = "/1.1/friendships/destroy"
	result.FriendshipsDestroyPost.Method = strings.ToUpper("Post")
	result.HandleFriendshipsDestroyPost(func(context swagger.RequestContext, params *FriendshipsDestroyPostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl FriendshipsDestroyPost"))
	})

	result.FriendshipsIncomingGet.Path = "/1.1/friendships/incoming"
	result.FriendshipsIncomingGet.Method = strings.ToUpper("Get")
	result.HandleFriendshipsIncomingGet(func(context swagger.RequestContext, params *FriendshipsIncomingGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl FriendshipsIncomingGet"))
	})

	result.FriendshipsOutgoingGet.Path = "/1.1/friendships/outgoing"
	result.FriendshipsOutgoingGet.Method = strings.ToUpper("Get")
	result.HandleFriendshipsOutgoingGet(func(context swagger.RequestContext, params *FriendshipsOutgoingGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl FriendshipsOutgoingGet"))
	})

	result.FriendshipsShowGet.Path = "/1.1/friendships/show"
	result.FriendshipsShowGet.Method = strings.ToUpper("Get")
	result.HandleFriendshipsShowGet(func(context swagger.RequestContext, params *FriendshipsShowGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl FriendshipsShowGet"))
	})

	result.FriendshipsUpdatePost.Path = "/1.1/friendships/update"
	result.FriendshipsUpdatePost.Method = strings.ToUpper("Post")
	result.HandleFriendshipsUpdatePost(func(context swagger.RequestContext, params *FriendshipsUpdatePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl FriendshipsUpdatePost"))
	})

	result.GeoIdPlaceIdGet.Path = "/1.1/geo/id/{place_id}"
	result.GeoIdPlaceIdGet.Method = strings.ToUpper("Get")
	result.HandleGeoIdPlaceIdGet(func(context swagger.RequestContext, params *GeoIdPlaceIdGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl GeoIdPlaceIdGet"))
	})

	result.GeoPlacesGet.Path = "/1.1/geo/places"
	result.GeoPlacesGet.Method = strings.ToUpper("Get")
	result.HandleGeoPlacesGet(func(context swagger.RequestContext, params *GeoPlacesGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl GeoPlacesGet"))
	})

	result.GeoReverseGeoncodeGet.Path = "/1.1/geo/reverse_geoncode"
	result.GeoReverseGeoncodeGet.Method = strings.ToUpper("Get")
	result.HandleGeoReverseGeoncodeGet(func(context swagger.RequestContext, params *GeoReverseGeoncodeGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl GeoReverseGeoncodeGet"))
	})

	result.GeoSearchGet.Path = "/1.1/geo/search"
	result.GeoSearchGet.Method = strings.ToUpper("Get")
	result.HandleGeoSearchGet(func(context swagger.RequestContext, params *GeoSearchGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl GeoSearchGet"))
	})

	result.GeoSimilarPlacesGet.Path = "/1.1/geo/similar_places"
	result.GeoSimilarPlacesGet.Method = strings.ToUpper("Get")
	result.HandleGeoSimilarPlacesGet(func(context swagger.RequestContext, params *GeoSimilarPlacesGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl GeoSimilarPlacesGet"))
	})

	result.HelpConfigurationGet.Path = "/1.1/help/configuration"
	result.HelpConfigurationGet.Method = strings.ToUpper("Get")
	result.HandleHelpConfigurationGet(func(context swagger.RequestContext, params *HelpConfigurationGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl HelpConfigurationGet"))
	})

	result.HelpLanguagesGet.Path = "/1.1/help/languages"
	result.HelpLanguagesGet.Method = strings.ToUpper("Get")
	result.HandleHelpLanguagesGet(func(context swagger.RequestContext, params *HelpLanguagesGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl HelpLanguagesGet"))
	})

	result.HelpPrivacyGet.Path = "/1.1/help/privacy"
	result.HelpPrivacyGet.Method = strings.ToUpper("Get")
	result.HandleHelpPrivacyGet(func(context swagger.RequestContext, params *HelpPrivacyGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl HelpPrivacyGet"))
	})

	result.HelpTosGet.Path = "/1.1/help/tos"
	result.HelpTosGet.Method = strings.ToUpper("Get")
	result.HandleHelpTosGet(func(context swagger.RequestContext, params *HelpTosGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl HelpTosGet"))
	})

	result.ListMembersCreatePost.Path = "/1.1/list/members/create"
	result.ListMembersCreatePost.Method = strings.ToUpper("Post")
	result.HandleListMembersCreatePost(func(context swagger.RequestContext, params *ListMembersCreatePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListMembersCreatePost"))
	})

	result.ListMembersDestroyAllGet.Path = "/1.1/list/members/destroy_all"
	result.ListMembersDestroyAllGet.Method = strings.ToUpper("Get")
	result.HandleListMembersDestroyAllGet(func(context swagger.RequestContext, params *ListMembersDestroyAllGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListMembersDestroyAllGet"))
	})

	result.ListMembersGet.Path = "/1.1/list/members"
	result.ListMembersGet.Method = strings.ToUpper("Get")
	result.HandleListMembersGet(func(context swagger.RequestContext, params *ListMembersGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListMembersGet"))
	})

	result.ListMembersShowGet.Path = "/1.1/list/members/show"
	result.ListMembersShowGet.Method = strings.ToUpper("Get")
	result.HandleListMembersShowGet(func(context swagger.RequestContext, params *ListMembersShowGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListMembersShowGet"))
	})

	result.ListsCreatePost.Path = "/1.1/lists/create"
	result.ListsCreatePost.Method = strings.ToUpper("Post")
	result.HandleListsCreatePost(func(context swagger.RequestContext, params *ListsCreatePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsCreatePost"))
	})

	result.ListsDestroyPost.Path = "/1.1/lists/destroy"
	result.ListsDestroyPost.Method = strings.ToUpper("Post")
	result.HandleListsDestroyPost(func(context swagger.RequestContext, params *ListsDestroyPostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsDestroyPost"))
	})

	result.ListsListGet.Path = "/1.1/lists/list"
	result.ListsListGet.Method = strings.ToUpper("Get")
	result.HandleListsListGet(func(context swagger.RequestContext, params *ListsListGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsListGet"))
	})

	result.ListsMembersCreateAllGet.Path = "/1.1/lists/members/create_all"
	result.ListsMembersCreateAllGet.Method = strings.ToUpper("Get")
	result.HandleListsMembersCreateAllGet(func(context swagger.RequestContext, params *ListsMembersCreateAllGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsMembersCreateAllGet"))
	})

	result.ListsMembersDestroyGet.Path = "/1.1/lists/members/destroy"
	result.ListsMembersDestroyGet.Method = strings.ToUpper("Get")
	result.HandleListsMembersDestroyGet(func(context swagger.RequestContext, params *ListsMembersDestroyGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsMembersDestroyGet"))
	})

	result.ListsMembershipsGet.Path = "/1.1/lists/memberships"
	result.ListsMembershipsGet.Method = strings.ToUpper("Get")
	result.HandleListsMembershipsGet(func(context swagger.RequestContext, params *ListsMembershipsGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsMembershipsGet"))
	})

	result.ListsShowGet.Path = "/1.1/lists/show"
	result.ListsShowGet.Method = strings.ToUpper("Get")
	result.HandleListsShowGet(func(context swagger.RequestContext, params *ListsShowGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsShowGet"))
	})

	result.ListsStatusesGet.Path = "/1.1/lists/statuses"
	result.ListsStatusesGet.Method = strings.ToUpper("Get")
	result.HandleListsStatusesGet(func(context swagger.RequestContext, params *ListsStatusesGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsStatusesGet"))
	})

	result.ListsSubscribersCreatePost.Path = "/1.1/lists/subscribers/create"
	result.ListsSubscribersCreatePost.Method = strings.ToUpper("Post")
	result.HandleListsSubscribersCreatePost(func(context swagger.RequestContext, params *ListsSubscribersCreatePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsSubscribersCreatePost"))
	})

	result.ListsSubscribersDestroyGet.Path = "/1.1/lists/subscribers/destroy"
	result.ListsSubscribersDestroyGet.Method = strings.ToUpper("Get")
	result.HandleListsSubscribersDestroyGet(func(context swagger.RequestContext, params *ListsSubscribersDestroyGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsSubscribersDestroyGet"))
	})

	result.ListsSubscribersGet.Path = "/1.1/lists/subscribers"
	result.ListsSubscribersGet.Method = strings.ToUpper("Get")
	result.HandleListsSubscribersGet(func(context swagger.RequestContext, params *ListsSubscribersGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsSubscribersGet"))
	})

	result.ListsSubscribersShowGet.Path = "/1.1/lists/subscribers/show"
	result.ListsSubscribersShowGet.Method = strings.ToUpper("Get")
	result.HandleListsSubscribersShowGet(func(context swagger.RequestContext, params *ListsSubscribersShowGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsSubscribersShowGet"))
	})

	result.ListsSubscriptionsGet.Path = "/1.1/lists/subscriptions"
	result.ListsSubscriptionsGet.Method = strings.ToUpper("Get")
	result.HandleListsSubscriptionsGet(func(context swagger.RequestContext, params *ListsSubscriptionsGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsSubscriptionsGet"))
	})

	result.ListsUpdatePost.Path = "/1.1/lists/update"
	result.ListsUpdatePost.Method = strings.ToUpper("Post")
	result.HandleListsUpdatePost(func(context swagger.RequestContext, params *ListsUpdatePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl ListsUpdatePost"))
	})

	result.SavedSearchesCreatePost.Path = "/1.1/saved_searches/create"
	result.SavedSearchesCreatePost.Method = strings.ToUpper("Post")
	result.HandleSavedSearchesCreatePost(func(context swagger.RequestContext, params *SavedSearchesCreatePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl SavedSearchesCreatePost"))
	})

	result.SavedSearchesDestroyIdPost.Path = "/1.1/saved_searches/destroy/{id}"
	result.SavedSearchesDestroyIdPost.Method = strings.ToUpper("Post")
	result.HandleSavedSearchesDestroyIdPost(func(context swagger.RequestContext, params *SavedSearchesDestroyIdPostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl SavedSearchesDestroyIdPost"))
	})

	result.SavedSearchesListGet.Path = "/1.1/saved_searches/list"
	result.SavedSearchesListGet.Method = strings.ToUpper("Get")
	result.HandleSavedSearchesListGet(func(context swagger.RequestContext, params *SavedSearchesListGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl SavedSearchesListGet"))
	})

	result.SavedSearchesShowIdGet.Path = "/1.1/saved_searches/show/{id}"
	result.SavedSearchesShowIdGet.Method = strings.ToUpper("Get")
	result.HandleSavedSearchesShowIdGet(func(context swagger.RequestContext, params *SavedSearchesShowIdGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl SavedSearchesShowIdGet"))
	})

	result.SearchTweetsGet.Path = "/1.1/search/tweets"
	result.SearchTweetsGet.Method = strings.ToUpper("Get")
	result.HandleSearchTweetsGet(func(context swagger.RequestContext, params *SearchTweetsGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl SearchTweetsGet"))
	})

	result.StatusesDestroyIdPost.Path = "/1.1/statuses/destroy/{id}"
	result.StatusesDestroyIdPost.Method = strings.ToUpper("Post")
	result.HandleStatusesDestroyIdPost(func(context swagger.RequestContext, params *StatusesDestroyIdPostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl StatusesDestroyIdPost"))
	})

	result.StatusesHomeTimelineGet.Path = "/1.1/statuses/home_timeline"
	result.StatusesHomeTimelineGet.Method = strings.ToUpper("Get")
	result.HandleStatusesHomeTimelineGet(func(context swagger.RequestContext, params *StatusesHomeTimelineGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl StatusesHomeTimelineGet"))
	})

	result.StatusesMentionsTimelineGet.Path = "/1.1/statuses/mentions_timeline"
	result.StatusesMentionsTimelineGet.Method = strings.ToUpper("Get")
	result.HandleStatusesMentionsTimelineGet(func(context swagger.RequestContext, params *StatusesMentionsTimelineGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl StatusesMentionsTimelineGet"))
	})

	result.StatusesOembedGet.Path = "/1.1/statuses/oembed"
	result.StatusesOembedGet.Method = strings.ToUpper("Get")
	result.HandleStatusesOembedGet(func(context swagger.RequestContext, params *StatusesOembedGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl StatusesOembedGet"))
	})

	result.StatusesRetweetsIdGet.Path = "/1.1/statuses/retweets/{id}"
	result.StatusesRetweetsIdGet.Method = strings.ToUpper("Get")
	result.HandleStatusesRetweetsIdGet(func(context swagger.RequestContext, params *StatusesRetweetsIdGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl StatusesRetweetsIdGet"))
	})

	result.StatusesRetweetsIdPost.Path = "/1.1/statuses/retweets/{id}"
	result.StatusesRetweetsIdPost.Method = strings.ToUpper("Post")
	result.HandleStatusesRetweetsIdPost(func(context swagger.RequestContext, params *StatusesRetweetsIdPostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl StatusesRetweetsIdPost"))
	})

	result.StatusesShowIdGet.Path = "/1.1/statuses/show/{id}"
	result.StatusesShowIdGet.Method = strings.ToUpper("Get")
	result.HandleStatusesShowIdGet(func(context swagger.RequestContext, params *StatusesShowIdGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl StatusesShowIdGet"))
	})

	result.StatusesUpdatePost.Path = "/1.1/statuses/update"
	result.StatusesUpdatePost.Method = strings.ToUpper("Post")
	result.HandleStatusesUpdatePost(func(context swagger.RequestContext, params *StatusesUpdatePostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl StatusesUpdatePost"))
	})

	result.StatusesUserTimelineGet.Path = "/1.1/statuses/user_timeline"
	result.StatusesUserTimelineGet.Method = strings.ToUpper("Get")
	result.HandleStatusesUserTimelineGet(func(context swagger.RequestContext, params *StatusesUserTimelineGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl StatusesUserTimelineGet"))
	})

	result.TrendsAvailableGet.Path = "/1.1/trends/available"
	result.TrendsAvailableGet.Method = strings.ToUpper("Get")
	result.HandleTrendsAvailableGet(func(context swagger.RequestContext, params *TrendsAvailableGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl TrendsAvailableGet"))
	})

	result.TrendsClosestGet.Path = "/1.1/trends/closest"
	result.TrendsClosestGet.Method = strings.ToUpper("Get")
	result.HandleTrendsClosestGet(func(context swagger.RequestContext, params *TrendsClosestGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl TrendsClosestGet"))
	})

	result.TrendsPlaceGet.Path = "/1.1/trends/place"
	result.TrendsPlaceGet.Method = strings.ToUpper("Get")
	result.HandleTrendsPlaceGet(func(context swagger.RequestContext, params *TrendsPlaceGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl TrendsPlaceGet"))
	})

	result.UsersContributeesGet.Path = "/1.1/users/contributees"
	result.UsersContributeesGet.Method = strings.ToUpper("Get")
	result.HandleUsersContributeesGet(func(context swagger.RequestContext, params *UsersContributeesGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl UsersContributeesGet"))
	})

	result.UsersContributorsGet.Path = "/1.1/users/contributors"
	result.UsersContributorsGet.Method = strings.ToUpper("Get")
	result.HandleUsersContributorsGet(func(context swagger.RequestContext, params *UsersContributorsGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl UsersContributorsGet"))
	})

	result.UsersLookupGet.Path = "/1.1/users/lookup"
	result.UsersLookupGet.Method = strings.ToUpper("Get")
	result.HandleUsersLookupGet(func(context swagger.RequestContext, params *UsersLookupGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl UsersLookupGet"))
	})

	result.UsersReportSpamPost.Path = "/1.1/users/report_spam"
	result.UsersReportSpamPost.Method = strings.ToUpper("Post")
	result.HandleUsersReportSpamPost(func(context swagger.RequestContext, params *UsersReportSpamPostParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl UsersReportSpamPost"))
	})

	result.UsersSearchGet.Path = "/1.1/users/search"
	result.UsersSearchGet.Method = strings.ToUpper("Get")
	result.HandleUsersSearchGet(func(context swagger.RequestContext, params *UsersSearchGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl UsersSearchGet"))
	})

	result.UsersShowGet.Path = "/1.1/users/show"
	result.UsersShowGet.Method = strings.ToUpper("Get")
	result.HandleUsersShowGet(func(context swagger.RequestContext, params *UsersShowGetParams) swagger.Responder {
		return context.NewBindErrorResponse(errors.New(501, "Not Impl UsersShowGet"))
	})

	return result
}

func (it *DefaultApiController) HandleAccountSettingsGet(handler AccountSettingsGetHandler) {
	it.AccountSettingsGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewAccountSettingsGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleAccountSettingsPost(handler AccountSettingsPostHandler) {
	it.AccountSettingsPost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewAccountSettingsPostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleAccountUpdateDeliveryDevicePost(handler AccountUpdateDeliveryDevicePostHandler) {
	it.AccountUpdateDeliveryDevicePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewAccountUpdateDeliveryDevicePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleAccountUpdateProfileBackgroundImagePost(handler AccountUpdateProfileBackgroundImagePostHandler) {
	it.AccountUpdateProfileBackgroundImagePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewAccountUpdateProfileBackgroundImagePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleAccountUpdateProfileColorsPost(handler AccountUpdateProfileColorsPostHandler) {
	it.AccountUpdateProfileColorsPost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewAccountUpdateProfileColorsPostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleAccountUpdateProfileImagePost(handler AccountUpdateProfileImagePostHandler) {
	it.AccountUpdateProfileImagePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewAccountUpdateProfileImagePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleAccountUpdateProfilePost(handler AccountUpdateProfilePostHandler) {
	it.AccountUpdateProfilePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewAccountUpdateProfilePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleApplicationRateLimitStatusGet(handler ApplicationRateLimitStatusGetHandler) {
	it.ApplicationRateLimitStatusGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewApplicationRateLimitStatusGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleBlocksCreatePost(handler BlocksCreatePostHandler) {
	it.BlocksCreatePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewBlocksCreatePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleBlocksDestroyPost(handler BlocksDestroyPostHandler) {
	it.BlocksDestroyPost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewBlocksDestroyPostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleBlocksIdsGet(handler BlocksIdsGetHandler) {
	it.BlocksIdsGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewBlocksIdsGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleBlocksListGet(handler BlocksListGetHandler) {
	it.BlocksListGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewBlocksListGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleDirectMessagesDestroyPost(handler DirectMessagesDestroyPostHandler) {
	it.DirectMessagesDestroyPost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewDirectMessagesDestroyPostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleDirectMessagesGet(handler DirectMessagesGetHandler) {
	it.DirectMessagesGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewDirectMessagesGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleDirectMessagesNewPost(handler DirectMessagesNewPostHandler) {
	it.DirectMessagesNewPost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewDirectMessagesNewPostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleDirectMessagesSentGet(handler DirectMessagesSentGetHandler) {
	it.DirectMessagesSentGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewDirectMessagesSentGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleDirectMessagesShowGet(handler DirectMessagesShowGetHandler) {
	it.DirectMessagesShowGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewDirectMessagesShowGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleFollowersIdsGet(handler FollowersIdsGetHandler) {
	it.FollowersIdsGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewFollowersIdsGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleFriendsIdsGet(handler FriendsIdsGetHandler) {
	it.FriendsIdsGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewFriendsIdsGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleFriendshipsCreatePost(handler FriendshipsCreatePostHandler) {
	it.FriendshipsCreatePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewFriendshipsCreatePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleFriendshipsDestroyPost(handler FriendshipsDestroyPostHandler) {
	it.FriendshipsDestroyPost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewFriendshipsDestroyPostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleFriendshipsIncomingGet(handler FriendshipsIncomingGetHandler) {
	it.FriendshipsIncomingGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewFriendshipsIncomingGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleFriendshipsOutgoingGet(handler FriendshipsOutgoingGetHandler) {
	it.FriendshipsOutgoingGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewFriendshipsOutgoingGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleFriendshipsShowGet(handler FriendshipsShowGetHandler) {
	it.FriendshipsShowGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewFriendshipsShowGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleFriendshipsUpdatePost(handler FriendshipsUpdatePostHandler) {
	it.FriendshipsUpdatePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewFriendshipsUpdatePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleGeoIdPlaceIdGet(handler GeoIdPlaceIdGetHandler) {
	it.GeoIdPlaceIdGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewGeoIdPlaceIdGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleGeoPlacesGet(handler GeoPlacesGetHandler) {
	it.GeoPlacesGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewGeoPlacesGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleGeoReverseGeoncodeGet(handler GeoReverseGeoncodeGetHandler) {
	it.GeoReverseGeoncodeGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewGeoReverseGeoncodeGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleGeoSearchGet(handler GeoSearchGetHandler) {
	it.GeoSearchGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewGeoSearchGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleGeoSimilarPlacesGet(handler GeoSimilarPlacesGetHandler) {
	it.GeoSimilarPlacesGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewGeoSimilarPlacesGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleHelpConfigurationGet(handler HelpConfigurationGetHandler) {
	it.HelpConfigurationGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewHelpConfigurationGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleHelpLanguagesGet(handler HelpLanguagesGetHandler) {
	it.HelpLanguagesGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewHelpLanguagesGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleHelpPrivacyGet(handler HelpPrivacyGetHandler) {
	it.HelpPrivacyGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewHelpPrivacyGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleHelpTosGet(handler HelpTosGetHandler) {
	it.HelpTosGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewHelpTosGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListMembersCreatePost(handler ListMembersCreatePostHandler) {
	it.ListMembersCreatePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListMembersCreatePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListMembersDestroyAllGet(handler ListMembersDestroyAllGetHandler) {
	it.ListMembersDestroyAllGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListMembersDestroyAllGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListMembersGet(handler ListMembersGetHandler) {
	it.ListMembersGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListMembersGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListMembersShowGet(handler ListMembersShowGetHandler) {
	it.ListMembersShowGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListMembersShowGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsCreatePost(handler ListsCreatePostHandler) {
	it.ListsCreatePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsCreatePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsDestroyPost(handler ListsDestroyPostHandler) {
	it.ListsDestroyPost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsDestroyPostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsListGet(handler ListsListGetHandler) {
	it.ListsListGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsListGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsMembersCreateAllGet(handler ListsMembersCreateAllGetHandler) {
	it.ListsMembersCreateAllGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsMembersCreateAllGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsMembersDestroyGet(handler ListsMembersDestroyGetHandler) {
	it.ListsMembersDestroyGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsMembersDestroyGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsMembershipsGet(handler ListsMembershipsGetHandler) {
	it.ListsMembershipsGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsMembershipsGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsShowGet(handler ListsShowGetHandler) {
	it.ListsShowGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsShowGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsStatusesGet(handler ListsStatusesGetHandler) {
	it.ListsStatusesGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsStatusesGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsSubscribersCreatePost(handler ListsSubscribersCreatePostHandler) {
	it.ListsSubscribersCreatePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsSubscribersCreatePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsSubscribersDestroyGet(handler ListsSubscribersDestroyGetHandler) {
	it.ListsSubscribersDestroyGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsSubscribersDestroyGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsSubscribersGet(handler ListsSubscribersGetHandler) {
	it.ListsSubscribersGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsSubscribersGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsSubscribersShowGet(handler ListsSubscribersShowGetHandler) {
	it.ListsSubscribersShowGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsSubscribersShowGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsSubscriptionsGet(handler ListsSubscriptionsGetHandler) {
	it.ListsSubscriptionsGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsSubscriptionsGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleListsUpdatePost(handler ListsUpdatePostHandler) {
	it.ListsUpdatePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewListsUpdatePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleSavedSearchesCreatePost(handler SavedSearchesCreatePostHandler) {
	it.SavedSearchesCreatePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewSavedSearchesCreatePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleSavedSearchesDestroyIdPost(handler SavedSearchesDestroyIdPostHandler) {
	it.SavedSearchesDestroyIdPost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewSavedSearchesDestroyIdPostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleSavedSearchesListGet(handler SavedSearchesListGetHandler) {
	it.SavedSearchesListGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewSavedSearchesListGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleSavedSearchesShowIdGet(handler SavedSearchesShowIdGetHandler) {
	it.SavedSearchesShowIdGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewSavedSearchesShowIdGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleSearchTweetsGet(handler SearchTweetsGetHandler) {
	it.SearchTweetsGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewSearchTweetsGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleStatusesDestroyIdPost(handler StatusesDestroyIdPostHandler) {
	it.StatusesDestroyIdPost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewStatusesDestroyIdPostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleStatusesHomeTimelineGet(handler StatusesHomeTimelineGetHandler) {
	it.StatusesHomeTimelineGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewStatusesHomeTimelineGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleStatusesMentionsTimelineGet(handler StatusesMentionsTimelineGetHandler) {
	it.StatusesMentionsTimelineGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewStatusesMentionsTimelineGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleStatusesOembedGet(handler StatusesOembedGetHandler) {
	it.StatusesOembedGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewStatusesOembedGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleStatusesRetweetsIdGet(handler StatusesRetweetsIdGetHandler) {
	it.StatusesRetweetsIdGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewStatusesRetweetsIdGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleStatusesRetweetsIdPost(handler StatusesRetweetsIdPostHandler) {
	it.StatusesRetweetsIdPost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewStatusesRetweetsIdPostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleStatusesShowIdGet(handler StatusesShowIdGetHandler) {
	it.StatusesShowIdGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewStatusesShowIdGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleStatusesUpdatePost(handler StatusesUpdatePostHandler) {
	it.StatusesUpdatePost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewStatusesUpdatePostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleStatusesUserTimelineGet(handler StatusesUserTimelineGetHandler) {
	it.StatusesUserTimelineGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewStatusesUserTimelineGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleTrendsAvailableGet(handler TrendsAvailableGetHandler) {
	it.TrendsAvailableGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewTrendsAvailableGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleTrendsClosestGet(handler TrendsClosestGetHandler) {
	it.TrendsClosestGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewTrendsClosestGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleTrendsPlaceGet(handler TrendsPlaceGetHandler) {
	it.TrendsPlaceGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewTrendsPlaceGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleUsersContributeesGet(handler UsersContributeesGetHandler) {
	it.UsersContributeesGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewUsersContributeesGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleUsersContributorsGet(handler UsersContributorsGetHandler) {
	it.UsersContributorsGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewUsersContributorsGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleUsersLookupGet(handler UsersLookupGetHandler) {
	it.UsersLookupGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewUsersLookupGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleUsersReportSpamPost(handler UsersReportSpamPostHandler) {
	it.UsersReportSpamPost.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewUsersReportSpamPostParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleUsersSearchGet(handler UsersSearchGetHandler) {
	it.UsersSearchGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewUsersSearchGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) HandleUsersShowGet(handler UsersShowGetHandler) {
	it.UsersShowGet.HandlerFunc = func(context swagger.RequestContext, request *http.Request) swagger.Responder {
		binder, err := context.NewRequestBinder(request)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		params, err := NewUsersShowGetParams(binder)
		if err != nil {
			return context.NewBindErrorResponse(err)
		}

		return handler(context, params)
	}
}

func (it *DefaultApiController) MapHandlers(mapper swagger.HandleMapper) {

	mapper.PutHandler(it.AccountSettingsGet)

	mapper.PutHandler(it.AccountSettingsPost)

	mapper.PutHandler(it.AccountUpdateDeliveryDevicePost)

	mapper.PutHandler(it.AccountUpdateProfileBackgroundImagePost)

	mapper.PutHandler(it.AccountUpdateProfileColorsPost)

	mapper.PutHandler(it.AccountUpdateProfileImagePost)

	mapper.PutHandler(it.AccountUpdateProfilePost)

	mapper.PutHandler(it.ApplicationRateLimitStatusGet)

	mapper.PutHandler(it.BlocksCreatePost)

	mapper.PutHandler(it.BlocksDestroyPost)

	mapper.PutHandler(it.BlocksIdsGet)

	mapper.PutHandler(it.BlocksListGet)

	mapper.PutHandler(it.DirectMessagesDestroyPost)

	mapper.PutHandler(it.DirectMessagesGet)

	mapper.PutHandler(it.DirectMessagesNewPost)

	mapper.PutHandler(it.DirectMessagesSentGet)

	mapper.PutHandler(it.DirectMessagesShowGet)

	mapper.PutHandler(it.FollowersIdsGet)

	mapper.PutHandler(it.FriendsIdsGet)

	mapper.PutHandler(it.FriendshipsCreatePost)

	mapper.PutHandler(it.FriendshipsDestroyPost)

	mapper.PutHandler(it.FriendshipsIncomingGet)

	mapper.PutHandler(it.FriendshipsOutgoingGet)

	mapper.PutHandler(it.FriendshipsShowGet)

	mapper.PutHandler(it.FriendshipsUpdatePost)

	mapper.PutHandler(it.GeoIdPlaceIdGet)

	mapper.PutHandler(it.GeoPlacesGet)

	mapper.PutHandler(it.GeoReverseGeoncodeGet)

	mapper.PutHandler(it.GeoSearchGet)

	mapper.PutHandler(it.GeoSimilarPlacesGet)

	mapper.PutHandler(it.HelpConfigurationGet)

	mapper.PutHandler(it.HelpLanguagesGet)

	mapper.PutHandler(it.HelpPrivacyGet)

	mapper.PutHandler(it.HelpTosGet)

	mapper.PutHandler(it.ListMembersCreatePost)

	mapper.PutHandler(it.ListMembersDestroyAllGet)

	mapper.PutHandler(it.ListMembersGet)

	mapper.PutHandler(it.ListMembersShowGet)

	mapper.PutHandler(it.ListsCreatePost)

	mapper.PutHandler(it.ListsDestroyPost)

	mapper.PutHandler(it.ListsListGet)

	mapper.PutHandler(it.ListsMembersCreateAllGet)

	mapper.PutHandler(it.ListsMembersDestroyGet)

	mapper.PutHandler(it.ListsMembershipsGet)

	mapper.PutHandler(it.ListsShowGet)

	mapper.PutHandler(it.ListsStatusesGet)

	mapper.PutHandler(it.ListsSubscribersCreatePost)

	mapper.PutHandler(it.ListsSubscribersDestroyGet)

	mapper.PutHandler(it.ListsSubscribersGet)

	mapper.PutHandler(it.ListsSubscribersShowGet)

	mapper.PutHandler(it.ListsSubscriptionsGet)

	mapper.PutHandler(it.ListsUpdatePost)

	mapper.PutHandler(it.SavedSearchesCreatePost)

	mapper.PutHandler(it.SavedSearchesDestroyIdPost)

	mapper.PutHandler(it.SavedSearchesListGet)

	mapper.PutHandler(it.SavedSearchesShowIdGet)

	mapper.PutHandler(it.SearchTweetsGet)

	mapper.PutHandler(it.StatusesDestroyIdPost)

	mapper.PutHandler(it.StatusesHomeTimelineGet)

	mapper.PutHandler(it.StatusesMentionsTimelineGet)

	mapper.PutHandler(it.StatusesOembedGet)

	mapper.PutHandler(it.StatusesRetweetsIdGet)

	mapper.PutHandler(it.StatusesRetweetsIdPost)

	mapper.PutHandler(it.StatusesShowIdGet)

	mapper.PutHandler(it.StatusesUpdatePost)

	mapper.PutHandler(it.StatusesUserTimelineGet)

	mapper.PutHandler(it.TrendsAvailableGet)

	mapper.PutHandler(it.TrendsClosestGet)

	mapper.PutHandler(it.TrendsPlaceGet)

	mapper.PutHandler(it.UsersContributeesGet)

	mapper.PutHandler(it.UsersContributorsGet)

	mapper.PutHandler(it.UsersLookupGet)

	mapper.PutHandler(it.UsersReportSpamPost)

	mapper.PutHandler(it.UsersSearchGet)

	mapper.PutHandler(it.UsersShowGet)

}
