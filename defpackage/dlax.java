package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlax implements dkff {
    public final djrr a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final dlad f;
    public final dlad g;
    public final fdae h;
    public final boolean i;
    public final String j;
    private final diih k;

    public /* synthetic */ dlax(djrr djrrVar, String str, String str2, String str3, List list, dlad dladVar, dlad dladVar2, fdae fdaeVar, boolean z, String str4, int i) {
        list = (i & 16) != 0 ? fcvo.a : list;
        dladVar = (i & 32) != 0 ? null : dladVar;
        dladVar2 = (i & 64) != 0 ? null : dladVar2;
        boolean z2 = z & ((i & 512) == 0);
        str4 = (i & 1024) != 0 ? null : str4;
        djrrVar.getClass();
        this.a = djrrVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = dladVar;
        this.g = dladVar2;
        this.k = null;
        this.h = fdaeVar;
        this.i = z2;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlax)) {
            return false;
        }
        dlax dlaxVar = (dlax) obj;
        if (this.a != dlaxVar.a || !fdbq.f(this.b, dlaxVar.b) || !fdbq.f(this.c, dlaxVar.c) || !fdbq.f(this.d, dlaxVar.d) || !fdbq.f(this.e, dlaxVar.e) || !fdbq.f(this.f, dlaxVar.f) || !fdbq.f(this.g, dlaxVar.g)) {
            return false;
        }
        diih diihVar = dlaxVar.k;
        return fdbq.f(null, null) && fdbq.f(this.h, dlaxVar.h) && this.i == dlaxVar.i && fdbq.f(this.j, dlaxVar.j);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        dlad dladVar = this.f;
        int iHashCode2 = ((iHashCode * 31) + (dladVar == null ? 0 : dladVar.hashCode())) * 31;
        dlad dladVar2 = this.g;
        int iHashCode3 = (((((iHashCode2 + (dladVar2 == null ? 0 : dladVar2.hashCode())) * 961) + this.h.hashCode()) * 31) + (true != this.i ? 1237 : 1231)) * 31;
        String str = this.j;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AlertCardUiData(featureIcon=" + this.a + ", featureTitle=" + this.b + ", cardTitle=" + this.c + ", cardDescription=" + this.d + ", cardDescriptionAnnotations=" + this.e + ", primaryButton=" + this.f + ", secondaryButton=" + this.g + ", initialCompositionElement=null, onCloseClick=" + this.h + ", hasLiveRegion=" + this.i + ", contentDescription=" + this.j + ")";
    }
}
