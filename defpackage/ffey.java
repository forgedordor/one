package defpackage;

import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffey extends OutputStream {
    final /* synthetic */ ffez a;

    public ffey(ffez ffezVar) {
        this.a = ffezVar;
    }

    public final String toString() {
        ffez ffezVar = this.a;
        Objects.toString(ffezVar);
        return ffezVar.toString().concat(".outputStream()");
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a.P(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.a.N(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
