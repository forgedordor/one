package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzgw {
    public final String a;
    public final String b;
    public final Status c;
    private final Object d;

    public bzgw(Object obj, String str, String str2, Status status) {
        str.getClass();
        this.d = obj;
        this.a = str;
        this.b = str2;
        this.c = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzgw)) {
            return false;
        }
        bzgw bzgwVar = (bzgw) obj;
        return fdbq.f(this.d, bzgwVar.d) && fdbq.f(this.a, bzgwVar.a) && fdbq.f(this.b, bzgwVar.b) && fdbq.f(this.c, bzgwVar.c);
    }

    public final int hashCode() {
        Object obj = this.d;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) * 31) + this.a.hashCode();
        String str = this.b;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CmsBatchResultRow(entity=" + this.d + ", associatedBugleId=" + this.a + ", cmsId=" + this.b + ", status=" + this.c + ")";
    }
}
