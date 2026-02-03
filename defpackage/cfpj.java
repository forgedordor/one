package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfpj implements Closeable {
    final /* synthetic */ eiju a;
    final /* synthetic */ cfpk b;

    public cfpj(cfpk cfpkVar, eiju eijuVar) {
        this.a = eijuVar;
        this.b = cfpkVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        cfpk cfpkVar = this.b;
        synchronized (cfpkVar.b) {
            if (this.a == cfpkVar.h) {
                cfpkVar.h = null;
            }
        }
    }
}
