$(document).ready(function() {
      var form = $('form');
      form.submit(function( event ) {
        var number = $("#number").val();
        $.ajax({
          type: form.attr('method'),
          url: form.attr('action'),
          data: 'input=' + number
        }).done(function(result) {
          $('#results').html(result).attr('class', 'alert alert-success');
          // This cleans the input field
          document.getElementById("number").value = "";
        }).fail(function() {
          $('#results').html('Error, Illegal string...').attr('class', 'alert alert-danger');
        });
        event.preventDefault();
      });



    });
