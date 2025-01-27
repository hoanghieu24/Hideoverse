<template>
    <div class="container">
        <h2>Upload Your Music</h2>
        <form action="upload.php" method="POST" enctype="multipart/form-data">
            <div class="form-group">
                <label for="songTitle">Song Title:</label>
                <input type="text" id="songTitle" name="songTitle" required>
            </div>
            <div class="form-group">
                <label for="artist">Artist:</label>
                <input type="text" id="artist" name="artist" required>
            </div>
            <div class="form-group">
                <label for="album">Album:</label>
                <input type="text" id="album" name="album">
            </div>
            <div class="form-group">
                <label for="genre">Genre:</label>
                <input type="text" id="genre" name="genre">
            </div>
            <div class="form-group">
                <label for="musicFile">Upload File:</label>
                <input type="file" id="musicFile" name="musicFile" accept="audio/*" required>
            </div>
            <button type="submit">Upload Music</button>
        </form>
    </div>
  </template>
  
  <script>
  export default {
    
  };
  </script>
  
  <style scoped>
  body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    margin: 0;
    padding: 0;
}
.container {
    max-width: 500px;
    margin: 50px auto;
    padding: 20px;
    background-color: #fff;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    border-radius: 10px;
}
h2 {
    text-align: center;
}
.form-group {
    margin-bottom: 15px;
}
label {
    font-weight: bold;
}
input[type="text"], input[type="file"] {
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
}
button {
    width: 100%;
    padding: 10px;
    background-color: #28a745;
    color: #fff;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
}
button:hover {
    background-color: #218838;
}
  </style>
  