# redis-console
Simple grails redis console which can be used to execute commands that jedis supports

##Usage
  1. Add the plugin as runtime ":redis-console:1.0.0.0" to you applications BuildConfig.groovy (currently you must build and grails maven-install until this plugin is published).
  2. Configure any url mappings if needed depending on your application setup
  3. Navigate to the redisConsole endpoint on you application
  4. Enter your connection information for the redis server you wish to run commands on
  5. Enter the command and arguments you wish to run (Warning this is case sensitive and must match the jedis method name and case. Example: clientList)
  

