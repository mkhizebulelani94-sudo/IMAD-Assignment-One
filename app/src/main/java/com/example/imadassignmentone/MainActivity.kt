package com.example.imadassignmentone

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.imadassignmentone.ui.theme.IMADAssignmentOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Variable declarations
        val textInput = findViewById<EditText>(R.id.txtIn)
        val resultText = findViewById<TextView>(R.id.TvResult)
        val checkButton = findViewById<Button>(R.id.btnResult)
        val resetButton = findViewById<Button>(R.id.btnReset)

        //Declaring the sparks for each time of day
        val morningSpark = "Send a 'Good Morning' text to a friend or family member"
        val midmorningSpark = "Reach out to a colleague with a quick 'Thank You'"
        val breakfastSpark = "Go and get ready for your classes"
        val snacktimeSpark = "Share a funny meme or an interesting link with a friend"
        val playtimeSpark = "Go and meet up with your teammates for practice"
        val dinnerSpark = "Call a friend or relative for a 5-minute catch up"
        val afterdinnerSpark = "Leave a thoughtful comment on a friend's post"

        //Check button with if and else if statements for each spark
        checkButton.setOnClickListener {
            val text = textInput.text.toString().uppercase()

            if (textInput.text.toString().lowercase() == "morning"){
                resultText.text = morningSpark
            }
            else if (textInput.text.toString().lowercase() == "midmorning"){
                resultText.text = midmorningSpark
            }
            else if (textInput.text.toString().lowercase() == "breakfast"){
                resultText.text = breakfastSpark
            }
            else if (textInput.text.toString().lowercase() == "snacktime"){
                resultText.text = snacktimeSpark
            }
            else if (textInput.text.toString().lowercase() == "playtime"){
                resultText.text = playtimeSpark
            }
            else if (textInput.text.toString().lowercase() == "dinner"){
                resultText.text = dinnerSpark
            }
            else if (textInput.text.toString().lowercase() == "after dinner"){
                resultText.text = afterdinnerSpark
            }
            else {
                resultText.text = "Enter one of the following: morning, midmorning, breakfast, snacktime, playtime, dinner, after dinner"
            }

        }
        //Reset Button
        resetButton.setOnClickListener {
            textInput.text.clear()
            resultText.text = "Enter the time of day"
        }
    }
}

