package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exmr {
    private final Map a = new HashMap();

    public final synchronized void a(long j, Object obj) {
        this.a.put(Long.valueOf(j), obj);
    }

    public final synchronized void b(long j) {
        this.a.get(Long.valueOf(j));
    }
}
