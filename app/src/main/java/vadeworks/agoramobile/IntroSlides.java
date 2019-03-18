package vadeworks.agoramobile;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.cuneytayyildiz.onboarder.OnboarderActivity;
import com.cuneytayyildiz.onboarder.OnboarderPage;
import com.cuneytayyildiz.onboarder.utils.OnboarderPageChangeListener;

import java.util.Arrays;
import java.util.List;

import static vadeworks.agoramobile.SplashScreen.SHARED_PREF;

public class IntroSlides extends OnboarderActivity implements OnboarderPageChangeListener {


    Boolean registered;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences.Editor editor = getSharedPreferences(SHARED_PREF, MODE_PRIVATE).edit();
        editor.putBoolean("checkedIntro", true);
        editor.apply();

        List<OnboarderPage> pages = Arrays.asList(
                new OnboarderPage.Builder()
                        .title("Intro Slide 1")
                        .description("Agora Mobile Application")
                        .imageResourceId( R.drawable.agora)
                        .backgroundColorId(R.color.green)
                        .titleColorId(R.color.white)
                        .descriptionColorId(R.color.white)
                        .multilineDescriptionCentered(true)
                        .build(),

                // No need to write all of them :P

                new OnboarderPage.Builder()
                        .title("Intro Slide 2")
                        .description("Agora Mobile Application")
                        .imageResourceId( R.drawable.agora)
                        .backgroundColorId(R.color.green)
                        .titleColorId(R.color.white)
                        .descriptionColorId(R.color.white)
                        .multilineDescriptionCentered(true)
                        .build(),

                new OnboarderPage.Builder()
                        .title("Intro Slide 3")
                        .description("Agora Mobile Application")
                        .imageResourceId( R.drawable.agora)
                        .backgroundColorId(R.color.green)
                        .titleColorId(R.color.white)
                        .descriptionColorId(R.color.white)
                        .multilineDescriptionCentered(true)
                        .build()
        );
        setOnboarderPageChangeListener(this);
        initOnboardingPages(pages);
    }

    @Override
    public void onFinishButtonPressed() {

        SharedPreferences prefs = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
        registered = prefs.getBoolean("registered",false);
        if(!registered){
            Intent intent = new Intent(IntroSlides.this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }else{
            Intent intent = new Intent(IntroSlides.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }


    }

    @Override
    public void onPageChanged(int position) {

    }
}
