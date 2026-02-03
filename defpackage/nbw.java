package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nbw implements ncg {
    public static final ArrayDeque a = new ArrayDeque();
    public static final Object b = new Object();
    public final MediaCodec c;
    public final HandlerThread d;
    public Handler e;
    public final AtomicReference f;
    public final mem g;
    public boolean h;

    public nbw(MediaCodec mediaCodec, HandlerThread handlerThread) {
        mem memVar = new mem();
        this.c = mediaCodec;
        this.d = handlerThread;
        this.g = memVar;
        this.f = new AtomicReference();
    }

    public static nbv a() {
        ArrayDeque arrayDeque = a;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new nbv();
            }
            return (nbv) arrayDeque.removeFirst();
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static int[] e(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Override // defpackage.ncg
    public final void b() {
        if (this.h) {
            try {
                Handler handler = this.e;
                mee.f(handler);
                handler.removeCallbacksAndMessages(null);
                mem memVar = this.g;
                memVar.f();
                Handler handler2 = this.e;
                mee.f(handler2);
                handler2.obtainMessage(3).sendToTarget();
                memVar.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.ncg
    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.f.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
