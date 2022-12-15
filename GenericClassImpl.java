package Generics.InterfaceType;

// Eğer bir "generic interface"  implement ederseniz , Class da generic olmalı
public class GenericClassImpl<T> implements GenericInterface<T>{

    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
