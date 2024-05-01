const fetch = require('node-fetch');

const repositoryOwner = 'alessioamo';
const repositoryName = 'What-Comes-Next';

fetch(`https://api.github.com/repos/${repositoryOwner}/${repositoryName}/discussions`)
    .then(response => {
        if (!response.ok) {
            throw new Error('Failed to fetch discussions');
        }
        return response.json();
    })
    .then(data => {
        // Process the fetched data
        console.log(data);
    })
    .catch(error => console.error('Error fetching discussions:', error));
