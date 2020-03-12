package com.example.massage;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {
    private EditText usename;
    private EditText usepassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usename =findViewById(R.id.editText);
        usepassword =findViewById(R.id.editText2);
    }

    public void login(View view){
        String Usename = usename.getText().toString();
        String Usepassword = usepassword.getText().toString();


        //利用Firebase資料庫來登入
//        FirebaseDatabase.getInstance().getReference("user").child('Usename').child("Usepassword").addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                String password = (String) dataSnapshot.getValue();
//                if (password.equals(Usepassword)) {
//                    setResult(RESULT_OK);
//                    finish();
//                }
//            }

//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
        if("user".equals(Usename) && "123456".equals(Usepassword)){
            setResult(RESULT_OK);
            finish();
        }else{
            new AlertDialog.Builder(loginActivity.this)
                    .setTitle("登入提示")
                    .setMessage("帳號密碼有錯誤，請重新輸入。")
                    .setPositiveButton("OK",null)
                    .show();
        }

    }

}
