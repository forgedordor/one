package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxng {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public dxng(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxng)) {
            return false;
        }
        dxng dxngVar = (dxng) obj;
        return this.a == dxngVar.a && this.b == dxngVar.b && this.c == dxngVar.c;
    }

    public final int hashCode() {
        return (((dxnf.a(this.a) * 31) + dxnf.a(this.b)) * 31) + dxnf.a(this.c);
    }

    public final String toString() {
        return "DeliveryAddressCreationConfig(withRegistrationId=" + this.a + ", withFetchOnlyId=" + this.b + ", withAndroidId=" + this.c + ")";
    }

    public dxng() {
        this(false, false, false);
    }
}
