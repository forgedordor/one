package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qgj {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public qgj(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgj)) {
            return false;
        }
        qgj qgjVar = (qgj) obj;
        return this.a == qgjVar.a && this.b == qgjVar.b && this.c == qgjVar.c && this.d == qgjVar.d;
    }

    public final int hashCode() {
        int iA = qgi.a(this.a);
        boolean z = this.d;
        return (((((iA * 31) + qgi.a(this.b)) * 31) + qgi.a(this.c)) * 31) + qgi.a(z);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}
