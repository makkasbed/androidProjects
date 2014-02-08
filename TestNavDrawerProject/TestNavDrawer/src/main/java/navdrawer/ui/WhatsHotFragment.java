package navdrawer.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Gogetter on 14/11/13.
 */
public class WhatsHotFragment extends Fragment{
    public WhatsHotFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_whats, container, false);

        return rootView;
    }
}
