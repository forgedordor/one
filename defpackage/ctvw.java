package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctvw {
    public final List a;
    public final List b;
    public final List c;

    public ctvw() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctvw)) {
            return false;
        }
        ctvw ctvwVar = (ctvw) obj;
        return fdbq.f(this.a, ctvwVar.a) && fdbq.f(this.b, ctvwVar.b) && fdbq.f(this.c, ctvwVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CombinedChipData(visibleNonRcsChips=" + this.a + ", visibleNonE2eeChips=" + this.b + ", totalChips=" + this.c + ")";
    }

    public ctvw(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public /* synthetic */ ctvw(List list, int i) {
        this((i & 1) != 0 ? fcvo.a : null, (i & 2) != 0 ? fcvo.a : null, (i & 4) != 0 ? fcvo.a : list);
    }
}
