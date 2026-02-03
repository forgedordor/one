package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axfv {
    public final int a;
    public final String b;
    public final alqm c;
    public final String d;
    public final String e;

    public axfv(int i, String str, alqm alqmVar, String str2, String str3) {
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = alqmVar;
        this.d = str2;
        this.e = str3;
    }

    public final String a() {
        alqm alqmVar = this.c;
        if (alqmVar == null) {
            return null;
        }
        String strO = alqmVar.o();
        if (strO.length() == 0) {
            return null;
        }
        return strO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axfv)) {
            return false;
        }
        axfv axfvVar = (axfv) obj;
        return this.a == axfvVar.a && fdbq.f(this.b, axfvVar.b) && fdbq.f(this.c, axfvVar.c) && fdbq.f(this.d, axfvVar.d) && fdbq.f(this.e, axfvVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.a * 31) + this.b.hashCode();
        alqm alqmVar = this.c;
        return (((((iHashCode * 31) + (alqmVar == null ? 0 : alqmVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "TelephonySubscription(subId=" + this.a + ", simSerialNumber=" + this.b + ", telephonyPhoneNumber=" + this.c + ", displayName=" + this.d + ", provisioningId=" + this.e + ")";
    }

    public /* synthetic */ axfv(int i, String str, alqm alqmVar, String str2, int i2) {
        this(i, str, alqmVar, (i2 & 8) != 0 ? "" : str2, "");
    }
}
