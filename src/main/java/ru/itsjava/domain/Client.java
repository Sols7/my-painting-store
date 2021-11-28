package ru.itsjava.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class Client {
    private final String name;
    public final List<Painting> paintings;
}
