function search() {
    console.log('Searching...');

    var query = document.getElementById('searchInput').value;
    if (query) {
        // Redirect to search-results.html with the query as a URL parameter
        window.location.href = 'search-results.html?q=' + encodeURIComponent(query);
    }
    return false;
}

document.getElementById('searchInput').addEventListener('keypress', function(event) {
    if (event.key === 'Enter') {
        event.preventDefault();
        search();
    }
});