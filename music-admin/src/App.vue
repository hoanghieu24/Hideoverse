<template>
  <div class="container mt-5">
    <h1 class="text-center">Music Admin Panel</h1>
    <MusicSearch @search="handleSearch" />
    <MusicList :musics="musics" />
  </div>
</template>

<script>
import axios from 'axios';
import MusicSearch from '../components/MusicSearch.vue';
import MusicList from '../components/MusicList.vue';

export default {
  components: {
    MusicSearch,
    MusicList
  },
  data() {
    return {
      musics: []
    };
  },
  methods: {
    async handleSearch(searchParams) {
      try {
        const response = await axios.get('http://localhost:8081/api/music', {
          params: searchParams
        });
        this.musics = response.data;
      } catch (error) {
        console.error("Lỗi khi gọi API:", error);
      }
    }
  }
};
</script>

<style scoped>
h1 {
  color: #4CAF50;
  font-size: 32px;
  margin-bottom: 20px;
  font-weight: bold;
}
.container {
  max-width: 900px;
  margin: 0 auto;
}
</style>
