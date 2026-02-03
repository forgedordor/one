package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sai extends InputStream implements InputStreamRetargetInterface {
    private final InputStream[] a;
    private int b = 0;

    public sai(InputStream[] inputStreamArr) {
        this.a = inputStreamArr;
    }

    private final boolean a() {
        int i = this.b + 1;
        int length = this.a.length;
        if (i >= 2) {
            return false;
        }
        this.b = 1;
        return true;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a[this.b].available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.b;
        int i2 = 0;
        IOException iOException = null;
        while (true) {
            InputStream[] inputStreamArr = this.a;
            int length = inputStreamArr.length;
            if (i2 >= 2) {
                return;
            }
            try {
                inputStreamArr[i2].close();
            } catch (IOException e) {
                e = e;
                if (i2 != i && iOException != null) {
                    e = iOException;
                }
                if (iOException != null && iOException != e) {
                    rzl.e(iOException, "Suppressing exception");
                }
                iOException = e;
            }
            i2++;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        do {
            int i = this.a[this.b].read();
            if (i != -1) {
                return i;
            }
        } while (a());
        return -1;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i = read(new byte[(int) j]);
        if (i >= 0) {
            return i;
        }
        return -1L;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        do {
            int i3 = this.a[this.b].read(bArr, i, i2);
            if (i3 != -1) {
                return i3;
            }
        } while (a());
        return -1;
    }
}
