package defpackage;

import j$.time.Duration;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drlx {
    public static final drlx a;
    private final Set b = Collections.newSetFromMap(new WeakHashMap());

    static {
        Duration.ofSeconds(4L);
        a = new drlx();
    }

    private drlx() {
        new HashSet();
    }

    public final synchronized void a(drly drlyVar) {
        this.b.add(drlyVar);
    }
}
