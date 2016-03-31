<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta http-equiv="content-type" content="text/html; charset=utf=8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />

    <title>${pageTitle}</title>
    <!-- Bootstrap core CSS -->
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom styles for this template -->
    <link href="dashboard.css" rel="stylesheet" />

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script type="text/javascript" src="assets/js/ember.js"></script>
    <![endif]-->

    <script>
        $(document).ready(function() {
            $("a").on("click", function () {
                $("a").find(".active").removeClass("active");
                $(this).parent().addClass("active");
            });
        });
    </script>

</head>