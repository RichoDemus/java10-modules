package com.richodemus.core.internal;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelperTest {
    @Test
    public void name() {
        var result = new Helper().msg();
        assertThat(result).isEqualTo("Hello from Internal");
    }
}