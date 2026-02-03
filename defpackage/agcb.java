package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcb implements afzv {
    public final long a;
    public final String b;
    public final String c = "com.whatsapp";
    public final fdap d;

    public agcb(long j, String str, fdap fdapVar) {
        this.a = j;
        this.b = str;
        this.d = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agcb)) {
            return false;
        }
        agcb agcbVar = (agcb) obj;
        return this.a == agcbVar.a && fdbq.f(this.b, agcbVar.b) && fdbq.f(this.c, agcbVar.c) && fdbq.f(this.d, agcbVar.d);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Cp2ThirdPartyService(rowId=" + this.a + ", mimeType=" + this.b + ", packageName=" + this.c + ", onStarted=" + this.d + ")";
    }
}
