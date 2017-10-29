$(document).ready(function () {
  var form = $('#move');
  var form2 = $('#newgame');
  form.submit(function (event) {
    var number = $("#number").val();
    $.ajax({
      type: form.attr('method'),
      url: form.attr('action'),
      data: 'input=' + number
    }).done(function (result) {
      $('#results').html(result).attr('class', 'alert alert-success');
      // This cleans the input field
      document.getElementById("number").value = "";
    }).fail(function () {
      $('#results').html('Error, Illegal string...').attr('class', 'alert alert-danger');
    });
    event.preventDefault();
  });
  form2.submit(function (event) {
    $.ajax({
      type: form2.attr('method'),
      url: form2.attr('action')
    }).done(function (result) {
      $('#results').html(result).attr('class', 'alert alert-success');
      document.getElementById("number").value = "";
    });
    event.preventDefault();
  });
});
