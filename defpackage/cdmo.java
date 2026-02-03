package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmo {
    private final AtomicInteger a = new AtomicInteger(cdmn.a.ordinal());

    public final cdmn a() {
        return (cdmn) cdmn.d.get(this.a.get());
    }

    public final void b(cdmn cdmnVar) {
        cdmnVar.getClass();
        this.a.set(cdmnVar.ordinal());
    }

    public final boolean c() {
        return a() != cdmn.a;
    }

    public final boolean d() {
        return a() == cdmn.c && c();
    }

    public final boolean e() {
        if (c()) {
            return a() == cdmn.b;
        }
        throw new IllegalStateException("TrustedContactsInMemory cache is not initialized. Cannot be used to determine the supervision status.");
    }
}
