package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esld {
    public static volatile esld a;
    private final Set b = new HashSet();

    final Set a() {
        Set setUnmodifiableSet;
        Set set = this.b;
        synchronized (set) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(set);
        }
        return setUnmodifiableSet;
    }
}
