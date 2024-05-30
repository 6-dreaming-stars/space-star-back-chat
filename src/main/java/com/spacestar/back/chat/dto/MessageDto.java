package com.spacestar.back.chat.dto;

import com.spacestar.back.chat.domain.ChatMessageCollection;
import com.spacestar.back.chat.enums.MessageType;
import com.spacestar.back.chat.vo.req.ChatMessageReqVo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class MessageDto {

    String roomNumber;
    String senderUuid;
    String content;
    MessageType messageType;
    LocalDateTime createdAt;

    public static MessageDto chatMessageReqVoToDto(ChatMessageReqVo chatMessageReqVo, String roomNumber, LocalDateTime createdAt){
        return MessageDto.builder()
                .roomNumber(roomNumber)
                .senderUuid(chatMessageReqVo.getSenderUuid())
                .content(chatMessageReqVo.getContent())
                .messageType(chatMessageReqVo.getMessageType())
                .createdAt(createdAt)
                .build();
    }

    public static ChatMessageCollection toEntity(MessageDto messageDto){
        return ChatMessageCollection.builder()
                .roomNumber(messageDto.getRoomNumber())
                .senderUuid(messageDto.getSenderUuid())
                .content(messageDto.getContent())
                .messageType(messageDto.getMessageType())
                .createdAt(messageDto.getCreatedAt().plusHours(9))
                .build();
    }

    public static MessageDto messageDtoFromEntity(ChatMessageCollection chatMessageCollection){
        return MessageDto.builder()
                .roomNumber(chatMessageCollection.getRoomNumber())
                .senderUuid(chatMessageCollection.getSenderUuid())
                .content(chatMessageCollection.getContent())
                .messageType(chatMessageCollection.getMessageType())
                .createdAt(chatMessageCollection.getCreatedAt().minusHours(9))
                .build();
    }

}
