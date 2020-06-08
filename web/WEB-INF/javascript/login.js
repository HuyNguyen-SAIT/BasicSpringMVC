$(document).ready(function(){
    $("#pnum").onkeyup(function() {
        $.get("login?action=validate&pnum=" + $("#pnum").value(), function(response) {

        });
    });


    // $("#itemSearch").keyup(function() {
    //     $.get("admin?action=checkItem&itemName=" + $("#itemSearch").val(), function(response) {
    //         document.getElementById("searchResult").innerHTML = response;
    //     });
    // });
    //
    // $("#chosenCate").change(function() {
    //     $.get("admin?action=EditCategory", function(){
    //         var chosenCate = document.getElementById("chosenCate");
    //         var selectedCate = chosenCate.options[chosenCate.selectedIndex].text;
    //         document.getElementById("modifyCateName").value=selectedCate;
    //         document.getElementById("modify").value=selectedCate;
    //         document.getElementById("modifyCateName").readOnly = false;
    //         document.getElementById("modifyCateName").className = null;
    //     });
    //});
});


