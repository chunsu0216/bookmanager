package com.fastcampus.jpa.bookmanager.domain;

import com.fastcampus.jpa.bookmanager.domain.listener.Auditable;
import com.fastcampus.jpa.bookmanager.domain.listener.UserEntityListener;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter

@NoArgsConstructor //아무런 인자없이 생성자
@AllArgsConstructor //모든 필드를 인자로 받아서 생성자 만듬
@RequiredArgsConstructor //필요한것만 인자로 받아서 생성자 만듬

@Data //@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode 해줌
@Entity
@EntityListeners(value = { UserEntityListener.class})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//@Table(indexes = {@Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class User extends BaseEntity implements Auditable {
    @Id //pk
    @GeneratedValue //순차적으로 데이터 증가
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    //@Column(nullable = false)
 /*   @Column(updatable = false)
    @CreatedDate
    private LocalDateTime createdAt;

    //@Column(insertable = false)
    @LastModifiedDate
    private LocalDateTime updatedAt;*/

    @Transient //영속성처리에서 제외 insert되지않음
    private String testData;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    //@OneToMany(fetch = FetchType.EAGER)
    //private List<Address> addresses;

   /* @PrePersist
    public void prePersist(){
        System.out.println(">>> prePersist");

        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate(){
        System.out.println(">>> preUpdate");

        this.updatedAt = LocalDateTime.now();
    }*/



}
