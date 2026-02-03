package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deqf extends OutputStream {
    public volatile depz a;
    private final OutputStream b;

    public deqf(OutputStream outputStream) {
        this.b = outputStream;
    }

    private final IOException a(IOException iOException) {
        if (this.a == null) {
            return iOException;
        }
        if (Log.isLoggable("ChannelOutputStream", 2)) {
            Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", iOException);
        }
        return new denj();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.b.close();
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.b.flush();
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            this.b.write(i);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        try {
            this.b.write(bArr);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.b.write(bArr, i, i2);
        } catch (IOException e) {
            throw a(e);
        }
    }
}
