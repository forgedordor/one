package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fciy extends InputStream implements InputStreamRetargetInterface, fbpu {
    private final fcix a;

    public fciy(fcix fcixVar) {
        fcixVar.getClass();
        this.a = fcixVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((fcba) this.a).a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read() {
        fcix fcixVar = this.a;
        if (((fcba) fcixVar).a == 0) {
            return -1;
        }
        return fcixVar.e();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        fcix fcixVar = this.a;
        int iMin = (int) Math.min(((fcba) fcixVar).a, j);
        fcixVar.l(iMin);
        return iMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        fcix fcixVar = this.a;
        int i3 = ((fcba) fcixVar).a;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i2);
        fcixVar.k(bArr, i, iMin);
        return iMin;
    }
}
