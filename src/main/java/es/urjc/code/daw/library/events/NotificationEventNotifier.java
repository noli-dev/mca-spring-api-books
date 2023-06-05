package es.urjc.code.daw.library.events;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;

public class NotificationEventNotifier implements ApplicationListener<NotificationEvent> {
    
    @Async
    @Override
    public void onApplicationEvent(NotificationEvent event) {
        System.out.println(event.getMessage());
    }
}
