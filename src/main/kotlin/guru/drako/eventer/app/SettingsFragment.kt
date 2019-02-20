package guru.drako.eventer.app

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

/**
 * The fragment used to show the preferences on the [SettingsActivity].
 */
class SettingsFragment : PreferenceFragmentCompat() {
  /**
   * Configure the fragment to use preferences.xml as the source for available settings.
   */
  override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
    setPreferencesFromResource(R.xml.preferences, rootKey)
  }
}
