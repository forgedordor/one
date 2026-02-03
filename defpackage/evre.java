package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evre extends evrb {
    private final OutputStream g;

    public evre(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.g = outputStream;
    }

    private final void au() throws IOException {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    private final void av(int i) throws IOException {
        if (this.b - this.c < i) {
            au();
        }
    }

    public final void A(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.b;
        int i4 = this.c;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        byte[] bArr2 = this.a;
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.c = i3;
        this.d += i5;
        au();
        int i7 = i2 - i5;
        if (i7 <= i3) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.c = i7;
        } else {
            this.g.write(bArr, i6, i7);
        }
        this.d += i7;
    }

    @Override // defpackage.evrf, defpackage.evqj
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        A(bArr, i, i2);
    }

    @Override // defpackage.evrf
    public final void aA(evqs evqsVar) throws IOException {
        w(evqsVar.d());
        evqsVar.p(this);
    }

    @Override // defpackage.evrf
    public final void aw() throws IOException {
        if (this.c > 0) {
            au();
        }
    }

    @Override // defpackage.evrf
    public final void ax(byte b) throws IOException {
        if (this.c == this.b) {
            au();
        }
        c(b);
    }

    @Override // defpackage.evrf
    public final void ay(int i, boolean z) throws IOException {
        av(11);
        f(i, 0);
        c(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.evrf
    public final void az(int i, evqs evqsVar) throws IOException {
        u(i, 2);
        aA(evqsVar);
    }

    @Override // defpackage.evrf
    public final void i(int i, int i2) throws IOException {
        av(14);
        f(i, 5);
        d(i2);
    }

    @Override // defpackage.evrf
    public final void j(int i) throws IOException {
        av(4);
        d(i);
    }

    @Override // defpackage.evrf
    public final void k(int i, long j) throws IOException {
        av(18);
        f(i, 1);
        e(j);
    }

    @Override // defpackage.evrf
    public final void l(long j) throws IOException {
        av(8);
        e(j);
    }

    @Override // defpackage.evrf
    public final void m(int i, int i2) throws IOException {
        av(20);
        f(i, 0);
        if (i2 >= 0) {
            g(i2);
        } else {
            h(i2);
        }
    }

    @Override // defpackage.evrf
    public final void n(int i) throws IOException {
        if (i >= 0) {
            w(i);
        } else {
            y(i);
        }
    }

    @Override // defpackage.evrf
    public final void o(int i, evuh evuhVar, evuz evuzVar) throws IOException {
        u(i, 2);
        w(((evpz) evuhVar).getSerializedSize(evuzVar));
        evuzVar.m(evuhVar, this.f);
    }

    @Override // defpackage.evrf
    public final void p(evuh evuhVar) throws IOException {
        w(evuhVar.getSerializedSize());
        evuhVar.writeTo(this);
    }

    @Override // defpackage.evrf
    public final void q(int i, evuh evuhVar) throws IOException {
        u(1, 3);
        v(2, i);
        u(3, 2);
        p(evuhVar);
        u(1, 4);
    }

    @Override // defpackage.evrf
    public final void r(int i, evqs evqsVar) throws IOException {
        u(1, 3);
        v(2, i);
        az(3, evqsVar);
        u(1, 4);
    }

    @Override // defpackage.evrf
    public final void s(int i, String str) throws IOException {
        u(i, 2);
        t(str);
    }

    @Override // defpackage.evrf
    public final void t(String str) throws IOException {
        int iB;
        try {
            int length = str.length() * 3;
            int iW = W(length);
            int i = iW + length;
            int i2 = this.b;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iA = evwe.a(str, bArr, 0, length);
                w(iA);
                A(bArr, 0, iA);
                return;
            }
            if (i > i2 - this.c) {
                au();
            }
            int iW2 = W(str.length());
            int i3 = this.c;
            try {
                if (iW2 == iW) {
                    int i4 = i3 + iW2;
                    this.c = i4;
                    int iA2 = evwe.a(str, this.a, i4, i2 - i4);
                    this.c = i3;
                    iB = (iA2 - i3) - iW2;
                    g(iB);
                    this.c = iA2;
                } else {
                    iB = evwe.b(str);
                    g(iB);
                    this.c = evwe.a(str, this.a, this.c, iB);
                }
                this.d += iB;
            } catch (evwd e) {
                this.d -= this.c - i3;
                this.c = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new evrd(e2);
            }
        } catch (evwd e3) {
            ad(str, e3);
        }
    }

    @Override // defpackage.evrf
    public final void u(int i, int i2) throws IOException {
        w(evwj.c(i, i2));
    }

    @Override // defpackage.evrf
    public final void v(int i, int i2) throws IOException {
        av(20);
        f(i, 0);
        g(i2);
    }

    @Override // defpackage.evrf
    public final void w(int i) throws IOException {
        av(5);
        g(i);
    }

    @Override // defpackage.evrf
    public final void x(int i, long j) throws IOException {
        av(20);
        f(i, 0);
        h(j);
    }

    @Override // defpackage.evrf
    public final void y(long j) throws IOException {
        av(10);
        h(j);
    }

    @Override // defpackage.evrf
    public final void z(byte[] bArr, int i) throws IOException {
        w(i);
        A(bArr, 0, i);
    }
}
