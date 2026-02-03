package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dote implements dpxp {
    public final Map a;
    public final boolean b;
    public final Integer c;
    public final Integer d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final float j;
    public final boolean k;

    public dote() {
        this(false, false, false, false, 0.0f, false, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dote)) {
            return false;
        }
        dote doteVar = (dote) obj;
        if (!fdbq.f(this.a, doteVar.a)) {
            return false;
        }
        boolean z = doteVar.b;
        if (!fdbq.f(this.c, doteVar.c) || !fdbq.f(this.d, doteVar.d)) {
            return false;
        }
        boolean z2 = doteVar.e;
        return this.f == doteVar.f && this.g == doteVar.g && this.h == doteVar.h && this.i == doteVar.i && Float.compare(this.j, doteVar.j) == 0 && this.k == doteVar.k;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.c;
        int iA = (((iHashCode + dotd.a(false)) * 31) + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return ((((((((((((((iA + (num2 == null ? 0 : num2.hashCode())) * 31) + dotd.a(false)) * 31) + dotd.a(this.f)) * 31) + dotd.a(this.g)) * 31) + dotd.a(this.h)) * 31) + dotd.a(this.i)) * 31) + Float.floatToIntBits(this.j)) * 31) + dotd.a(this.k);
    }

    public final String toString() {
        return "ProxyScreenConfiguration(attachedScreenConfigurationOverrides=" + this.a + ", dismissIconWithSearchBar=false, searchBarTopInsetResId=" + this.c + ", searchBarBottomMarginResId=" + this.d + ", isEmotifyEntryPointEnabled=false, notifyOnStateChange=" + this.f + ", alwaysRespectSearchTerm=" + this.g + ", shouldDelayBindingSearchUntilRequired=" + this.h + ", shouldUnbindSearchBarWhenHidden=" + this.i + ", emotifySmallSegmentRatio=" + this.j + ", enableEmotifyActivityEdgeToEdgeDisplay=" + this.k + ")";
    }

    public dote(Map map, Integer num, Integer num2, boolean z, boolean z2, boolean z3, boolean z4, float f, boolean z5) {
        map.getClass();
        this.a = map;
        this.b = false;
        this.c = num;
        this.d = num2;
        this.e = false;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = f;
        this.k = z5;
    }

    public /* synthetic */ dote(boolean z, boolean z2, boolean z3, boolean z4, float f, boolean z5, int i) {
        this((i & 1) != 0 ? fcvp.a : null, null, null, ((i & 32) == 0) & z, ((i & 64) == 0) & z2, ((i & 128) == 0) & z3, ((i & 256) == 0) & z4, (i & 512) != 0 ? 0.0f : f, ((i & 1024) == 0) & z5);
    }
}
