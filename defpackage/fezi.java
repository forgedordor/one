package defpackage;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezi extends Reader {
    private final fffb a;
    private final Charset b;
    private boolean c;
    private Reader d;

    public fezi(fffb fffbVar, Charset charset) {
        fffbVar.getClass();
        charset.getClass();
        this.a = fffbVar;
        this.b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c = true;
        Reader reader = this.d;
        if (reader != null) {
            reader.close();
        } else {
            this.a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        cArr.getClass();
        if (this.c) {
            throw new IOException("Stream closed");
        }
        Reader reader = this.d;
        if (reader == null) {
            fffb fffbVar = this.a;
            InputStreamReader inputStreamReader = new InputStreamReader(fffbVar.k(), fezr.n(fffbVar, this.b));
            this.d = inputStreamReader;
            reader = inputStreamReader;
        }
        return reader.read(cArr, i, i2);
    }
}
