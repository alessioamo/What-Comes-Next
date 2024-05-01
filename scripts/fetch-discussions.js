fetch('https://api.github.com/repos/alessioamo/What-Comes-Next/discussions')
    .then(response => {
        if (!response.ok) {
            throw new Error(`Failed to fetch discussions. Status: ${response.status} ${response.statusText}`);
        }
        return response.json();
    })
    .then(data => {
        // Process the fetched data
        console.log('Fetched discussions:', data);
        // Add more processing logic here if needed
    })
    .catch(error => console.error('Error fetching discussions:', error));
