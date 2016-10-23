/**
 * Created by jjenkins on 10/23/2016.
 */
$(document).ready(function() {
    console.log("Document ready called!!");
    $.ajax({
        url: "/employee/John"
    }).then(function(data) {
        $('.greeting-id').append(data.name);
        $('.greeting-content').append(data.email);
        $('.bio-greeting-content').append(data.bio);

        console.log(data)

    });
});