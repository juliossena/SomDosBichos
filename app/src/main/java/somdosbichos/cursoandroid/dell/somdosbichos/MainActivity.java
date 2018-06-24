package somdosbichos.cursoandroid.dell.somdosbichos;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgVaca;
    private ImageView imgCao;
    private ImageView imgMacaco;
    private ImageView imgOvelha;
    private ImageView imgLeao;
    private ImageView imgGato;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgVaca = (ImageView) findViewById(R.id.btn_vaca_id);
        imgCao = (ImageView) findViewById(R.id.btn_cao_id);
        imgMacaco = (ImageView) findViewById(R.id.btn_macaco_id);
        imgOvelha = (ImageView) findViewById(R.id.btn_ovelha_id);
        imgLeao = (ImageView) findViewById(R.id.btn_leao_id);
        imgGato = (ImageView) findViewById(R.id.btn_gato_id);

        imgVaca.setOnClickListener(this);
        imgCao.setOnClickListener(this);
        imgMacaco.setOnClickListener(this);
        imgOvelha.setOnClickListener(this);
        imgLeao.setOnClickListener(this);
        imgGato.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_cao_id:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                tocarMusica();
                break;
            case R.id.btn_gato_id:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                tocarMusica();
                break;
            case R.id.btn_leao_id:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                tocarMusica();
                break;
            case R.id.btn_macaco_id:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                tocarMusica();
                break;
            case R.id.btn_ovelha_id:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                tocarMusica();
                break;
            case R.id.btn_vaca_id:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                tocarMusica();
                break;
        }
    }

    public void tocarMusica() {
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
