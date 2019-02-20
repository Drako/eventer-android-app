package guru.drako.eventer.app

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

/**
 * The fragment used to show the preferences on the [SettingsActivity].
 */
class SettingsFragment : PreferenceFragmentCompat() {
  /*
  private val fixedLocation by lazy {
    findPreference<EditTextPreference>("fixedLocation")
  }

  private val location by lazy {
    findPreference<ListPreference>("location")
  }
  */

  /**
   * Configure the fragment to use preferences.xml as the source for available settings.
   */
  override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
    setPreferencesFromResource(R.xml.preferences, rootKey)

    /*
    val currentLocationType = PreferenceManager
      .getDefaultSharedPreferences(activity)
      .getString("location", "ask")
    fixedLocation.isVisible = isLocationFixed(currentLocationType)

    location.setOnPreferenceChangeListener { _, newValue ->
      fixedLocation.isVisible = isLocationFixed(newValue)
      return@setOnPreferenceChangeListener true
    }
    */
  }

  /*
  private fun isLocationFixed(locationValue: Any?): Boolean {
    return locationValue == "fixed"
  }
  */
}
