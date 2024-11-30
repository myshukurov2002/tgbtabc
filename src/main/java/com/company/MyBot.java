package com.company;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot  extends TelegramLongPollingBot {

    public MyBot() {
        super("6880678135:AAF6qv7kK78akDJU0FDbg1jdILQUqaKuwDs");
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
        return "@mysebappbot";
    }
}
