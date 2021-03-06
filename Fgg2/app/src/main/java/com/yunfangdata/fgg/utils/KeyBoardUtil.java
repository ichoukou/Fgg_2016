package com.yunfangdata.fgg.utils;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * 键盘帮助
 *
 */
public class KeyBoardUtil {

	/**
	 * 隐藏键盘
	 * @param activity
	 */
	public static void hideKeyboard(Activity activity) {
		InputMethodManager imm = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);  
		if (imm != null) {
			View focus = activity.getCurrentFocus();
			if (focus != null) {
				IBinder ib = focus.getWindowToken();
				if (ib != null) {
					imm.hideSoftInputFromWindow(ib, 0); 
				}
			}
		}	
	}
}
