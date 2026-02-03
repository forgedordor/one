package defpackage;

import android.media.MediaCodec;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceb implements cdz {
    public final MediaCodec.BufferInfo a;
    private final MediaCodec b;
    private final int c;
    private final ByteBuffer d;
    private final ListenableFuture e;
    private final kog f;
    private final AtomicBoolean g = new AtomicBoolean(false);

    public ceb(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        lcg.i(mediaCodec);
        this.b = mediaCodec;
        this.c = i;
        this.d = mediaCodec.getOutputBuffer(i);
        lcg.i(bufferInfo);
        this.a = bufferInfo;
        final AtomicReference atomicReference = new AtomicReference();
        this.e = kol.a(new koi() { // from class: cea
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                atomicReference.set(kogVar);
                return "Data closed";
            }
        });
        kog kogVar = (kog) atomicReference.get();
        lcg.i(kogVar);
        this.f = kogVar;
    }

    @Override // defpackage.cdz
    public final long a() {
        return this.a.presentationTimeUs;
    }

    @Override // defpackage.cdz
    public final long b() {
        return this.a.size;
    }

    @Override // defpackage.cdz
    public final MediaCodec.BufferInfo c() {
        return this.a;
    }

    @Override // defpackage.cdz, java.lang.AutoCloseable
    public final void close() {
        if (this.g.getAndSet(true)) {
            return;
        }
        try {
            this.b.releaseOutputBuffer(this.c, false);
            this.f.b(null);
        } catch (IllegalStateException e) {
            this.f.c(e);
        }
    }

    @Override // defpackage.cdz
    public final ByteBuffer d() {
        if (this.g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        ByteBuffer byteBuffer = this.d;
        MediaCodec.BufferInfo bufferInfo = this.a;
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }

    @Override // defpackage.cdz
    public final boolean e() {
        return (this.a.flags & 1) != 0;
    }

    public final ListenableFuture f() {
        return bqk.d(this.e);
    }
}
