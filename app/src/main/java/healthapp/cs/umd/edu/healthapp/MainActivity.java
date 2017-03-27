package healthapp.cs.umd.edu.healthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button general_button = (Button) findViewById(R.id.general_button);
        general_button.setOnClickListener(this);
        Button fitness_button = (Button) findViewById(R.id.fitness_button);
        fitness_button.setOnClickListener(this);
        Button diet_button = (Button) findViewById(R.id.diet_button);
        diet_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.general_button:
                Intent general_intent = new Intent(getApplicationContext(), GeneralActivity.class);
                startActivity(general_intent);
                break;
            case R.id.diet_button:
                Intent diet_intent = new Intent(getApplicationContext(), DietActivity.class);
                startActivity(diet_intent);
                break;
            case R.id.fitness_button:
                Intent fitness_intent = new Intent(getApplicationContext(), FitnessActivity.class);
                startActivity(fitness_intent);
                break;
        }
    }
}
