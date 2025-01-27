<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <header>
    <div class="user-menu">
      <button @click="toggleMenu" class="user-btn">
        <span class="user-name"><img src="https://chiemtaimobile.vn/images/companies/1/%E1%BA%A2nh%20Blog/avatar-facebook-dep/Anh-avatar-hoat-hinh-de-thuong-doi-lot-soi.jpg?1704788224743" alt="" width="30px" height="30px"></span>
        <span class="user-name">{{ userName }}</span>
        <i class="fa fa-caret-down"></i>
      </button>
      <ul v-if="menuVisible" class="submenu">
        <li><a href="javascript:void(0)" @click="logout">Đăng xuất</a></li>
        <li><a href="javascript:void(0)" @click="goToSettings">Cài đặt</a></li>
      </ul>
    </div>
  </header>
</template>

<script>
export default {
  data() {
    return {
      userName: 'Hoàng Hiếu ',  // Tên người dùng có thể lấy từ dữ liệu người dùng đăng nhập
      menuVisible: false, // Trạng thái menu hiển thị
    };
  },
  methods: {
    // Toggle hiển thị menu
    toggleMenu() {
      this.menuVisible = !this.menuVisible;
    },
    // Thực hiện đăng xuất
    logout() {
      alert('Đã đăng xuất!');
      // Ở đây bạn có thể thực hiện các hành động đăng xuất như xoá token, chuyển hướng đến trang đăng nhập, v.v.
    },
    // Chuyển hướng đến trang cài đặt
    goToSettings() {
      alert('Chuyển đến trang cài đặt!');
      // Chuyển hướng đến trang cài đặt
      // Ví dụ: this.$router.push({ name: 'settings' });
    },
  },
};
</script>

<style scoped>
/* Header */
header {
  padding: 10px 20px;
  background-color: #344a63;
  color: white;
  display: flex;
  justify-content: flex-end;
  align-items: center;
  width: 100%; /* Kéo dài header toàn bộ chiều rộng */
  position: fixed; /* Đảm bảo header nằm cố định ở trên cùng */
  top: 0; /* Vị trí nằm trên cùng của trang */
  left: 0;
  z-index: 1000; /* Đảm bảo header hiển thị trên các phần khác */
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1); /* Tạo bóng cho header */
}

/* User button */
.user-btn {
  background: none;
  border: none;
  color: white;
  font-size: 16px;
  display: flex;
  align-items: center;
  cursor: pointer;
}

.user-btn .user-name {
  margin-right: 10px;
}

.user-btn .fa {
  font-size: 12px;
}

/* Submenu */
.submenu {
  display: block;
  position: absolute;
  top: 50px;
  right: 20px;
  background-color: #ffffff;
  list-style: none;
  padding: 10px;
  border-radius: 4px;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.submenu li {
  padding: 8px 10px;
}

.submenu li a {
  color: #344a63;
  text-decoration: none;
  display: block;
}

.submenu li a:hover {
  background-color: #f1f1f1;
  color: #000;
}
</style>
