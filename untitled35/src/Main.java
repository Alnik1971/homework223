//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GameProgress game1 = new GameProgress(3, 5, 7, 9);
        GameProgress game2 = new GameProgress(13, 15, 17, 19);
        GameProgress game3 = new GameProgress(23, 25, 27, 29);
        //D:\Games\savegames
        game1.saveGame("D:/Games/savegames/save1.dat", game1);
        game2.saveGame("D:/Games/savegames/save2.dat", game2);
        game3.saveGame("D:/Games/savegames/save3.dat", game3);
        String[] files = {
                "D:/Games/savegames/save1.dat",
                "D:/Games/savegames/save2.dat"
        };
        game1.zipFiles("D:/Games/savegames/arxiv1.zip", files);
    }
}