package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxxm extends dxxo {
    public final boolean a;
    public final int b;

    public dxxm(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.dxxo
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.dxxo
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxxo) {
            dxxo dxxoVar = (dxxo) obj;
            if (this.a == dxxoVar.a() && this.b == dxxoVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.b;
        return "GaiaAccountData{isG1User=" + this.a + ", isUnicornUser=" + (i != 1 ? i != 2 ? "FALSE" : "TRUE" : "UNKNOWN") + "}";
    }
}
