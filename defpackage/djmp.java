package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djmp implements djmy {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d = true;
    public final dktq e;
    public final dktq f;
    public final fdae g;

    public djmp(String str, String str2, List list, dktq dktqVar, dktq dktqVar2, fdae fdaeVar) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.e = dktqVar;
        this.f = dktqVar2;
        this.g = fdaeVar;
    }

    @Override // defpackage.djmy
    public final /* synthetic */ djmy a(boolean z, fdae fdaeVar) {
        return djmg.a(this, z, fdaeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djmp)) {
            return false;
        }
        djmp djmpVar = (djmp) obj;
        if (!fdbq.f(this.a, djmpVar.a) || !fdbq.f(this.b, djmpVar.b) || !fdbq.f(this.c, djmpVar.c)) {
            return false;
        }
        boolean z = djmpVar.d;
        return fdbq.f(this.e, djmpVar.e) && fdbq.f(this.f, djmpVar.f) && fdbq.f(this.g, djmpVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + 1) * 31) + 1231) * 31) + this.e.hashCode();
        dktq dktqVar = this.f;
        return (((iHashCode * 31) + (dktqVar != null ? dktqVar.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "Preview(title=" + this.a + ", body=" + this.b + ", bodyAnnotations=" + this.c + ", stretchInLandscape=true, confirmButton=" + this.e + ", dismissButton=" + this.f + ", onDismissRequest=" + this.g + ")";
    }
}
