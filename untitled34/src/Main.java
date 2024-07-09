import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuilder log = new StringBuilder();
        File dir1 = new File("D://Games", "src");
        File dir2 = new File("D://Games", "res");
        File dir3 = new File("D://Games", "savegames");
        File dir4 = new File("D://Games", "temp");
        if (dir1.mkdir()) {
            log.append("Папка src создана успешно");
            log.append('\n');
        }
        if (dir2.mkdir()) {
            log.append("Папка res создана успешно");
            log.append("\n");
        }
        if (dir3.mkdir()) {
            log.append("Папка savegames создана успешно");
            log.append("\n");
        }
        if (dir4.mkdir()) {
            log.append("Папка temp создана успешно");
            log.append("\n");
        }
        File dir11 = new File("D://Games/src", "main");
        if (dir11.mkdir()) {
            log.append("Папка main создана успешно");
            log.append("\n");
        }
        File dir12 = new File("D://Games/src", "test");
        if (dir12.mkdir()) {
            log.append("Папка test создана успешно");
            log.append("\n");
        }
        File file1 = new File("D://Games/src/main", "Main.java");
        try {
            if (file1.createNewFile()) {
                log.append("Файл Main.java создан успешно");
                log.append("\n");
            }
        } catch (IOException exc) {
            log.append(exc.getMessage());
            log.append("\n");
        }
        File file2 = new File("D://Games/src/main", "Utils.java");
        try {
            if (file2.createNewFile()) {
                log.append("Файл Utils.java создан успешно");
                log.append("\n");
            }
        } catch (IOException exc) {
            log.append(exc.getMessage());
            log.append("\n");
        }
        File dir21 = new File("D://Games/res", "drawables");
        if (dir21.mkdir()) {
            log.append("Папка drawables создана успешно");
            log.append("\n");
        }
        File dir22 = new File("D://Games/res", "vectors");
        if (dir22.mkdir()) {
            log.append("Папка vectors создана успешно");
            log.append("\n");
        }
        File dir23 = new File("D://Games/res", "icons");
        if (dir23.mkdir()) {
            log.append("Папка icons создана успешно");
            log.append("\n");
        }
        File file3 = new File("D://Games/temp/temp.txt");
        try {
            if (file3.createNewFile()) {
                try (FileOutputStream fos = new FileOutputStream("D://Games/temp/temp.txt")) {
                    byte[] bytes = log.toString().getBytes();
                    fos.write(bytes, 0, bytes.length);
                }
            }
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

    }
}