
$(document).ready(function() {
  
  var form = $('form');
    form.submit(function( event ) {
      $.ajax({
        type: form.attr('method'),
        url: form.attr('action'),
      }).done(function(result) {
        $('#results').html(result).attr('class', 'alert alert-success');
      }).fail(function() {
        $('#results').html('Error, Illegal string...').attr('class', 'alert alert-danger');
      });
      event.preventDefault();
    });

    // To display the board initially
    jQuery(function(){
      jQuery('#button').click();
   });

   // This function takes the user input and does ____ with it
   getUserInput = function () {
    var userInput = document.getElementById("userInput").value;
    console.log(userInput);
  };
   
  
  
    
  });