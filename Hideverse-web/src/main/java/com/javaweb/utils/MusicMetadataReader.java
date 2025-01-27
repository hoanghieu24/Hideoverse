//package music.untils;
//import java.io.File;
//
//import org.jaudiotagger.audio.AudioFile;
//import org.jaudiotagger.audio.AudioFileIO;
//import org.jaudiotagger.audio.AudioHeader;
//
//public class MusicMetadataReader {
//    public static int getDurationInSeconds(String filePath) {
//        try {
//            File file = new File(filePath);
//            AudioFile audioFile = AudioFileIO.read(file);
//            AudioHeader audioHeader = audioFile.getAudioHeader();
//            return audioHeader.getTrackLength(); // Thời lượng tính bằng giây
//        } catch (Exception e) {
//            e.printStackTrace();
//            return 0; // Trả về 0 nếu không đọc được
//        }
//    }
//
//    public static void main(String[] args) {
//        String filePath = "path/to/your/music/file.mp3";
//        int duration = getDurationInSeconds(filePath);
//        System.out.println("Thời lượng của file nhạc: " + duration + " giây");
//    }
//}
