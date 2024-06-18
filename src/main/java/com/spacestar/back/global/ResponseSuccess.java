package com.spacestar.back.global;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum ResponseSuccess {

    SUCCESS(200, "요청에 성공했습니다."),

    MESSAGE_CREATE_SUCCESS(201, "메시지 생성 성공"),

    CREATE_CHATROOM_SUCCESS(301, "채팅방 생성 성공"),
    GET_CHATROOM_LIST_SUCCESS(302, "채팅방 목록 조회 성공"),
    GET_CHATROOM_RECRUIT_LIST_SUCCESS(303, "팀 채팅방 요청 목록 조회 성공"),
    GET_CHATROOM_DETAIL_SUCCESS(303, "채팅방 상세 조회 성공"),
    GET_CHATROOM_MEMBER_LIST_SUCCESS(304, "채팅방 멤버 목록 조회 성공"),
    JOIN_CHATROOM_SUCCESS(305, "채팅방 참여 성공"),
    GET_CHATROOM_MESSAGE_LIST_SUCCESS(306, "채팅방 메시지 목록 조회 성공"),
    GET_CHATROOM_UNREAD_MESSAGE_LIST_SUCCESS(307, "안 읽은 메시지 목록 조회 성공"),
    GET_CHATROOM_RECENT_MESSAGE_SUCCESS(308, "최근 메시지 조회 성공"),



    CREATE_TEAM_CHATROOM_SUCCESS(401, "팀 채팅방 생성 성공"),
    GET_TEAM_CHATROOM_LIST_SUCCESS(402, "내가 속한 채팅방 리스트 조회 성공"),
    GET_TEAM_CHATROOM_DETAIL_SUCCESS(403, "팀 채팅방 상세 조회 성공"),
    JOIN_TEAM_CHATROOM_SUCCESS(404, "팀 채팅방 참여 성공"),
    INTERNAL_SERVER_ERROR(900, "Internal server error");


    private final int code;
    private final String message;

}
