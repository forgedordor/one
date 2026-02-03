package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffft implements fffa {
    public final fffz a;
    public final ffez b = new ffez();
    public boolean c;

    public ffft(fffz fffzVar) {
        this.a = fffzVar;
    }

    @Override // defpackage.fffa
    public final void L(fffd fffdVar) {
        fffdVar.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.L(fffdVar);
        c();
    }

    @Override // defpackage.fffa
    public final void N(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.N(bArr, i, i2);
        c();
    }

    @Override // defpackage.fffa
    public final void Q(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.P(i);
        c();
    }

    @Override // defpackage.fffa
    public final void S(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.R(i);
        c();
    }

    @Override // defpackage.fffa
    public final void T(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ffez ffezVar = this.b;
        fffw fffwVarY = ffezVar.y(2);
        byte[] bArr = fffwVarY.a;
        int i2 = fffwVarY.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        fffwVarY.c = i2 + 2;
        ffezVar.b += 2;
        c();
    }

    @Override // defpackage.fffz
    public final ffgd a() {
        return this.a.a();
    }

    @Override // defpackage.fffa
    public final void aa(byte[] bArr) {
        bArr.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.aa(bArr);
        c();
    }

    @Override // defpackage.fffa
    public final void ac(String str) {
        str.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.ac(str);
        c();
    }

    public final void c() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ffez ffezVar = this.b;
        long jH = ffezVar.h();
        if (jH > 0) {
            this.a.hO(ffezVar, jH);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.fffz
    public final void close() throws Throwable {
        Throwable th;
        if (this.c) {
            return;
        }
        try {
            ffez ffezVar = this.b;
            long j = ffezVar.b;
            th = null;
            if (j > 0) {
                this.a.hO(ffezVar, j);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.fffa, defpackage.fffz, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ffez ffezVar = this.b;
        long j = ffezVar.b;
        if (j > 0) {
            this.a.hO(ffezVar, j);
        }
        this.a.flush();
    }

    @Override // defpackage.fffz
    public final void hO(ffez ffezVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.hO(ffezVar, j);
        c();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.fffa
    public final ffez r() {
        return this.b;
    }

    @Override // defpackage.fffa
    public final ffez s() {
        return this.b;
    }

    @Override // defpackage.fffa
    public final fffa t(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.ab(j);
        c();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.b.write(byteBuffer);
        c();
        return iWrite;
    }
}
