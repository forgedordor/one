package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afx extends ajn {
    final List a;
    private Set b;

    public afx(List list) {
        lcg.i(list);
        this.a = list;
    }

    public final Set a() {
        if (this.b == null) {
            this.b = DesugarCollections.unmodifiableSet(new css(this.a));
        }
        return this.b;
    }
}
