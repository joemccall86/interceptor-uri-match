package interceptor.uri.match

class HelloWorldController {

    static responseFormats = ['json']

    def index() { 
        respond text: 'Hello, world!'
    }
}
