package com.spacestar.back.chat.vo.res;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class RecentMessageResVo {
    private String lastChatMessage;

    private Instant createdAt;

    private int unReadCount;
}
