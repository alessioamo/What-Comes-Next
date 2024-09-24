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
		const textToCopy = codeBlock.textContent || codeBlock.innerText;

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