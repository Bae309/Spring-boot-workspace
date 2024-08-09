package com.example.demo;

//import org.springframework.web.server.adapter.HttpWebHandlerAdapter;

public class HelloGetterSetter {
    private String hello;
    private int lombok;

    HelloGetterSetter(String hello, int lombok) {
        this.hello = hello;
        this.lombok = lombok;
    }

    public String getHello() {
        return this.hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public int getLombok() {
        return this.lombok;
    }

    public void setLombok(int lombok) {
        this.lombok = lombok;
    }


    public static void main(String[] args) {
        HelloGetterSetter helloGetterSetter = new HelloGetterSetter("김일남", 97);
        //helloGetterSetter.setHello("???");
        //helloGetterSetter.setLombok(99);

        System.out.println(helloGetterSetter.getHello());
        System.out.println(helloGetterSetter.getLombok());
    }
}
