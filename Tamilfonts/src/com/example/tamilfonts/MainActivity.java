package com.example.tamilfonts;


import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView tv=(TextView)findViewById(R.id.textView1);

		String name=" காளிதாஸ் ராஜேந்திரன்";

		// Converting String from Unicode for Message Titles
		final String strMorning = TamilUtil.convertToTamil(TamilUtil.TSCII, name);
		Typeface tfBamini = Typeface.createFromAsset(getAssets(),"fonts/Bamini.ttf");
		tv.setTypeface(tfBamini);
		tv.setText(strMorning);
	}

}
