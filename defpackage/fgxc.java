package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgxc {
    public final ByteBuffer a;
    public int b = -1;
    public int c = -1;

    public fgxc(byte[] bArr) {
        this.a = ByteBuffer.wrap(bArr);
    }

    private final void k(int i) throws fhao {
        if (i > d()) {
            throw new fhao("end of input");
        }
    }

    public final int a() {
        return this.a.position();
    }

    public final int b() throws fhao {
        k(2);
        return (char) this.a.getShort();
    }

    public final int c() throws fhao {
        k(1);
        return this.a.get() & 255;
    }

    public final int d() {
        return this.a.remaining();
    }

    public final long e() throws fhao {
        k(4);
        return this.a.getInt() & 4294967295L;
    }

    public final void f(byte[] bArr, int i, int i2) throws fhao {
        k(i2);
        this.a.get(bArr, i, i2);
    }

    public final void g(int i) {
        ByteBuffer byteBuffer = this.a;
        if (i > byteBuffer.capacity() - byteBuffer.position()) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        byteBuffer.limit(byteBuffer.position() + i);
    }

    public final byte[] h() {
        int iD = d();
        byte[] bArr = new byte[iD];
        this.a.get(bArr, 0, iD);
        return bArr;
    }

    public final byte[] i(int i) throws fhao {
        k(i);
        byte[] bArr = new byte[i];
        this.a.get(bArr, 0, i);
        return bArr;
    }

    public final byte[] j() {
        return i(c());
    }
}
