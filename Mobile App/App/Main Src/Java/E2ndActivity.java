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
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.*;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.YouTubePlayerUtils;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class E2ndActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout linear2;
	private ImageView imageview1;
	private TextView textview4;
	private ScrollView vscroll1;
	private LinearLayout linear5;
	private TextView textview6;
	private YouTubePlayerView youtube1;
	private TextView textview5;
	private YouTubePlayerView youtube3;
	private TextView textview7;
	private YouTubePlayerView youtube4;
	private TextView textview8;
	private YouTubePlayerView youtube5;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.e2nd);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview4 = (TextView) findViewById(R.id.textview4);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview6 = (TextView) findViewById(R.id.textview6);
		youtube1 = (YouTubePlayerView) findViewById(R.id.youtube1);
		textview5 = (TextView) findViewById(R.id.textview5);
		youtube3 = (YouTubePlayerView) findViewById(R.id.youtube3);
		textview7 = (TextView) findViewById(R.id.textview7);
		youtube4 = (YouTubePlayerView) findViewById(R.id.youtube4);
		textview8 = (TextView) findViewById(R.id.textview8);
		youtube5 = (YouTubePlayerView) findViewById(R.id.youtube5);
	}
	
	private void initializeLogic() {
		youtube1.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
			  @Override
			  public void onReady(@NonNull YouTubePlayer youTubePlayer) {
				    String videoId = "ERClR5Yn1lU";
				    youTubePlayer.cueVideo(videoId, 0);
				    getLifecycle().addObserver(youtube1);
				  }
		});
		youtube3.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
			  @Override
			  public void onReady(@NonNull YouTubePlayer youTubePlayer) {
				    String videoId = "UIxBWBHCTcQ";
				    youTubePlayer.cueVideo(videoId, 0);
				    getLifecycle().addObserver(youtube3);
				  }
		});
		youtube4.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
			  @Override
			  public void onReady(@NonNull YouTubePlayer youTubePlayer) {
				    String videoId = "PnQxNisRfBA";
				    youTubePlayer.cueVideo(videoId, 0);
				    getLifecycle().addObserver(youtube4);
				  }
		});
		youtube5.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
			  @Override
			  public void onReady(@NonNull YouTubePlayer youTubePlayer) {
				    String videoId = "6BlJc3FlzMg";
				    youTubePlayer.cueVideo(videoId, 0);
				    getLifecycle().addObserver(youtube5);
				  }
		});
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