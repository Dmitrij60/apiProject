package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigInteger;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //DiBean diBean = context.getBean("diBean", DiBean.class);
        // System.out.println(diBean.getName());
        // diBean.collection();

        DiBean diBean = context.getBean("diBean", DiBean.class);



/*
        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
        MusicPlayer classMusicP = new MusicPlayer(music2);
        classMusicP.playMusic();*/


        ComplexNumber number1 = new ComplexNumber(1.5, 5.1);
        ComplexNumber number2 = new ComplexNumber(1.5, 5.1);
        System.out.println(number1.equals(number2));


        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // musicPlayer.playMusicList();

        //  System.out.println(musicPlayer.getName());
        // System.out.println(musicPlayer.getVolume());

      /*  int[] a1 = {1,1};
        int[] a2 = {1,3};
        musicPlayer.sortArray(a1, a2);*/

       /* String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] texts = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        String result = musicPlayer.sortPiesa(roles, texts);
        System.out.println(result);*/

        context.close();

       /* boolean result = MusicPlayer.booleanExpression(false, true, false, false);
        System.out.println(result);*/

       /* int year = MusicPlayer.gregorianCallendar(4);
        System.out.println(year);*/

       /*boolean res = MusicPlayer.checkSum(0.1, 0.2, 0.3);
        System.out.println(res);*/

       /* char res = MusicPlayer.charset(32);
        System.out.println(res);*/

        /*boolean res = MusicPlayer.polindrom("madam");
        System.out.println(res);
        */
       /* BigInteger res = MusicPlayer.factorial(6);
        System.out.println(res);*/


       /* int[] arr1 = {0, 2, 2};
        int[] arr2 = {1, 3};
        MusicPlayer.sortArray(arr1, arr2);
        System.out.println();*/

    }
}
