package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaet {
    public final evqs a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    private final boolean f;
    private final List g;
    private final List h;
    private final List i;
    private final boolean j;

    public eaet(boolean z, List list, evqs evqsVar, String str, String str2, List list2, List list3, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        evqsVar.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        this.f = z;
        this.g = list;
        this.a = evqsVar;
        this.b = str;
        this.c = str2;
        this.h = list2;
        this.i = list3;
        this.j = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean a(eryd erydVar) {
        erydVar.getClass();
        return this.f && this.g.contains(erydVar);
    }

    public final int b(eryd erydVar, String str) {
        erydVar.getClass();
        str.getClass();
        if (!this.j) {
            return 14;
        }
        if (!a(erydVar)) {
            return 3;
        }
        if (this.a.H()) {
            return 4;
        }
        List list = this.h;
        if (list.isEmpty() || list.contains(str)) {
            return this.i.contains(str) ? 6 : 0;
        }
        return 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaet)) {
            return false;
        }
        eaet eaetVar = (eaet) obj;
        return this.f == eaetVar.f && fdbq.f(this.g, eaetVar.g) && fdbq.f(this.a, eaetVar.a) && fdbq.f(this.b, eaetVar.b) && fdbq.f(this.c, eaetVar.c) && fdbq.f(this.h, eaetVar.h) && fdbq.f(this.i, eaetVar.i) && this.j == eaetVar.j && this.d == eaetVar.d && this.e == eaetVar.e;
    }

    public final int hashCode() {
        int iA = (((((((((((eaes.a(this.f) * 31) + this.g.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
        boolean z = this.e;
        return (((((iA * 31) + eaes.a(this.j)) * 31) + eaes.a(this.d)) * 31) + eaes.a(z);
    }

    public final String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.f + ", enabledBackings=" + this.g + ", secret=" + this.a + ", dirPath=" + this.b + ", gmsCoreDirPath=" + this.c + ", includeStaticConfigPackages=" + this.h + ", excludeStaticConfigPackages=" + this.i + ", hasStorageInfoFromGms=" + this.j + ", allowEmptySnapshotToken=" + this.d + ", enableCommitV2Api=" + this.e + ")";
    }
}
