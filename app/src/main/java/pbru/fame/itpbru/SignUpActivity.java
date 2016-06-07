package pbru.fame.itpbru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private EditText nameEditText, surenameEditText, userEditText, passwordEditText;
    private String nameString, surenameString, userString, passwordString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        surenameEditText = (EditText) findViewById(R.id.editText2);
        userEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);


    }//Main Method

    public void clickSignUpSign(View view) {

        nameString = nameEditText.getText().toString().trim(); //เก็บค่าเปลี่ยนเป็น Text ลบช่องว่าง
        surenameString = surenameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

         //check space
        if (checkSpace()) {
            //True
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "Error!", "Please Input Text");



        } else {
            //False

        }

    } //clickSign

    private boolean checkSpace() {

        boolean result = true;

        result = nameString.equals("")||surenameString.equals("")||
                userString.equals("")||passwordString.equals("");

        return result;
    }

}//Main Class
