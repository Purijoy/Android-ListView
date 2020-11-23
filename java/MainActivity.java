package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//继承AppCompatActivity，在界面最上方会出现一个ActionBar，
//但如果继承Activity，则不会出现ActionBar

    private List<Fruit> fruitList = new ArrayList<Fruit>();
    private String[] data = {"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple",
    "Strawberry","cherry","Mango"};//ListView中显示的数据可以是来自网上下载的，也可以是数据库的，这里用数组中的数据来测试

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        //初始化适配器（参数：1、context上下文对象，2、每一个item的样式，3、数据源）
       FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);//adapter实现的功能就是将数据显示在listView控件上
    }

    private void initFruits(){
        Fruit apple = new Fruit("Apple",R.drawable.apple_pic);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana",R.drawable.banana_pic);
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange",R.drawable.orange_pic);
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon",R.drawable.watermelon_pic);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear",R.drawable.pear_pic);
        fruitList.add(pear);
        Fruit grape = new Fruit("Grape",R.drawable.grape_pic);
        fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple",R.drawable.pineapple_pic);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry",R.drawable.strawberry_pic);
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry",R.drawable.cherry_pic);
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango",R.drawable.mango_pic);
        fruitList.add(mango);
    }
}
