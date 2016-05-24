package grails.plugin.redis
import grails.converters.JSON

class RedisConsoleController {

    def redisConsoleService

    def index() {
            render(view: "redisConsole")
    }

    def parseCommand() {
        render redisConsoleService.parseCommand(params.connection.replaceAll("\\s",""), params.command.tokenize())
    }

}