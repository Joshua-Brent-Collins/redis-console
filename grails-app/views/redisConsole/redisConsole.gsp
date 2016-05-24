<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <asset:stylesheet href="redis-console.css"/>
    <asset:javascript src="application-rc.js"/>
    <script type="text/javascript" >
        var submitCommand = function() {
            var baseUrl = document.location.href;
            $.ajax({
                type: 'POST',
                url: baseUrl + '/parseCommand',
                data: {
                    connection:$("#connection").val(),
                    command:$("#commands").val(),
                },
                success: function(data){
                    $("#results").val('');
                    $("#results").val(data);
                }
            });
        };
    </script>
</head>
<body>
    <div class="container">
        <form>
            <textarea id="connection" placeholder="Connection URL"></textarea>
            <textarea id="commands" placeholder="Command"></textarea>
        </form>
        <div class="btn">
            <button onclick="submitCommand()">Run</button>
        </div>
    </div>
    <div class="container">
        <textarea class="results" spellcheck="false" placeholder="Results" id="results"></textarea>
    </div>
</body>
</html>
