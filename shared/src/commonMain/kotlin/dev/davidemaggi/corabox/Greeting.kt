package dev.davidemaggi.corabox

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}