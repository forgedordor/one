package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffap {
    private final Set a = new LinkedHashSet();

    public final synchronized void a(fezl fezlVar) {
        this.a.remove(fezlVar);
    }

    public final synchronized void b(fezl fezlVar) {
        this.a.add(fezlVar);
    }

    public final synchronized boolean c(fezl fezlVar) {
        return this.a.contains(fezlVar);
    }
}
