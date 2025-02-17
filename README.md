# Kotlin Mutable Collection removeIf() Gotcha

This repository demonstrates a potential pitfall when using the `removeIf()` function on mutable collections (Lists, Maps, Sets) in Kotlin.  While convenient, `removeIf()` modifies the collection directly, which can lead to unexpected behavior if not handled carefully.  The example shows the function's behavior with lists, maps, and sets, highlighting the potential for errors in data processing if the implications of in-place modification are not considered.

## Example

The `bug.kt` file contains code showcasing the `removeIf()` function.  Notice how it removes even numbers from different collection types. 

The `bugSolution.kt` file (optional) may contain alternative approaches to avoid this issue, but the core lesson is about understanding the in-place modification nature of `removeIf()`.