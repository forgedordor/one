package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyi {
    public final vvg a;
    public final List b;
    public final amie c;

    public wyi(amie amieVar, vvg vvgVar, List list) {
        amieVar.getClass();
        this.c = amieVar;
        this.a = vvgVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyi)) {
            return false;
        }
        wyi wyiVar = (wyi) obj;
        return fdbq.f(this.c, wyiVar.c) && fdbq.f(this.a, wyiVar.a) && fdbq.f(this.b, wyiVar.b);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.a.hashCode();
        List list = this.b;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "LoggingEnvelope(analyticsId=" + this.c + ", annotateDraft=" + this.a + ", attachmentAnalyticsIds=" + this.b + ")";
    }
}
