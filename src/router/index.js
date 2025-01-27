import { createRouter, createWebHistory } from 'vue-router'; // Dùng createRouter và createWebHistory cho Vue 3
import Home from '../components/Home.vue';
// import MusicAdminPanel from '../components/MusicAdminPanel.vue';
import MusicAdd from '../components/MusicAdd.vue';
import PageAdmin from '@/components/PageAdmin.vue';


const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/admin',
    name: 'MusicAdminPanel',
    component: PageAdmin
  },
  {
    path: '/admin/addMusic',
    name: 'MusicAdd',
    component: MusicAdd
  }

];

const router = createRouter({
  history: createWebHistory(), // Sử dụng createWebHistory để quản lý các URL
  routes
});

export default router;
