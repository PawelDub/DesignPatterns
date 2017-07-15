package observer_and_adapter.observer;

import java.util.Map;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public interface Observer {
    void notifyMe(Map<String, Integer> sharePrices);
}