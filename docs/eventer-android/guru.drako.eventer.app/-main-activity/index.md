---
title: MainActivity - eventer-android
---

[eventer-android](../../index.html) / [guru.drako.eventer.app](../index.html) / [MainActivity](./index.html)

# MainActivity

`class MainActivity : AppCompatActivity, CoroutineScope`

The main activity.

The main activity displays a list of events matching the user's filters.

### Constructors

| [&lt;init&gt;](-init-.html) | `MainActivity()`<br>The main activity. |

### Properties

| [coroutineContext](coroutine-context.html) | `val coroutineContext: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)<br>The [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html) of the MainActivity. |

### Functions

| [onCreate](on-create.html) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Configure the layout of the activity. |
| [onCreateOptionsMenu](on-create-options-menu.html) | `fun onCreateOptionsMenu(menu: `[`Menu`](https://developer.android.com/reference/android/view/Menu.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Configure the options menu. |
| [onOptionsItemSelected](on-options-item-selected.html) | `fun onOptionsItemSelected(item: `[`MenuItem`](https://developer.android.com/reference/android/view/MenuItem.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Handle selection of an options menu item. |
| [showPreferences](show-preferences.html) | `fun showPreferences(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Switch to the [SettingsActivity](../-settings-activity/index.html). |

