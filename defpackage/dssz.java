package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dssz {
    public final AtomicReference a = new AtomicReference();

    public final void a(dssw dsswVar) {
        this.a.set(dsswVar);
    }

    public final void b() {
        this.a.set(null);
    }
}
