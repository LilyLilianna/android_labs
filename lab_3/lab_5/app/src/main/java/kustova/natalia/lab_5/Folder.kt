package kustova.natalia.lab_5

import java.util.*

class Folder(
    override var name: String?,
    override var parentElement: FileSystemNode? = null,
    override var path: String? = "",
    vararg fileSystemNodes: FileSystemNode?
) : FileSystemNode {

    private val arrayList: ArrayList<FileSystemNode>

    init {
        arrayList = ArrayList(fileSystemNodes.size)
        for (cureNode in fileSystemNodes) {
            (cureNode as FileSystemNode).parentElement = this
            arrayList.add(cureNode)
        }
    }

    fun getChildNodes() : String {
            val result = StringBuilder()
            result.append("Child nodes: ")
            for (curNode in arrayList) {
                result.append("""
                    ${curNode}
                """.trimIndent())
            }
            return result.toString()
        }

    fun getChildNode(indxNode: Int): FileSystemNode {
        return arrayList[indxNode]
    }
}