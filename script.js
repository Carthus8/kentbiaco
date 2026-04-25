function sayHello() {
  alert("Hello! Welcome to my website 🎉");
}

function toggleDarkMode() {
  const isChecked = document.getElementById('dark-mode-toggle').checked;
  
  if (isChecked) {
    document.body.classList.add('dark-theme');
    localStorage.setItem('theme', 'dark');
  } else {
    document.body.classList.remove('dark-theme');
    localStorage.setItem('theme', 'light');
  }
}

window.onload = () => {
  const savedTheme = localStorage.getItem('theme');
  if (savedTheme === 'dark') {
    document.body.classList.add('dark-theme');
    document.getElementById('dark-mode-toggle').checked = true;
  }
}
