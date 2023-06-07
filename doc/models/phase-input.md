
# Phase Input

Represents the arguments used to construct a new phase.

## Structure

`PhaseInput`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Ordinal` | `int` | Required | index of phase in total subscription plan | int getOrdinal() |
| `OrderTemplateId` | `String` | Optional | id of order to be used in billing | String getOrderTemplateId() |

## Example (as JSON)

```json
{
  "ordinal": 80,
  "order_template_id": "order_template_id2"
}
```
