package com.flavor.isthereopen;


import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.flavor.isthereopen.CafeOpenReviewController.cafeOpenReviewMap;

@RestController
public class CafeController {
    public static Map<Integer, Cafe> cafeMap;
    public static final Integer CLOSE = 0;
    public static final Integer BREAKTIME = 1;
    public static final Integer OPEN = 2;
    public static final Integer UNKNOWN = 3;

    @PostConstruct
    public void init() {
        cafeMap = new HashMap<>();
        cafeMap.put(0, new Cafe(0, "커피베이 성신여대점", "서울 성북구 보문로34길 80 1층", "매일 10:00 - 23:00", "http://ldb.phinf.naver.net/20190922_46/1569123521799gJEQg_JPEG/lxoQ7YkH0Y3AyedAkNbeKJK6.jpeg.jpg"));
        cafeMap.put(1, new Cafe(1, "카페비", "서울 성북구 보문로30길 71 ", "매일 11:00 - 24:00", "http://ldb.phinf.naver.net/20151104_44/1446627314732yeCEp_JPEG/167054578530574_21.jpg"));
        cafeMap.put(2, new Cafe(2, "홀슈", "서울 성북구 보문로34길 88", "오후 12시~오후 8시", "http://ldb.phinf.naver.net/20191002_250/1569986451053OrdX1_JPEG/JcHuVz_SanKstCeTbMuK6O8W.JPG.jpg"));
        cafeMap.put(3, new Cafe(3, "이디야커피 성신여대점", "서울 성북구 보문로34길 100", "평일 07:30 - 23:00, 주말 08:00 - 23:00, 공휴일 08:00 - 23:00", "http://ldb.phinf.naver.net/20170711_282/1499738599754pJSvu_JPEG/186661513339210_0.jpeg"));
        cafeMap.put(4, new Cafe(4, "스타벅스 성신여대정문점", "서울 성북구 보문로34길 62", " 08:00 - 21:30", "http://ldb.phinf.naver.net/20190828_93/1566953601239OT9MQ_PNG/xX7Wv642gXMoTI0DAv0hRymS.png"));
        cafeMap.put(5, new Cafe(5, "카페온더플랜", "서울 성북구 동소문로22길 39-4", "매일 08:00 - 05:00", "http://ldb.phinf.naver.net/20190214_234/1550123304569M0StE_JPEG/omHhVGuluiyH3ye3XAnPu2j1.jpg"));
        cafeMap.put(6, new Cafe(6, "본크레페", "서울 성북구 동소문로20다길 30", "평일 14:00 - 19:00", "http://ldb.phinf.naver.net/20150813_69/1439473829903KC20W_JPEG/SUBMIT_1439434572823_33646766.jpg"));
    }

    @GetMapping("/cafe/{cafeSeq}/openState") // (API 테스트 완료)
    public Integer getCurrentState(@PathVariable("cafeSeq") Integer cafeSeq) {
        return cafeMap.get(cafeSeq).getCurrentState();
    }

    @GetMapping("/cafe/all") // (API 테스트 완료)
    public List<Cafe> getCafeList() {
        return new ArrayList<Cafe>(cafeMap.values());
    }

    @GetMapping("/cafe/{cafeSeq}") // (API 테스트 완료)
    public Cafe getCafe(@PathVariable("cafeSeq") Integer cafeSeq) {
        return cafeMap.get(cafeSeq);
    }

    @PutMapping("/cafe") //(API 테스트 완료)
    public void putCafe(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("runtime") String runningTime, @RequestParam("photoURL") @Nullable String photoUrl) {
        int seq = cafeMap.size();
        if(photoUrl == null)
            cafeMap.put(seq, new Cafe(seq, name, address, runningTime));
        else
            cafeMap.put(seq, new Cafe(seq, name, address, runningTime, photoUrl));
    }

    @PostMapping("/cafe/{cafeSeq}") //(API 테스트 완료)
    public void postCurrentState(@PathVariable("cafeSeq") Integer cafeSeq, @RequestParam("openState") Integer openState) {
        cafeMap.get(cafeSeq).setCurrentState(openState);
    }
}
