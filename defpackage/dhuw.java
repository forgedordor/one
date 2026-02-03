package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhuw extends dhph {
    public final dhvp a;
    private final List b;
    private final List c;

    public dhuw(List list, dhvp dhvpVar, List list2) {
        this.b = list;
        this.a = dhvpVar;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhuw)) {
            return false;
        }
        dhuw dhuwVar = (dhuw) obj;
        return fdbq.f(this.b, dhuwVar.b) && fdbq.f(this.a, dhuwVar.a) && fdbq.f(this.c, dhuwVar.c);
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 31) * 31) + this.c.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dhuw(dhvp dhvpVar) {
        fcvo fcvoVar = fcvo.a;
        this(fcvoVar, dhvpVar, fcvoVar);
    }
}
