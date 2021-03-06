package com.reloadly.paypro.notificationservice.constant;

public class EventTopicConstant {

    private static final String BASE_TOPIC = "com.reloadly.paypro.event.";

    public static final String TRANSACTION_COMPLETED = BASE_TOPIC + "transaction-completed";

    public static final String USER_CREATION = BASE_TOPIC + "user-creation";

    public static final String USER_UPDATE = BASE_TOPIC + "user-update";

}