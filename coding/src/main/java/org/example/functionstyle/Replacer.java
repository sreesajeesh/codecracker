package org.example.functionstyle;

@FunctionalInterface
public interface Replacer<String> {
    String replace(String s);
}
