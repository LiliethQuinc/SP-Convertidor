package com.example.actividaduno;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class color {
 private static int tema;
    public final static int tema_azul=1;
    public final static int tema_amarillo=2;
    public final static int tema_morado=3;

    public static void changetheme(Activity activity, int theme){
        tema=theme;
        activity.finish();
        activity.startActivity(new Intent(activity,activity.getClass()));;

    }

    public static void crearTema(MainActivity activity){
        switch (tema) {
            default:
            case tema_azul:
                activity.setTheme(R.style.Themeazul);
                break;
            case tema_amarillo:
                activity.setTheme(R.style.Themeamarillo);
                break;
            case tema_morado:
                activity.setTheme(R.style.Thememorado);
                break;
        }
        }

    }

