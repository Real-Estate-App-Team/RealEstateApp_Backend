package com.prettier.payload.mapper;

import com.prettier.config.MapStructConfig;
import com.prettier.entity.concretes.Message;
import com.prettier.payload.request.concretes.MessageRequest;
import com.prettier.payload.request.concretes.NewMessageRequest;
import com.prettier.payload.response.concretes.MessageResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(config = MapStructConfig.class)
public interface MessageMapper {

    MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);

    @Mapping(target = "receiver.email", source = "receiver")
    Message toMessage(NewMessageRequest messageRequest);

    MessageResponse toResponse(Message message);

}
