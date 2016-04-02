(function($) {
	$(document).ready(function() {
	// Ember JQuery functions

		$("a").on("click", function() {
			$("a").find(".active").removeClass("active");
			$(this).parent().addClass("active");
		});

		$(".personnelRecord").on("click", function() {
			alert($(this).val());

		});


	})
})(jQuery)


