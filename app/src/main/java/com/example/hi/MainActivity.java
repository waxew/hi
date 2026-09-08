package com.example.hi;
import android.app.Activity; import android.os.Bundle; import android.graphics.Color; import android.view.Gravity; import android.widget.TextView;
public class MainActivity extends Activity { public void onCreate(Bundle s){super.onCreate(s); TextView t=new TextView(this); t.setText("سلام"); t.setTextSize(32); t.setTextColor(Color.BLACK); t.setGravity(Gravity.CENTER); setContentView(t);} }
