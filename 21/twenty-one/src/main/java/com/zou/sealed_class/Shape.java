package com.zou.sealed_class;

public abstract sealed class Shape permits Circle, Rectangle, Square, WeirdShape {
}
