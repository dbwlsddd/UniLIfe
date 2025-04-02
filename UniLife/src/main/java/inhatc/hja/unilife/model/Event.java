// 일정 엔터티

package inhatc.hja.unilife.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 기본 키

    private String title;

    private String start;

    private String endDate; // `end` 대신 `endDate` 사용

}
