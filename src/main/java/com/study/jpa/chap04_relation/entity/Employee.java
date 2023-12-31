package com.study.jpa.chap04_relation.entity;

import lombok.*;

import javax.persistence.*;

@Setter @Getter
// jpa 연관관계 맵핑에서 연관관계 데이터는 toString에서 제외해야 합니다.
@ToString(exclude = {"department"})
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_emp")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "emp_name", nullable = false)
    private String name;

    // EAGER: 항상 무조건 조인을 수행.
    // LAZY: 필요한 경우에만 조인을 수행. (실무)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id") // Department에서 조인할 컬럼을 지정 (FK 있는 쪽에서 쓴다.)
    private Department department; // 사원은 자신이 속한 부서의 정보 가져야 한다.

}
