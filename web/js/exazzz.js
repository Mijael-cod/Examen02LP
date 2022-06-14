$(document).ready(function () {

    listarPost2();
});
function listarPost2() {
    $.get("post", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {


            console.log("pene");
            $("#producto").append($("<option>", {
                value: x[i],
                text: x[i].descripcion

            })
                    );


        }

    });

}
