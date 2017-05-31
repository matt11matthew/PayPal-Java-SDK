// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// WebhookSubscribedEventTypesList.java
// DO NOT EDIT
// @type request
// @json {"Name":"webhook.subscribed-event-types.list","Description":"Lists event subscriptions for a webhook, by ID.","Parameters":[{"Type":"string","VariableName":"webhook_id","Description":"The ID of the webhook for which to list subscriptions.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"SuccessResponseType":{"Type":"Webhook Event Type List","VariableName":"","Description":"List of webhook events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"DefaultResponseType":{"Type":"error","VariableName":"","Description":"Details about an error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"GET","Path":"/v1/notifications/webhooks/{webhook_id}/event-types","Visible":true}

package com.paypal.sdk.request;

import com.paypal.sdk.object.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.fail;

public class WebhookSubscribedEventTypesListRequestTest {

    @Test
    public void testWebhookSubscribedEventTypesListRequest() {
        fail("Not implemented");
    }
}