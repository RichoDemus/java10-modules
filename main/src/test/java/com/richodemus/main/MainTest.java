package com.richodemus.main;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    public void name() {
        var result = new Main().msg();
        assertThat(result).isEqualTo("Hello from Internal");
    }
}
