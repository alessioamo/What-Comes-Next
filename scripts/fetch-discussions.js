fetch('https://api.github.com/repos/alessioamo/What-Comes-Next/discussions')
    .then(response => response.json())
    .then(data => {
        // Process the fetched data
        console.log(data);
    })
    .catch(error => console.error('Error fetching discussions:', error));