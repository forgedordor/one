package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efr implements ehc {
    private final ehc a;
    private final int b;

    public efr(ehc ehcVar, int i) {
        this.a = ehcVar;
        this.b = i;
    }

    @Override // defpackage.ehc
    public final int a(kio kioVar) {
        if (ehs.b(this.b, 32)) {
            return this.a.a(kioVar);
        }
        return 0;
    }

    @Override // defpackage.ehc
    public final int b(kio kioVar, kji kjiVar) {
        if (ehs.b(this.b, kjiVar == kji.a ? 8 : 2)) {
            return this.a.b(kioVar, kjiVar);
        }
        return 0;
    }

    @Override // defpackage.ehc
    public final int c(kio kioVar, kji kjiVar) {
        if (ehs.b(this.b, kjiVar == kji.a ? 4 : 1)) {
            return this.a.c(kioVar, kjiVar);
        }
        return 0;
    }

    @Override // defpackage.ehc
    public final int d(kio kioVar) {
        if (ehs.b(this.b, 16)) {
            return this.a.d(kioVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efr)) {
            return false;
        }
        efr efrVar = (efr) obj;
        return fdbq.f(this.a, efrVar.a) && this.b == efrVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        if ((i & 9) == 9) {
            ehs.a(sb3, "Start");
        }
        if ((i & 10) == 10) {
            ehs.a(sb3, "Left");
        }
        if ((i & 16) == 16) {
            ehs.a(sb3, "Top");
        }
        if ((i & 6) == 6) {
            ehs.a(sb3, "End");
        }
        if ((i & 5) == 5) {
            ehs.a(sb3, "Right");
        }
        if ((i & 32) == 32) {
            ehs.a(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
