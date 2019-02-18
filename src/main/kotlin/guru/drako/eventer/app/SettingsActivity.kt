package guru.drako.eventer.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

class SettingsActivity : AppCompatActivity(), CoroutineScope {
  override val coroutineContext: CoroutineContext
    get() = Dispatchers.Main

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_settings)
  }
}
