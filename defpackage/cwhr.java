package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhr {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public cwhr(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwhr)) {
            return false;
        }
        cwhr cwhrVar = (cwhr) obj;
        return this.a == cwhrVar.a && this.b == cwhrVar.b && this.c == cwhrVar.c;
    }

    public final int hashCode() {
        return (((cwhq.a(this.a) * 31) + cwhq.a(this.b)) * 31) + cwhq.a(this.c);
    }

    public final String toString() {
        return "Flags(enableCoolRanchPhase3=" + this.a + ", moveActiveSimToTop=" + this.b + ", attachSnackbar=" + this.c + ")";
    }

    public cwhr() {
        this(false, false, false);
    }
}
