package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afrs {
    public final fdvc a;
    public final fdpl b;
    public final fdvc c;
    public final fdap d;
    public final fdae e;
    public final fdae f;
    public final afrr g;

    public afrs(fdvc fdvcVar, fdpl fdplVar, fdvc fdvcVar2, fdap fdapVar, fdae fdaeVar, fdae fdaeVar2, afrr afrrVar) {
        fdvcVar.getClass();
        fdplVar.getClass();
        fdvcVar2.getClass();
        this.a = fdvcVar;
        this.b = fdplVar;
        this.c = fdvcVar2;
        this.d = fdapVar;
        this.e = fdaeVar;
        this.f = fdaeVar2;
        this.g = afrrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afrs)) {
            return false;
        }
        afrs afrsVar = (afrs) obj;
        return fdbq.f(this.a, afrsVar.a) && fdbq.f(this.b, afrsVar.b) && fdbq.f(this.c, afrsVar.c) && fdbq.f(this.d, afrsVar.d) && fdbq.f(this.e, afrsVar.e) && fdbq.f(this.f, afrsVar.f) && fdbq.f(this.g, afrsVar.g);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "MultiShareListUiData(conversationsFlow=" + this.a + ", contactsFlow=" + this.b + ", headerIndexFlow=" + this.c + ", onMultiShareListScroll=" + this.d + ", onMultiShareListInteractive=" + this.e + ", onActivateFastScroll=" + this.f + ", flags=" + this.g + ")";
    }
}
