dependencies {
    api("org.graphstream:pherd:_")
    api("org.graphstream:mbox2:_")
}

publishOnCentral {
    projectDescription.set(
        "The GraphStream library. With GraphStream you deal with" +
        "graphs. Static and Dynamic. You create them from scratch, from a file" +
        "or any source. You display and render them. This is the core package" +
        "that contains the minimal needed to read and write a graph."
    )

    projectLongName.set("gs-core")
}