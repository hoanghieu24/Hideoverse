<template>
  <div class="search-form">
    <input v-model="title" placeholder="Nhập tên bài hát" class="form-control mb-2" />
    <input v-model="artist" placeholder="Nhập tên nghệ sĩ" class="form-control mb-2" />
    <input v-model="genre" placeholder="Nhập thể loại" class="form-control mb-2" />
    <button @click="searchMusic" class="btn btn-primary">Tìm kiếm</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      title: '',
      artist: '',
      genre: ''
    };
  },
  methods: {
    searchMusic() {
      this.$emit('search', {
        title: this.title,
        artist: this.artist,
        genre: this.genre
      });
    }
  }
};
</script>

<style scoped>
.search-form {
  max-width: 600px;
  margin: 0 auto;
  text-align: center;
}
input {
  width: 100%;
}
</style>
