package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxs {
    public final List a;
    public final bxc b;

    public bxs(List list, bxc bxcVar) {
        boolean z = true;
        if (list.isEmpty() && bxcVar == bxc.c) {
            z = false;
        }
        lcg.b(z, "No preferred quality and fallback strategy.");
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.b = bxcVar;
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.a + ", fallbackStrategy=" + this.b + "}";
    }
}
