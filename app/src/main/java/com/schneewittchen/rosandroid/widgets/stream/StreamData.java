package com.schneewittchen.rosandroid.widgets.stream;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;

import com.schneewittchen.rosandroid.model.entities.widgets.BaseEntity;
import com.schneewittchen.rosandroid.model.repositories.rosRepo.node.BaseData;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBufferOutputStream;
import org.ros.internal.message.Message;
import org.ros.internal.message.MessageBuffers;
import org.ros.node.topic.Publisher;

import sensor_msgs.Image;

public class StreamData extends BaseData {

    public float x;
    public float y;

    ChannelBufferOutputStream stream = new ChannelBufferOutputStream(MessageBuffers.dynamicBuffer());

    public StreamData (float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Message toRosMessage(Publisher<Message> publisher, BaseEntity widget) {
        StreamEntity streamWidget = (StreamEntity) widget;

        sensor_msgs.Image message = (Image) publisher.newMessage();

//        CameraDevice cd = CameraDevice();

//        stream.write();

        message.setData(stream.buffer().copy());

        return super.toRosMessage(publisher, widget);
    }
}
