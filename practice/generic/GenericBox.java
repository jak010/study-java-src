package practice.generic;

import lombok.Generated;
import lombok.val;

class GenericBoxEx<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}


class GenericBox {

    public static void main(String[] args) {

        // Integer 타입의 Generic 생성
        GenericBoxEx<Integer> integerGenericBox = new GenericBoxEx<Integer>();
        integerGenericBox.set(10);
        Integer integer = integerGenericBox.get();
        System.out.println("integer =" + integer);

        // String 타입의 Generic 생성
        GenericBoxEx<String> stringGenericBoxEx = new GenericBoxEx<String>();
        stringGenericBoxEx.set("hello");
        String string = stringGenericBoxEx.get();
        System.out.println("string =" + string);

    }

}