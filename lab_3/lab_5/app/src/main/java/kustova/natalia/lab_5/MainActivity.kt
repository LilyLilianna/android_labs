package kustova.natalia.lab_5

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val file1_1 = File("Child1_1.txt")
        val file1_2 = File("Child1_2.mp4")
        val file2_1 = File("Child2_1.kek")
        val file2_2 = File("Child2_2.jpeg")
        val file2_3 = File("Child2_3.lol")
        val child1Folder = Folder("FirstFolder", fileSystemNodes = arrayOf(file1_1, file1_2))
        val child2Folder = Folder(
            "SecondFolder", fileSystemNodes = arrayOf(
                file2_1,
                file2_2,
                file2_3
            )
        )
        val rootFolder = Folder("RootFolder", fileSystemNodes = arrayOf(child1Folder, child2Folder))
        var result_text : String = """
            Path: ${file2_3.path} \n
            ${rootFolder.getChildNodes()}
            File type: ${(child2Folder.getChildNode(1) as File).getFileType()}
        """.trimMargin()
        var helloTextView : TextView = findViewById(R.id.result_text)
        helloTextView.setText(result_text);
    }
}