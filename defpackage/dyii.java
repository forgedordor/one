package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyii extends dyif {
    public final ejwi a;
    public final ejwi b;
    public final ejwi c;
    public final ejwi d;
    public final dyjb e;
    public final ejwi f;
    public final dyix g;
    public final ejwi h;
    public final ejwi i;
    public final ekgb j;
    public final dyiw k;
    public final ejwi l;
    public final ejwi m;
    public final ejwi n;
    public final dymv o;
    public final boolean p;
    public final Runnable q;

    public dyii(ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4, dyjb dyjbVar, ejwi ejwiVar5, dyix dyixVar, ejwi ejwiVar6, ejwi ejwiVar7, ekgb ekgbVar, dyiw dyiwVar, ejwi ejwiVar8, ejwi ejwiVar9, ejwi ejwiVar10, dymv dymvVar, boolean z, Runnable runnable) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
        this.c = ejwiVar3;
        this.d = ejwiVar4;
        this.e = dyjbVar;
        this.f = ejwiVar5;
        this.g = dyixVar;
        this.h = ejwiVar6;
        this.i = ejwiVar7;
        this.j = ekgbVar;
        this.k = dyiwVar;
        this.l = ejwiVar8;
        this.m = ejwiVar9;
        this.n = ejwiVar10;
        this.o = dymvVar;
        this.p = z;
        this.q = runnable;
    }

    @Override // defpackage.dyif
    public final dyiw b() {
        return this.k;
    }

    @Override // defpackage.dyif
    public final dyix c() {
        return this.g;
    }

    @Override // defpackage.dyif
    public final dyjb d() {
        return this.e;
    }

    @Override // defpackage.dyif
    public final dymv e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyif) {
            dyif dyifVar = (dyif) obj;
            if (this.a.equals(dyifVar.j()) && this.b.equals(dyifVar.l()) && this.c.equals(dyifVar.i()) && this.d.equals(dyifVar.n()) && this.e.equals(dyifVar.d()) && this.f.equals(dyifVar.o()) && this.g.equals(dyifVar.c()) && this.h.equals(dyifVar.h()) && this.i.equals(dyifVar.f()) && ekjz.h(this.j, dyifVar.p()) && this.k.equals(dyifVar.b()) && this.l.equals(dyifVar.g()) && this.m.equals(dyifVar.k()) && this.n.equals(dyifVar.m())) {
                dyifVar.s();
                dyifVar.t();
                if (this.o.equals(dyifVar.e()) && this.p == dyifVar.r() && this.q.equals(dyifVar.q())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dyif
    public final ejwi f() {
        return this.i;
    }

    @Override // defpackage.dyif
    public final ejwi g() {
        return this.l;
    }

    @Override // defpackage.dyif
    public final ejwi h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1) * 1000003) ^ this.o.hashCode()) * 1000003) ^ (true == this.p ? 1231 : 1237)) * 1000003) ^ this.q.hashCode();
    }

    @Override // defpackage.dyif
    public final ejwi i() {
        return this.c;
    }

    @Override // defpackage.dyif
    public final ejwi j() {
        return this.a;
    }

    @Override // defpackage.dyif
    public final ejwi k() {
        return this.m;
    }

    @Override // defpackage.dyif
    public final ejwi l() {
        return this.b;
    }

    @Override // defpackage.dyif
    public final ejwi m() {
        return this.n;
    }

    @Override // defpackage.dyif
    public final ejwi n() {
        return this.d;
    }

    @Override // defpackage.dyif
    public final ejwi o() {
        return this.f;
    }

    @Override // defpackage.dyif
    public final ekgb p() {
        return this.j;
    }

    @Override // defpackage.dyif
    public final Runnable q() {
        return this.q;
    }

    @Override // defpackage.dyif
    public final boolean r() {
        return this.p;
    }

    public final String toString() {
        return "AccountMenuFeatures{deactivatedAccountsFeature=" + String.valueOf(this.a) + ", incognitoFeature=" + String.valueOf(this.b) + ", customIncognitoActionFeature=" + String.valueOf(this.c) + ", obakeFeature=" + String.valueOf(this.d) + ", policyFooterCustomizer=" + this.e.toString() + ", useWithoutAnAccountActionFeature=" + String.valueOf(this.f) + ", flavorsFeature=" + this.g.toString() + ", criticalAlertFeature=" + String.valueOf(this.h) + ", accountMessagesFeature=" + String.valueOf(this.i) + ", commonActions=" + this.j.toString() + ", educationManager=" + this.k.toString() + ", countDecorationGenerator=" + String.valueOf(this.l) + ", disableAccountSwitchingFeature=" + String.valueOf(this.m) + ", launcherAppSpec=" + String.valueOf(this.n) + ", isExperimental=false, largeScreenDialogAlignment=ALIGN_CENTER, materialVersion=" + this.o.toString() + ", enableQuickProfileSwitching=" + this.p + ", onSlowAccountSwitchingRunnable=" + this.q.toString() + "}";
    }

    @Override // defpackage.dyif
    public final void s() {
    }

    @Override // defpackage.dyif
    public final void t() {
    }
}
