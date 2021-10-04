package mx.tecnm.tepic.ladm_u2_ejercicio1_cilostimersehilos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var contador = 1
    val timer = object : CountDownTimer(20000,200){ //20000/200=100
        override fun onTick(p0: Long) {
            //SE EJECUTA CUANDO EL INTERVALO SE HACE 0
            //LO HACE 99 VECES
            txtT.text="EL VALOR DE TIMER ${contador}"
            contador++
        }

        override fun onFinish() {
            //CUANDO EL TIEMPO TOTAL SE HACE 0
            //LO HACE UNA VEZ
            start() //asi se pende en segundo plano
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnC.setOnClickListener {
            (0..100000).forEach {
                txtC.text="EL VALOR DEL CICLO ${it}"
            }
        }

        btnt.setOnClickListener {
            timer.start()
        }
    }
}