package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coje {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;

    public coje(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coje)) {
            return false;
        }
        coje cojeVar = (coje) obj;
        return fdbq.f(this.a, cojeVar.a) && fdbq.f(this.b, cojeVar.b) && fdbq.f(this.c, cojeVar.c) && fdbq.f(this.d, cojeVar.d) && fdbq.f(this.e, cojeVar.e) && fdbq.f(this.f, cojeVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "BugleCronetConfig(copperHostsList=" + this.a + ", cronetCacheMaxSize=" + this.b + ", staleDnsFreshLookoutTimeout=" + this.c + ", staleDnsMaxExpiredDelay=" + this.d + ", staleDnsAllowCrossNetworkUsage=" + this.e + ", quicRetransmittableOnWireTimeoutMillis=" + this.f + ")";
    }
}
