package grails.plugin.redis

import redis.clients.jedis.Jedis
import redis.clients.jedis.Protocol.Command as COMMAND

class RedisConsoleService {

    static transactional = false

    def redisConnection

    def parseCommand(connection, commands) {

        redisConnection = new Jedis(connection)

        def cmd = commands[0]
        def argList = commands.drop(1)
        def commandResults = "An error occured while trying to run the given command."

        def isCommand = COMMAND.find {
            cmd.toUpperCase().contains(it.toString())
        }

        if (isCommand) {

            if (argList) {
                //use * to spread args for variadic functions
                commandResults = redisConnection."${cmd}"(*(argList))
            } else {
                commandResults = redisConnection."${cmd}"()
            }

        }

        redisConnection.close()
        return commandResults
    }
}
