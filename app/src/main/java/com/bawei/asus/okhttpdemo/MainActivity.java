package com.bawei.asus.okhttpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private List<Tugou> list;
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        listview= (ListView) findViewById(R.id.listview);
        initView();
        postObj();
        //postJson();
        //postKey();
        //getEnqueue();
        //getExecute();
        hongyang();
    }

    private void postObj() {

    }

    private void initView() {

    }

    private void hongyang() {
        String url = "http://www.tngou.net/api/cook/list";
        //创建okHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
//创建一个Request
        OkHttpUtils.get(url, new okhttp3.Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                final String res = response.body().string();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv.setText(res);
//                        Gson gson=new Gson();
//                        Bean bean=gson.fromJson(res,Bean.class);
//                        Bean bean1=new Bean();
//
//                        listview.setAdapter(new MyBaseAdapter(list,MainActivity.this));
                    }

                });
            }
        });
//
    }


//    private void postObj() {
//        RequestParameter req = new RequestParameter();
//        req.page = "1";
//        req.rows = "20";
//
//        OkHttpUtils.post("http://www.tngou.net/api/cook/list",
//                req, new Callback() {
//
//                    @Override
//                    public void onFailure(Call call, IOException e) {
//
//                    }
//
//                    @Override
//                    public void onResponse(Call call, Response response) throws IOException {
//                        final String result = response.body().string();
//                        tv.post(new Runnable() {
//                            @Override
//                            public void run() {
//                                tv.setText(result);
//                            }
//                        });
//                    }
//                });
//    }
//
//    private void postJson() {
//        String json = "{\"page\":\"1\",\"rows\":\"20\"}";
//        OkHttpUtils.post("http://www.tngou.net/api/cook/list",
//                json, new Callback() {
//
//                    @Override
//                    public void onFailure(Call call, IOException e) {
//
//                    }
//
//                    @Override
//                    public void onResponse(Call call, Response response) throws IOException {
//                        final String result = response.body().string();
//                        tv.post(new Runnable() {
//                            @Override
//                            public void run() {
//                                tv.setText(result);
//                            }
//                        });
//                    }
//                });
//    }
//
//    private void postKey() {
//        Map<String, String> map = new HashMap<>();
//        map.put("page", "1");
//        map.put("rows", "20");
//
//        OkHttpUtils.post("http://www.tngou.net/api/cook/list",
//                map, new Callback() {
//
//                    @Override
//                    public void onFailure(Call call, IOException e) {
//
//                    }
//
//                    @Override
//                    public void onResponse(Call call, Response response) throws IOException {
//                        final String result = response.body().string();
//                        tv.post(new Runnable() {
//                            @Override
//                            public void run() {
//                                tv.setText(result);
//                            }
//                        });
//                    }
//                });
//    }
//
//    private void getEnqueue() {
//        OkHttpUtils.get("http://www.baidu.com",
//                new Callback() {
//                    @Override
//                    public void onFailure(Call call, IOException e) {
//
//                    }
//
//                    @Override
//                    public void onResponse(Call call, Response response) throws IOException {
//                        final String result = response.body().string();
//                        tv.post(new Runnable() {
//                            @Override
//                            public void run() {
//                                tv.setText(result);
//                            }
//                        });
//                    }
//                });
//    }
//
//    private void getExecute() {
//        new Thread() {
//            @Override
//            public void run() {
//                final String result = OkHttpUtils.get("http://www.baidu.com");
//                tv.post(new Runnable() {
//                    @Override
//                    public void run() {
//                        tv.setText(result);
//                    }
//                });
//            }
//        }.start();
//    }
//
//    private void initView() {
//        tv = (TextView) findViewById(R.id.tv);
//    }

}
