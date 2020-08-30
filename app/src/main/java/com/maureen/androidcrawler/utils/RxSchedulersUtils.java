package com.maureen.androidcrawler.utils;

import org.reactivestreams.Publisher;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/***
 * 异步运行,通用控制类(.compose)
 * @author Maureen
 */
public class RxSchedulersUtils {

    public static <T> ObservableTransformer<T, T> applyObservableAsync() {
        return new ObservableTransformer<T, T>() {

            @Override
            public ObservableSource<T> apply(Observable<T> arg0) {
                return arg0.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread(), false, 100);
            }

        };
    }

    public static <T> FlowableTransformer<T, T> applyFlowableAsync() {
        return new FlowableTransformer<T, T>() {

            @Override
            public Publisher<T> apply(Flowable<T> arg0) {
                return null;
            }

        };
    }

    public static <T> SingleTransformer<T, T> applySingleAsync() {
        return new SingleTransformer<T, T>() {

            @Override
            public SingleSource<T> apply(Single<T> arg0) {
                return arg0.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }

        };
    }

    public static CompletableTransformer applyCompletableAsync() {
        return new CompletableTransformer() {

            @Override
            public CompletableSource apply(Completable arg0) {
                return arg0.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

}
