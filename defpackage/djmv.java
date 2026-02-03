package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djmv implements djmy {
    public final String a;
    public final String b;
    public final List c;
    public final dktq d;
    public final dktq e;
    public final fdae f;
    public final djmu g;

    public djmv(djmu djmuVar, String str, String str2, List list, dktq dktqVar, dktq dktqVar2, fdae fdaeVar) {
        str2.getClass();
        this.g = djmuVar;
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = dktqVar;
        this.e = dktqVar2;
        this.f = fdaeVar;
    }

    @Override // defpackage.djmy
    public final /* synthetic */ djmy a(boolean z, fdae fdaeVar) {
        return djmg.a(this, z, fdaeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djmv)) {
            return false;
        }
        djmv djmvVar = (djmv) obj;
        return fdbq.f(this.g, djmvVar.g) && fdbq.f(this.a, djmvVar.a) && fdbq.f(this.b, djmvVar.b) && fdbq.f(this.c, djmvVar.c) && fdbq.f(this.d, djmvVar.d) && fdbq.f(this.e, djmvVar.e) && fdbq.f(this.f, djmvVar.f);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.g.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        dktq dktqVar = this.e;
        return (((iHashCode * 31) + (dktqVar == null ? 0 : dktqVar.hashCode())) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Verification(icon=" + this.g + ", title=" + this.a + ", body=" + this.b + ", bodyAnnotations=" + this.c + ", confirmButton=" + this.d + ", dismissButton=" + this.e + ", onDismissRequest=" + this.f + ")";
    }
}
