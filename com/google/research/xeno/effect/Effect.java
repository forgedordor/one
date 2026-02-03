package com.google.research.xeno.effect;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.research.xeno.effect.Effect;
import defpackage.exjr;
import defpackage.exjz;
import defpackage.exkm;
import defpackage.exkn;
import defpackage.exmr;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Effect implements exkm {
    public static final exmr a = new exmr();
    public static final /* synthetic */ int d = 0;
    public final long b;
    public final Map c;
    private final ReentrantReadWriteLock e = new ReentrantReadWriteLock();

    /* compiled from: PG */
    public interface NativeLoadCallback {
        void onCompletion(long j, String str);
    }

    public Effect(long j) {
        this.b = j;
        this.c = nativeGetControls(j);
        nativeGetAuxOutputStreamNames(j);
        String str = exjz.a;
        try {
        } catch (Exception e) {
            Log.e(exjz.a, "Exception occurred: ".concat(String.valueOf(e.getMessage())));
        }
        a.a(nativeGetEffectAddress(j), this);
    }

    public static void b(final exjr exjrVar, final Effect effect, final String str) {
        Runnable runnable = new Runnable() { // from class: exjk
            @Override // java.lang.Runnable
            public final void run() {
                int i = Effect.d;
                exjrVar.a(effect, str);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private native List<String> nativeGetAuxOutputStreamNames(long j);

    private native Map<String, Control> nativeGetControls(long j);

    private static native long nativeGetEffectAddress(long j);

    public static native void nativeLoadCapabilityWithRemoteAssetManager(byte[] bArr, long j, String str, NativeLoadCallback nativeLoadCallback);

    public static native void nativeLoadChoreoWithRemoteAssetManager(byte[] bArr, long j, String str, NativeLoadCallback nativeLoadCallback);

    public static native void nativeLoadWithRemoteAssetManager(byte[] bArr, long j, String str, NativeLoadCallback nativeLoadCallback);

    @Override // defpackage.exkm
    public final void hv(exkn exknVar) {
        this.e.readLock().lock();
        try {
            exknVar.a(this.b);
        } finally {
            this.e.readLock().unlock();
        }
    }

    public native String nativeGetName(long j);

    public native byte[] nativeGetSerializedProcessingMetadata(long j);

    public native void nativeSetName(long j, String str);
}
