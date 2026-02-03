package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjrr {
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public cjrr(int i, String str, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjrr)) {
            return false;
        }
        cjrr cjrrVar = (cjrr) obj;
        return this.a == cjrrVar.a && fdbq.f(this.b, cjrrVar.b) && this.c == cjrrVar.c && this.d == cjrrVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + cjrq.a(this.c)) * 31) + cjrq.a(this.d);
    }

    public final String toString() {
        return "PhoneNumberInputData(simSlot=" + this.a + ", carrierName=" + this.b + ", isDefaultCall=" + this.c + ", isDefaultSms=" + this.d + ")";
    }
}
