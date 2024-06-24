package com.itwill.spring2.repository;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor @Builder
//DB 테이블 comments의 모델(Model) 클래스
public class Comments {
	    private Integer commentsId; // Primary Key
	    private Integer postId; // Foreign Key: posts 테이블의 post_id(pk) 컬럼을 참조.
	    private Integer userId; // Foreign Key: users 테이블의 user_id(pk) 컬럼을 참조.
	    private String ctext; // 댓글 내용.
	    private LocalDateTime createdTime; // 댓글 최초 작성 시간.
	    private LocalDateTime modifiedTime; // 댓글 최종 수정 시간.
	    private Integer isPrivate; 
	    //-> 비밀 댓글. DB에서 default 0으로 되어있음(공개 0, 비밀1로 하기로 정함)
}
	
