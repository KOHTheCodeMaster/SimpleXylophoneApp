package dev.koh.simplexylophoneapp;

import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool soundPool;

    //  Sound IDs for each Node
    private int cSoundId;
    private int dSoundId;
    private int eSoundId;
    private int fSoundId;
    private int gSoundId;
    private int aSoundId;
    private int bSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        major();

    }

    private void major() {

        init();

    }

    private void init() {

        //  Initialize soundPool
        int NUM_OF_SIMULTANEOUS_SOUNDS = 7;
        soundPool = new SoundPool.Builder()
                .setMaxStreams(NUM_OF_SIMULTANEOUS_SOUNDS)
                .build();

        //  SoundPool Constructor is deprecated & replaced with SoundPool.Builder
//        soundPool = new SoundPool(NUM_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        //  Initialize Sound IDs
        initializeSoundIDs();

    }

    private void initializeSoundIDs() {

        aSoundId = soundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        bSoundId = soundPool.load(getApplicationContext(), R.raw.note7_b, 1);
        cSoundId = soundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        dSoundId = soundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        eSoundId = soundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        fSoundId = soundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        gSoundId = soundPool.load(getApplicationContext(), R.raw.note5_g, 1);

    }

    public void onNodeBtnClick(View v) {

        //  Constants
        String TAG = "MainActivity_1";
        float leftVolume = 1;
        float rightVolume = 1;
        int loop = 0;
        int priority = 1;
        float rate = 1;
        switch (v.getId()) {

            case R.id.a_key:
                soundPool.play(aSoundId, leftVolume, rightVolume, priority, loop, rate);
                break;

            case R.id.b_key:
                soundPool.play(bSoundId, leftVolume, rightVolume, priority, loop, rate);
                break;

            case R.id.c_key:
                soundPool.play(cSoundId, leftVolume, rightVolume, priority, loop, rate);
                break;

            case R.id.d_key:
                soundPool.play(dSoundId, leftVolume, rightVolume, priority, loop, rate);
                break;

            case R.id.e_key:
                soundPool.play(eSoundId, leftVolume, rightVolume, priority, loop, rate);
                break;

            case R.id.f_key:
                soundPool.play(fSoundId, leftVolume, rightVolume, priority, loop, rate);
                break;

            case R.id.g_key:
                soundPool.play(gSoundId, leftVolume, rightVolume, priority, loop, rate);
                break;

        }

    }


}

/*
 *  Date Created  : 26th July 2K19, 03:01 PM..!!
 *
 *  Init Commit - [Simple Xylophone App]
 *  1.  Added 7 Musical Nodes (Buttons) along with their respective sound using Raw resource file.
 *  2. Using SoundPool to load & play the sound.
 *
 *  Code Developed By,
 *  ~K.O.H..!! ^__^
 */