package com.flavor.isthereopen;


import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.flavor.isthereopen.BarController.barMap;

@RestController
public class BarInfoReviewController {
    Map<Integer, BarInfoReview> barInfoReviewMap;

    @PostConstruct
    public void init() {
        barInfoReviewMap = new HashMap<>();
    }
    @PutMapping("/bar/{barSeq}/infoReview")
    public void putBarInfoReview(
            @PathVariable("barSeq")Integer barSeq,
            @RequestParam("openStyle") Integer openStyle,
            @RequestParam("cleanness") Integer cleanness,
            @RequestParam("mood") Integer mood,
            @RequestParam("mainAlcohol") Integer mainAlcohol,
            @RequestParam("price") Integer price
    ) {
        int seq = barInfoReviewMap.size();
        BarInfoReview barInfoReview = new BarInfoReview(seq, barSeq, openStyle, cleanness, mood, mainAlcohol, price);
        barInfoReviewMap.put(seq,barInfoReview);
        barMap.get(barSeq).getBarInfoReviewList().add(barInfoReview);
    }

    @GetMapping("/bar/{barSeq}/infoReview")
    public List<BarInfoReview> getRestaurantInfoReviewList(@PathVariable("barSeq") Integer barSeq) {
        return barMap.get(barSeq).getBarInfoReviewList();
    }

    @GetMapping("/bar/{barSeq}/infoReview/{infoReviewSeq}")
    public BarInfoReview getBarInfoReview(@PathVariable("barSeq") Integer barSeq, @PathVariable("infoReviewSeq") Integer infoReviewSeq) {
        return barMap.get(barSeq).getBarInfoReviewList().get(infoReviewSeq);
    }
}
