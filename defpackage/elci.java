package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class elci extends elck {
    private final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    private final void n(int i) {
        try {
            e(this.a.array(), i);
        } finally {
            this.a.clear();
        }
    }

    public abstract void a(byte b);

    public void b(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.elcv
    public final void c(byte b) {
        a(b);
    }

    @Override // defpackage.elck
    public final void d(char c) {
        this.a.putChar(c);
        n(2);
    }

    protected void e(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void f(ByteBuffer byteBuffer) {
        b(byteBuffer);
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void g(byte[] bArr, int i) {
        ejwl.k(0, i, bArr.length);
        e(bArr, i);
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void h(int i) {
        this.a.putInt(i);
        n(4);
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void i(long j) {
        this.a.putLong(j);
        n(8);
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void j(byte[] bArr) {
        bArr.getClass();
        e(bArr, bArr.length);
    }
}
