package guru.drako.eventer.app

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

/**
 * The main activity.
 *
 * The main activity displays a list of events matching the user's filters.
 */
class MainActivity : AppCompatActivity(), CoroutineScope {
  /**
   * The [CoroutineContext] of the MainActivity.
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
    setContentView(R.layout.activity_main)
    setSupportActionBar(toolbar)
  }

  /**
   * Configure the options menu.
   */
  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.main_menu, menu)
    return true
  }

  /**
   * Handle selection of an options menu item.
   */
  override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
    R.id.settings -> {
      showPreferences()
      true
    }
    else -> super.onOptionsItemSelected(item)
  }

  /**
   * Switch to the [SettingsActivity].
   */
  fun showPreferences() {
    startActivity(Intent(this, SettingsActivity::class.java))
  }
}
