package defpackage;

import android.database.Cursor;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cqjc implements Closeable {
    public abstract Cursor a();

    public abstract cqjb b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (a() != null) {
            a().close();
        }
    }
}
