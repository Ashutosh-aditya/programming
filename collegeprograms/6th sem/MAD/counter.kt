//import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    private val timer = MyCounter(10000000000, 1000)
    var countervalue: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startBtn.setOnClickListener {
            timer.start()
            startBtn.isEnabled = false
        }
        stopBtn.setOnClickListener {
            timer.cancel()
            startBtn.isEnabled = true
        }
    }
    inner class MyCounter(millisInFuture: Long, countDownInterval: Long) :CountDownTimer(millisInFuture, countDownInterval) {
        override fun onFinish() {
        }
        override fun onTick(millisUntilFinished: Long) {
            countervalue++
            viewNumber.text = (countervalue).toString()
        }
    }
}