public open class AbstractFileSystemNode public constructor() : kustova.natalia.FileSystemNode {
    private final var name: kotlin.String?

    private final var parent: kustova.natalia.FileSystemNode?

    public open fun getName(): kotlin.String

    public open fun getParentElement(): kustova.natalia.FileSystemNode

    public open fun getPath(): kotlin.String

    public final fun setName(name: kotlin.String?): kotlin.Unit

    public final fun setParent(parent: kustova.natalia.FileSystemNode?): kotlin.Unit
}