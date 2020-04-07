package com.maureen.androidcrawler;

import android.os.Bundle;
import android.text.TextUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.maureen.androidcrawler.utils.UrlConstants;
import com.maureen.androidcrawler.utils.WebClient;

import java.util.Objects;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void loadAllData() {
        Observable<String> signDataObservable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {
                String result = Objects.requireNonNull(WebClient.getInstance().syncGet(UrlConstants.SIGN_DATA_URL).body()).toString();
                if (TextUtils.isEmpty(result)) {
                    emitter.onError(new Throwable("数据为空"));
                } else {
                    emitter.onNext(result);
                }
            }
        });

        Observable<String> popularityObservable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {
                String result = Objects.requireNonNull(WebClient.getInstance().syncGet(UrlConstants.POPULARITY_DATA_URL).body()).toString();
                if (TextUtils.isEmpty(result)) {
                    emitter.onError(new Throwable("数据为空"));
                } else {
                    emitter.onNext(result);
                }
            }
        });

        Observable.merge(signDataObservable, popularityObservable)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(String s) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
