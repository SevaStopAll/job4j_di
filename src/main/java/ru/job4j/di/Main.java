package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(StartUI.class);
        context.reg(ConsoleInput.class);

        ConsoleInput input = context.get(ConsoleInput.class);

        input.askStr("What is your name?");
    }
}