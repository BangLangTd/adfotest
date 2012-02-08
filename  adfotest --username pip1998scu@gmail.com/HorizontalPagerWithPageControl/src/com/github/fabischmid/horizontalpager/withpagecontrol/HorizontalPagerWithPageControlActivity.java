package com.github.fabischmid.horizontalpager.withpagecontrol;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.github.fabischmid.horizontalpager.withpagecontrol.HorizontalPagerWithPageControl.OnFlingListener;
import com.github.fabischmid.horizontalpager.withpagecontrol.HorizontalPagerWithPageControl.OnScreenSwitchListener;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;

public class HorizontalPagerWithPageControlActivity extends Activity {
	private HorizontalPagerWithPageControl mPager;
	private LayoutParams params = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
//    private RadioGroup mRadioGroup;

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horizontal_pager_with_page_control);
        mPager = (HorizontalPagerWithPageControl) findViewById(R.id.horizontal_pager);
        /*
         * You can add more views to the horizontal pager here with mPager.addChild() or in xml.
         * When every view is in the horizontal pager just call addPagerControl() on the
         * horzizontal pager. Thats all :)
         */
        mPager.addPagerControl();
        mPager.setOnFlingListenet(new OnFlingListener() {
			
			@Override
			public void onFling(int Scrollx) {
				// TODO Auto-generated method stub
				if (mPager.getCurrentScreen() == mPager.getChildCount()-1 && Scrollx > 0) {
					ScrollView scrollView = new ScrollView(HorizontalPagerWithPageControlActivity.this);
					TextView text = new TextView(HorizontalPagerWithPageControlActivity.this);
					text.setText(mPager.getChildCount()+"picture");
					scrollView.addView(text);
					mPager.addView(scrollView, mPager.getChildCount(), params);
					mPager.freshPagerControl();
				}else if (mPager.getCurrentScreen() == 0 && Scrollx < 0) {
					ScrollView scrollView = new ScrollView(HorizontalPagerWithPageControlActivity.this);
					TextView text = new TextView(HorizontalPagerWithPageControlActivity.this);
					text.setText(mPager.getChildCount()+"before");
					scrollView.addView(text);
					mPager.addView(scrollView, 0, params);
					mPager.setCurrentScreen(1, false);
					mPager.freshPagerControl();
				}
			}
		});
        
        mPager.setOnScreenSwitchListener(new OnScreenSwitchListener() {
			
			@Override
			public void onScreenSwitched(int screen) {
				// TODO Auto-generated method stub
//				if (screen == mPager.getChildCount()-1) {
//					TextView text = new TextView(HorizontalPagerWithPageControlActivity.this);
//					text.setText(mPager.getChildCount()+"picture");
//					mPager.addView(text, mPager.getChildCount(), params);
//					mPager.freshPagerControl();
//				}else if (screen == 0) {
//					TextView text = new TextView(HorizontalPagerWithPageControlActivity.this);
//					text.setText(mPager.getChildCount()+"picture");
//					mPager.addView(text, 0, params);
//					mPager.setCurrentScreen(1, false);
//					mPager.freshPagerControl();
//				}
				
			}
		});
    }
/*
 * /////////////////////////////////
 * RADIOGROUPS ARE ONLY UNCOMMENTED! 
 * look at xml 
 * /////////////////////////////////
 */
 

}