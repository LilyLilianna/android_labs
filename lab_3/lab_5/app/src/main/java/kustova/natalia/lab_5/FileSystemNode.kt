package kustova.natalia.lab_5

interface FileSystemNode {
    var parentElement: FileSystemNode?
    var name: String?
    var path: String?
}