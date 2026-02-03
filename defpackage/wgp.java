package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wgp {
    private final wgo a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public wgp(wgo wgoVar, boolean z, boolean z2, boolean z3, boolean z4) {
        wgoVar.getClass();
        this.a = wgoVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgp)) {
            return false;
        }
        wgp wgpVar = (wgp) obj;
        return this.a == wgpVar.a && this.b == wgpVar.b && this.c == wgpVar.c && this.d == wgpVar.d && this.e == wgpVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.e;
        boolean z2 = this.d;
        return ((((((iHashCode + wgn.a(this.b)) * 31) + wgn.a(this.c)) * 31) + wgn.a(z2)) * 31) + wgn.a(z);
    }

    public final String toString() {
        return "TopUiDataLoggingContext(chosenType=" + this.a + ", hasSubjectUrgent=" + this.b + ", hasReply=" + this.c + ", hasScheduledSend=" + this.d + ", hasEdit=" + this.e + ")";
    }
}
