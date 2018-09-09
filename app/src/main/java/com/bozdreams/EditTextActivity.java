package com.bozdreams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;



/**
 * 业务名:
 * 功能说明:Android EditText 输入回车符自动跳转至下一个EditText
 * 编写日期:2018/8/24 22:50;
 * 作者:zhangbo;
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public class EditTextActivity extends AppCompatActivity implements TextWatcher {

    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext);
        editText1 = findViewById(R.id.edit_text_1);
        editText2 = findViewById(R.id.edit_text_2);
        editText1.addTextChangedListener(this);

        editText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        String str = s.toString();
        if (str.indexOf("\r") >= 0 || str.indexOf("\n") >= 0) {//发现输入回车符或换行符
            editText1.setText(str.replace("\r", "").replace("\n", ""));//去掉回车符和换行符
            editText2.requestFocus();//让editText2获取焦点
            editText2.setSelection(editText2.getText().length());//若editText2有内容就将光标移动到文本末尾
        }
    }

}
