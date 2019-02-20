package guru.drako.eventer.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

/**
 * The settings activity.
 *
 * The settings activity is used to configure the app.
 *
 * @see SettingsFragment
 */
class SettingsActivity : AppCompatActivity(), CoroutineScope {
  /**
   * The [CoroutineContext] of the SettingsActivity.
   *
   * By default coroutines will run in Android's UI thread.
   */
  override val coroutineContext: CoroutineContext
    get() = Dispatchers.Main

  /**
   * Configure the layout of the activity.
   */
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_settings)
  }
}
