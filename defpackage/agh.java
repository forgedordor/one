package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agh {
    private final List a;
    private final List b;

    public agh(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.a);
    }

    public final List b() {
        return DesugarCollections.unmodifiableList(this.b);
    }
}
