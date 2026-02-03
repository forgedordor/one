package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eycu implements eycb {
    private final byte[] a;
    private int b;
    private int c;

    public eycu(String str) {
        this.a = str.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.eycb
    public final synchronized int a(byte[] bArr, int i, int i2) {
        ejwl.b(65536 - i >= i2, "Buffer length too small.");
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.b;
        byte[] bArr2 = this.a;
        int length = bArr2.length;
        if (i3 == length) {
            return 0;
        }
        int iMin = Math.min(i2, length - i3);
        for (int i4 = 0; i4 < iMin; i4++) {
            int i5 = this.b;
            bArr[i + i4] = bArr2[i5];
            this.b = i5 + 1;
        }
        return iMin;
    }

    @Override // defpackage.eycb
    public final synchronized long b() {
        return this.c;
    }

    @Override // defpackage.eycb
    public final synchronized long c() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.eycb, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // defpackage.eycb
    public final synchronized long d() {
        return this.b;
    }

    @Override // defpackage.eycb
    public final synchronized long e() {
        return this.a.length;
    }

    @Override // defpackage.eycb
    public final synchronized long f(long j) {
        long jMin;
        jMin = Math.min(j, this.a.length - this.b);
        this.b = (int) (this.b + jMin);
        return jMin;
    }

    @Override // defpackage.eycb
    public final synchronized void g() {
        this.c = this.b;
    }

    @Override // defpackage.eycb
    public final synchronized void h() {
        this.b = this.c;
    }

    @Override // defpackage.eycb
    public final synchronized boolean i() {
        return this.b < this.a.length;
    }
}
