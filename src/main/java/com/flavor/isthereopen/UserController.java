package com.flavor.isthereopen;


import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.flavor.isthereopen.BarController.barMap;

@RestController
public class UserController {
    private Map<Integer, User> userMap;

    @PostConstruct
    public void init() {
        userMap = new HashMap<>();
        userMap.put(0, new User(0, "hek0628", "김효은"));
        userMap.put(1, new User(1, "yeokyeong", "윤여경"));
        userMap.put(2, new User(2, "seol", "박설"));
    }

    @GetMapping("/user/{seq}")
    public User getUser(@PathVariable("seq") Integer seq) {
        return userMap.get(seq);
    }

    @GetMapping("/user/all")
    public List<User> getUserList() {
        return new ArrayList<User>(userMap.values());
    }

    @PutMapping("/user")
    public void putUser(@RequestParam("id") String id, @RequestParam("name") String name) {
        int seq = userMap.size();
        User user = new User(seq, id, name);
        userMap.put(seq, user);
    }

    @PostMapping("/user/{seq}")
    public void postUserName(@PathVariable("seq") Integer seq, @RequestParam("name") String name) {
        User user = userMap.get(seq);
        user.setName(name);
    }

    //단골 술집
    @GetMapping("/user/{seq}/patronBar")//단골 술집 조회
    public List<Integer> getPatronBarList(@PathVariable("seq") Integer seq) {
        return userMap.get(seq).getPatronBarList();
    }

    @PutMapping("/user/{seq}/patronBar")//단골 술집 추가
    public void putPatronBar(@PathVariable("seq") Integer seq, @RequestParam("barSeq") Integer barSeq) {
        userMap.get(seq).getPatronBarList().add(barSeq);
    }

    @DeleteMapping("/user/{seq}/patronBar")//단골 술집 삭제
    public void deletePatronBar(@PathVariable("seq") Integer seq, @RequestParam("barSeq") Integer barSeq) {
        userMap.get(seq).getPatronBarList().remove(barSeq);
    }

    //단골 카페
    @GetMapping("/user/{seq}/patronCafe")//단골 카페 조회 (API 테스트 완료)
    public List<Integer> getPatronCafeList(@PathVariable("seq") Integer seq) {
        return userMap.get(seq).getPatronCafeList();
    }

    @PutMapping("/user/{seq}/patronCafe")//단골 카페 추가 (API 테스트 완료)
    public void putPatronCafe(@PathVariable("seq") Integer seq, @RequestParam("cafeSeq") Integer cafeSeq) {
        userMap.get(seq).getPatronCafeList().add(cafeSeq);
    }

    @DeleteMapping("/user/{seq}/patronCafe")//단골 카페 삭제 (API 테스트 완료)
    public void deletePatronCafe(@PathVariable("seq") Integer seq, @RequestParam("cafeSeq") Integer cafeSeq) {
        userMap.get(seq).getPatronCafeList().remove(cafeSeq);
    }

    //단골 식당
    @GetMapping("/user/{seq}/patronRestaurant") //단골 식당 조회
    public List<Integer> getPatronRestaurantList(@PathVariable("seq") Integer seq) {
        return userMap.get(seq).getPatronRestaurantList();
    }

    @PutMapping("/user/{seq}/patronRestaurant") //단골 식당 추가
    public void putPatronRestaurant(@PathVariable("seq") Integer seq, @RequestParam("restaurantSeq") Integer restaurantSeq) {
        userMap.get(seq).getPatronRestaurantList().add(restaurantSeq);
    }

    @DeleteMapping("/user/{seq}/patronRestaurant") //단골 식당 삭제
    public void deletePatronRestaurant(@PathVariable("seq") Integer seq, @RequestParam("restaurantSeq") Integer restaurantSeq) {
        userMap.get(seq).getPatronRestaurantList().remove(restaurantSeq);
    }
}
