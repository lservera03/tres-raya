package com.luisangelservera.tres_raya.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.luisangelservera.tres_raya.R;

public class GameActivity extends AppCompatActivity {

    private int playerturn = 0;
    boolean clicked1, clicked2, clicked3, clicked4, clicked5, clicked6, clicked7, clicked8, clicked9 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);


        ImageButton button00 = (ImageButton) findViewById(R.id.button00);
        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked1) {
                    if (playerturn == 0) {
                        cruz(R.id.button00);
                        playerturn = 1;
                    } else {
                        circulo(R.id.button00);
                        playerturn = 0;
                    }
                    clicked1 = true;
                }
            }
        });
        ImageButton button01 = (ImageButton) findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked2) {
                    if (playerturn == 0) {
                        cruz(R.id.button01);
                        playerturn = 1;
                    } else {
                        circulo(R.id.button01);
                        playerturn = 0;
                    }
                    clicked2 = true;
                }
            }
        });
        ImageButton button02 = (ImageButton) findViewById(R.id.button02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked3) {
                    if (playerturn == 0) {
                        cruz(R.id.button02);
                        playerturn = 1;
                    } else {
                        circulo(R.id.button02);
                        playerturn = 0;
                    }
                    clicked3 = true;
                }
            }
        });
        ImageButton button10 = (ImageButton) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked4) {
                    if (playerturn == 0) {
                        cruz(R.id.button10);
                        playerturn = 1;
                    } else {
                        circulo(R.id.button10);
                        playerturn = 0;
                    }
                    clicked4 = true;
                }
            }
        });
        ImageButton button11 = (ImageButton) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked5) {
                    if (playerturn == 0) {
                        cruz(R.id.button11);
                        playerturn = 1;
                    } else {
                        circulo(R.id.button11);
                        playerturn = 0;
                    }
                    clicked5 = true;
                }
            }
        });
        ImageButton button12 = (ImageButton) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked6) {
                    if (playerturn == 0) {
                        cruz(R.id.button12);
                        playerturn = 1;
                    } else {
                        circulo(R.id.button12);
                        playerturn = 0;
                    }
                    clicked6 = true;
                }
            }
        });
        ImageButton button20 = (ImageButton) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked7) {
                    if (playerturn == 0) {
                        cruz(R.id.button20);
                        playerturn = 1;
                    } else {
                        circulo(R.id.button20);
                        playerturn = 0;
                    }
                    clicked7 = true;
                }
            }
        });
        ImageButton button21 = (ImageButton) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked8) {
                    if (playerturn == 0) {
                        cruz(R.id.button21);
                        playerturn = 1;
                    } else {
                        circulo(R.id.button21);
                        playerturn = 0;
                    }
                    clicked8 = true;
                }
            }
        });
        ImageButton button22 = (ImageButton) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!clicked9) {
                    if (playerturn == 0) {
                        cruz(R.id.button22);
                        playerturn = 1;
                    } else {
                        circulo(R.id.button22);
                        playerturn = 0;
                    }
                    clicked9 = true;
                }
            }
        });
    }

    public void cruz(int button) {
        ImageButton ima1 = (ImageButton) findViewById(button);
        ima1.setImageResource(R.drawable.outline_close_black_48);
    }

    public void circulo(int button) {
        ImageButton ima1 = (ImageButton) findViewById(button);
        ima1.setImageResource(R.drawable.outline_radio_button_unchecked_black_48);
    }
}