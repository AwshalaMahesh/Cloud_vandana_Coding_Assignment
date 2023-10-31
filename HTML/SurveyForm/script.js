function submitForm() {
    const form = document.getElementById("survey-form");
    if (form.checkValidity()) {
        const firstName = document.getElementById("first-name").value;
        const lastName = document.getElementById("last-name").value;
        const dob = document.getElementById("dob").value;
        const country = document.getElementById("country").value;
        const gender = document.querySelector("input[name='gender']:checked");
        const profession = document.getElementById("profession").value;
        const email = document.getElementById("email").value;
        const mobile = document.getElementById("mobile").value;

        // Build the content for the popup
        const popupContent = `
            <p><strong>First Name:</strong> ${firstName}</p>
            <p><strong>Last Name:</strong> ${lastName}</p>
            <p><strong>Date of Birth:</strong> ${dob}</p>
            <p><strong>Country:</strong> ${country}</p>
            <p><strong>Gender:</strong> ${gender ? gender.value : "Not selected"}</p>
            <p><strong>Profession:</strong> ${profession}</p>
            <p><strong>Email:</strong> ${email}</p>
            <p><strong>Mobile Number:</strong> ${mobile}</p>
        `;

        const popup = document.getElementById("popup");
        const popupContentDiv = document.getElementById("popup-content");
        popupContentDiv.innerHTML = popupContent;
        popup.style.display = "block";
        form.reset();
    } else {
        alert("Please fill in all required fields.");
    }
}

function resetForm() {
    document.getElementById("survey-form").reset();
}

function closePopup() {
    document.getElementById("popup").style.display = "none";
}
