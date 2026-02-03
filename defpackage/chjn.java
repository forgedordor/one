package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chjn {
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;
    public final int e;
    public final axza f;

    public chjn(String str, int i, boolean z, String str2, int i2, axza axzaVar) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.e = i2;
        this.f = axzaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chjn)) {
            return false;
        }
        chjn chjnVar = (chjn) obj;
        return fdbq.f(this.a, chjnVar.a) && this.b == chjnVar.b && this.c == chjnVar.c && fdbq.f(this.d, chjnVar.d) && this.e == chjnVar.e && fdbq.f(this.f, chjnVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "TelephonyData(subject=" + this.a + ", subId=" + this.b + ", replyPathPresent=" + this.c + ", smsc=" + this.d + ", protocolIdentifier=" + this.e + ", rawSmsMessagingAddress=" + this.f + ")";
    }
}
