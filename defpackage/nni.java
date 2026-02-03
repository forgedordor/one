package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nni implements nns {
    public final long a;
    public long b;
    public int d;
    public int e;
    private final mah g;
    public byte[] c = new byte[65536];
    private final byte[] f = new byte[4096];

    static {
        mbp.b("media3.extractor");
    }

    public nni(mah mahVar, long j, long j2) {
        this.g = mahVar;
        this.b = j;
        this.a = j2;
    }

    private final int p(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.c, 0, bArr, i, iMin);
        s(iMin);
        return iMin;
    }

    private final int q(int i) {
        int iMin = Math.min(this.e, i);
        s(iMin);
        return iMin;
    }

    private final void r(int i) {
        if (i != -1) {
            this.b += i;
        }
    }

    private final void s(int i) {
        int i2 = this.e - i;
        this.e = i2;
        this.d = 0;
        byte[] bArr = this.c;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.c = bArr2;
    }

    @Override // defpackage.nns, defpackage.mah
    public final int a(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int iP = p(bArr, i, i2);
        if (iP == 0) {
            iP = b(bArr, i, i2, 0, true);
        }
        r(iP);
        return iP;
    }

    public final int b(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iA = this.g.a(bArr, i + i3, i2 - i3);
        if (iA != -1) {
            return i3 + iA;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.nns
    public final int c(int i) throws EOFException, InterruptedIOException {
        int iQ = q(i);
        if (iQ == 0) {
            iQ = b(this.f, 0, Math.min(i, 4096), 0, true);
        }
        r(iQ);
        return iQ;
    }

    @Override // defpackage.nns
    public final long d() {
        return this.a;
    }

    @Override // defpackage.nns
    public final long e() {
        return this.b + this.d;
    }

    @Override // defpackage.nns
    public final long f() {
        return this.b;
    }

    @Override // defpackage.nns
    public final void g(int i) throws EOFException, InterruptedIOException {
        m(i, false);
    }

    public final void h(int i) {
        int i2 = this.d + i;
        int length = this.c.length;
        if (i2 > length) {
            this.c = Arrays.copyOf(this.c, mgb.d(length + length, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.nns
    public final void i(byte[] bArr, int i, int i2) {
        n(bArr, i, i2, false);
    }

    @Override // defpackage.nns
    public final void j(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        o(bArr, i, i2, false);
    }

    @Override // defpackage.nns
    public final void k() {
        this.d = 0;
    }

    @Override // defpackage.nns
    public final void l(int i) throws EOFException, InterruptedIOException {
        int iQ = q(i);
        while (iQ < i && iQ != -1) {
            iQ = b(this.f, -iQ, Math.min(i, iQ + 4096), iQ, false);
        }
        r(iQ);
    }

    public final boolean m(int i, boolean z) throws EOFException, InterruptedIOException {
        h(i);
        int iB = this.e - this.d;
        while (iB < i) {
            int i2 = i;
            boolean z2 = z;
            iB = b(this.c, this.d, i2, iB, z2);
            if (iB == -1) {
                return false;
            }
            this.e = this.d + iB;
            i = i2;
            z = z2;
        }
        this.d += i;
        return true;
    }

    @Override // defpackage.nns
    public final boolean n(byte[] bArr, int i, int i2, boolean z) {
        if (!m(i2, z)) {
            return false;
        }
        System.arraycopy(this.c, this.d - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.nns
    public final boolean o(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iP = p(bArr, i, i2);
        while (iP < i2 && iP != -1) {
            iP = b(bArr, i, i2, iP, z);
        }
        r(iP);
        return iP != -1;
    }
}
