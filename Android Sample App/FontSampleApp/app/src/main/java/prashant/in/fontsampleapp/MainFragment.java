package prashant.in.fontsampleapp;


import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import prashant.in.fonticons.FontIcon;


public class MainFragment extends Fragment {
    private View mSceneView;
    private View mSunView;
    private View mSkyView;

    private int mBlueSkyColor;
    private int mSunsetSkyColor;
    private int mNightSkyColor;

    private ProgressDialog pd;
    private AlertDialog ad;


    public static MainFragment newInstance() {
        return new MainFragment();
    }


    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);

        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menus, menu);

        FontIcon.setIconFontFA(getContext(), menu.findItem(R.id.menu_3), R.string.android_icon, 15.0f, "#00ffff");
        FontIcon.setIconFontMA(getContext(), menu.findItem(R.id.menu_2), "\uE145", 30.0f, "#ffff00");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b) {
        View view = inflater.inflate(R.layout.fragment, container, false);

        FontIcon.setIconFontFA(getContext(), view.findViewById(R.id.tv));
        FontIcon.setIconFontFA(getContext(), view.findViewById(R.id.btn));

        return view;
    }
}
