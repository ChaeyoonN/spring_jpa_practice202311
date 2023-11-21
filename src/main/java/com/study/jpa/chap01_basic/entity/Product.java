package com.study.jpa.chap01_basic.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_product") // 테이블명은 tbl_product로 세팅된다.
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id") // 컬럼명은 prod_id로 세팅된다.
    private long id;

    @Column(name="prod_name", nullable = false, length = 30)
    private String name;

    private int price; // =0 이라 쓰면 default

    @Enumerated(EnumType.STRING)
    private Category category;

    @CreationTimestamp // default sysdate(current_timestamp) 의미
    @Column(updatable=false)
    private LocalDateTime createDate;

    @UpdateTimestamp // 업데이트 시 날짜로 자동 설정
    private LocalDateTime updateDate;

    public enum Category{
        FOOD, FASHION, ELECTRONIC
    }


}
