package vadeworks.agoramobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import vadeworks.agoramobile.MainScreenFragments.Home;


import android.os.Bundle;
import com.shrikanthravi.customnavigationdrawer2.widget.SNavigationDrawer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{


    SNavigationDrawer sNavigationDrawer;
    Class fragmentClass;
    public static Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sNavigationDrawer = findViewById(R.id.navigationDrawer);

        List<com.shrikanthravi.customnavigationdrawer2.data.MenuItem> menuItems = new ArrayList<>();
        sNavigationDrawer.setAppbarTitleTV("Dashboard");
        //Use the MenuItem given by this library and not the default one.
        //First parameter is the title of the menu item and then the second parameter is the image which will be the background of the menu item.

        menuItems.add(new com.shrikanthravi.customnavigationdrawer2.data.MenuItem("Dashboard",R.mipmap.ic_launcher));
        menuItems.add(new com.shrikanthravi.customnavigationdrawer2.data.MenuItem("Profile",R.mipmap.ic_launcher));
        menuItems.add(new com.shrikanthravi.customnavigationdrawer2.data.MenuItem("About",R.mipmap.ic_launcher));
        menuItems.add(new com.shrikanthravi.customnavigationdrawer2.data.MenuItem("Help",R.mipmap.ic_launcher));

        //then add them to navigation drawer
        sNavigationDrawer.setMenuItemList(menuItems);
        sNavigationDrawer.setBackground(getResources().getDrawable(R.drawable.agora));

        fragmentClass =  Home.class;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out).replace(R.id.frameLayout, fragment).commit();
        }

        //Listener to handle the menu item click. It returns the position of the menu item clicked. Based on that you can switch between the fragments.

        sNavigationDrawer.setOnMenuItemClickListener(new SNavigationDrawer.OnMenuItemClickListener() {
            @Override
            public void onMenuItemClicked(int position) {
                System.out.println("Position "+position);

                switch (position){
                    case 0:{
                        fragmentClass = Home.class;
                        break;
                    }
                    case 1:{
                        fragmentClass = BlankFragment.class;
                        break;
                    }
                    case 2:{
                        fragmentClass = BlankFragment.class;
                        break;
                    }
                    case 3:{
                        fragmentClass = BlankFragment.class;
                        break;
                    }
                }

                //Listener for drawer events such as opening and closing.
                sNavigationDrawer.setDrawerListener(new SNavigationDrawer.DrawerListener() {

                    @Override
                    public void onDrawerOpened() {

                    }

                    @Override
                    public void onDrawerOpening(){

                    }

                    @Override
                    public void onDrawerClosing(){
                        System.out.println("Drawer closed");

                        try {
                            fragment = (Fragment) fragmentClass.newInstance();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        if (fragment != null) {
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            fragmentManager.beginTransaction().setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out).replace(R.id.frameLayout, fragment).commit();

                        }
                    }

                    @Override
                    public void onDrawerClosed() {

                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {
                        System.out.println("State "+newState);
                    }
                });
            }
        });
    }
}
