import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;

    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }
    public void saveGame(String path, GameProgress game) {
        try ( FileOutputStream savedGame = new FileOutputStream(path);
        ObjectOutputStream saveObject = new ObjectOutputStream(savedGame)){
           saveObject.writeObject(game);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void zipFiles(String path, String[] files) {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(path))) {
           for (int i = 0; i < files.length; i++) {
               try {
                   System.out.println(files[i]);
                   FileInputStream fis = new FileInputStream(files[i]);
                   ZipEntry entry = new ZipEntry(i + ".dat");
                   zos.putNextEntry(entry);
                   byte[] bufer = new byte[fis.available()];
                   fis.read(bufer);
                   zos.write(bufer);
                   zos.closeEntry();

                   }
               catch (Exception ex) {
                   System.out.println(ex.getMessage());
               }
               File file = new File(files[i]);
               if (file.delete()) {
                   System.out.println(i);
               }

           }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }
}