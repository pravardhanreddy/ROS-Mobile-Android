package com.schneewittchen.rosandroid.widgets.stream;

import android.view.View;

import com.schneewittchen.rosandroid.model.entities.widgets.BaseEntity;
import com.schneewittchen.rosandroid.ui.views.details.PublisherWidgetViewHolder;

import java.util.Collections;
import java.util.List;

import sensor_msgs.Image;

public class StreamDetailVH extends PublisherWidgetViewHolder {
    @Override
    protected void initView(View itemView) {

    }

    @Override
    protected void bindEntity(BaseEntity entity) {

    }

    @Override
    protected void updateEntity(BaseEntity entity) {

    }

    @Override
    public List<String> getTopicTypes() {
        return Collections.singletonList(Image._TYPE);
    }
}
