package org.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setSong(Music music) {
        this.music = music;
    }

  /*  public void playMusicList() {
        for(Music musicItem : musicList) {
            System.out.println(musicItem.getSong());
        }
    }*/

















    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        if ((a && b) == true && (c == false) && (d == false)
                || (a && c) == true && (b == false) && (d == false)
                || (a && d) == true && (b == false) && (c == false)
                || (b && c) == true && (a == false) && (d == false)
                || (b && d) == true && (c == false) && (a == false)
                || (c && d) == true && (b == false) && (a == false)) {
            return true;
        } else {
            return false;
        }
    }

    public static int gregorianCallendar(int year) {
        int i;
        int count = 0;
        for (i = 1; i <= year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                 count++;
            }
        }
        return count;
    }

    public static boolean checkSum(double a, double b, double c) {
        double res = a + b;
       // double res = Math.add(a, b);

        System.out.println(res);
        System.out.println(0x0bp3);
        res = Math.rint(res);
        System.out.println(res);
        if(res == c){
            return true;
        } else {return false;}
    }

    public static char charset(int a) {
        int preResult = (int) '\\' + a;
        char result = (char) preResult;

        return result;
    }

    public static boolean polindrom(String str) {
        StringBuilder buildStr = new StringBuilder(str);
        StringBuilder revStr = new StringBuilder(buildStr);
        StringBuilder revStr2 = revStr.reverse();
        String resStr = buildStr.toString().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String resRevStr = revStr2.toString().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (resStr.equals(resRevStr)) {
            return true;
        }else{
            return false;
        }
    }

    public static BigInteger factorial(int value) {
       BigInteger result = new BigInteger("1");
        for(int i = 1; i <= value; i++){
            BigInteger big = BigInteger.valueOf(i);

            result = result.multiply(big);
        }
        return result;
    }

    public static void sortArray(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int firstArrayCounter = 0;
        int secondArrayCounter = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        for (int i = 0; result.length > i; i++) {
            if (a1.length > firstArrayCounter) {
                firstNumber = a1[firstArrayCounter];
            }
            if (a2.length > secondArrayCounter){
                secondNumber = a2[secondArrayCounter];
            }
            if(a1.length > firstArrayCounter && firstNumber < secondNumber || a2.length <= secondArrayCounter) {
                result[i] = firstNumber;
                firstArrayCounter++;
            } else{
                result[i] = secondNumber;
                secondArrayCounter++;
            }
        }
        System.out.print(Arrays.toString(result));
    }

    public static String sortPiesa(String[] roles, String[] textLines) {

        StringBuilder result = new StringBuilder();
        String resultTextLine;
        int i;
        int j;

        for (i = 0; i < roles.length; i++) {
            String currentRole = roles[i] + ":";
            result.append(currentRole).append("\n");

            for (j = 0; j < textLines.length; j++) {
                String textLine = textLines[j];
                if(textLine.startsWith(currentRole)) {
                    resultTextLine = j + 1 + ")" + textLines[j].replaceFirst(currentRole, "");
                    result.append(resultTextLine).append("\n");
                }
            }

            result.append("\n");

        }

        return result.toString();
    }
}
