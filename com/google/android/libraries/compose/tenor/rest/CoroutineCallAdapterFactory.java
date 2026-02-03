package com.google.android.libraries.compose.tenor.rest;

import com.google.android.libraries.compose.tenor.rest.CoroutineCallAdapterFactory;
import defpackage.fctx;
import defpackage.fdap;
import defpackage.fdbk;
import defpackage.fdbq;
import defpackage.fdjc;
import defpackage.fdjd;
import defpackage.fdkf;
import defpackage.fhbk;
import defpackage.fhbl;
import defpackage.fhbm;
import defpackage.fhbn;
import defpackage.fhcc;
import defpackage.fhdv;
import defpackage.fhdy;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CoroutineCallAdapterFactory extends fhbl {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    static final class BodyCallAdapter<T> implements fhbm<T, fdkf<? extends T>> {
        private final Type responseType;

        public BodyCallAdapter(Type type) {
            type.getClass();
            this.responseType = type;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fctx adapt$lambda$0(fdjc fdjcVar, fhbk fhbkVar, Throwable th) {
            if (fdjcVar.x()) {
                fhbkVar.c();
            }
            return fctx.a;
        }

        @Override // defpackage.fhbm
        public Type responseType() {
            return this.responseType;
        }

        @Override // defpackage.fhbm
        public fdkf<T> adapt(final fhbk<T> fhbkVar) {
            fhbkVar.getClass();
            final fdjd fdjdVar = new fdjd();
            fdjdVar.hK(new fdap() { // from class: com.google.android.libraries.compose.tenor.rest.CoroutineCallAdapterFactory$BodyCallAdapter$$ExternalSyntheticLambda0
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    return CoroutineCallAdapterFactory.BodyCallAdapter.adapt$lambda$0(fdjdVar, fhbkVar, (Throwable) obj);
                }
            });
            fhbkVar.d(new fhbn<T>() { // from class: com.google.android.libraries.compose.tenor.rest.CoroutineCallAdapterFactory$BodyCallAdapter$adapt$2
                @Override // defpackage.fhbn
                public void onFailure(fhbk<T> fhbkVar2, Throwable th) {
                    fhbkVar2.getClass();
                    th.getClass();
                    fdjdVar.a(th);
                }

                @Override // defpackage.fhbn
                public void onResponse(fhbk<T> fhbkVar2, fhdv<T> fhdvVar) {
                    fhbkVar2.getClass();
                    fhdvVar.getClass();
                    if (!fhdvVar.c()) {
                        fdjdVar.a(new fhcc(fhdvVar));
                        return;
                    }
                    fdjc<T> fdjcVar = fdjdVar;
                    Object obj = fhdvVar.b;
                    obj.getClass();
                    fdjcVar.b(obj);
                }
            });
            return fdjdVar;
        }
    }

    /* compiled from: PG */
    public static final class Companion {
        private Companion() {
        }

        public final CoroutineCallAdapterFactory create() {
            return new CoroutineCallAdapterFactory(null);
        }

        public /* synthetic */ Companion(fdbk fdbkVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    static final class ResponseCallAdapter<T> implements fhbm<T, fdkf<? extends fhdv<T>>> {
        private final Type responseType;

        public ResponseCallAdapter(Type type) {
            type.getClass();
            this.responseType = type;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fctx adapt$lambda$0(fdjc fdjcVar, fhbk fhbkVar, Throwable th) {
            if (fdjcVar.x()) {
                fhbkVar.c();
            }
            return fctx.a;
        }

        @Override // defpackage.fhbm
        public Type responseType() {
            return this.responseType;
        }

        @Override // defpackage.fhbm
        public fdkf<fhdv<T>> adapt(final fhbk<T> fhbkVar) {
            fhbkVar.getClass();
            final fdjd fdjdVar = new fdjd();
            fdjdVar.hK(new fdap() { // from class: com.google.android.libraries.compose.tenor.rest.CoroutineCallAdapterFactory$ResponseCallAdapter$$ExternalSyntheticLambda0
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    return CoroutineCallAdapterFactory.ResponseCallAdapter.adapt$lambda$0(fdjdVar, fhbkVar, (Throwable) obj);
                }
            });
            fhbkVar.d(new fhbn<T>() { // from class: com.google.android.libraries.compose.tenor.rest.CoroutineCallAdapterFactory$ResponseCallAdapter$adapt$2
                @Override // defpackage.fhbn
                public void onFailure(fhbk<T> fhbkVar2, Throwable th) {
                    fhbkVar2.getClass();
                    th.getClass();
                    fdjdVar.a(th);
                }

                @Override // defpackage.fhbn
                public void onResponse(fhbk<T> fhbkVar2, fhdv<T> fhdvVar) {
                    fhbkVar2.getClass();
                    fhdvVar.getClass();
                    fdjdVar.b(fhdvVar);
                }
            });
            return fdjdVar;
        }
    }

    private CoroutineCallAdapterFactory() {
    }

    public static final CoroutineCallAdapterFactory create() {
        return Companion.create();
    }

    @Override // defpackage.fhbl
    public fhbm<?, ?> get(Type type, Annotation[] annotationArr, fhdy fhdyVar) {
        type.getClass();
        annotationArr.getClass();
        fhdyVar.getClass();
        if (!fdbq.f(fdkf.class, fhbl.getRawType(type))) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("Deferred return type must be parameterized as Deferred<Foo> or Deferred<out Foo>");
        }
        Type parameterUpperBound = fhbl.getParameterUpperBound(0, (ParameterizedType) type);
        parameterUpperBound.getClass();
        Class<?> rawType = fhbl.getRawType(parameterUpperBound);
        rawType.getClass();
        if (!fdbq.f(rawType, fhdv.class)) {
            return new BodyCallAdapter(parameterUpperBound);
        }
        if (!(parameterUpperBound instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<out Foo>");
        }
        Type parameterUpperBound2 = fhbl.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
        parameterUpperBound2.getClass();
        return new ResponseCallAdapter(parameterUpperBound2);
    }

    public /* synthetic */ CoroutineCallAdapterFactory(fdbk fdbkVar) {
        this();
    }
}
