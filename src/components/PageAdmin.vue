<template>
    <div id="app">
      <!-- Sử dụng component Header và Menu -->
      <Headers />
      <Menu />
      <div class="main-content">
      </div>
    </div>
  </template>
  
  <script>
  // Import Menu.vue và Headers.vue từ thư mục components
  import Menu from '../components/Menu.vue';
  import Headers from './Headers.vue';
  
  export default {
    name: 'App',  // Chỉ cần khai báo 1 lần
    components: {
      Headers,  // Đăng ký component Header
      Menu,     // Đăng ký component Menu
    },
  };
  </script>
  
  <style>
  #app {
    display: flex;
  }
  
  .main-content {
    margin-left: 250px; /* Đảm bảo nội dung chính không bị che bởi menu */
    padding: 20px;
  }
  </style>
  