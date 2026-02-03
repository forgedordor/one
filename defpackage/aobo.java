package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aobo extends aobp {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public aobo(boolean z, boolean z2, boolean z3, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
    }

    @Override // defpackage.aobr
    public final int a() {
        return this.d;
    }

    @Override // defpackage.aobr
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.aobr
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.aobr
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aobp) {
            aobp aobpVar = (aobp) obj;
            if (this.a == aobpVar.b() && this.b == aobpVar.c() && this.c == aobpVar.d() && this.d == aobpVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "BugleVideoCallingOptions{duoEnabled=" + this.a + ", duoSetupRequired=" + this.b + ", reachable=" + this.c + ", rawDuoStatus=" + this.d + "}";
    }
}
