package com.luisangelservera.tres_raya.controller;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.luisangelservera.tres_raya.R;

import java.util.ArrayList;
import java.util.Arrays;

public class GameActivity extends AppCompatActivity {

    private TextView playerTurnText;
    private ArrayList<ImageButton> buttons = new ArrayList<>();

    private static final char EMPTY_CHAR = '-';
    private static final char CROSS_CHAR = 'X';
    private static final char CIRCLE_CHAR = 'O';

    private char[][] matrix = new char[3][3];
    private int playerTurn = 0;
    private int positions = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        fillMatrix();

        playerTurnText = findViewById(R.id.playerTurnTextView);
        playerTurnText.setText(R.string.player1_turn_string);


        ImageButton button00 = findViewById(R.id.button00);
        buttons.add(button00);
        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPositionEmpty(0, 0)) {
                    if (playerTurn == 0) {
                        setCrossToButton(R.id.button00);
                        setPositionInMatrix(0, 0, CROSS_CHAR);
                        playerTurn = 1;
                    } else {
                        setCircleToButton(R.id.button00);
                        setPositionInMatrix(0, 0, CIRCLE_CHAR);
                        playerTurn = 0;
                    }

                    positions++;

                    if (checkPlayerWon()) {
                        playerWon();
                    } else {
                        if (positions < 9) {
                            changePlayerTurnLabel();
                        } else {
                            tieGame();
                        }
                    }
                } else {
                    showPositionError();
                }
            }
        });

        ImageButton button01 = findViewById(R.id.button01);
        buttons.add(button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPositionEmpty(0, 1)) {
                    if (playerTurn == 0) {
                        setCrossToButton(R.id.button01);
                        setPositionInMatrix(0, 1, CROSS_CHAR);
                        playerTurn = 1;
                    } else {
                        setCircleToButton(R.id.button01);
                        setPositionInMatrix(0, 1, CIRCLE_CHAR);
                        playerTurn = 0;
                    }

                    positions++;

                    if (checkPlayerWon()) {
                        playerWon();
                    } else {
                        if (positions < 9) {
                            changePlayerTurnLabel();
                        } else {
                            tieGame();
                        }
                    }
                } else {
                    showPositionError();
                }
            }
        });

        ImageButton button02 = findViewById(R.id.button02);
        buttons.add(button02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPositionEmpty(0, 2)) {
                    if (playerTurn == 0) {
                        setCrossToButton(R.id.button02);
                        setPositionInMatrix(0, 2, CROSS_CHAR);
                        playerTurn = 1;
                    } else {
                        setCircleToButton(R.id.button02);
                        setPositionInMatrix(0, 2, CIRCLE_CHAR);
                        playerTurn = 0;
                    }

                    positions++;

                    if (checkPlayerWon()) {
                        playerWon();
                    } else {
                        if (positions < 9) {
                            changePlayerTurnLabel();
                        } else {
                            tieGame();
                        }
                    }
                } else {
                    showPositionError();
                }
            }
        });

        ImageButton button10 = findViewById(R.id.button10);
        buttons.add(button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPositionEmpty(1, 0)) {
                    if (playerTurn == 0) {
                        setCrossToButton(R.id.button10);
                        setPositionInMatrix(1, 0, CROSS_CHAR);
                        playerTurn = 1;
                    } else {
                        setCircleToButton(R.id.button10);
                        setPositionInMatrix(1, 0, CIRCLE_CHAR);
                        playerTurn = 0;
                    }

                    positions++;

                    if (checkPlayerWon()) {
                        playerWon();
                    } else {
                        if (positions < 9) {
                            changePlayerTurnLabel();
                        } else {
                            tieGame();
                        }
                    }
                } else {
                    showPositionError();
                }
            }
        });

        ImageButton button11 = findViewById(R.id.button11);
        buttons.add(button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPositionEmpty(1, 1)) {
                    if (playerTurn == 0) {
                        setCrossToButton(R.id.button11);
                        setPositionInMatrix(1, 1, CROSS_CHAR);
                        playerTurn = 1;
                    } else {
                        setCircleToButton(R.id.button11);
                        setPositionInMatrix(1, 1, CIRCLE_CHAR);
                        playerTurn = 0;
                    }

                    positions++;

                    if (checkPlayerWon()) {
                        playerWon();
                    } else {
                        if (positions < 9) {
                            changePlayerTurnLabel();
                        } else {
                            tieGame();
                        }
                    }
                } else {
                    showPositionError();
                }
            }
        });

        ImageButton button12 = findViewById(R.id.button12);
        buttons.add(button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPositionEmpty(1, 2)) {
                    if (playerTurn == 0) {
                        setCrossToButton(R.id.button12);
                        setPositionInMatrix(1, 2, CROSS_CHAR);
                        playerTurn = 1;
                    } else {
                        setCircleToButton(R.id.button12);
                        setPositionInMatrix(1, 2, CIRCLE_CHAR);
                        playerTurn = 0;
                    }

                    positions++;

                    if (checkPlayerWon()) {
                        playerWon();
                    } else {
                        if (positions < 9) {
                            changePlayerTurnLabel();
                        } else {
                            tieGame();
                        }
                    }
                } else {
                    showPositionError();
                }
            }
        });

        ImageButton button20 = findViewById(R.id.button20);
        buttons.add(button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPositionEmpty(2, 0)) {
                    if (playerTurn == 0) {
                        setCrossToButton(R.id.button20);
                        setPositionInMatrix(2, 0, CROSS_CHAR);
                        playerTurn = 1;
                    } else {
                        setCircleToButton(R.id.button20);
                        setPositionInMatrix(2, 0, CIRCLE_CHAR);
                        playerTurn = 0;
                    }

                    positions++;

                    if (checkPlayerWon()) {
                        playerWon();
                    } else {
                        if (positions < 9) {
                            changePlayerTurnLabel();
                        } else {
                            tieGame();
                        }
                    }
                } else {
                    showPositionError();
                }
            }
        });

        ImageButton button21 = findViewById(R.id.button21);
        buttons.add(button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPositionEmpty(2, 1)) {
                    if (playerTurn == 0) {
                        setCrossToButton(R.id.button21);
                        setPositionInMatrix(2, 1, CROSS_CHAR);
                        playerTurn = 1;
                    } else {
                        setCircleToButton(R.id.button21);
                        setPositionInMatrix(2, 1, CIRCLE_CHAR);
                        playerTurn = 0;
                    }

                    positions++;

                    if (checkPlayerWon()) {
                        playerWon();
                    } else {
                        if (positions < 9) {
                            changePlayerTurnLabel();
                        } else {
                            tieGame();
                        }
                    }
                } else {
                    showPositionError();
                }
            }
        });

        ImageButton button22 = findViewById(R.id.button22);
        buttons.add(button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPositionEmpty(2, 2)) {
                    if (playerTurn == 0) {
                        setCrossToButton(R.id.button22);
                        setPositionInMatrix(2, 2, CROSS_CHAR);
                        playerTurn = 1;
                    } else {
                        setCircleToButton(R.id.button22);
                        setPositionInMatrix(2, 2, CIRCLE_CHAR);
                        playerTurn = 0;
                    }

                    positions++;

                    if (checkPlayerWon()) {
                        playerWon();
                    } else {
                        if (positions < 9) {
                            changePlayerTurnLabel();
                        } else {
                            tieGame();
                        }
                    }
                } else {
                    showPositionError();
                }
            }
        });
    }

    private void setCrossToButton(@IdRes int button) {
        ImageButton ima1 = findViewById(button);
        ima1.setImageResource(R.drawable.outline_close_black_48);
    }

    private void setCircleToButton(@IdRes int button) {
        ImageButton ima1 = findViewById(button);
        ima1.setImageResource(R.drawable.outline_radio_button_unchecked_black_48);
    }

    private void changePlayerTurnLabel() {
        if (playerTurn == 0) {
            playerTurnText.setText(R.string.player1_turn_string);
        } else {
            playerTurnText.setText(R.string.player2_turn_string);
        }
    }

    private void setPositionInMatrix(int x, int y, char character) {
        matrix[x][y] = character;
    }

    private boolean checkPositionEmpty(int x, int y) {
        return matrix[x][y] == EMPTY_CHAR;
    }

    private void fillMatrix() {
        for (char[] row : matrix)
            Arrays.fill(row, EMPTY_CHAR);
    }

    private void showPositionError() {
        Toast.makeText(GameActivity.this, R.string.position_error_string, Toast.LENGTH_SHORT).show();
    }

    private boolean checkPlayerWon() {
        char character = playerTurn == 0 ? CIRCLE_CHAR : CROSS_CHAR;
        int counter = 0;

        // Left to right
        for (char[] row : matrix) {
            for (char letter : row) {
                if (letter == character) {
                    counter++;
                }
            }

            if (counter == 3) {
                return true;
            }
            counter = 0;
        }

        //Top to bottom
        for (int i = 0; i < 3; i++) {
            if (matrix[0][i] == character) {
                counter++;
            }
            if (matrix[1][i] == character) {
                counter++;
            }
            if (matrix[2][i] == character) {
                counter++;
            }

            if (counter == 3) {
                return true;
            }

            counter = 0;
        }

        //Cross up to bottom
        for (int i = 0; i < 3; i++) {
            if (matrix[i][i] == character) {
                counter++;
            }
        }

        if (counter == 3) {
            return true;
        }

        counter = 0;

        //Cross bottom to up
        for (int i = 2; i >= 0; i--) {
            if (matrix[2 - i][i] == character) {
                counter++;
            }
        }

        if (counter == 3) {
            return true;
        }

        return false;
    }

    private void tieGame() {
        Toast toast;

        disableButtons();

        playerTurnText.setText(R.string.tie_string);

        toast = Toast.makeText(GameActivity.this, R.string.tie_string, Toast.LENGTH_LONG);

        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
        toast.show();
    }

    private void playerWon() {
        Toast toast;

        disableButtons();

        if (playerTurn == 0) {
            playerTurnText.setText(R.string.player2_won_string);
            toast = Toast.makeText(GameActivity.this, R.string.player2_won_string, Toast.LENGTH_LONG);
        } else {
            playerTurnText.setText(R.string.player1_won_string);
            toast = Toast.makeText(GameActivity.this, R.string.player1_won_string, Toast.LENGTH_LONG);
        }

        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
        toast.show();

    }


    private void disableButtons() {
        for (ImageButton button : buttons) {
            button.setEnabled(false);
        }
    }

}