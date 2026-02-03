package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffv implements fffb {
    public final ffgb a;
    public final ffez b = new ffez();
    public boolean c;

    public fffv(ffgb ffgbVar) {
        this.a = ffgbVar;
    }

    @Override // defpackage.fffb
    public final void C(long j) throws EOFException {
        if (!F(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.fffb
    public final void D(long j) throws EOFException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            ffez ffezVar = this.b;
            if (ffezVar.b == 0 && this.a.b(ffezVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, ffezVar.b);
            ffezVar.D(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.fffb
    public final boolean E() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ffez ffezVar = this.b;
        return ffezVar.E() && this.a.b(ffezVar, 8192L) == -1;
    }

    @Override // defpackage.fffb
    public final boolean F(long j) {
        ffez ffezVar;
        if (j < 0) {
            throw new IllegalArgumentException(a.u(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            ffezVar = this.b;
            if (ffezVar.b >= j) {
                return true;
            }
        } while (this.a.b(ffezVar, 8192L) != -1);
        return false;
    }

    @Override // defpackage.fffb
    public final byte[] G() {
        ffez ffezVar = this.b;
        ffezVar.O(this.a);
        return ffezVar.G();
    }

    @Override // defpackage.fffb
    public final byte[] H(long j) throws EOFException {
        C(j);
        return this.b.H(j);
    }

    @Override // defpackage.fffb
    public final void J(fffz fffzVar) {
        ffez ffezVar;
        while (true) {
            ffgb ffgbVar = this.a;
            ffezVar = this.b;
            if (ffgbVar.b(ffezVar, 8192L) == -1) {
                break;
            }
            long jH = ffezVar.h();
            if (jH > 0) {
                fffzVar.hO(ffezVar, jH);
            }
        }
        long j = ffezVar.b;
        if (j > 0) {
            fffzVar.hO(ffezVar, j);
        }
    }

    @Override // defpackage.ffgb
    public final ffgd a() {
        return this.a.a();
    }

    @Override // defpackage.ffgb
    public final long b(ffez ffezVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.u(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ffez ffezVar2 = this.b;
        if (ffezVar2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.b(ffezVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return ffezVar2.b(ffezVar, Math.min(j, ffezVar2.b));
    }

    public final int c() throws EOFException {
        C(4L);
        int iF = this.b.f();
        int i = iF >>> 24;
        int i2 = 16711680 & iF;
        int i3 = 65280 & iF;
        return ((iF & 255) << 24) | i | (i2 >>> 8) | (i3 << 8);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ffgb
    public final void close() throws EOFException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.B();
    }

    @Override // defpackage.fffb
    public final byte d() throws EOFException {
        C(1L);
        return this.b.d();
    }

    public final long e() {
        return h((byte) 0, Long.MAX_VALUE);
    }

    @Override // defpackage.fffb
    public final int f() throws EOFException {
        C(4L);
        return this.b.f();
    }

    @Override // defpackage.fffb
    public final int g(fffn fffnVar) throws EOFException {
        fffnVar.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            ffez ffezVar = this.b;
            int iA = ffgf.a(ffezVar, fffnVar, true);
            if (iA != -2) {
                if (iA != -1) {
                    ffezVar.D(fffnVar.b[iA].b());
                    return iA;
                }
            } else if (this.a.b(ffezVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    public final long h(byte b, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (jMax < j) {
            ffez ffezVar = this.b;
            byte b2 = b;
            long j2 = j;
            long jI = ffezVar.i(b2, jMax, j2);
            if (jI != -1) {
                return jI;
            }
            long j3 = ffezVar.b;
            if (j3 >= j2 || this.a.b(ffezVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
            b = b2;
            j = j2;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // defpackage.fffb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(defpackage.fffd r19) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fffv.j(fffd):long");
    }

    @Override // defpackage.fffb
    public final InputStream k() {
        return new fffu(this);
    }

    @Override // defpackage.fffb
    public final String l(Charset charset) {
        ffez ffezVar = this.b;
        ffezVar.O(this.a);
        return ffezVar.l(charset);
    }

    @Override // defpackage.fffb
    public final String p() {
        return q(Long.MAX_VALUE);
    }

    @Override // defpackage.fffb
    public final String q(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(a.u(j, "limit < 0: "));
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jH = h((byte) 10, j2);
        if (jH != -1) {
            return ffgf.b(this.b, jH);
        }
        if (j2 < Long.MAX_VALUE && F(j2)) {
            ffez ffezVar = this.b;
            if (ffezVar.c((-1) + j2) == 13 && F(1 + j2) && ffezVar.c(j2) == 10) {
                return ffgf.b(ffezVar, j2);
            }
        }
        ffez ffezVar2 = new ffez();
        ffez ffezVar3 = this.b;
        ffezVar3.I(ffezVar2, 0L, Math.min(32L, ffezVar3.b));
        throw new EOFException("\\n not found: limit=" + Math.min(ffezVar3.b, j) + " content=" + ffezVar2.u().d() + "…");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ffez ffezVar = this.b;
        if (ffezVar.b == 0 && this.a.b(ffezVar, 8192L) == -1) {
            return -1;
        }
        return ffezVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // defpackage.fffb
    public final fffd v(long j) throws EOFException {
        C(j);
        return this.b.v(j);
    }

    @Override // defpackage.fffb
    public final short z() throws EOFException {
        C(2L);
        return this.b.z();
    }
}
