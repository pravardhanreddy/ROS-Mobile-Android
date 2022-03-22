package com.schneewittchen.rosandroid.widgets.stream;

import com.schneewittchen.rosandroid.model.entities.widgets.PublisherWidgetEntity;
import com.schneewittchen.rosandroid.model.repositories.rosRepo.message.Topic;

import sensor_msgs.Image;

public class StreamEntity extends PublisherWidgetEntity {

    public StreamEntity() {
        this.width = 8;
        this.height = 6;
        this.topic = new Topic("camera/image_raw", Image._TYPE);
    }
}
