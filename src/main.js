import { createApp } from 'vue';
import App from './App.vue';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import router from './router';
import './assets/styles.css'; 

const app = createApp(App);

// Đảm bảo chỉ gọi createApp một lần và đăng ký router
app.config.productionTip = false;
app.use(router); // Đăng ký router
app.mount('#app');
