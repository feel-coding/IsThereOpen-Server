package com.flavor.isthereopen;


import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.flavor.isthereopen.RestaurantController.restaurantMap;

@RestController
public class RestaurantInfoReviewController {
    Map<Integer, RestaurantInfoReview> restaurantInfoReviewMap;

    @PostConstruct
    public void init() {
        restaurantInfoReviewMap = new HashMap<>();
    }
    @PutMapping("/restaurant/{restaurantSeq}/infoReview")
    public void putRestaurantInfoReview( //식당 리뷰 추가 (API 테스트 완료)
                                         @PathVariable("restaurantSeq")Integer restaurantSeq,
                                         @RequestParam("openStyle") Integer openStyle,
                                         @RequestParam("waitingTime") Integer waitingTime,
                                         @RequestParam("cleanness") Integer cleanness,
                                         @RequestParam("price") Integer price,
                                         @RequestParam("takeOut") Integer takeOut,
                                         @RequestParam("eatAlone") Integer eatAlone
    ) {
        int seq = restaurantInfoReviewMap.size();
        RestaurantInfoReview restaurantInfoReview = new RestaurantInfoReview(seq, restaurantSeq, openStyle, waitingTime, cleanness, price, takeOut, eatAlone);
        restaurantInfoReviewMap.put(seq,restaurantInfoReview);
        restaurantMap.get(restaurantSeq).getRestaurantInfoReviewList().add(restaurantInfoReview);
    }

    @GetMapping("/restaurant/{restaurantSeq}/infoReview") //특정 식당의 리뷰들 가져오기 (API 테스트 완료)
    public List<RestaurantInfoReview> getRestaurantInfoReviewList(@PathVariable("restaurantSeq") Integer restaurantSeq) {
        return restaurantMap.get(restaurantSeq).getRestaurantInfoReviewList();
    }

    @GetMapping("/restaurant/{restaurantSeq}/infoReview/{infoReviewSeq}") //특정 식당의 몇 번째 리뷰 가져오기 (API 테스트 완료)
    public RestaurantInfoReview getRestaurantInfoReview(@PathVariable("restaurantSeq") Integer restaurantSeq, @PathVariable("infoReviewSeq") Integer infoReviewSeq) {
        return restaurantMap.get(restaurantSeq).getRestaurantInfoReviewList().get(infoReviewSeq);
    }
}
