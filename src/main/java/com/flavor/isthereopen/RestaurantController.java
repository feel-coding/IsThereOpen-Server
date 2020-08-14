package com.flavor.isthereopen;

import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.flavor.isthereopen.RestaurantOpenReviewController.restaurantOpenReviewMap;

@RestController
public class RestaurantController {
    public static Map<Integer, Restaurant> restaurantMap;
    public static final Integer CLOSE = 0;
    public static final Integer BREAKTIME = 1;
    public static final Integer OPEN = 2;
    public static final Integer UNKNOWN = 3;

    @PostConstruct
    public void init() {
        restaurantMap = new HashMap<>();
        restaurantMap.put(0, new Restaurant(0, "이름없는파스타 성신여대점", "서울 성북구 동소문로20다길 33", "매일 11:30 - 20:30", "http://blogfiles.naver.net/MjAyMDA3MDlfMjU5/MDAxNTk0MjkyMDI5MzMw.ZAX8LeKf_eY0Q_Xuv3c4hBt0RU5VzApy2pZew_YDGUUg.5kPPrPx02rAWA3u48-R0uFivGuLhPXVDulDQE6z5gVQg.JPEG.tmfwl6756/KakaoTalk_20200709_183307242_14.jpg"));
        restaurantMap.put(1, new Restaurant(1, "마늘과 올리브 성신여대점", "성북구 동소문로22길 29", "매일 11:00 - 22:00명절 당일 휴무", "http://ldb.phinf.naver.net/20151104_232/1446627390967kmYDH_JPEG/167054578649635_0.jpg"));
        restaurantMap.put(2, new Restaurant(2, "미오지오", "서울 성북구 동소문로24가길 21", "오후 12시~오후 8시", "http://ldb.phinf.naver.net/20170622_62/1498119280128apS3n_JPEG/186569597177939_0.jpeg"));
        restaurantMap.put(3, new Restaurant(3, "해밀", "성북구 동소문로24가길 19", "매일 09:30 - 23:00, 일요일 11:00 - 23:00"));
        restaurantMap.put(4, new Restaurant(4, "최고당돈까스", "서울 성북구 보문로34길 77", " 08:00 - 21:30", "http://ldb.phinf.naver.net/20191112_75/1573542729468PLhMJ_JPEG/jN-aNpRrljfOS4pdDnW4fV23.jpg"));
        restaurantMap.put(5, new Restaurant(5, "제순식당 성신여대점", "서울 성북구 동소문로20다길 30-9", "매일 08:00 - 05:00", "http://ldb.phinf.naver.net/20151104_222/1446627540736dkLpR_JPEG/167054578879147_1.jpg"));
        restaurantMap.put(6, new Restaurant(6, "띵라면", "서울 성북구 동소문로22길 29-8", "매일 11:00~21:00"));
        restaurantMap.put(7, new Restaurant(7, "마녀주방 성신여대점", "서울 성북구 동소문로22길 11 2, 3층", "매일 10:00 - 23:00", "http://ldb.phinf.naver.net/20200624_235/1592971156269CwCTN_JPEG/TFGIfkPp5x4sWyZi9lsoECih.jpg"));
        restaurantMap.put(8, new Restaurant(8, "쵸이양식", "서울 성북구 동소문로20나길 24 2층", "매일 12:00 - 21:00, 매주 일요일 휴무", "http://ldb.phinf.naver.net/20190101_187/154635217293249UVn_JPEG/XlyOJgqlT8jtY4Bzb6c-8_TY.jpeg.jpg"));
    }

    @GetMapping("/restaurant/{restaurantSeq}/openState")
    public Integer getCurrentState(@PathVariable("restaurantSeq") Integer restaurantSeq) {
        return restaurantMap.get(restaurantSeq).getCurrentState();
    }

    @GetMapping("/restaurant/all")
    public List<Restaurant> getRestaurantList() {
        return new ArrayList<Restaurant>(restaurantMap.values());
    }

    @PutMapping("/restaurant")
    public void putRestaurant(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("runningTime") String runningTime, @RequestParam("photoURL") @Nullable String photoUrl) {
        int seq = restaurantMap.size();
        if(photoUrl == null)
            restaurantMap.put(seq, new Restaurant(seq, name, address, runningTime));
        else
            restaurantMap.put(seq, new Restaurant(seq, name, address, runningTime, photoUrl));
    }

    @GetMapping("/restaurant/{restaurantSeq}")
    public Restaurant getRestaurant(@PathVariable("restaurantSeq") Integer restaurantSeq) {
        return restaurantMap.get(restaurantSeq);
    }

    @PostMapping("/restaurant/{restaurantSeq}")
    public void postCurrentState(@PathVariable("restaurantSeq") Integer restaurantSeq, @RequestParam("openState") Integer openState) {
        restaurantMap.get(restaurantSeq).setCurrentState(openState);
    }
}
