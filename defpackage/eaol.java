package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaol extends easj {
    public final int a;
    public final int b;

    public eaol(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.easj
    public final int a() {
        return this.a;
    }

    @Override // defpackage.easj
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof easj) {
            easj easjVar = (easj) obj;
            if (this.a == easjVar.a() && this.b == easjVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "LocalTime{hours=" + this.a + ", minutes=" + this.b + "}";
    }
}
