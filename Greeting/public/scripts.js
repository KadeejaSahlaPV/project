document.addEventListener('DOMContentLoaded', function () {
  const greetForm = document.getElementById('greetForm');
  const greetingDiv = document.getElementById('greeting');

  greetForm.addEventListener('submit', function (event) {
    event.preventDefault();

    const nameInput = document.getElementById('name');
    const name = nameInput.value;

    fetch('/greet', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/x-www-form-urlencoded',
      },
      body: `name=${name}`,
    })
      .then(response => response.text())
      .then(data => {
        greetingDiv.innerHTML = data;
      })
      .catch(error => {
        console.error('Error:', error);
      });
  });
});
