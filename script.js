function toggleDarkMode() {
  const isChecked = document.getElementById('dark-mode-toggle').checked;
  
  if (isChecked) {
    document.documentElement.classList.add('dark-theme'); // Apply to html
    localStorage.setItem('theme', 'dark');
  } else {
    document.documentElement.classList.remove('dark-theme'); // Apply to html
    localStorage.setItem('theme', 'light');
  }
}

window.onload = () => {
  const savedTheme = localStorage.getItem('theme');
  // We only need this to make the toggle switch look right on refresh
  if (savedTheme === 'dark') {
    document.getElementById('dark-mode-toggle').checked = true;
  }
}
