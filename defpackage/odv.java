package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class odv {
    public final mdk a;
    public final AtomicLong b;
    private final ByteBuffer c;

    public odv(mdk mdkVar) {
        this.a = mdkVar;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(mdkVar.e * 1024).order(ByteOrder.nativeOrder());
        this.c = byteBufferOrder;
        byteBufferOrder.flip();
        this.b = new AtomicLong();
    }

    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.c;
        AtomicLong atomicLong = this.b;
        long j = atomicLong.get();
        if (!byteBuffer.hasRemaining()) {
            byteBuffer.clear();
            if (j < byteBuffer.capacity()) {
                byteBuffer.limit((int) j);
            }
            atomicLong.addAndGet(-byteBuffer.remaining());
        }
        return byteBuffer;
    }

    public final boolean b() {
        return this.c.hasRemaining() || this.b.get() > 0;
    }
}
