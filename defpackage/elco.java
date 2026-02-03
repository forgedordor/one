package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class elco extends elck {
    private final ByteBuffer a;

    protected elco() {
        ejwl.a(true);
        this.a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void o() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            e(byteBuffer);
        }
        byteBuffer.compact();
    }

    private final void p() {
        if (this.a.remaining() < 8) {
            o();
        }
    }

    private final void q(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer.remaining() <= byteBuffer2.remaining()) {
            byteBuffer2.put(byteBuffer);
            p();
            return;
        }
        int iPosition = 16 - byteBuffer2.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer2.put(byteBuffer.get());
        }
        o();
        while (byteBuffer.remaining() >= 16) {
            e(byteBuffer);
        }
        byteBuffer2.put(byteBuffer);
    }

    protected abstract elct b();

    @Override // defpackage.elcv
    public final void c(byte b) {
        this.a.put(b);
        p();
    }

    @Override // defpackage.elck
    public final void d(char c) {
        this.a.putChar(c);
        p();
    }

    protected abstract void e(ByteBuffer byteBuffer);

    @Override // defpackage.elck, defpackage.elcv
    public final void f(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            q(byteBuffer);
        } finally {
            byteBuffer.order(byteOrderOrder);
        }
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void g(byte[] bArr, int i) {
        q(ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void i(long j) {
        this.a.putLong(j);
        p();
    }

    protected void n(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.elcv
    public final elct r() {
        o();
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            n(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return b();
    }
}
