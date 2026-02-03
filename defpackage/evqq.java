package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes5.dex */
class evqq extends evqp {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public evqq(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.evqs
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.evqs
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.evqs
    public int d() {
        return this.a.length;
    }

    @Override // defpackage.evqs
    protected void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.evqs
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof evqs) || d() != ((evqs) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof evqq)) {
            return obj.equals(this);
        }
        evqq evqqVar = (evqq) obj;
        int i = this.c;
        int i2 = evqqVar.c;
        if (i == 0 || i2 == 0 || i == i2) {
            return g(evqqVar, 0, d());
        }
        return false;
    }

    @Override // defpackage.evqp
    public final boolean g(evqs evqsVar, int i, int i2) {
        if (i2 > evqsVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i2 + d());
        }
        int i3 = i + i2;
        if (i3 > evqsVar.d()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + evqsVar.d());
        }
        if (!(evqsVar instanceof evqq)) {
            return evqsVar.k(i, i3).equals(k(0, i2));
        }
        evqq evqqVar = (evqq) evqsVar;
        byte[] bArr = this.a;
        byte[] bArr2 = evqqVar.a;
        int iC = c() + i2;
        int iC2 = c();
        int iC3 = evqqVar.c() + i;
        while (iC2 < iC) {
            if (bArr[iC2] != bArr2[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
        }
        return true;
    }

    @Override // defpackage.evqs
    protected final int i(int i, int i2, int i3) {
        return evth.c(i, this.a, c() + i2, i3);
    }

    @Override // defpackage.evqs
    protected final int j(int i, int i2, int i3) {
        int iC = c() + i2;
        return evwe.a.a(i, this.a, iC, i3 + iC);
    }

    @Override // defpackage.evqs
    public final evqs k(int i, int i2) {
        int iS = s(i, i2, d());
        return iS == 0 ? evqs.b : new evqm(this.a, c() + i, iS);
    }

    @Override // defpackage.evqs
    public final evqz l() {
        return evqz.R(this.a, c(), d());
    }

    @Override // defpackage.evqs
    public final InputStream m() {
        return new ByteArrayInputStream(this.a, c(), d());
    }

    @Override // defpackage.evqs
    protected final String n(Charset charset) {
        return new String(this.a, c(), d(), charset);
    }

    @Override // defpackage.evqs
    public final ByteBuffer o() {
        return ByteBuffer.wrap(this.a, c(), d()).asReadOnlyBuffer();
    }

    @Override // defpackage.evqs
    public final void p(evqj evqjVar) {
        evqjVar.a(this.a, c(), d());
    }

    @Override // defpackage.evqs
    public final void q(OutputStream outputStream) throws IOException {
        outputStream.write(I());
    }

    @Override // defpackage.evqs
    public final boolean r() {
        int iC = c();
        return evwe.h(this.a, iC, d() + iC);
    }
}
