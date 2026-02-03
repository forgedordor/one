package defpackage;

import android.content.Context;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhz implements Closeable {
    public final Context a;
    public final euki b;
    public eugc c;
    public boolean d = true;

    public euhz(Context context, euki eukiVar) {
        this.a = context;
        this.b = eukiVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }
}
