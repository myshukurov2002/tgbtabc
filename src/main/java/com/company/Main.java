package com.company;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) throws TelegramApiException {

        TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(new MyBot());
        System.out.println("running");

        api.registerBot(new MyBot2());
        System.out.println("running");
    }
}