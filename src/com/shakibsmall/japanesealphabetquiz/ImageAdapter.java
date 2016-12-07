/* Author: Shakib Small
 * Year: 2016
 */
 package com.shakibsmall.japanesealphabetquiz;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * @author Shakib
 * Image adapter that loads the images for HiraganaGridView.
 * To do:
 * Make use of bitmaps more efficient and accurate. Sometimes the incorrect 
 * image is loaded (usually at the first loading of the activity). Scrolling 
 * through the activity is also laggy.
 */
public class ImageAdapter extends BaseAdapter {
	
	//Font: Helvetica World, 144 
	//Static Array containing the bitmap hiragana symbols.
	private final static int[] images = 
		{
			R.drawable.hiragana_a, R.drawable.hiragana_i, R.drawable.hiragana_u, R.drawable.hiragana_e, R.drawable.hiragana_o,
			R.drawable.hiragana_ka, R.drawable.hiragana_ki, R.drawable.hiragana_ku, R.drawable.hiragana_ke, R.drawable.hiragana_ko,
			R.drawable.hiragana_sa, R.drawable.hiragana_shi, R.drawable.hiragana_su, R.drawable.hiragana_se, R.drawable.hiragana_so,
			R.drawable.hiragana_ta, R.drawable.hiragana_chi, R.drawable.hiragana_tsu, R.drawable.hiragana_te, R.drawable.hiragana_to,
			R.drawable.hiragana_na, R.drawable.hiragana_ni, R.drawable.hiragana_nu, R.drawable.hiragana_ne, R.drawable.hiragana_no,
			R.drawable.hiragana_ha, R.drawable.hiragana_hi, R.drawable.hiragana_fu, R.drawable.hiragana_he, R.drawable.hiragana_ho,
			R.drawable.hiragana_ma, R.drawable.hiragana_mi, R.drawable.hiragana_mu, R.drawable.hiragana_me, R.drawable.hiragana_mo,
			R.drawable.hiragana_ya, R.drawable.hiragana_yi, R.drawable.hiragana_yu, R.drawable.hiragana_ye, R.drawable.hiragana_yo,
			R.drawable.hiragana_ra, R.drawable.hiragana_ri, R.drawable.hiragana_ru, R.drawable.hiragana_re, R.drawable.hiragana_ro,
			R.drawable.hiragana_wa, R.drawable.hiragana_wi, R.drawable.hiragana_wu, R.drawable.hiragana_we, R.drawable.hiragana_wo,
			R.drawable.hiragana_n, R.drawable.hiragana_wu, R.drawable.hiragana_wi, R.drawable.hiragana_wu, R.drawable.hiragana_we
		};
	
	private static Context context;
	
	/**
	 * Get application context.
	 * @return context
	 */
	public static Context getContext()
	{
		return context;
	}

	/**
	 * Get number of hiragana symbols
	 * @return length of images array
	 */
	@Override
	public int getCount() {
		// number of data elements to be displayed
		return images.length;
	}
	
	/**
	 * Constructor that sets application context.
	 * @param applicationContext
	 */
	public ImageAdapter(Context applicationContext) {
		context = applicationContext;
	}
	
	/**
	 * Get a drawable image as Object from images array
	 * @param image position
	 */
	@Override
	public Object getItem(int position) {
		return images[position];
	}

	/**
	 * To do.
	 */
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Get view to be displayed within the GridView.
	 * @return imageView
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;

		//If recycled just use same view
		if(convertView != null)
		{
			imageView = (ImageView) convertView;
		}
		//If not recycled initialize a new view.
		else
		{
			imageView = new ImageView(context);
			//imageView.setLayoutParams(new GridView.LayoutParams(216, 216));
			//imageView.setScaleType(ScaleType.CENTER_CROP);
			//imageView.setPadding(8, 8, 8, 8);
			
			//Call helper class to create the view more efficiently.
			new BitmapWorkerTask(imageView).execute(images[position]);
			/*if(position % 2 == 0)
			{
				imageView.setBackgroundColor(Color.parseColor("#ADC9E6"));;
			}
			else
			{
				imageView.setBackgroundColor(Color.parseColor("#EEEEEE"));;	
			}*/
		}
		//
		imageView.setImageResource(images[position]);// Needs updating for efficiency sake.  

        //loadBitmap(images[position], imageView);
		return imageView;
	}
	
}
