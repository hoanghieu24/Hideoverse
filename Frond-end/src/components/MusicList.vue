<template>
  <div>
    <h2 class="text-center">Danh sách bài hát</h2>
    <table class="table table-striped">
      <thead>
        <tr>
          <th>ID</th>
          <th>Tiêu đề</th>
          <th>Nghệ sĩ</th>
          <th>Thể loại</th>
          <th>Album</th>
          <th>Thời lượng (giây)</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="music in musics" :key="music.id">
          <td>{{ music.id }}</td>
          <td>{{ music.title }}</td>
          <td>{{ music.artist }}</td>
          <td>{{ music.genre }}</td>
          <td>{{ music.album }}</td>
          <td>{{ music.duration }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  props: {
    musics: {
      type: Array,
      required: true
    }
  }
};
</script>

<style scoped>
h2 {
  color: #2196F3;
  margin-bottom: 20px;
}
</style>
