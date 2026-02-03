package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckza extends clbc {
    public final int a;
    public final int b;

    public ckza(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.clbc
    public final int a() {
        return this.a;
    }

    @Override // defpackage.clbc
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clbc) {
            clbc clbcVar = (clbc) obj;
            if (this.a == clbcVar.a() && this.b == clbcVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return a.d(Integer.toString(this.b - 1), Integer.toString(this.a - 1), "ActionDescription{action=", ", reason=", "}");
    }
}
