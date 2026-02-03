package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpdy {
    public final dpzj a;
    public final dnhl b;
    public final dpyu c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final boolean g;

    public dpdy(dpzj dpzjVar, dnhl dnhlVar, dpyu dpyuVar, boolean z, boolean z2, boolean z3) {
        dpzjVar.getClass();
        this.a = dpzjVar;
        this.b = dnhlVar;
        this.c = dpyuVar;
        this.d = z;
        this.g = false;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpdy)) {
            return false;
        }
        dpdy dpdyVar = (dpdy) obj;
        if (!fdbq.f(this.a, dpdyVar.a) || !fdbq.f(this.b, dpdyVar.b) || !fdbq.f(this.c, dpdyVar.c) || this.d != dpdyVar.d) {
            return false;
        }
        boolean z = dpdyVar.g;
        return this.e == dpdyVar.e && this.f == dpdyVar.f;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        boolean z = this.f;
        return (((((((iHashCode * 31) + dpdw.a(this.d)) * 31) + dpdw.a(false)) * 31) + dpdw.a(this.e)) * 31) + dpdw.a(z);
    }

    public final String toString() {
        return "HugoUiData(inputDisplay=" + this.a + ", draftController=" + this.b + ", stateCollector=" + this.c + ", enableThemingHugo=" + this.d + ", enableSkipUpdateWhenFragmentDestroyed=false, useAndroidFragment=" + this.e + ", enableEdgeToEdge=" + this.f + ")";
    }

    public /* synthetic */ dpdy(dpzj dpzjVar, dnhl dnhlVar, dpyu dpyuVar, boolean z, int i) {
        this(dpzjVar, dnhlVar, (i & 4) != 0 ? dpdx.a : dpyuVar, false, ((i & 32) == 0) & z, false);
    }
}
