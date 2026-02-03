package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class divn implements dkgq {
    public final String a;
    public final fdae b;
    public final boolean c;
    private final fdae d;
    private final String e;

    public divn(String str, fdae fdaeVar, fdae fdaeVar2, String str2, boolean z) {
        this.a = str;
        this.b = fdaeVar;
        this.d = fdaeVar2;
        this.e = str2;
        this.c = z;
    }

    @Override // defpackage.dkgq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.b;
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
        if (!(obj instanceof divn)) {
            return false;
        }
        divn divnVar = (divn) obj;
        return fdbq.f(this.a, divnVar.a) && fdbq.f(this.b, divnVar.b) && fdbq.f(this.d, divnVar.d) && fdbq.f(this.e, divnVar.e) && this.c == divnVar.c;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "BreadcrumbBubbleUiData(text=" + this.a + ", onClick=" + this.b + ", onLayout=" + this.d + ", contentDescription=" + this.e + ", isHighlighted=" + this.c + ")";
    }
}
