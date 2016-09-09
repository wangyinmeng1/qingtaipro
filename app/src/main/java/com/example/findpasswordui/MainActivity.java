package com.example.findpasswordui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /******************测试代码*****************************/
    private Button button;
    private Button open;

    /******************测试代码*****************************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /******************测试代码*****************************/
        button=(Button)findViewById(R.id.button);
        open = (Button)findViewById(R.id.open);
        button.setOnClickListener(this);
        open.setOnClickListener(this);


        /******************测试代码*****************************/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent=new Intent("com.example.findpasswordui.ACTION_START");
                startActivity(intent);
                break;
            case R.id.open:
                Intent intent1 =new Intent(MainActivity.this,Open.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
