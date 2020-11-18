package com.vorozheykin.Main;

public interface Action<S, D> {
    D action(S source);
}
