package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmlq {
    public final dggn a;
    public final dggn b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    public cmlq(dggn dggnVar, dggn dggnVar2, int i, int i2) {
        this.a = dggnVar;
        this.b = dggnVar2;
        this.c = i;
        this.d = i2;
        this.e = dggo.a(dggnVar).a;
        this.f = dggo.a(dggnVar2).a;
    }

    public static final String a(String str) {
        if (str.length() <= 3) {
            return "";
        }
        String strSubstring = str.substring(str.length() - 3);
        strSubstring.getClass();
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmlq)) {
            return false;
        }
        cmlq cmlqVar = (cmlq) obj;
        return fdbq.f(this.a, cmlqVar.a) && fdbq.f(this.b, cmlqVar.b) && dggr.b(this.c, cmlqVar.c) && dggr.b(this.d, cmlqVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        int i = this.d;
        return "ComparisonLoggingEventDetails(simSubscriptionInfoRcsProvisioningId=" + this.a + ", simPreferencesRcsProvisioningId=" + this.b + ", simSubscriptionInfoSubId=" + dggr.a(this.c) + ", simPreferencesSubId=" + dggr.a(i) + ")";
    }
}
