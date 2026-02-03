package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffex extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ ffez a;

    public ffex(ffez ffezVar) {
        this.a = ffezVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.a.b, 2147483647L);
    }

    @Override // java.io.InputStream
    public final int read() {
        ffez ffezVar = this.a;
        if (ffezVar.b > 0) {
            return ffezVar.d() & 255;
        }
        return -1;
    }

    public final String toString() {
        ffez ffezVar = this.a;
        Objects.toString(ffezVar);
        return ffezVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        return this.a.e(bArr, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
