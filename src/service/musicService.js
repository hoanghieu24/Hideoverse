import axios from 'axios';

const API_URL = 'http://localhost:8081/api/musics';  // Đổi từ 8080 -> 8081
  // Đảm bảo rằng URL này đúng với API của bạn

export default {
  // Lấy tất cả các bài hát
  getMusics(params) {
    return axios.get(API_URL, { params: params });
  },

  // Thêm một bài hát mới
  addMusic(musicDTO) {
    return axios.post(API_URL, musicDTO);
  },

  // Cập nhật một bài hát
  editMusic(musicDTO) {
    return axios.put(API_URL, musicDTO);
  },

  // Xóa bài hát
  deleteMusic(musicIds) {
    return axios.delete(`${API_URL}/${musicIds}`);
  }
};
