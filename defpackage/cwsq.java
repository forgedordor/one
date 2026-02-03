package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwsq implements einb {
    public final List a;

    public cwsq(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwsq) && fdbq.f(this.a, ((cwsq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CalendarBadgeClickEvent(suggestions=" + this.a + ")";
    }
}
