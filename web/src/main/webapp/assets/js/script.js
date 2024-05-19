// function tracking(){
var prev = document.getElementById('prev');
var next = document.getElementById('next');
var trak = document.getElementById('progress');
var step = document.getElementById('step');

next.addEventListener('click', function () {
    var cls = trak.className.split('-').pop();
    cls > 6 ? cls = 0 : cls++;

    step.innerHTML = cls;
    trak.className = 'progress-' + cls;
});

prev.addEventListener('click', function () {
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
    // alert(username.value + " " + password.value);

    fetch('login', {
        method: 'post',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            username: username.value,
            password: password.value,
        })
    }).then(
        response => {
            if (response.status == 200) {
                return response.text();
            } else {
                alert("Login Failed!");
                throw new Error("Login Failed!");
            }
        }
    ).then(
        text => {
            alert(text);

            username.value = "";
            password.value = "";

            window.location.href = "/web/addPackage";

        }
    )
}

// signin end-----------------------------------------------------------------------------------------------------------

// signup ----------------------------------------------------------------------------------------------------
function signUp() {

    let name = document.getElementById("signup__name");
    let mobile = document.getElementById("signup__mobile");
    let email = document.getElementById("signup__username");
    let password = document.getElementById("signup__password");

    // alert(name.value + " " + mobile.value + " " + email.value + " " + password.value);

    fetch('signup', {
        method: 'post',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            name: name.value,
            mobileNumber: mobile.value,
            username: email.value,
            password: password.value,
        })
    }).then(
        response => {
            if (response.status == 200) {
                return response.text();
            } else {
                alert("Registration Failed!");
                throw new Error("Registration Failed!");
            }
        }
    ).then(
        text => {

            alert(text);

            name.value = "";
            mobile.value = "";
            email.value = "";
            password.value = "";

            window.location.href = "/web/login";
        }
    )

}

// signup end----------------------------------------------------------------------------------------------------

// add package --------------------------------------------------------------------
function addPackage() {

    let packageId = document.getElementById("package_id");
     let customerName = document.getElementById("customer_name");
    let customerMobile = document.getElementById("customer_mobile");
    let address = document.getElementById("address");
    let city = document.getElementById("city");
    let packageWeight = document.getElementById("package_weight");

    // alert(packageId.value + " " + customerName.value + " " + customerMobile.value + " " + address.value + " " + city.value + " " + packageWeight.value);


    fetch('addPackage', {
        method: 'post',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            packageId: packageId.value,
            customerName: customerName.value,
            customerMobile: customerMobile.value,
            address: address.value,
            city: city.value,
            packageWeight: packageWeight.value
        })
    }).then(
        response => {
            if (response.status == 200) {
                return response.text();
            } else if (response.status == 401) {
                alert("Unauthorized Access!");
                throw new Error("Unauthorized Access!");
            } else {
                alert("Package Adding Failed!");
                throw new Error("Package Adding Failed!");
            }
        }
    ).then(
        text => {
            alert(text);
            window.location.href = "/web/addPackage";
        }
    )
}

// add package end ----------------------------------------------------------------