/* Author: Shakib Small
 * Year: 2016
 */
 package com.shakibsmall.japanesealphabetquiz;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Shakib
 * Displays the katakana_listing screen.
 * To do:
 * Change implementation to Call an adapter that populates a katakanaGridView.
 */
public class KatakanaListing extends Activity{
	
	/**
	 * Load katakana_listing layout on activity startup.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		//inflate katakana_listing layout
		setContentView(R.layout.katakana_listing);
		
	}
}
