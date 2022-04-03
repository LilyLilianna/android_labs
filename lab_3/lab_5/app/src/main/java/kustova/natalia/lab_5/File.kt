package kustova.natalia.lab_5

class File(
        override var name: String?,
        override var parentElement: FileSystemNode? = null,
        filePath: String? = ""
    ) : FileSystemNode {
    override var path: String? = filePath
        get() {
            return if (parentElement == null) "://$name" else "$parentElement/$name"
        }
    fun getFileType(): String? {
        val fileName = name!!
        return fileName.substring(fileName.lastIndexOf('.'))
    }
}