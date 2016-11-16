package interceptor.uri.match


class HelloWorldInterceptor {

    HelloWorldInterceptor() {
        // This should match regardless of server.contextPath setting
        match(uri: '/helloWorld')
    }

    boolean before() {
        response.status = 200
        response.outputStream.println("Intercepted!")
        false 
    }
}
