(function($) {
	$(document).ready(function() {
	// Ember JQuery functions

		$(document).ready(function() {
			$("a").on("click", function () {
				$("a").find(".active").removeClass("active");
				$(this).parent().addClass("active");
			});
		});


	})
})(jQuery)