package com.example.androidfileexplorer;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingsActivity extends Activity {
	public static final String PREF_UNKNOWN_MIME_TYPE_HANLDER = "pref_unknownMimeTypeHandler";
	public static final String PREF_DIR_COLOR = "pref_dirColor";
	public static final String PREF_FILE_COLOR = "pref_fileColor";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getFragmentManager().beginTransaction()
				.replace(android.R.id.content, new SettingsFragment()).commit();
	}

	public static class SettingsFragment extends PreferenceFragment {
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			addPreferencesFromResource(R.xml.preferences);
		}
	}
}
