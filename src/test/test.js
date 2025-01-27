// Lấy các phần tử của giao diện
const songUrl = encodeURIComponent('y2mate.com - Giờ Thì buitruonglinh.mp3');
console.log(songUrl); // In ra đường dẫn đã mã hóa

const playButton = document.querySelector('.play');
const prevButton = document.querySelector('.prev');
const nextButton = document.querySelector('.next');
const volumeControl = document.querySelector('.volume');

// Các bài hát mẫu
const songs = [
  { title: 'Bài hát 1', url: songUrl},
  { title: 'Bài hát 2', url: 'song2.mp3' },
  { title: 'Bài hát 3', url: 'song3.mp3' },
];

let currentSongIndex = 0;
let audio = new Audio(songs[currentSongIndex].url);

// Hàm phát hoặc tạm dừng nhạc
playButton.addEventListener('click', () => {
  if (audio.paused) {
    audio.play();
    playButton.textContent = '⏸';  // Đổi biểu tượng thành "tạm dừng"
  } else {
    audio.pause();
    playButton.textContent = '▶';  // Đổi biểu tượng thành "phát"
  }
});

// Hàm chuyển bài hát trước
prevButton.addEventListener('click', () => {
  currentSongIndex = (currentSongIndex - 1 + songs.length) % songs.length;
  audio.src = songs[currentSongIndex].url;
  audio.play();
  playButton.textContent = '⏸';
});

// Hàm chuyển bài hát tiếp theo
nextButton.addEventListener('click', () => {
  currentSongIndex = (currentSongIndex + 1) % songs.length;
  audio.src = songs[currentSongIndex].url;
  audio.play();
  playButton.textContent = '⏸';
});

// Hàm điều chỉnh âm lượng
volumeControl.addEventListener('input', (event) => {
  audio.volume = event.target.value / 100;
});
