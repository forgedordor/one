package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csbo {

    @esyz(a = "p")
    private final String a;

    @esyz(a = "t")
    private final String b;

    @esyz(a = "c")
    private final String c;

    public csbo(String str, String str2, String str3) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csbo)) {
            return false;
        }
        csbo csboVar = (csbo) obj;
        return fdbq.f(this.a, csboVar.a) && fdbq.f(this.b, csboVar.b) && fdbq.f(this.c, csboVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CarrierSpamReportMessage(protocol=" + this.a + ", messageReceiptTimestampUtc=" + this.b + ", messageText=" + this.c + ")";
    }
}
