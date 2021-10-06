package com.hevo.team;

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
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.CheckBox;
import android.widget.TextView;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

public class MainActivity extends AppCompatActivity {
	
	private String fontName = "";
	private String typeace = "";
	
	private LinearLayout bg_hevo;
	private LinearLayout b_hevo_1;
	private LinearLayout linear3;
	private LinearLayout b_hevo_4;
	private LinearLayout bg_hevo_2;
	private ImageView image_hevo1;
	private LinearLayout b_hevo_2;
	private ImageView image_hevo2;
	private CheckBox check_hevo;
	private LinearLayout linear4;
	private ImageView image_hevo3;
	private ImageView image_hevo4;
	private TextView text_hevo1;
	private TextView text_hevo2;
	private LinearLayout bt_hevo_pro;
	private TextView text_hevo_pro;
	private LinearLayout bt_hevo_1;
	private LinearLayout bt_hevo_2;
	private LinearLayout bt_hevo_3;
	private LinearLayout bt_hevo_4;
	private LinearLayout bt_hevo_5;
	private LinearLayout bt_hevo_6;
	private ImageView image_hevo5;
	private TextView text_hevo3;
	private ImageView image_hevo_bt1;
	private ImageView image_hevo6;
	private TextView text_hevo4;
	private ImageView image_hevo_bt2;
	private ImageView image_hevo7;
	private TextView text_hevo5;
	private ImageView image_hevo_bt3;
	private ImageView image_hevo8;
	private TextView text_hevo6;
	private ImageView image_hevo_bt4;
	private ImageView image_hevo9;
	private TextView text_hevo7;
	private ImageView image_hevo_bt5;
	private ImageView image_hevo10;
	private TextView text_hevo8;
	private ImageView image_hevo_bt6;
	
	private SharedPreferences hevo;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		bg_hevo = findViewById(R.id.bg_hevo);
		b_hevo_1 = findViewById(R.id.b_hevo_1);
		linear3 = findViewById(R.id.linear3);
		b_hevo_4 = findViewById(R.id.b_hevo_4);
		bg_hevo_2 = findViewById(R.id.bg_hevo_2);
		image_hevo1 = findViewById(R.id.image_hevo1);
		b_hevo_2 = findViewById(R.id.b_hevo_2);
		image_hevo2 = findViewById(R.id.image_hevo2);
		check_hevo = findViewById(R.id.check_hevo);
		linear4 = findViewById(R.id.linear4);
		image_hevo3 = findViewById(R.id.image_hevo3);
		image_hevo4 = findViewById(R.id.image_hevo4);
		text_hevo1 = findViewById(R.id.text_hevo1);
		text_hevo2 = findViewById(R.id.text_hevo2);
		bt_hevo_pro = findViewById(R.id.bt_hevo_pro);
		text_hevo_pro = findViewById(R.id.text_hevo_pro);
		bt_hevo_1 = findViewById(R.id.bt_hevo_1);
		bt_hevo_2 = findViewById(R.id.bt_hevo_2);
		bt_hevo_3 = findViewById(R.id.bt_hevo_3);
		bt_hevo_4 = findViewById(R.id.bt_hevo_4);
		bt_hevo_5 = findViewById(R.id.bt_hevo_5);
		bt_hevo_6 = findViewById(R.id.bt_hevo_6);
		image_hevo5 = findViewById(R.id.image_hevo5);
		text_hevo3 = findViewById(R.id.text_hevo3);
		image_hevo_bt1 = findViewById(R.id.image_hevo_bt1);
		image_hevo6 = findViewById(R.id.image_hevo6);
		text_hevo4 = findViewById(R.id.text_hevo4);
		image_hevo_bt2 = findViewById(R.id.image_hevo_bt2);
		image_hevo7 = findViewById(R.id.image_hevo7);
		text_hevo5 = findViewById(R.id.text_hevo5);
		image_hevo_bt3 = findViewById(R.id.image_hevo_bt3);
		image_hevo8 = findViewById(R.id.image_hevo8);
		text_hevo6 = findViewById(R.id.text_hevo6);
		image_hevo_bt4 = findViewById(R.id.image_hevo_bt4);
		image_hevo9 = findViewById(R.id.image_hevo9);
		text_hevo7 = findViewById(R.id.text_hevo7);
		image_hevo_bt5 = findViewById(R.id.image_hevo_bt5);
		image_hevo10 = findViewById(R.id.image_hevo10);
		text_hevo8 = findViewById(R.id.text_hevo8);
		image_hevo_bt6 = findViewById(R.id.image_hevo_bt6);
		hevo = getSharedPreferences("mode", Activity.MODE_PRIVATE);
		
		image_hevo2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_performClick(check_hevo);
			}
		});
		
		check_hevo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					hevo.edit().putString("mode", "true").commit();
					_mod_hevo();
				}
				else {
					if (!_isChecked) {
						hevo.edit().putString("mode", "false").commit();
						_mod_hevo();
					}
				}
			}
		});
	}
	
	private void initializeLogic() {
		_NavStatusBarColor("#FFFFFF", "#FFFFFF");
		_DARK_ICONS();
		_changeActivityFont("hevoteam");
		_addCardView(image_hevo4, 0, 360, 4, 4, true, "#101D24");
		_rippleRoundStroke(image_hevo3, "#FF4433", "#FFFFFF", 360, 2, "#FF4433");
		_rippleRoundStroke(bt_hevo_1, "#F3F7FB", "#FFFFFF", 80, 0, "#FFFFFF");
		_rippleRoundStroke(bt_hevo_2, "#F3F7FB", "#FFFFFF", 80, 0, "#FFFFFF");
		_rippleRoundStroke(bt_hevo_3, "#F3F7FB", "#FFFFFF", 80, 0, "#FFFFFF");
		_rippleRoundStroke(bt_hevo_4, "#F3F7FB", "#FFFFFF", 80, 0, "#FFFFFF");
		_rippleRoundStroke(bt_hevo_5, "#F3F7FB", "#FFFFFF", 80, 0, "#FFFFFF");
		_rippleRoundStroke(bt_hevo_6, "#F3F7FB", "#FFFFFF", 80, 0, "#FFFFFF");
		_rippleRoundStroke(bt_hevo_pro, "#FF4433", "#FFFFFF", 80, 0, "#FFFFFF");
		_ICC(image_hevo1, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo2, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo5, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo6, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo7, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo8, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo9, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo10, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo_bt1, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo_bt2, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo_bt3, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo_bt4, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo_bt5, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo_bt6, "#4D4D4D", "#FFFFFF");
		_ICC(image_hevo3, "#FFFFFF", "#F3F7FB");
	}
	
	public void _DARK_ICONS() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
	}
	
	
	public void _changeActivityFont(final String _fontname) {
		fontName = "fonts/".concat(_fontname.concat(".ttf"));
		overrideFonts(this,getWindow().getDecorView()); 
	} 
	private void overrideFonts(final android.content.Context context, final View v) {
		
		try {
			Typeface 
			typeace = Typeface.createFromAsset(getAssets(), fontName);;
			if ((v instanceof ViewGroup)) {
				ViewGroup vg = (ViewGroup) v;
				for (int i = 0;
				i < vg.getChildCount();
				i++) {
					View child = vg.getChildAt(i);
					overrideFonts(context, child);
				}
			}
			else {
				if ((v instanceof TextView)) {
					((TextView) v).setTypeface(typeace);
				}
				else {
					if ((v instanceof EditText )) {
						((EditText) v).setTypeface(typeace);
					}
					else {
						if ((v instanceof Button)) {
							((Button) v).setTypeface(typeace);
						}
					}
				}
			}
		}
		catch(Exception e)
		
		{
			SketchwareUtil.showMessage(getApplicationContext(), "Error Loading Font");
		};
	}
	
	
	public void _rippleRoundStroke(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _mod_hevo() {
		if (hevo.getString("mode", "").equals("true")) {
			_NavStatusBarColor("#212121", "#212121");
			bg_hevo.setBackgroundColor(0xFF212121);
			image_hevo2.setImageResource(R.drawable.hevo_team_9);
			text_hevo1.setTextColor(0xFFFFFFFF);
			text_hevo2.setTextColor(0xFFFFFFFF);
			text_hevo3.setTextColor(0xFFFFFFFF);
			text_hevo4.setTextColor(0xFFFFFFFF);
			text_hevo5.setTextColor(0xFFFFFFFF);
			text_hevo6.setTextColor(0xFFFFFFFF);
			text_hevo7.setTextColor(0xFFFFFFFF);
			text_hevo8.setTextColor(0xFFFFFFFF);
			_rippleRoundStroke(bt_hevo_1, "#FF323232", "#FFFFFF", 80, 0, "#FFFFFF");
			_rippleRoundStroke(bt_hevo_2, "#FF323232", "#FFFFFF", 80, 0, "#FFFFFF");
			_rippleRoundStroke(bt_hevo_3, "#FF323232", "#FFFFFF", 80, 0, "#FFFFFF");
			_rippleRoundStroke(bt_hevo_4, "#FF323232", "#FFFFFF", 80, 0, "#FFFFFF");
			_rippleRoundStroke(bt_hevo_5, "#FF323232", "#FFFFFF", 80, 0, "#FFFFFF");
			_rippleRoundStroke(bt_hevo_6, "#FF323232", "#FFFFFF", 80, 0, "#FFFFFF");
			_rippleRoundStroke(bt_hevo_pro, "#FF4433", "#FFFFFF", 80, 0, "#FFFFFF");
			_ICC(image_hevo1, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo2, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo5, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo6, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo7, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo8, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo9, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo10, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo_bt1, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo_bt2, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo_bt3, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo_bt4, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo_bt5, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo_bt6, "#F3F7FB", "#FFFFFF");
			_ICC(image_hevo3, "#FFFFFF", "#F3F7FB");
		}
		else {
			if (hevo.getString("mode", "").equals("false")) {
				_NavStatusBarColor("#FFFFFF", "#FFFFFF");
				_DARK_ICONS();
				bg_hevo.setBackgroundColor(0xFFFFFFFF);
				image_hevo2.setImageResource(R.drawable.hevo_team_8);
				text_hevo1.setTextColor(0xFF212121);
				text_hevo2.setTextColor(0xFF212121);
				text_hevo3.setTextColor(0xFF212121);
				text_hevo4.setTextColor(0xFF212121);
				text_hevo5.setTextColor(0xFF212121);
				text_hevo6.setTextColor(0xFF212121);
				text_hevo7.setTextColor(0xFF212121);
				text_hevo8.setTextColor(0xFF212121);
				_rippleRoundStroke(bt_hevo_1, "#F3F7FB", "#FFFFFF", 80, 0, "#FFFFFF");
				_rippleRoundStroke(bt_hevo_2, "#F3F7FB", "#FFFFFF", 80, 0, "#FFFFFF");
				_rippleRoundStroke(bt_hevo_3, "#F3F7FB", "#FFFFFF", 80, 0, "#FFFFFF");
				_rippleRoundStroke(bt_hevo_4, "#F3F7FB", "#FFFFFF", 80, 0, "#FFFFFF");
				_rippleRoundStroke(bt_hevo_5, "#F3F7FB", "#FFFFFF", 80, 0, "#FFFFFF");
				_rippleRoundStroke(bt_hevo_6, "#F3F7FB", "#FFFFFF", 80, 0, "#FFFFFF");
				_rippleRoundStroke(bt_hevo_pro, "#FF4433", "#FFFFFF", 80, 0, "#FFFFFF");
				_ICC(image_hevo1, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo2, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo5, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo6, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo7, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo8, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo9, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo10, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo_bt1, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo_bt2, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo_bt3, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo_bt4, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo_bt5, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo_bt6, "#4D4D4D", "#FFFFFF");
				_ICC(image_hevo3, "#FFFFFF", "#F3F7FB");
			}
		}
	}
	
	
	public void _addCardView(final View _layoutView, final double _margins, final double _cornerRadius, final double _cardElevation, final double _cardMaxElevation, final boolean _preventCornerOverlap, final String _backgroundColor) {
		androidx.cardview.widget.CardView cv = new androidx.cardview.widget.CardView(this);
		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		int m = (int)_margins;
		lp.setMargins(m,m,m,m);
		cv.setLayoutParams(lp);
		int c = Color.parseColor(_backgroundColor);
		cv.setCardBackgroundColor(c);
		cv.setRadius((float)_cornerRadius);
		cv.setCardElevation((float)_cardElevation);
		cv.setMaxCardElevation((float)_cardMaxElevation);
		cv.setPreventCornerOverlap(_preventCornerOverlap);
		if(_layoutView.getParent() instanceof LinearLayout){
			ViewGroup vg = ((ViewGroup)_layoutView.getParent());
			vg.removeView(_layoutView);
			vg.removeAllViews();
			vg.addView(cv);
			cv.addView(_layoutView);
		}else{
			
		}
	}
	
	
	public void _SetCornerRadius(final View _view, final double _radius, final double _shadow, final String _color) {
		android.graphics.drawable.GradientDrawable ab = new android.graphics.drawable.GradientDrawable();
		
		ab.setColor(Color.parseColor(_color));
		ab.setCornerRadius((float) _radius);
		_view.setElevation((float) _shadow);
		_view.setBackground(ab);
		
		//Add More block in OnCreateActivity :
	}
	
	
	public void _NavStatusBarColor(final String _color1, final String _color2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			Window w = this.getWindow();	w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);	w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(Color.parseColor("#" + _color1.replace("#", "")));	w.setNavigationBarColor(Color.parseColor("#" + _color2.replace("#", "")));
		}
	}
	
	
	public void _ICC(final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	public void _performClick(final View _view) {
		_view.performClick();
		//by hevo team
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