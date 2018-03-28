package com.richodemus.main;

import com.richodemus.core.external.User;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().msg());
    }

    String msg() {
        return new User().msg();
    }
}
