package io.chronize.blairbash;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import org.apache.http.client.HttpClient;

public class BrowseFragment extends Fragment {

	public static BrowseFragment newInstance() {
		BrowseFragment fragment = new BrowseFragment();
		Bundle args = new Bundle();
		fragment.setArguments(args);
		return fragment;
	}

	public BrowseFragment() {
//		RequestQueue queue = Volley.
//		String url = "http://www.blairbash.org/browse";

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_browse, container, false);
	}

	public void goQuote(View view) {

	}

}
