package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cekq implements Closeable {
    final /* synthetic */ ceku a;

    public cekq(ceku cekuVar) {
        this.a = cekuVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ceku cekuVar = this.a;
        synchronized (cekuVar) {
            cekuVar.x = null;
        }
    }
}
