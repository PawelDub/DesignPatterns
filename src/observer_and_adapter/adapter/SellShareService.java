package observer_and_adapter.adapter;

import java.util.List;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class SellShareService {
    public void sell(List<Share> shares) {
        for (Share share : shares) {
            if (share.getPrice() > 500) {
                System.out.println("Sprzedaje akcje firmy " + share.getName() + " za kwotę " + share.getPrice());
            }
        }
    }
}
