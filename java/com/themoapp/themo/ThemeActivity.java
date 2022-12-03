package com.themoapp.themo;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ThemeActivity extends AppCompatActivity {
    Button bApply;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);
        Intent i = getIntent();
        String s=i.getStringExtra("s");
        ImageView iv=findViewById(R.id.imageView);
        if(s.equals("1")){
            iv.setImageResource(R.drawable.theme1);
            }
        else if(s.equals("2")){
            iv.setImageResource(R.drawable.theme2);
            }
        else if(s.equals("3")){
            iv.setImageResource(R.drawable.theme3);
            }
        else if(s.equals("4")){
            iv.setImageResource(R.drawable.theme4);
            }
        else if(s.equals("5")){
            iv.setImageResource(R.drawable.theme5);
            }
        else if(s.equals("6")){
            iv.setImageResource(R.drawable.theme6);
            }
        else if(s.equals("7")){
            iv.setImageResource(R.drawable.theme7);
            }
        else if(s.equals("8")){
            iv.setImageResource(R.drawable.theme8);
            }
        else if(s.equals("9")){
            iv.setImageResource(R.drawable.theme9);
            }
        else if(s.equals("10")){
            iv.setImageResource(R.drawable.theme10);
            }
        else if(s.equals("11")){
            iv.setImageResource(R.drawable.theme11);
            }
        else if(s.equals("12")){
            iv.setImageResource(R.drawable.theme12);
            }
        else if(s.equals("13")){
            iv.setImageResource(R.drawable.theme13);
            }
        else if(s.equals("14")){
            iv.setImageResource(R.drawable.theme14);
            }
        else if(s.equals("15")){
            iv.setImageResource(R.drawable.theme15);
            }
        else if(s.equals("16")){
            iv.setImageResource(R.drawable.theme16);
            }
        else if(s.equals("17")){
            iv.setImageResource(R.drawable.theme17);
            }
        else if(s.equals("18")){
            iv.setImageResource(R.drawable.theme18);
            }
        else if(s.equals("19")){
            iv.setImageResource(R.drawable.theme19);
            }
        else if(s.equals("20")){
            iv.setImageResource(R.drawable.theme20);
            }
        else if(s.equals("21")){
            iv.setImageResource(R.drawable.theme21);
            }
        else if(s.equals("22")){
            iv.setImageResource(R.drawable.theme22);
            }
        else if(s.equals("23")){
            iv.setImageResource(R.drawable.theme23);
            }
        else if(s.equals("24")){
            iv.setImageResource(R.drawable.theme24);
            }
        else if(s.equals("25")){
            iv.setImageResource(R.drawable.theme25);
            }

    final WallpaperManager wm = WallpaperManager.getInstance(getApplicationContext());
    bApply=findViewById(R.id.button);
    bApply.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("ResourceType")
        @Override
        public void onClick(View v) {
            try {
                if(s.equals("1")) {
                    wm.setResource(R.drawable.theme1);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();
                }
                else if(s.equals("2")){
                    wm.setResource(R.drawable.theme2);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("3")){
                    wm.setResource(R.drawable.theme3);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("4")){
                    wm.setResource(R.drawable.theme4);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("5")){
                    wm.setResource(R.drawable.theme5);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("6")){
                    wm.setResource(R.drawable.theme6);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("7")){
                    wm.setResource(R.drawable.theme7);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("8")){
                    wm.setResource(R.drawable.theme8);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("9")){
                    wm.setResource(R.drawable.theme9);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("10")){
                    wm.setResource(R.drawable.theme10);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("11")){
                    wm.setResource(R.drawable.theme11);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("12")){
                    wm.setResource(R.drawable.theme12);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("13")){
                    wm.setResource(R.drawable.theme13);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("14")){
                    wm.setResource(R.drawable.theme14);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("15")){
                    wm.setResource(R.drawable.theme15);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("16")){
                    wm.setResource(R.drawable.theme16);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("17")){
                    wm.setResource(R.drawable.theme17);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("18")){
                    wm.setResource(R.drawable.theme18);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("19")){
                    wm.setResource(R.drawable.theme19);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("20")){
                    wm.setResource(R.drawable.theme20);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("21")){
                    wm.setResource(R.drawable.theme21);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("22")){
                    wm.setResource(R.drawable.theme22);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("23")){
                    wm.setResource(R.drawable.theme23);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("24")){
                    wm.setResource(R.drawable.theme24);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}
                else if(s.equals("25")){
                    wm.setResource(R.drawable.theme25);
                    Toast.makeText(getApplicationContext(),"wallpaper applied successfully", Toast.LENGTH_LONG).show();}

            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    });
    }

}
