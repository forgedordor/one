package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csbn {

    @esyz(a = "v")
    private final String a = "1";

    @esyz(a = "i")
    private final String b;

    @esyz(a = "u")
    private final String c;

    @esyz(a = "s")
    private final String d;

    @esyz(a = "r")
    private final String e;

    @esyz(a = "d")
    private final String f;

    @esyz(a = "m")
    private final csbo g;

    public csbn(String str, String str2, String str3, String str4, String str5, csbo csboVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = csboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csbn)) {
            return false;
        }
        csbn csbnVar = (csbn) obj;
        return fdbq.f(this.a, csbnVar.a) && fdbq.f(this.b, csbnVar.b) && fdbq.f(this.c, csbnVar.c) && fdbq.f(this.d, csbnVar.d) && fdbq.f(this.e, csbnVar.e) && fdbq.f(this.f, csbnVar.f) && fdbq.f(this.g, csbnVar.g);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        String str = this.e;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "CarrierSpamReport(version=" + this.a + ", conversationUuid=" + this.b + ", userAgent=" + this.c + ", senderDestination=" + this.d + ", reporterDestination=" + this.e + ", disposition=" + this.f + ", message=" + this.g + ")";
    }
}
