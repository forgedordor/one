package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efgn extends efgw {
    public final ekfk a;
    public final ekgb b;
    public final efgz c;

    public efgn(ekfk ekfkVar, ekgb ekgbVar, efgz efgzVar) {
        this.a = ekfkVar;
        this.b = ekgbVar;
        this.c = efgzVar;
    }

    @Override // defpackage.efgw
    public final efgz a() {
        return this.c;
    }

    @Override // defpackage.efgw
    public final ekfk b() {
        return this.a;
    }

    @Override // defpackage.efgw
    public final ekgb e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efgw) {
            efgw efgwVar = (efgw) obj;
            if (ekmi.m(this.a, efgwVar.b()) && ekjz.h(this.b, efgwVar.e()) && this.c.equals(efgwVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        efgz efgzVar = this.c;
        ekgb ekgbVar = this.b;
        return "CpimMessage{namespaces=" + String.valueOf(this.a) + ", headers=" + String.valueOf(ekgbVar) + ", content=" + efgzVar.toString() + "}";
    }
}
