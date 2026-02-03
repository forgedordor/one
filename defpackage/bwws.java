package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwws implements Closeable {
    private final ejvr a;

    public bwws(ejvr ejvrVar) {
        this.a = ejvrVar;
        ejwl.m(!((Boolean) ejvrVar.apply(null)).booleanValue(), "database closed before starting work");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ejwl.m(!((Boolean) this.a.apply(null)).booleanValue(), "database closed while doing work");
    }
}
