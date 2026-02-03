package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyl {
    public final List a;
    public final diyk b;

    public diyl(List list, diyk diykVar) {
        this.a = list;
        this.b = diykVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diyl)) {
            return false;
        }
        diyl diylVar = (diyl) obj;
        return fdbq.f(this.a, diylVar.a) && fdbq.f(this.b, diylVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1237;
    }

    public final String toString() {
        return "ModeSelectorUiData(modes=" + this.a + ", flags=" + this.b + ")";
    }
}
