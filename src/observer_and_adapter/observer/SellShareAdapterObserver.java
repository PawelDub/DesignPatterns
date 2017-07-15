package observer_and_adapter.observer;

import observer_and_adapter.adapter.SellShareService;
import observer_and_adapter.adapter.Share;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class SellShareAdapterObserver implements Observer {

    private SellShareService sellShareService = new SellShareService();

    @Override
    public void notifyMe(Map<String, Integer> sharePrices) {
        System.out.println(getClass().getSimpleName() + " I have just been notified about new prices");
        List<Share> shares = new ArrayList<Share>();
            for (String shareName : sharePrices.keySet()){
                Integer price = sharePrices.get(shareName);
                Share share = new Share(shareName, price);
                shares.add(share);
        }
        sellShareService.sell(shares);
    }
}