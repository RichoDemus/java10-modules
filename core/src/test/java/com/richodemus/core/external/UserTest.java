package com.richodemus.core.external;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    @Test
    public void name() {
        var result = new User().msg();
        assertThat(result).isEqualTo("Hello from Internal");
    }
}