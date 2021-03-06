package edu.wisc.cs.cs638.messagesearch.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import edu.wisc.cs.cs638.messagesearch.R;

public class ThreadListFragment extends ListFragment {

	 /**
     * Create a new instance of DetailsFragment, initialized to
     * show the text at 'index'.
     */
    public static ThreadListFragment newInstance(int index) {
    	ThreadListFragment f = new ThreadListFragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);

        return f;
    }

    public int getShownIndex() {
        return getArguments().getInt("index", 0);
    }

    

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		

		// TODO Remove the following
		List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();

		HashMap<String, String> dataMap;

		dataMap = new HashMap<String, String>();
		dataMap.put("Message", "John Does: Hi");
		dataList.add(dataMap);

		dataMap = new HashMap<String, String>();
		dataMap.put("Message", "Jane Does: Hello");
		dataList.add(dataMap);

		dataMap = new HashMap<String, String>();
		dataMap.put("Message", "John Does: Bye");
		dataList.add(dataMap);

		dataMap = new HashMap<String, String>();
		dataMap.put("Message", "Jane Does: See ya");
		dataList.add(dataMap);

		SimpleAdapter adapter = new SimpleAdapter(getActivity(), dataList,
				R.layout.thread_list_item, new String[] { "Message" },
						new int[] { R.id.thread_text });

		setListAdapter(adapter);
	}

}
