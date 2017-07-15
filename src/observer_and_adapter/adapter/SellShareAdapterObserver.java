package observer_and_adapter.adapter;

import observer_and_adapter.observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Pawel_D on 2017-07-12.
 */
public class SellShareAdapterObserver implements Observer {

    private SellShareService sellShares = new SellShareService();

    @Override
    public void notifyMe(Map<String, Integer> sharePrices) {
        List<Share> shares = new ArrayList<>();
        for (String shareName : sharePrices.keySet()) {
            Integer price = sharePrices.get(shareName);
            Share share = new Share(shareName, price);
            shares.add(share);
        }
        sellShares.sell(shares);
    }
}
