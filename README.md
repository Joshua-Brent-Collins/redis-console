# redis-console
Simple Grails Redis console which can be used to execute commands that Jedis supports

##Usage
  1. Add the plugin as runtime ":redis-console:1.0.0" to you application's BuildConfig.groovy (currently you must build and grails maven-install until this plugin is published).
  2. Configure any url mappings if needed depending on your application setup
  3. Navigate to the redisConsole endpoint on your application
  4. Enter your connection information for the Redis server you wish to run commands on
  5. Enter the command and arguments you wish to run (Warning this is case-sensitive and must match the Jedis method name and case. Example: clientList)


