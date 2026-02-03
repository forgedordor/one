package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlyo extends dlyp {
    public final Instant a;
    public final Object b;

    public dlyo(Instant instant, Object obj) {
        this.a = instant;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlyo)) {
            return false;
        }
        dlyo dlyoVar = (dlyo) obj;
        return fdbq.f(this.a, dlyoVar.a) && fdbq.f(this.b, dlyoVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "DataPacket(timestamp=" + this.a + ", value=" + this.b + ")";
    }
}
