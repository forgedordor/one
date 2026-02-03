package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdx implements cdz {
    private final ByteBuffer a;
    private final MediaCodec.BufferInfo b;
    private final kog c;

    public cdx(cdz cdzVar) {
        ceb cebVar = (ceb) cdzVar;
        MediaCodec.BufferInfo bufferInfo = cebVar.a;
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        this.b = bufferInfo2;
        ByteBuffer byteBufferD = cdzVar.d();
        MediaCodec.BufferInfo bufferInfo3 = cebVar.a;
        byteBufferD.position(bufferInfo3.offset);
        byteBufferD.limit(bufferInfo3.offset + bufferInfo3.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfo3.size);
        byteBufferAllocate.order(byteBufferD.order());
        byteBufferAllocate.put(byteBufferD);
        byteBufferAllocate.flip();
        this.a = byteBufferAllocate;
        final AtomicReference atomicReference = new AtomicReference();
        kol.a(new koi() { // from class: cdw
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                atomicReference.set(kogVar);
                return "Data closed";
            }
        });
        kog kogVar = (kog) atomicReference.get();
        lcg.i(kogVar);
        this.c = kogVar;
    }

    @Override // defpackage.cdz
    public final long a() {
        return this.b.presentationTimeUs;
    }

    @Override // defpackage.cdz
    public final long b() {
        return this.b.size;
    }

    @Override // defpackage.cdz
    public final MediaCodec.BufferInfo c() {
        return this.b;
    }

    @Override // defpackage.cdz, java.lang.AutoCloseable
    public final void close() {
        this.c.b(null);
    }

    @Override // defpackage.cdz
    public final ByteBuffer d() {
        return this.a;
    }

    @Override // defpackage.cdz
    public final boolean e() {
        throw null;
    }
}
