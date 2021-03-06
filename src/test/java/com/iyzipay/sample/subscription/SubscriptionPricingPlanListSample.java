package com.iyzipay.sample.subscription;

import com.iyzipay.PagingRequest;
import com.iyzipay.model.Locale;
import com.iyzipay.model.Status;
import com.iyzipay.model.subscription.SubscriptionPricingPlanList;
import com.iyzipay.sample.Sample;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class SubscriptionPricingPlanListSample extends Sample {

    @Test
    public void should_retrieve() {
        PagingRequest pagingRequest = new PagingRequest();
        pagingRequest.setPage(1);
        pagingRequest.setCount(10);
        pagingRequest.setLocale(Locale.TR.name());
        pagingRequest.setConversationId("123456");

        SubscriptionPricingPlanList response = SubscriptionPricingPlanList.retrieve("553d006c-da91-46d3-81a4-8297881d6b9e", pagingRequest, options);

        assertEquals(response.getStatus(), Status.SUCCESS.getValue());
        assertNotNull(response.getSubscriptionPricingPlanListData().getSubscriptionPricingPlansResource());
    }
}