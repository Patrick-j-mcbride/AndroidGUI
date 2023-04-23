package edu.sdsmt.hamster_run_patrick_mcbride;

import androidx.annotation.Nullable;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class GameView extends View {

    private TextView movesTextView, homeStoresTextView, foodInPouchesTextView, energyTextView, zoomPowerTextView;
    private Button resetButton, zoomButton, eatButton, leftButton, rightButton, upButton, downButton;
    private GridLayout gridLayout;

    public GameView(Context context) {
        super(context);
        init(context);
    }

    public void init(Context context) {
    }

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public GameView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public GameView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }


    // Update methods for game statistics
        private void updateMoves(int moves) {
            movesTextView.setText(String.format("Moves: %d", moves));
        }

        private void updateHomeStores(int homeStores) {
            homeStoresTextView.setText(String.format("Home Stores: %d", homeStores));
        }

        private void updateFoodInPouches(int foodInPouches) {
            foodInPouchesTextView.setText(String.format("Food in pouches: %d", foodInPouches));
        }

        private void updateEnergy(int energy) {
            energyTextView.setText(String.format("Energy: %d", energy));
        }

        private void updateZoomPower(int zoomPower) {
            zoomPowerTextView.setText(String.format("Zoom Power: %d", zoomPower));
        }
}
