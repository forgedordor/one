package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddk {
    public final dat a;
    public final ddf b;
    public final cyo c;
    public final daz d;
    public final boolean e;
    public final Map f;

    public ddk() {
        this(null, null, null, null, false, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddk)) {
            return false;
        }
        ddk ddkVar = (ddk) obj;
        return fdbq.f(this.a, ddkVar.a) && fdbq.f(this.b, ddkVar.b) && fdbq.f(this.c, ddkVar.c) && fdbq.f(this.d, ddkVar.d) && this.e == ddkVar.e && fdbq.f(this.f, ddkVar.f);
    }

    public final int hashCode() {
        dat datVar = this.a;
        int iHashCode = datVar == null ? 0 : datVar.hashCode();
        ddf ddfVar = this.b;
        int iHashCode2 = ((iHashCode * 31) + (ddfVar == null ? 0 : ddfVar.hashCode())) * 31;
        cyo cyoVar = this.c;
        int iHashCode3 = (iHashCode2 + (cyoVar == null ? 0 : cyoVar.hashCode())) * 31;
        daz dazVar = this.d;
        return ((((iHashCode3 + (dazVar != null ? dazVar.hashCode() : 0)) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public ddk(dat datVar, ddf ddfVar, cyo cyoVar, daz dazVar, boolean z, Map map) {
        this.a = datVar;
        this.b = ddfVar;
        this.c = cyoVar;
        this.d = dazVar;
        this.e = z;
        this.f = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ddk(dat datVar, ddf ddfVar, cyo cyoVar, daz dazVar, boolean z, Map map, int i) {
        Map map2 = (i & 32) != 0 ? fcvp.a : map;
        int i2 = i & 8;
        int i3 = i & 4;
        int i4 = i & 2;
        boolean z2 = (i & 16) == 0;
        int i5 = i & 1;
        boolean z3 = z2 & z;
        daz dazVar2 = i2 != 0 ? null : dazVar;
        cyoVar = i3 != 0 ? null : cyoVar;
        this(1 == i5 ? null : datVar, i4 != 0 ? null : ddfVar, cyoVar, dazVar2, z3, map2);
    }
}
