package com.flavor.isthereopen;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BarController {
    public static Map<Integer, Bar> barMap;
    public static final Integer CLOSE = 0;
    public static final Integer BREAKTIME = 1;
    public static final Integer OPEN = 2;
    public static final Integer UNKNOWN = 3;

    @PostConstruct
    public void init() {
        barMap = new HashMap<>();
        barMap.put(0, new Bar(0, "육회본가", "성북구 어쩌구", "오전 9시~오후 11시"));
        barMap.put(1, new Bar(1, "대한맥주집", "정문 앞", "오후 12시~오후 8시"));
    }
    @GetMapping("/bar/{barSeq}/openState") // (API 테스트 완료)
    public Integer getCurrentState(@PathVariable("barSeq") Integer barSeq) {
        return barMap.get(barSeq).getCurrentState();
    }

    @GetMapping("/bar/all") // (API 테스트 완료)
    public List<Bar> getBarList() {
        return new ArrayList<Bar>(barMap.values());
    }

    @GetMapping("/bar/{barSeq}") // (API 테스트 완료)
    public Bar getBar(@PathVariable("barSeq") Integer barSeq) {
        return barMap.get(barSeq);
    }

    @PutMapping("/bar") //(API 테스트 완료)
    public void putBar(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("runtime") String runningTime) {
        int seq = barMap.size();
        barMap.put(seq, new Bar(seq, name, address, runningTime));
    }

    @PostMapping("/bar/{barSeq}") //(API 테스트 완료)
    public void postCurrentState(@PathVariable("barSeq") Integer barSeq, @RequestParam("openState") Integer openState) {
        barMap.get(barSeq).setCurrentState(openState);
    }
}
