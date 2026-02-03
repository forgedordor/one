package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxnr {
    public final int a;
    public final String b;

    public dxnr(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxnr)) {
            return false;
        }
        dxnr dxnrVar = (dxnr) obj;
        return this.a == dxnrVar.a && fdbq.f(this.b, dxnrVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RegistrationState(registrationStatus=" + this.a + ", environment=" + this.b + ")";
    }
}
