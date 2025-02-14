package cervantes.fedra.practica6_24478

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cervantes.fedra.practica6_24478.databinding.ActivityDetallePeliculaBinding

class DetallePelicula : AppCompatActivity() {

    private lateinit var binding: ActivityDetallePeliculaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityDetallePeliculaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras

        if (bundle != null) {
            binding.ivPeliculaImagen.setImageResource(bundle.getInt("header"))
            binding.tvNombrePelicula.text = bundle.getString("nombre")
            binding.tvPeliculaDesc.text = bundle.getString("sinopsis")
        }
    }
}
