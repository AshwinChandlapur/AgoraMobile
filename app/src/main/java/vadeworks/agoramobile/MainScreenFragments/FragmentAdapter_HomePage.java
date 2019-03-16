package vadeworks.agoramobile.MainScreenFragments;



import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentAdapter_HomePage extends FragmentStatePagerAdapter {

    private static final int TAB_1 = 0;
    private static final int TAB_2 = 1;
    private static final int TAB_3 = 2;

    private static final int NB_TABS = 3;

    public FragmentAdapter_HomePage(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case TAB_1:
                TotalElections tab1 = new TotalElections();
                return tab1;

            case TAB_2:
                TotalElections tab2 = new TotalElections();
                return tab2;

            case TAB_3:
                TotalElections tab3 = new TotalElections();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NB_TABS;
    }
}
