$(function(){
	var topOfOthDiv = $(".hideshare").offset().top;
	$(window).scroll(function() {
		if($(window).scrollTop() > topOfOthDiv) { //scrolled past the other div?
			$(".share").hide(); //reached the desired point -- show div
		}
		else{
			$(".share").show();
		}
	});
});

document.querySelectorAll('.copyBtn').forEach(button => {
	button.addEventListener('click', () => {
		const codeBlock = button.closest('.codeBackground').querySelector('code');
		const textToCopy1 = codeBlock.textContent || codeBlock.innerText;

		//textToCopy = textToCopy.replace(/&emsp;/g, '');
		textToCopy = textToCopy1.replace(/\u2003/g, '\t');

		navigator.clipboard.writeText(textToCopy).then(() => {
			button.textContent = 'Copied!';
			setTimeout(() => {
				button.textContent = 'Copy';
			}, 2000); // Change back to "Copy" after 2 seconds
		}).catch(err => {
			console.error('Could not copy text: ', err);
		});
	});
});

const copyButtons = document.querySelectorAll('.copy-btn');

    copyButtons.forEach(button => {
        button.addEventListener('click', function() {
            // Get the previous <pre><code> element (the one to be copied)
            const codeBlock = button.previousElementSibling;
            
            // Create a range and selection to copy the text content
            const range = document.createRange();
            range.selectNodeContents(codeBlock);
            const selection = window.getSelection();
            selection.removeAllRanges();  // Clear previous selections
            selection.addRange(range);  // Add the new selection
            
            try {
                // Try to execute the copy command
                document.execCommand('copy');
                alert('Code copied to clipboard!');
            } catch (err) {
                console.error('Error copying text: ', err);
            }
        });
    });