/* Author: Shakib Small
 * Year: 2016
 */
 package com.shakibsmall.japanesealphabetquiz;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Shakib
 * Displays Quizzes screen.
 */
public class Quizzes extends Activity{

	/**
	 * Load quizzes layout on activity startup.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		//inflate katakana_listing layout
		setContentView(R.layout.quizzes);
		
	}
}
