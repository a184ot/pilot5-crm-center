package net.pilot5.servapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.Date;

@Setter
@Getter
@Data
public class message {

    Date incomeTime;
    String messenger;
    TelegramData telegramData;
    ViberData viberData;
    WatsappData watsappData;

    class TelegramData extends Message {


    }
}
