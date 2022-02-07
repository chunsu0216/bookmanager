package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.Gender;
import com.fastcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.hibernate.criterion.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserHistoryRepository userHistoryRepository;

    @Test

    void crud(){
        //List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));

        //List<User> users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));

        //users.forEach(System.out::println);

        /*User user1 = new User("jack", "jack@fastcampus.com");
        User user2 = new User("steve", "steve@fastcampus.com");

        userRepository.saveAll(Lists.newArrayList(user1, user2));

        List<User> users = userRepository.findAll();

        users.forEach(System.out::println);*/

        //User user = userRepository.getOne(1L); //Entity에대해서 lazy한 로딩을 지원함 트랜잭셔널 사용안하면 오류남
        //User user = userRepository.findById(1L).orElse(null); //eager loading

        //System.out.println(user);

        //userRepository.saveAndFlush(new User("new martin", "newmartin@fastcampus.com"));

        //userRepository.flush();

        //userRepository.findAll().forEach(System.out::println);

        //long count = userRepository.count();

        //System.out.println(count);

       // boolean exists = userRepository.existsById(1L);

        //System.out.println(exists);

        //userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new)); //select 두번함 왜?? delete 하기 전에 한번 찾는듯?
        //userRepository.deleteById(1L);
        //userRepository.findAll().forEach(System.out::println);
        //userRepository.deleteAll(); //findAll하고 레코드 개수만큼 delete여러번 돔
        //userRepository.findAll().forEach(System.out::println);

        //userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L, 3L))); //select해서 각각 delete 처리
        //userRepository.deleteInBatch(userRepository.findAllById(Lists.newArrayList(1L, 3L))); //select 한 다음에 delete문에 where절사용해서 한번만 실행
                                                                                                        //find한다음에 해서 그렇지 실제론 바로 있던지 말던지 delete문 바로실행
        //userRepository.deleteAllInBatch(); //find안하고 바로 from 테이블명 해서 다이렉트로 delete 시킴

        //Paging
       /* Page<User> users = userRepository.findAll(PageRequest.of(1, 3)); //0부터 시작

        System.out.println("page : " + users);
        System.out.println("totalElements : " + users.getTotalElements());
        System.out.println("totalPages " + users.getTotalPages());
        System.out.println("numberOfElements : " + users.getNumberOfElements()); //현재 가져온 레코드수
        System.out.println("sort : " + users.getSort());
        System.out.println("size : " + users.getSize()); //페이징할때 나누는 크기

        users.getContent().forEach(System.out::println);*/

        /*ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("name") //name은 매칭하지않겠다
                .withMatcher("email", endsWith());
        Example<User> example = Example.of(new User("ma", "fastcampus.com"), matcher); //ma는 무시 email Like검색*/

        /*User user2 = new User();
        user2.setEmail("slow");

        ExampleMatcher matcher1 = ExampleMatcher.matching().withMatcher("email", contains()); //양방향 Like 검색
        Example<User> example1 = Example.of(user2, matcher1);

        userRepository.findAll(example1).forEach(System.out::println);*/

        //userRepository.save(new User("david", "david@fastcampus.com")); //isNew이면 persist(insert) 호출 getId == null이면

        //User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        //user.setEmail("martin-update@fastcampus.com");

       // userRepository.save(user); //해당 entity가 존재하는지 select 한번하고 update 침
    }


    //Spring Data Jpa queryMethod
    @Test
    void select(){
        /*System.out.println(userRepository.findByName("martin"));

        System.out.println("findByEmail : " + userRepository.findByEmail("martin@fastcampus.com"));
        System.out.println("getByEmail : " + userRepository.getByEmail("martin@fastcampus.com"));
        System.out.println("readByEmail : " + userRepository.readByEmail("martin@fastcampus.com"));
        System.out.println("queryByEmail : " + userRepository.queryByEmail("martin@fastcampus.com"));
        System.out.println("searchByEmail : " + userRepository.searchByEmail("martin@fastcampus.com"));
        System.out.println("streamByEmail : " + userRepository.streamByEmail("martin@fastcampus.com"));
        System.out.println("findUserByEmail : " + userRepository.findUserByEmail("martin@fastcampus.com"));
        System.out.println("findSomethingByEmail : " + userRepository.findSomethingByEmail("martin@fastcampus.com"));

        System.out.println("findTop1ByName : " + userRepository.findTop1ByName("martin"));
        System.out.println("findFirst1ByName : " + userRepository.findFirst1ByName("martin"));*/
        //Last는 안됨

        //System.out.println("findByEmailAndName : " + userRepository.findByEmailAndName("martin@fastcampus.com", "martin"));
        //System.out.println("findByEmailOrName : " + userRepository.findByEmailOrName("martin@fastcampus.com", "dennis"));

        //날짜와 시간같을 때만 쓰도록하자 after, before
        //System.out.println("findByCreatedAtAfter : " + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));

        //System.out.println("findByIdAfter : " + userRepository.findByIdAfter(4L));

        //나머지 숫자나 이럴 때 쓰도록하자 날짜, 시간도 상관없음
        //System.out.println("findByCreateAtGreaterThan : " + userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));

        // >=
        //System.out.println("findByCreatedAtGreaterThanEqual : " + userRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1L)));

        //System.out.println("findByCreatedAtBetween : " + userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1L), LocalDateTime.now().plusDays(1L)));
        //System.out.println("findByIdBetween : " + userRepository.findByIdBetween(1L, 3L));

        //System.out.println("findByIdIsNotNull : " + userRepository.findByIdIsNotNull());

        //문자열의 not Empty가아니라 collection 타입의 not empty 체크 잘 안씀
        //System.out.println("findByIdIsNotEmpty : " + userRepository.findByAddressesIsNotEmpty());

        //System.out.println("findByNameIn : " + userRepository.findByNameIn(Lists.newArrayList("martin", "dennis")));

       /* System.out.println("findByNameStartingWith : " + userRepository.findByNameStartingWith("mar"));
        System.out.println("findByNameEndingWith : " + userRepository.findByNameEndingWith("tin"));
        System.out.println("findByNameContains : " + userRepository.findByNameContains("art"));
        System.out.println("findByNameLike : " + userRepository.findByNameLike("%art%"));*/


    }

    @Test
    void pagingAndSortingTest(){
       // System.out.println("findTop1ByName : " + userRepository.findTop1ByName("martin"));
        //안먹힘 걍 findByName실행됨
        //System.out.println("findLast1ByName : " + userRepository.findLast1ByName("martin"));

        /*System.out.println("findTop1ByNameOrderByIdDesc" + userRepository.findTopByNameOrderByIdDesc("martin"));
        System.out.println("findFirstByNameOrderByIdDescEmailAsc : " + userRepository.findFirstByNameOrderByIdDescEmailAsc("martin"));*/

        //System.out.println("findFirstByNameWithSortParams : " + userRepository.findFirstByName("martin", Sort.by(Sort.Order.desc("id"), Sort.Order.asc("email"))));

        System.out.println("findByNameWithPaging : " + userRepository.findByName("martin", PageRequest.of(0, 1, Sort.by(Sort.Order.desc("id")))).getContent());

    }

    @Test
    void insertAndUpdateTest(){
        User user = new User();

        user.setName("martin");
        user.setEmail("martin@fastcampus.com");

        userRepository.save(user);

        User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user2.setName("martin2");

        userRepository.save(user2);
    }

    @Test
    void enumTest(){
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);

        user.setGender(Gender.MALE);

        userRepository.save(user);

        userRepository.findAll().forEach(System.out::println);

        System.out.println(userRepository.findRowRecord().get("gender"));
    }

    @Test
    void listener(){
        User user = new User();

        user.setEmail("asdfasdf@fastcampus.com");
        user.setName("martin");

        userRepository.save(user);

       User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
       user2.setName("adfasd");
       userRepository.save(user2);

       userRepository.deleteById(4L);
    }

    @Test
    void prePersistTest(){
        User user = new User();
        user.setEmail("martin2@fastcampus.com");
        user.setName("martin");
        //user.setCreatedAt(LocalDateTime.now());
        //user.setUpdatedAt(LocalDateTime.now());

        userRepository.save(user);

        System.out.println(userRepository.findByEmail("martin2@fastcampus.com"));
    }

    @Test
    void preUpdateTest(){
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);

        System.out.println("as-is " + user);

        user.setName("martin22");
        userRepository.save(user);

        System.out.println("to be " + userRepository.findAll().get(0));
    }

    @Test
    void userHistoryTest(){
        User user = new User();
        user.setEmail("martin-new@fastcampus.com");
        user.setName("martin-new");

        userRepository.save(user);

        user.setName("martin-new-new");

        userRepository.save(user);

        userHistoryRepository.findAll().forEach(System.out::println);
    }
}