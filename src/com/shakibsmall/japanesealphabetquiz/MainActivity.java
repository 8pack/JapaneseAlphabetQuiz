/* Author: Shakib Small
 * Year: 2016
 */
 package com.shakibsmall.japanesealphabetquiz;

//import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
//import android.widget.Toast;


/**
 * @author Shakib
 * The main activity of the application.
 * Handles the items in activity_main.xml.
 */
public class MainActivity extends Activity {
	
	//Text view fields corresponding to the main text views in activity_main.xml
	TextView hiraganaTextView;
	TextView katakanaTextView;
	TextView quizzesTextView;

	/**
	 * Handle the click events in activity_main.xml for:
	 * "Hiragana Listing"
	 * "Katakana Listing" &
	 * "Quizzes"
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//inflate activity_main layout
		setContentView(R.layout.activity_main);
		
		//link the field hiraganaTextView to the text view HiraganaListingTextView
		hiraganaTextView = (TextView) this.findViewById(R.id.HiraganaListingTextView);
		//assign onClick listener to hiraganaTextView
		hiraganaTextView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				//Toast.makeText(getApplicationContext(), "Hiragana Listing Clicked", Toast.LENGTH_LONG).show();
				
				//create and start intent to load HiraganaListing class
				Intent intent = new Intent("HiraganaListingIntent");
				startActivity(intent);
				
			}
		});

		//link the field katakanaTextView to the text view KatakanaListingTextView
		katakanaTextView = (TextView) this.findViewById(R.id.KatakanaListingTextView);
		//assign onClick listener to katakanaTextView
		katakanaTextView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				//create and start intent to load KatakanaListing class
				Intent intent = new Intent("KatakanaListingIntent");
				startActivity(intent);
			}
		});

		//link the field quizzesTextView to the text view quizzesTextView
		quizzesTextView = (TextView) this.findViewById(R.id.quizzesTextView);
		//assign onClick listener to quizesTextView
		quizzesTextView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				//create and start intent to load Quizzes class
				Intent intent = new Intent("QuizzesIntent");
				startActivity(intent);
			}
		});
	}
	
}
