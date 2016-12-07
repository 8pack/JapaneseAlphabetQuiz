/* Author: Shakib Small
 * Year: 2016
 */
 package com.shakibsmall.japanesealphabetquiz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

/**
 * @author Shakib
 * Powers the hiragana_listing screen. Calls an adapter that populates the 
 * hiraganaGridView.
 */
public class HiraganaListing extends Activity{

	//GridView Field corresponding to GridView in hiragana_listing.xml.
	GridView hiraganaGridView;
	
	/**
	 * Populates hiraganaGridView on activity startup.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		//inflate hiragana_listing layout
		setContentView(R.layout.hiragana_listing);

		//link the field hiraganaGridView to the text view hiraganaGridView
		hiraganaGridView = (GridView) findViewById(R.id.hiraganaGridView);
		//Call adapter to populate GridView
		hiraganaGridView.setAdapter(new ImageAdapter(getApplicationContext()));
		
	}
}
