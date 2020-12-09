package com.example.demo;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.*;
import android.widget.*;


/***
 * 默认情况下设定成进入计算器的第一时间，进制选项按钮为未激活状态，在输入数字之后按钮设置为可点击，
 * **/
public class MainActivity extends Activity{
    /** Called when the activity is first created. */

    String str="";
    EditText et;
    int c=0,flag=0;
    double b=0.0,g=0.0,f=0.0;
    View vi;
    String num1=null,num2=null,num3=null,num4=null;
    int k=10;
    String temp=null;
    int ids[]={R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5, R.id.btn6,R.id.btn7,
            R.id.btn8,R.id.btn9,R.id.btnA,R.id.btnB,R.id.btnC,R.id.btnD,R.id.btnE,R.id.btnF};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //获得按键
        final Button number[]=new Button[16];
        final Button fuhao[]=new Button[6];

        fuhao[0]=(Button)findViewById(R.id.btn_two);
        fuhao[1]=(Button)findViewById(R.id.btn_eig);
        fuhao[2]=(Button)findViewById(R.id.btn_ten);
        fuhao[3]=(Button)findViewById(R.id.btn_sixteen);
        fuhao[4]=(Button)findViewById(R.id.btn_delete);
        fuhao[5]=(Button)findViewById(R.id.btn_backspace);


        number[0]=(Button)findViewById(R.id.btn0);
        number[1]=(Button)findViewById(R.id.btn1);
        number[2]=(Button)findViewById(R.id.btn2);
        number[3]=(Button)findViewById(R.id.btn3);
        number[4]=(Button)findViewById(R.id.btn4);
        number[5]=(Button)findViewById(R.id.btn5);
        number[6]=(Button)findViewById(R.id.btn6);
        number[7]=(Button)findViewById(R.id.btn7);
        number[8]=(Button)findViewById(R.id.btn8);
        number[9]=(Button)findViewById(R.id.btn9);
        number[10]=(Button)findViewById(R.id.btnA);
        number[11]=(Button)findViewById(R.id.btnB);
        number[12]=(Button)findViewById(R.id.btnC);
        number[13]=(Button)findViewById(R.id.btnD);
        number[14]=(Button)findViewById(R.id.btnE);
        number[15]=(Button)findViewById(R.id.btnF);

        et=(EditText) findViewById(R.id.etShow);
//设置文本输入框为：屏蔽输入法，课多行输入，可横向滑动的文本输入框

//设置EditText的显示方式为多行文本输入
        et.setInputType(InputType.TYPE_TEXT_FLAG_IME_MULTI_LINE);
//文本显示的位置在EditText的最上方
        et.setGravity(Gravity.TOP);
//改变默认的单行模式
        et.setSingleLine(false);
//水平滚动设置为False
        et.setHorizontallyScrolling(false);
        et.setVerticalScrollBarEnabled(true);

        et.setInputType(InputType.TYPE_NULL);           //屏蔽手机键盘，只使用设定的键盘输入
        et.setText(str);
        for (int i=0;i<6;i++)
            fuhao[i].setBackgroundResource(R.drawable.ed_border);

        for (int i=0;i<16;i++)
        {
            number[i].setBackgroundResource(R.drawable.ed_border);
        }
        for (int i=10;i<16;i++){
            number[i].setEnabled(false);
        }

        for(int i=0;i<ids.length;i++){
            Button btn = findViewById(ids[i]);


        //设定数字按键


        number[0].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+=0;
                    et.setText(str);
                    flag=0;
                }
                else{
                    char ch1[];
                    ch1=str.toCharArray();
                    if(!(ch1.length==1&&ch1[0]=='0'))
                    {str+=0;
                        et.setText(str);}

                }
                vi=v;
            }
        });


        number[1].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+=1;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=1;
                    et.setText(str);
                }
                vi=v;
            }
        });

        number[2].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+=2;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=2;
                    et.setText(str);
                }
                vi=v;
            }
        });

        number[3].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+=3;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=3;
                    et.setText(str);
                }
                vi=v;
            }
        });

        number[4].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+=4;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=4;
                    et.setText(str);
                }
                vi=v;
            }
        });

        number[5].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+=5;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=5;
                    et.setText(str);
                }
                vi=v;
            }
        });

        number[6].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+=6;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=6;
                    et.setText(str);
                }
                vi=v;
            }
        });

        number[7].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+=7;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=7;
                    et.setText(str);
                }
                vi=v;
            }
        });

        number[8].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+=8;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=8;
                    et.setText(str);
                }
                vi=v;
            }
        });

        number[9].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+=9;
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+=9;
                    et.setText(str);
                }
                vi=v;
            }
        });
        number[10].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+='A';
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+='A';
                    et.setText(str);
                }
                vi=v;
            }
        });
        number[11].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+='B';
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+='B';
                    et.setText(str);
                }
                vi=v;
            }
        });
        number[12].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+='C';
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+='C';
                    et.setText(str);
                }
                vi=v;
            }
        });
        number[13].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+='D';
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+='D';
                    et.setText(str);
                }
                vi=v;
            }
        });
        number[14].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+='E';
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+='E';
                    et.setText(str);
                }
                vi=v;
            }
        });
        number[15].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag==1){
                    str="";
                    str+='F';
                    et.setText(str);
                    flag=0;
                }
                else{
                    str+='F';
                    et.setText(str);
                }
                vi=v;
            }
        });

/**
 * ----------------------------------------------运算算法部分--------------------------------------------------------------------------------
 * 1、进制转换算法
 * 2、设置键值对存储数据------这一项基本可以否定
 * 提问：
 * 1、二。八，十，十六进制如何转换？
 * 2、如何实现判断源数据属于二、八、十、十六中的哪种类型？
 * *默认情况下设定成进入计算器的第一时间，进制选项按钮为未激活状态，在输入数字之后按钮设置为可点击，
 * **/
//----------------------------------设定进制转换键------------------------------------------------------------------------

//计算逻辑中的按钮点击事件
//str=num1,num2,num3,num4的几句代码是给退格键做的准备

        //二进制
        fuhao[0].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(et.getText().toString()==""||et.getText().toString().equals("")) {
                    k=2;
                }else{

                    temp = et.getText().toString();
                    System.out.println("------------------------------2temp:"+temp);
                    num3 = Integer.valueOf(temp, k).toString();//转换为十进制
                    System.out.println("------------------------------2num3:"+num3);
                    num1 = Integer.toBinaryString(Integer.parseInt(num3));//转换为二进制
                    str=num1;
                    et.setText(num1);
                    k=2;
                }
                //屏蔽0，1之外的按钮
                for (int i=0;i<2;i++){
                    number[i].setBackgroundResource(R.drawable.ed_border);
                }
                for (int i=2;i<16;i++){
                    number[i].setBackgroundResource(R.drawable.ed_boder_after);
                    number[i].setEnabled(false);
                }



            }
        });

        //八进制
        fuhao[1].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                //设置按钮背景色改变和不可点击
                if(et.getText().toString()==""||et.getText().toString().equals("")) {
                    k=8;
                }else{
                    temp = et.getText().toString();

                    System.out.println("------------------------------temp:"+temp);
                    num3 = Integer.valueOf(temp, k).toString();//转换为十进制
                    System.out.println("------------------------------num3:"+num3);
                    num2 = Integer.toOctalString(Integer.parseInt(num3));//转换为八进制
                    str=num2;
                    et.setText(num2);
                    k=8;
                }
                for (int i=0;i<8;i++){
                    number[i].setBackgroundResource(R.drawable.ed_border);
                    number[i].setEnabled(true);
                }
                for (int i=8;i<16;i++){
                    number[i].setBackgroundResource(R.drawable.ed_boder_after);
                    number[i].setEnabled(false);
                }


            }
        });

        //十进制
        fuhao[2].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(et.getText().toString()==""||et.getText().toString().equals("")) {
                    k=10;
                }else{
                   temp=et.getText().toString();

                   num3=Integer.valueOf(temp,k).toString();//转换为十进制
                   System.out.println("------------------------------temp:"+num3);
                    str=num3;
                   et.setText(num3);
                   k=10;
               }
                //设置按钮背景色改变和不可点击
                //十进制部分设置按钮的点击和背景色
                for (int i=0;i<10;i++){
                    number[i].setBackgroundResource(R.drawable.ed_border);
                    number[i].setEnabled(true);
                }
                for (int i=10;i<16;i++){
                    number[i].setBackgroundResource(R.drawable.ed_boder_after);
                    number[i].setEnabled(false);
                }


            }
        });

        //十六进制
        fuhao[3].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(et.getText().toString()==""||et.getText().toString().equals("")) {
                    k=16;
                }else{
                    temp = et.getText().toString();

                    num3 = Integer.valueOf(temp, k).toString();//转换为十进制
                    num4 = Integer.toHexString(Integer.parseInt(num3));
                    str=num4;
                    et.setText(num4);
                    k=16;
                }
                //十六进制部分设置按钮的背景色更改和可点击
                for (int i=0;i<16;i++){
                    number[i].setBackgroundResource(R.drawable.ed_border);
                    number[i].setEnabled(true);
                }

            }
        });


        //删除
        fuhao[4].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                str=et.getText().toString();
                if (str!=""||!str.equals("")){
                    str="";
                    et.setText(str);
                }

            }
        });

        //退格：定位字符位置删除对应字符
        fuhao[5].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(str==""){
                    str+="";
                    et.setText(str);
                }

                else{

                    char ch1[];int x=0;
                    ch1=str.toCharArray();
                    for(int i=0;i<ch1.length;i++)
                        if(ch1[i]!=' ')
                            x++;
                    if(x!=0){
                        x--;
                        str="";
                        for (int a=0;a<x;a++)
                        {
                            str+=ch1[a];
                        }
                       // Toast.makeText(MainActivity.this,"结果："+str,Toast.LENGTH_LONG).show();
                        et.setText(str);

                    }
                    System.out.println(x+str+ch1[0]);
                }

            }
        });
    }


}}
