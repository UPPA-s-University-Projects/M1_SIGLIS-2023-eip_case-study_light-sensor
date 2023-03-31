package eip.lightsensor;

import java.util.ArrayList;
import java.util.List;

import eip.lightsensor.interfaces.PubSubMessageListener;

public class PubSubService {
    private List<PubSubMessageListener> listeners = new ArrayList<>();

    public void subscribe(PubSubMessageListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(PubSubMessageListener listener) {
        listeners.remove(listener);
    }

    public void publish(String message) {
        for (PubSubMessageListener listener : listeners) {
            listener.onMessageReceived(message);
        }
    }
}
