package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksw implements dksx {
    public final Float a;
    public final fdae b;
    private final boolean c;
    private final fdae d;
    private final fdae e;
    private final String f;

    public dksw(Float f, fdae fdaeVar, boolean z, fdae fdaeVar2, fdae fdaeVar3, String str) {
        this.a = f;
        this.b = fdaeVar;
        this.c = z;
        this.d = fdaeVar2;
        this.e = fdaeVar3;
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
        return this.e;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dksw)) {
            return false;
        }
        dksw dkswVar = (dksw) obj;
        return fdbq.f(this.a, dkswVar.a) && fdbq.f(this.b, dkswVar.b) && this.c == dkswVar.c && fdbq.f(this.d, dkswVar.d) && fdbq.f(this.e, dkswVar.e) && fdbq.f(this.f, dkswVar.f);
    }

    public final int hashCode() {
        Float f = this.a;
        return ((((((((((f == null ? 0 : f.hashCode()) * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Transferring(progressPercentage=" + this.a + ", onCancelButtonClicked=" + this.b + ", isHighlighted=" + this.c + ", onClick=" + this.d + ", onLayout=" + this.e + ", contentDescription=" + this.f + ")";
    }
}
