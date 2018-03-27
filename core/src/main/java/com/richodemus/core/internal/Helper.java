package com.richodemus.core.internal;

import java.util.List;
import java.util.stream.Collectors;

public class Helper {
    public String msg() {
        final var words = List.of("Hello", "from", "Internal");
        return words.stream().collect(Collectors.joining(" "));
    }
}
