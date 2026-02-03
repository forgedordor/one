package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekvo extends ekvv implements ekvt {
    public final AtomicBoolean a = new AtomicBoolean();

    @Override // defpackage.ekvv
    public final ekvr a() {
        return new ekvm(this);
    }

    @Override // defpackage.ekvt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
