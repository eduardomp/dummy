package com.m.dummy.api.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
public class DummyController {

    @GetMapping("/dummy")
    public String getDummyMessage() {
        StringBuffer result = new StringBuffer();
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(100)
                .map(t -> t[0])
            .forEach(x -> result.append(x).append("\n"));
        return result.toString();
    }

}
