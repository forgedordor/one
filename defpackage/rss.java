package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rss {
    private final List a = new ArrayList();

    public final synchronized red a(Class cls) {
        for (rsr rsrVar : this.a) {
            if (rsrVar.a.isAssignableFrom(cls)) {
                return rsrVar.b;
            }
        }
        return null;
    }

    public final synchronized void b(Class cls, red redVar) {
        this.a.add(new rsr(cls, redVar));
    }
}
