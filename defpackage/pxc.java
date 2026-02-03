package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxc {
    public final List a;

    public pxc(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !fdbq.f(getClass(), obj.getClass())) {
            return false;
        }
        return fdbq.f(this.a, ((pxc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fcva.aF(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
