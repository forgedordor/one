package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echb implements Closeable {
    public final /* synthetic */ Uri a;
    final /* synthetic */ Pair b;

    public echb(Uri uri, Pair pair) {
        this.a = uri;
        this.b = pair;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((Closeable) this.b.second).close();
    }
}
