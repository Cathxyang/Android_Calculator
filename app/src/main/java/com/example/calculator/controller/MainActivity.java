package com.example.calculator.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {

    //当前结果和数字
    private String result = "0";
    private float num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //创建按钮和文本框
        Button button_ac = (Button) findViewById(R.id.button_ac);
        Button button = (Button) findViewById(R.id.button);
        Button button_add = (Button) findViewById(R.id.button_add);
        Button button_sub = (Button) findViewById(R.id.button_sub);
        Button button_mul = (Button) findViewById(R.id.button_mul);
        Button button_div = (Button) findViewById(R.id.button_div);
        Button button_mod = (Button) findViewById(R.id.button_mod);
        Button button_root = (Button) findViewById(R.id.button_root);
        Button button_equ = (Button) findViewById(R.id.button_equ);
        Button button_point = (Button) findViewById(R.id.button_point);
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        TextView text = (TextView) findViewById(R.id.edit_text);

        // 创建监听事件
        text.setText(result);
        //创建清空事件
        button_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = "0";
                text.setText(result);
            }
        });
        //创建正负数事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.charAt(0) != '-') {
                    result = "-" + result;
                } else {
                    result = result.substring(1);//从第零位起删除1位
                    text.setText(result);
                }
            }
        });
        //创建加法事件
        button_add.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String) text.getText());
                result = "0";
                button_equ.setOnClickListener((new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        result = String.valueOf(num + Float.parseFloat(result));
                        text.setText(result);
                    }
                }));

            }
        }));
        //创建减法事件
        button_sub.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String) text.getText());
                result = "0";
                button_equ.setOnClickListener((new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        result = String.valueOf(num - Float.parseFloat(result));
                        text.setText(result);
                    }
                }));

            }
        }));
        //创建乘法事件
        button_mul.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String) text.getText());
                result = "0";
                button_equ.setOnClickListener((new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        result = String.valueOf(num * Float.parseFloat(result));
                        text.setText(result);
                    }
                }));

            }
        }));
        //创建除法事件
        button_div.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String) text.getText());
                result = "0";
                button_equ.setOnClickListener((new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (result.equals("0")) {
                            Toast.makeText(MainActivity.this, "除数不能为0", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        result = String.valueOf(num / Float.parseFloat(result));
                        text.setText(result);
                    }
                }));

            }
        }));
        //创建求模事件
        button_mod.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String) text.getText());
                result = "0";
                button_equ.setOnClickListener((new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        result = String.valueOf(num % Float.parseFloat(result));
                        text.setText(result);
                    }
                }));

            }
        }));
        //创建开平方事件
        button_root.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.charAt(0) == '-') {
                    Toast.makeText(MainActivity.this, "请输入正数", Toast.LENGTH_SHORT).show();
                } else {
                    result = String.valueOf(Math.sqrt(Double.parseDouble(result)));
                    text.setText(result);

                }
            }
        }));
        //创建小数点事件
        button_point.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result += ".";
                text.setText(result);
            }
        }));
        //创建0~9数字事件
        button0.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.equals("0")) {
                    result = "0";
                    text.setText(result);
                    return;
                }
                if (result.equals("-0")) {
                    result = "-0";
                    text.setText(result);
                    return;
                }
                result += "0";
                text.setText(result);
            }
        }));
        button1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.equals("0")) {
                    result = "1";
                    text.setText(result);
                    return;
                }
                if (result.equals("-0")) {
                    result = "-1";
                    text.setText(result);
                    return;
                }
                result += "1";
                text.setText(result);
            }
        }));
        button2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.equals("0")) {
                    result = "2";
                    text.setText(result);
                    return;
                }
                if (result.equals("-0")) {
                    result = "-2";
                    text.setText(result);
                    return;
                }
                result += "2";
                text.setText(result);
            }
        }));
        button3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.equals("0")) {
                    result = "3";
                    text.setText(result);
                    return;
                }
                if (result.equals("-0")) {
                    result = "-3";
                    text.setText(result);
                    return;
                }
                result += "3";
                text.setText(result);
            }
        }));
        button4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.equals("0")) {
                    result = "4";
                    text.setText(result);
                    return;
                }
                if (result.equals("-0")) {
                    result = "-4";
                    text.setText(result);
                    return;
                }
                result += "4";
                text.setText(result);
            }
        }));
        button5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.equals("0")) {
                    result = "5";
                    text.setText(result);
                    return;
                }
                if (result.equals("-0")) {
                    result = "-5";
                    text.setText(result);
                    return;
                }
                result += "5";
                text.setText(result);
            }
        }));
        button6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.equals("0")) {
                    result = "6";
                    text.setText(result);
                    return;
                }
                if (result.equals("-0")) {
                    result = "-6";
                    text.setText(result);
                    return;
                }
                result += "6";
                text.setText(result);
            }
        }));
        button7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.equals("0")) {
                    result = "7";
                    text.setText(result);
                    return;
                }
                if (result.equals("-0")) {
                    result = "-7";
                    text.setText(result);
                    return;
                }
                result += "7";
                text.setText(result);
            }
        }));
        button8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.equals("0")) {
                    result = "8";
                    text.setText(result);
                    return;
                }
                if (result.equals("-0")) {
                    result = "-8";
                    text.setText(result);
                    return;
                }
                result += "8";
                text.setText(result);
            }
        }));
        button9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.equals("0")) {
                    result = "9";
                    text.setText(result);
                    return;
                }
                if (result.equals("-0")) {
                    result = "-9";
                    text.setText(result);
                    return;
                }
                result += "9";
                text.setText(result);
            }
        }));

    }

}
