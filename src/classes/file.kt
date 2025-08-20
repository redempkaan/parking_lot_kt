package classes

import java.io.PrintWriter
import java.io.File
import java.io.FileWriter


fun outputStr(log: String) {
    //If specified file does not exist, creates a new one; if it exists, adds the log to the end of the file

    PrintWriter(FileWriter(File("lotLog.txt"), File("lotLog.txt").exists())).use { writer -> writer.println(log)}
}
