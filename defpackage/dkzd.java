package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkzd implements dkzf {
    public final List a;
    public final Integer b;
    public final boolean c;
    public final fdae d;
    public final iby e;
    public final boolean f;
    public final boolean g;
    public final dkzc h;
    public final fdae i;

    public dkzd(List list, Integer num, fdae fdaeVar, iby ibyVar, dkzc dkzcVar, fdae fdaeVar2) {
        this.a = list;
        this.b = num;
        this.c = true;
        this.d = fdaeVar;
        this.e = ibyVar;
        this.f = true;
        this.g = true;
        this.h = dkzcVar;
        this.i = fdaeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkzd)) {
            return false;
        }
        dkzd dkzdVar = (dkzd) obj;
        if (!fdbq.f(this.a, dkzdVar.a) || !fdbq.f(this.b, dkzdVar.b)) {
            return false;
        }
        boolean z = dkzdVar.c;
        if (!fdbq.f(this.d, dkzdVar.d) || !fdbq.f(this.e, dkzdVar.e)) {
            return false;
        }
        boolean z2 = dkzdVar.f;
        boolean z3 = dkzdVar.g;
        return fdbq.f(this.h, dkzdVar.h) && fdbq.f(this.i, dkzdVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return ((((((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + 1231) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + 1231) * 31) + 1231) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "ScrollingReactionsBarUiData(reactionItems=" + this.a + ", selectedIndex=" + this.b + ", enableEnterAnimation=true, customEmojiButtonOnClick=" + this.d + ", contentAlignment=" + this.e + ", replayItemAnimationsOnScroll=true, hasBackgroundPill=true, flags=" + this.h + ", emotifyButtonOnClick=" + this.i + ")";
    }

    public /* synthetic */ dkzd(List list, Integer num, fdae fdaeVar, dkzc dkzcVar, fdae fdaeVar2) {
        this(list, num, fdaeVar, ibw.e, dkzcVar, fdaeVar2);
    }
}
