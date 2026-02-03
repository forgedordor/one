package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkur implements dkgq {
    public final List a;
    public final dkuq b;
    public final boolean c;
    public final fdae d;
    public final fdae e;
    public final String f;
    public final int g;

    public dkur(List list, int i, dkuq dkuqVar, boolean z, fdae fdaeVar, fdae fdaeVar2, String str) {
        this.a = list;
        this.g = i;
        this.b = dkuqVar;
        this.c = z;
        this.d = fdaeVar;
        this.e = fdaeVar2;
        this.f = str;
    }

    @Override // defpackage.dkgq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.d;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkur)) {
            return false;
        }
        dkur dkurVar = (dkur) obj;
        return fdbq.f(this.a, dkurVar.a) && this.g == dkurVar.g && fdbq.f(this.b, dkurVar.b) && this.c == dkurVar.c && fdbq.f(this.d, dkurVar.d) && fdbq.f(this.e, dkurVar.e) && fdbq.f(this.f, dkurVar.f);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.g) * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RichCardCarouselUiData(cards=");
        sb.append(this.a);
        sb.append(", cardWidth=");
        int i = this.g;
        sb.append((Object) (i != 120 ? i != 232 ? "null" : "Medium" : "Small"));
        sb.append(", sizeConfigurations=");
        sb.append(this.b);
        sb.append(", isHighlighted=");
        sb.append(this.c);
        sb.append(", onClick=");
        sb.append(this.d);
        sb.append(", onLayout=");
        sb.append(this.e);
        sb.append(", contentDescription=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
