const owner = 'alessioamo'; // Replace with the owner of the repository
const repo = 'What-Comes-Next'; // Replace with the name of the repository

console.log('Fetching discussions from:', `https://api.github.com/repos/${owner}/${repo}/discussions`);

fetch(`https://api.github.com/repos/${owner}/${repo}/discussions`)
    .then(response => {
        console.log('Response status:', response.status, response.statusText);
        if (!response.ok) {
            throw new Error(`Failed to fetch discussions. Status: ${response.status} ${response.statusText}`);
        }
        return response.json();
    })
    .then(data => {
        // Process the fetched discussions
        console.log('Fetched discussions:', data);
        // Add more processing logic here if needed
    })
    .catch(error => console.error('Error fetching discussions:', error));
