package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ebcx extends OutputStream {
    private final OutputStream a;

    public ebcx(OutputStream outputStream) {
        outputStream.getClass();
        this.a = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ebcx) {
            return this == obj || this.a.equals(((ebcx) obj).a);
        }
        return false;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    public final int hashCode() {
        return Objects.hash(ebcx.class, this.a);
    }

    public final String toString() {
        return String.format("ForwardingOutputStream { delegate=%s }", this.a);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.a.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.a.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }
}
