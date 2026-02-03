package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwwm {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;

    public bwwm(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
        this.g = fcsuVar7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwwm)) {
            return false;
        }
        bwwm bwwmVar = (bwwm) obj;
        return fdbq.f(this.a, bwwmVar.a) && fdbq.f(this.b, bwwmVar.b) && fdbq.f(this.c, bwwmVar.c) && fdbq.f(this.d, bwwmVar.d) && fdbq.f(this.e, bwwmVar.e) && fdbq.f(this.f, bwwmVar.f) && fdbq.f(this.g, bwwmVar.g);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "OnSubscriptionsChangedParams(countryCodeDetectorActionFactory=" + this.a + ", countryCodeDetectorActionDelayMs=" + this.b + ", mmsConfigManager=" + this.c + ", carrierConfigValuesLoaderProvider=" + this.d + ", selfParticipantsRefreshActionFactory=" + this.e + ", selfParticipantsRefreshActionDelayMs=" + this.f + ", callbackEventUmaCounter=" + this.g + ")";
    }
}
