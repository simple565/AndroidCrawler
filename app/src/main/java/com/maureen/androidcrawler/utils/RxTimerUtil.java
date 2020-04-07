package com.maureen.androidcrawler.utils;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @Description 计时器
 * @Author Lianml
 * @Create 2019-12-13 22:18
 */
public class RxTimerUtil {

    private static Disposable mDisposable;

    /**
     * 延迟指定时间后执行操作
     *
     * @param milliseconds 指定秒
     * @param rxAction     操作
     */
    public static void timer(long milliseconds, final RxAction rxAction) {
        Observable.timer(milliseconds, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        mDisposable = d;
                    }

                    @Override
                    public void onNext(Long aLong) {
                        if (null != rxAction) {
                            rxAction.action();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        cancel();
                    }

                    @Override
                    public void onComplete() {
                        cancel();
                    }
                });
    }

    /**
     * 指定时间间隔轮询
     *
     * @param time 指定时间间隔 单位小时
     * @param rxAction     轮询操作
     */
    public static void interval(long time, final RxAction rxAction) {
        Observable.interval(time, TimeUnit.MINUTES)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        mDisposable = d;
                    }

                    @Override
                    public void onNext(Long aLong) {
                        if (null != rxAction) {
                            rxAction.action();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public static void cancel() {
        if (null != mDisposable && (!mDisposable.isDisposed())) {
            mDisposable.dispose();
            mDisposable = null;
        }
    }

    public interface RxAction {
        void action();
    }
}
