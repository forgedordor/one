package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyih extends dyie {
    public ejwi a;
    public ejwi b;
    public dyjb c;
    public ejwi d;
    public dyix e;
    public ejwi f;
    public ejwi g;
    public dyiw h;
    public dymv i;
    public Runnable j;
    public byte k;
    public int l;
    private ejwi m;
    private ejwi n;
    private ekgb o;
    private ejwi p;
    private ejwi q;
    private ejwi r;
    private boolean s;

    public dyih() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.m = ejudVar;
        this.n = ejudVar;
        this.b = ejudVar;
        this.d = ejudVar;
        this.f = ejudVar;
        this.g = ejudVar;
        this.p = ejudVar;
        this.q = ejudVar;
        this.r = ejudVar;
    }

    @Override // defpackage.dyie
    public final dyif a() {
        dyjb dyjbVar;
        dyix dyixVar;
        ekgb ekgbVar;
        dyiw dyiwVar;
        dymv dymvVar;
        Runnable runnable;
        if (this.k == 3 && (dyjbVar = this.c) != null && (dyixVar = this.e) != null && (ekgbVar = this.o) != null && (dyiwVar = this.h) != null && this.l != 0 && (dymvVar = this.i) != null && (runnable = this.j) != null) {
            return new dyii(this.a, this.m, this.n, this.b, dyjbVar, this.d, dyixVar, this.f, this.g, ekgbVar, dyiwVar, this.p, this.q, this.r, dymvVar, this.s, runnable);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" policyFooterCustomizer");
        }
        if (this.e == null) {
            sb.append(" flavorsFeature");
        }
        if (this.o == null) {
            sb.append(" commonActions");
        }
        if (this.h == null) {
            sb.append(" educationManager");
        }
        if ((this.k & 1) == 0) {
            sb.append(" isExperimental");
        }
        if (this.l == 0) {
            sb.append(" largeScreenDialogAlignment");
        }
        if (this.i == null) {
            sb.append(" materialVersion");
        }
        if ((this.k & 2) == 0) {
            sb.append(" enableQuickProfileSwitching");
        }
        if (this.j == null) {
            sb.append(" onSlowAccountSwitchingRunnable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dyie
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null commonActions");
        }
        this.o = ekgbVar;
    }

    @Override // defpackage.dyie
    public final void c(boolean z) {
        this.s = z;
        this.k = (byte) (this.k | 2);
    }

    public dyih(dyif dyifVar) {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.m = ejudVar;
        this.n = ejudVar;
        this.b = ejudVar;
        this.d = ejudVar;
        this.f = ejudVar;
        this.g = ejudVar;
        this.p = ejudVar;
        this.q = ejudVar;
        this.r = ejudVar;
        dyii dyiiVar = (dyii) dyifVar;
        this.a = dyiiVar.a;
        this.m = dyiiVar.b;
        this.n = dyiiVar.c;
        this.b = dyiiVar.d;
        this.c = dyiiVar.e;
        this.d = dyiiVar.f;
        this.e = dyiiVar.g;
        this.f = dyiiVar.h;
        this.g = dyiiVar.i;
        this.o = dyiiVar.j;
        this.h = dyiiVar.k;
        this.p = dyiiVar.l;
        this.q = dyiiVar.m;
        this.r = dyiiVar.n;
        this.l = 1;
        this.i = dyiiVar.o;
        this.s = dyiiVar.p;
        this.j = dyiiVar.q;
        this.k = (byte) 3;
    }
}
