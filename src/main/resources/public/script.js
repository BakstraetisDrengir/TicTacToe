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
        }).fail(function() {
          $('#results').html('Error, Illegal string...').attr('class', 'alert alert-danger');
        });
        event.preventDefault();
      });
    });
