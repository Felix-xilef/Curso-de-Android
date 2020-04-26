package com.xilef.estudonautaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class Cursos extends AppCompatActivity {

    Intent nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
    }

    public void clickVoltar(View view) { finish(); }

    public void clickCursosPortugol(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/programacao-basica/"));
        startActivity(nav);
    }

    public void clickCursosLingC(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/linguagem-c/"));
        startActivity(nav);
    }

    public void clickCursosAndroid(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/android-studio/"));
        startActivity(nav);
    }

    public void clickCursosKotlin(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/kotlin/"));
        startActivity(nav);
    }

    public void clickCursosCSharp(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/c/"));
        startActivity(nav);
    }

    public void clickCursosPHP(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/php-mysql/"));
        startActivity(nav);
    }

    public void clickCursosVideo(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/course-cat/producao-de-videos/"));
        startActivity(nav);
    }
}
