package config;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import android.app.Activity;
import android.widget.LinearLayout;

public class admob {
	
	private static String admBanner = "ca-app-pub-6503318492484443/6337503173";
	public static String Interstitial = "ca-app-pub-6503318492484443/3328196458";
	
	public static void admobBannerCall(Activity acitivty , LinearLayout linerlayout){
		
        AdView adView = new AdView(acitivty);
        adView.setAdUnitId(admBanner);
        adView.setAdSize(AdSize.BANNER);
        AdRequest.Builder builder = new AdRequest.Builder();
        adView.loadAd(builder.build());
        linerlayout.addView(adView);

	}
	
}