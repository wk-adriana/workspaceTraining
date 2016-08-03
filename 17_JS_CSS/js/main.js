document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('registration-form').addEventListener("submit", function(e) {
      var formElements = document.forms["registration-form"].elements;
      var firstName = formElements.namedItem("firstName");
      var lastName = formElements.namedItem("lastName");
      var email = formElements.namedItem("email");
      var isValid = true;
      if (firstName.value == "") {
        firstName.parentElement.classList.add("has-error");
        isValid = false;
      }

      if (lastName.value == "") {
        lastName.parentElement.classList.add("has-error");
        isValid = false;
      }

      if (email.value == "") {
        email.parentElement.classList.add("has-error");
        isValid = false;
      }

      if(!isValid) {
        e.preventDefault();
      }
   });

   var inputs = document.getElementsByTagName('input');
   for (var i = 0; i < inputs.length; i++) {
       inputs[i].addEventListener("keypress", function() {
         this.parentElement.className = "form-element";
       });
   }

});
