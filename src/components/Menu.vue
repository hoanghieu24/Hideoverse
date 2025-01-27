<template>
    <div class="left-sidebar-pro">
      <nav id="sidebar" class="sidebar-custom">
        <div class="sidebar-header">
          <a href="index.html">
            <img class="main-logo" src="img/logo/logo.png" alt="Logo">
          </a>
          <strong><a href="index.html"><img src="img/logo/logosn.png" alt="Logo"></a></strong>
        </div>
        <div class="menu-wrap">
          <nav class="sidebar-nav">
            <ul class="metismenu" id="menu1">
              <!-- Dashboard -->
              <li class="menu-item">
                <a class="has-arrow" href="javascript:void(0)" aria-expanded="false">
                  <span class="icon"><i class="fa fa-home"></i></span>
                  <span class="menu-title">Quản lý Nhạc </span>
                </a>
                <ul class="submenu" aria-expanded="false">
                  <li><a href="index.html">Quản lý nhạc </a></li>
                  <li><a href="index-1.html">Quản lý Album</a></li>
                  <li><a href="index-2.html">Quản lý Playlist</a></li>
                </ul>
              </li>
  
              <!-- Professors -->
              <li class="menu-item">
                <a class="has-arrow" href="all-professors.html" aria-expanded="false">
                  <span class="icon"><i class="fa fa-user-graduate"></i></span>
                  <span class="menu-title">Quản lý người dùng</span>
                </a>
                <ul class="submenu" aria-expanded="false">
                  <li><a href="all-professors.html">Quản lý tài khoản </a></li>
                  <li><a href="add-professor.html">Quản lý người nghe </a></li>
                  <li><a href="edit-professor.html">Quản lý ca sĩ </a></li>
                </ul>
              </li>
  
              <!-- Students -->
              <li class="menu-item">
                <a class="has-arrow" href="all-students.html" aria-expanded="false">
                  <span class="icon"><i class="fa fa-users"></i></span>
                  <span class="menu-title">Trống</span>
                </a>
                <ul class="submenu" aria-expanded="false">
                  <li><a href="all-students.html">All Students</a></li>
                  <li><a href="add-student.html">Add Student</a></li>
                  <li><a href="edit-student.html">Edit Student</a></li>
                </ul>
              </li>
            </ul>
          </nav>
        </div>
      </nav>
    </div>
  </template>
  
  
  <style scoped>
  /* Sidebar */
  .sidebar-custom {
    background-color: #2e3b4e;
    width: 250px;
    height: 100vh;
    position: fixed;
    top: 0;
    left: 0;
    color: #fff;
    box-shadow: 2px 0 10px rgba(0, 0, 0, 0.1);
    transition: all 0.3s ease;
  }
  
  .sidebar-header {
    padding: 20px;
    text-align: center;
  }
  
  .main-logo {
    width: 200px;
  }
  
  .menu-wrap {
    padding-top: 30px;
  }
  
  .sidebar-nav .metismenu > li {
    margin: 10px 0;
  }
  
  .menu-item > a {
    padding: 12px 20px;
    display: flex;
    align-items: center;
    color: #ddd;
    text-decoration: none;
    font-size: 16px;
    border-radius: 5px;
    transition: all 0.3s;
  }
  
  .menu-item > a:hover {
    background-color: #1c2737;
    color: #fff;
  }
  
  .menu-item .icon {
    margin-right: 10px;
    font-size: 20px;
  }
  
  .submenu {
    display: none;
    padding-left: 20px;
    opacity: 0;
    transition: opacity 0.4s ease, transform 0.4s ease;
    transform: translateY(-10px);
  }
  
  .menu-item.active > .submenu {
    display: block;
    opacity: 1;
    transform: translateY(0);
  }
  
  .has-arrow:after {
    content: ' ▼';
    font-size: 12px;
    margin-left: auto;
    transition: transform 0.3s ease;
  }
  
  .menu-item.active > a > .has-arrow:after {
    content: ' ▲';
    transform: rotate(180deg);
  }
  
  .submenu a {
    padding: 10px 20px;
    color: #bbb;
    text-decoration: none;
    font-size: 14px;
    border-radius: 5px;
    transition: all 0.3s;
  }
  
  .submenu a:hover {
    color: #fff;
    background-color: #344a63;
  }
  
  .submenu a:active {
    transform: scale(0.98);
    background-color: #4a5c77;
  }
  
  
  
      
  </style>
  
  <script>
document.addEventListener('DOMContentLoaded', () => {
  document.querySelectorAll('.has-arrow').forEach(item => {
    item.addEventListener('click', (event) => {
      event.preventDefault(); // Ngừng hành động mặc định của thẻ <a>
      let parentLi = item.parentElement;
      parentLi.classList.toggle('active'); // Thêm/loại bỏ lớp active khi nhấn vào

      let submenu = parentLi.querySelector('.submenu'); // Tìm submenu con
      if (submenu) {
        // Đảm bảo chỉ một submenu mở ra tại một thời điểm
        let allSubmenus = document.querySelectorAll('.submenu');
        allSubmenus.forEach(sub => {
          if (sub !== submenu) {
            sub.style.maxHeight = null; // Đóng tất cả submenu khác
          }
        });

        // Chuyển trạng thái hiển thị của submenu hiện tại
        if (submenu.style.maxHeight) {
          submenu.style.maxHeight = null;
        } else {
          submenu.style.maxHeight = submenu.scrollHeight + "px"; // Tạo hiệu ứng mở submenu
        }
      }
    });
  });
});



  </script>
  