
// function tracking(){
    var prev = document.getElementById('prev');
    var next = document.getElementById('next');
    var trak = document.getElementById('progress');
    var step = document.getElementById('step');

    next.addEventListener('click', function(){
        var cls = trak.className.split('-').pop();
        cls > 6 ? cls = 0 : cls++;

        step.innerHTML = cls;
        trak.className = 'progress-' + cls;
    });

    prev.addEventListener('click', function(){
        var cls = trak.className.split('-').pop();
        cls < 1 ? cls = 7 : cls--;

        step.innerHTML = cls;
        trak.className = 'progress-' + cls;
    });
// }


function doTrack() {
    var num = document.getElementById("YQNum").value;
    if (num === "") {
        alert("Enter your tracking number.");
        return;
    }
    YQV5.trackSingle({
        //Required, Specify the container ID of the carrier content.
        YQ_ContainerId: "YQContainer",
        //Optional, specify tracking result height, max height 800px, default is 560px.
        YQ_Height: 560,
        //Optional, select carrier, default to auto identify.
        YQ_Fc: "0",
        //Optional, specify UI language, default language is automatically detected based on the browser settings.
        YQ_Lang: "en",
        //Required, specify the number needed to be tracked.
        YQ_Num: num
    });
}

// signin -----------------------------------------------------------------------------------------------------------
function signIn() {

    let username = document.getElementById("login__username");
    let password = document.getElementById("login__password");
    alert(username.value + " " + password.value);
    //
    // fetch('', {
    //     method: 'post',
    //     headers: {
    //         'Content-Type': 'application/json'
    //     },
    //     body: JSON.stringify({
    //         username: username.value,
    //         password: password.value,
    //     })
    // }).then(
    //     response => {
    //         if (response.status == 200) {
    //             return response.text();
    //         } else {
    //             alert("Login Failed!");
    //         }
    //     }
    // ).then(
    //     text => {
    //         alert(text);
    //
    //         username.value = "";
    //         password.value = "";
    //
    //     }
    // )
}
// signin end-----------------------------------------------------------------------------------------------------------
