package sdu.cs58.apinan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//1
    EditText number1EditText,number2EditText;
    Button addButton,deleteButton,PlusButton,DivideButton;
    TextView resultTextview;
    int num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//2 ผูกตัวเเปรบน java
        number1EditText=findViewById(R.id.edtNumber1);
        number2EditText=findViewById(R.id.edtNumber2);
        addButton=findViewById(R.id.btnAdd);
        deleteButton=findViewById(R.id.btnminus);
        PlusButton=findViewById(R.id.btnPlus);
        DivideButton=findViewById(R.id.btnDivide);
        resultTextview=findViewById(R.id.txvResult);




       addButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               //แปลงค่าที่รับค่าที่ user edittext เป็น ตัวเลข int
               //getText รับค่า
               //setText เเสดงผล
               num1 = Integer.parseInt(number1EditText.getText().toString().trim());
               num2 = Integer.parseInt(number2EditText.getText().toString().trim());
               result = num1 + num2;
               // เเสดง ผลลัพธ์การคำนวน
               resultTextview.setText(result + "");


               deleteButton.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {

                       num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                       num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                       result = num1 - num2;

                       resultTextview.setText(result + "");
                       PlusButton.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {

                               num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                               num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                               result = num1 * num2;

                               resultTextview.setText(result + "");
                               DivideButton.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {

                                       num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                                       num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                                       result = num1 / num2;

                                       resultTextview.setText(result + "");
                                   }
                               });
                           }
                       });
                   }
               });
           }

       });   // end on clicklistener


    }//end method on create

}
