package defpackage;

import java.io.IOException;
import java.io.Writer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehqq extends Writer {
    public long a = 0;
    private final Writer b;

    public ehqq(Writer writer) {
        this.b = writer;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.b.flush();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        this.b.write(cArr, i, i2);
        this.a += i2;
    }
}
