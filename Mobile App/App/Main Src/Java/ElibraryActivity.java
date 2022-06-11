package com.eedu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ScrollView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class ElibraryActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private ImageView imageview1;
	private TextView textview4;
	private ScrollView vscroll1;
	private LinearLayout linear5;
	private LinearLayout linear11;
	private LinearLayout linear14;
	private LinearLayout linear17;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear18;
	
	private Intent elibraryintent = new Intent();
	private Intent inttoe1 = new Intent();
	private Intent inttoe2 = new Intent();
	private Intent inttoe3 = new Intent();
	private Intent inttoe4 = new Intent();
	private Intent inttoe5 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.elibrary);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview4 = (TextView) findViewById(R.id.textview4);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		
		linear12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				inttoe1.setClass(getApplicationContext(), E1stActivity.class);
				startActivity(inttoe1);
			}
		});
		
		linear13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				inttoe2.setClass(getApplicationContext(), E2ndActivity.class);
				startActivity(inttoe2);
			}
		});
		
		linear15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				inttoe3.setClass(getApplicationContext(), E3rdActivity.class);
				startActivity(inttoe3);
			}
		});
		
		linear16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				inttoe4.setClass(getApplicationContext(), E4thActivity.class);
				startActivity(inttoe4);
			}
		});
		
		linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				inttoe5.setClass(getApplicationContext(), E5thActivity.class);
				startActivity(inttoe5);
			}
		});
	}
	
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}