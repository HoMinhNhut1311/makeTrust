package com.example.makeTrust.mapper;

public interface IMyMapper<R, E , P> {

    E mapFormRequest(R r);

    P mapToResponse(E e);
}
