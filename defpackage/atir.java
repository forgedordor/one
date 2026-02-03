package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atir {
    public final String a;
    public final athh b;
    public final String c;

    public /* synthetic */ atir(String str, athh athhVar, String str2, int i) {
        this.a = 1 == (i & 1) ? null : str;
        this.b = (i & 2) != 0 ? null : athhVar;
        this.c = (i & 4) != 0 ? "" : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atir)) {
            return false;
        }
        atir atirVar = (atir) obj;
        return fdbq.f(this.a, atirVar.a) && fdbq.f(this.b, atirVar.b) && fdbq.f(this.c, atirVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        athh athhVar = this.b;
        return (((iHashCode * 31) + (athhVar != null ? athhVar.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "UploadIdentifiers(uploadId=" + this.a + ", processingId=" + this.b + ", transactionId=" + this.c + ")";
    }
}
