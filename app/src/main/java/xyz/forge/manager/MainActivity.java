package xyz.forge.manager;

import android.graphics.Typeface;
import android.os.Build;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import xyz.forge.manager.R;
import xyz.forge.manager.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private LinearLayout linear1;
    private TextView textview1;
    private LottieAnimationView lottie1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear1 = findViewById(R.id.linear1);
        textview1 = findViewById(R.id.textview1);
        lottie1 = findViewById(R.id.lottie1);

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
            Window w = MainActivity.this.getWindow();
            w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            w.setStatusBarColor(0xFF111111);
        }
        
        textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/chillax_semi_bold.ttf"));
        
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
