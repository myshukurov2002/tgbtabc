package com.company;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot2  extends TelegramLongPollingBot {

    public MyBot2() {
        super("1845451291:AAEYwEqqte-YtWmbZ-9sFK5NZsl_fnra6lI");
    }
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        SendMessage sendMessage = SendMessage
                .builder()
                .text(message.getText())
                .chatId(message.getChatId())
                .build();

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotUsername() {
        return "@bssresultbot";
    }
}
