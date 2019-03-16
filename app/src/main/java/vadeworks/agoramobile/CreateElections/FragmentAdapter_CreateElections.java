package vadeworks.agoramobile.CreateElections;



import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import vadeworks.agoramobile.MainScreenFragments.TotalElections;

public class FragmentAdapter_CreateElections extends FragmentStatePagerAdapter {

    private static final int TAB_1 = 0;
    private static final int TAB_2 = 1;
    private static final int TAB_3 = 2;
    private static final int TAB_4 = 3;
    private static final int TAB_5 = 4;

    private static final int NB_TABS = 5;

    public FragmentAdapter_CreateElections(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case TAB_1:
                Phase1 tab1 = new Phase1();
                return tab1;

            case TAB_2:
                Phase2 tab2 = new Phase2();
                return tab2;

            case TAB_3:
                Phase3 tab3 = new Phase3();
                return tab3;

            case TAB_4:
                Phase4 tab4 = new Phase4();
                return tab4;

            case TAB_5:
                Phase5 tab5 = new Phase5();
                return tab5;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NB_TABS;
    }
}
