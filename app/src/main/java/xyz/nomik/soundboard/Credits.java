package xyz.nomik.soundboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        Button backButton = this.findViewById(R.id.yeet);
        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent returnToHome = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(returnToHome);
                finish();

            }
        });
    }
}
