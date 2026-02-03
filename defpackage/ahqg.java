package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqg {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;

    public ahqg(bpvd bpvdVar) {
        String strS = bpvdVar.s();
        strS.getClass();
        long jK = bpvdVar.k();
        String strR = bpvdVar.r();
        String strQ = bpvdVar.q();
        boolean zX = bpvdVar.x();
        this.a = strS;
        this.b = jK;
        this.c = strR;
        this.d = strQ;
        this.e = zX;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahqg)) {
            return false;
        }
        ahqg ahqgVar = (ahqg) obj;
        return fdbq.f(this.a, ahqgVar.a) && this.b == ahqgVar.b && fdbq.f(this.c, ahqgVar.c) && fdbq.f(this.d, ahqgVar.d) && this.e == ahqgVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode2) * 31;
        String str2 = this.d;
        return ((i + (str2 != null ? str2.hashCode() : 0)) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "LinkPreview(triggerUrlString=" + this.a + ", expirationTimeMsEpoch=" + this.b + ", linkTitle=" + this.c + ", linkImageUrlString=" + this.d + ", linkPreviewFailed=" + this.e + ")";
    }
}
