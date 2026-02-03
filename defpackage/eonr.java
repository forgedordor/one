package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eonr implements Closeable, Flushable {
    public static final /* synthetic */ int d = 0;
    public final Writer a;
    public final String b = "\n";
    public final eonq c;

    public eonr(Writer writer, eonq eonqVar) {
        this.a = writer;
        this.c = eonqVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }
}
