package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkze implements dkzf {
    public final List a;
    public final Integer b;
    public final fdae c;
    private final boolean d = true;

    public dkze(List list, Integer num, fdae fdaeVar) {
        this.a = list;
        this.b = num;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkze)) {
            return false;
        }
        dkze dkzeVar = (dkze) obj;
        if (!fdbq.f(this.a, dkzeVar.a) || !fdbq.f(this.b, dkzeVar.b)) {
            return false;
        }
        boolean z = dkzeVar.d;
        return fdbq.f(this.c, dkzeVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + 1231) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "StaticReactionsBarUiData(reactionItems=" + this.a + ", selectedIndex=" + this.b + ", enableEnterAnimation=true, customEmojiButtonOnClick=" + this.c + ")";
    }
}
