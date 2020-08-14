package com.flavor.isthereopen;



import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.*;

import static com.flavor.isthereopen.CafeController.*;

@RestController
public class CafeOpenReviewController {
    public static Map<Integer, CafeOpenReview> cafeOpenReviewMap;

    @PostConstruct
    public void init(){
        cafeOpenReviewMap = new HashMap<>();
//        cafeOpenReviewMap.put(1, new CafeOpenReview(1, 1, 2, CLOSE));
//        cafeOpenReviewMap.put(2, new CafeOpenReview(2, 2, 1, UNKNOWN));
    }

    @GetMapping("/cafe/{cafeSeq}/openReview") //카페 오픈 리뷰 조회 (API 테스트 완료)
    public List<CafeOpenReview> getCafeOpenReviewList(@PathVariable("cafeSeq") Integer cafeSeq) {
        return cafeMap.get(cafeSeq).getCafeOpenReviewList();
    }

    @PutMapping("/cafe/{cafeSeq}/openReview") //카페 오픈 리뷰 작성 (API 테스트 완료)
    public void putCafeOpenReview(@PathVariable("cafeSeq") Integer cafeSeq, @RequestParam("userSeq") Integer userSeq, @RequestParam("openState") Integer openState) {
        int seq = cafeOpenReviewMap.size();
        CafeOpenReview openReview = new CafeOpenReview(seq, cafeSeq, userSeq, openState);
        cafeOpenReviewMap.put(seq, openReview);
        cafeMap.get(cafeSeq).getCafeOpenReviewList().add(openReview);
        cafeMap.get(cafeSeq).setCurrentState(openState);
        cafeMap.get(cafeSeq).setLastUpdate(new Date());
    }
}
