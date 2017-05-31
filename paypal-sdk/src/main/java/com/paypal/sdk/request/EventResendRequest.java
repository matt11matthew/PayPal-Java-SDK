// This class was generated on Wed, 31 May 2017 13:36:12 PDT by version 0.01 of Braintree SDK Generator
// EventResend.java
// DO NOT EDIT
// @type request
// @json {"Name":"event.resend","Description":"Resends a webhook event notification, by ID. Any pending notifications are not resent.","Parameters":[{"Type":"string","VariableName":"event_id","Description":"The ID of the webhook event notification to resend.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Event Resend","VariableName":"body","Description":"Resends a webhook event notification, by ID.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"SuccessResponseType":{"Type":"Event","VariableName":"","Description":"A webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"DefaultResponseType":{"Type":"error","VariableName":"","Description":"Details about an error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"POST","Path":"/v1/notifications/webhooks-events/{event_id}/resend","Visible":true}

package com.paypal.sdk.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.object.*;
import java.util.List;


/**
 * Resends a webhook event notification, by ID. Any pending notifications are not resent.
 */
public class EventResendRequest extends HttpRequest<Event> {

    public EventResendRequest() {
    	super("/v1/notifications/webhooks-events/{event_id}/resend?", "POST", Event.class);
    }
    
    public EventResendRequest eventId(String eventId) {
        path(path().replace("{event_id}", String.valueOf(eventId)));
        return this;
    }
    
    public EventResendRequest body(EventResend body) {
        requestBody(body);
        return this;
    }
}