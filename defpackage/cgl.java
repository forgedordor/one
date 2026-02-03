package defpackage;

import android.media.MediaCodec;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cgl {
    private final MediaCodec a;
    public final ByteBuffer b;
    private final int d;
    private final ListenableFuture e;
    private final kog f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private long h = 0;
    public boolean c = false;

    public cgl(MediaCodec mediaCodec, int i) {
        lcg.i(mediaCodec);
        this.a = mediaCodec;
        lcg.g(i);
        this.d = i;
        this.b = mediaCodec.getInputBuffer(i);
        final AtomicReference atomicReference = new AtomicReference();
        this.e = kol.a(new koi() { // from class: cgk
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                atomicReference.set(kogVar);
                return "Terminate InputBuffer";
            }
        });
        kog kogVar = (kog) atomicReference.get();
        lcg.i(kogVar);
        this.f = kogVar;
    }

    public void a(long j) {
        c();
        lcg.a(j >= 0);
        this.h = j;
    }

    public final ListenableFuture b() {
        return bqk.d(this.e);
    }

    public final void c() {
        if (this.g.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    public final void d() {
        if (this.g.getAndSet(true)) {
            return;
        }
        try {
            this.a.queueInputBuffer(this.d, 0, 0, 0L, 0);
            this.f.b(null);
        } catch (IllegalStateException e) {
            this.f.c(e);
        }
    }

    public final void e() {
        if (this.g.getAndSet(true)) {
            return;
        }
        try {
            MediaCodec mediaCodec = this.a;
            int i = this.d;
            ByteBuffer byteBuffer = this.b;
            mediaCodec.queueInputBuffer(i, byteBuffer.position(), byteBuffer.limit(), this.h, true != this.c ? 0 : 4);
            this.f.b(null);
        } catch (IllegalStateException e) {
            this.f.c(e);
        }
    }
}
