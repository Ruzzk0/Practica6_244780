package cervantes.fedra.practica6_24478

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import cervantes.fedra.practica6_24478.databinding.ActivityDetallePeliculaBinding

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle_pelicula)

        var header: ImageView = findViewById(R.id.movie_header)
        var title: TextView = findViewById(R.id.movie_title_detail)
        var desc: TextView = findViewById(R.id.movie_desc)

        val content = intent.extras

        header.setImageResource(content!!.getInt("header"))
        title.setText(content.getString("titulo"))
        desc.setText(content.getString("sinopsis"))
    }
}