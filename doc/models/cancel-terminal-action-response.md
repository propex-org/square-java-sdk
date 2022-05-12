
# Cancel Terminal Action Response

## Structure

`CancelTerminalActionResponse`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Errors` | [`List<Error>`](../../doc/models/error.md) | Optional | Information on errors encountered during the request. | List<Error> getErrors() |
| `Action` | [`TerminalAction`](../../doc/models/terminal-action.md) | Optional | - | TerminalAction getAction() |

## Example (as JSON)

```json
{
  "action": {
    "app_id": "APP_ID",
    "cancel_reason": "SELLER_CANCELED",
    "created_at": "2021-07-28T23:22:07.476Z",
    "deadline_duration": "PT5M",
    "device_id": "DEVICE_ID",
    "id": "termapia:jveJIAkkAjILHkdCE",
    "location_id": "LOCATION_ID",
    "save_card_options": {
      "customer_id": "CUSTOMER_ID",
      "reference_id": "user-id-1"
    },
    "status": "CANCELED",
    "type": "SAVE_CARD",
    "updated_at": "2021-07-28T23:22:29.511Z"
  }
}
```
