package com.sparta.springprepare;

import com.sparta.springprepare.calculator.Calculator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Memo {
    private final Calculator calculator;
    private final String username;
    private String contents;
}