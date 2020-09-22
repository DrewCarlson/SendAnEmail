package test.email

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import androidx.core.app.ShareCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<Button>(R.id.button_first).setOnClickListener {
            ShareCompat.IntentBuilder.from(this)
                    .setChooserTitle("Will You See Me?")
                    .addEmailTo("a@real.email")
                    .startChooser()
        }
    }
}