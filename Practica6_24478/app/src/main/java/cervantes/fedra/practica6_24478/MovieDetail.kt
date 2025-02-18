package cervantes.fedra.practica6_24478

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MovieDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_movie_detail)

        val header: ImageView = findViewById(R.id.movie_header)
        val title: TextView = findViewById(R.id.movie_title_detail)
        val desc: TextView = findViewById(R.id.movie_desc)
        val btnBuyTicket: Button = findViewById(R.id.btn_buy_ticket)

        val content = intent.extras
        if (content != null) {
            header.setImageResource(content.getInt("header"))
            title.text = content.getString("titulo")
            desc.text = content.getString("sinopsis")
        }


        btnBuyTicket.setOnClickListener {
            val intent = Intent(this, SeatSelection::class.java)
            startActivity(intent)
        }
    }
}
