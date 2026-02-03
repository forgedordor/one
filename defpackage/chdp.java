package defpackage;

import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chdp extends chdq {
    public final List a;
    public final eqeq b;
    public final Instant c;

    public chdp(List list, eqeq eqeqVar, Instant instant) {
        this.a = list;
        this.b = eqeqVar;
        this.c = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chdp)) {
            return false;
        }
        chdp chdpVar = (chdp) obj;
        return fdbq.f(this.a, chdpVar.a) && fdbq.f(this.b, chdpVar.b) && fdbq.f(this.c, chdpVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TachygramTransportMessage(transportMessages=" + this.a + ", messageMetadata=" + this.b + ", timestamp=" + this.c + ")";
    }
}
