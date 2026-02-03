package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjq implements fgmb {
    @Override // defpackage.fgmb
    public final Set a() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{'<'}[0];
        obj.getClass();
        if (hashSet.add(obj)) {
            return DesugarCollections.unmodifiableSet(hashSet);
        }
        Objects.toString(obj);
        throw new IllegalArgumentException("duplicate element: ".concat(obj.toString()));
    }

    @Override // defpackage.fgmb
    public final fgma b() {
        return new fgjr();
    }
}
