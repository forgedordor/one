package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dymg extends dyms {
    public final dyyf a;
    public final ejxr b;
    public final boolean c;
    public final ekhx d;
    public final boolean e;
    public final abyq f;
    public final int g;
    private final dxxk h;
    private final dyau i;
    private final ejwi j;
    private final int k;
    private final int l;
    private final ejxr m;
    private final dtah n;
    private final ejwi o;
    private final Runnable p;
    private final dymp q;

    public dymg(dxxk dxxkVar, dyau dyauVar, ejwi ejwiVar, dymp dympVar, abyq abyqVar, dyyf dyyfVar, int i, int i2, int i3, ejxr ejxrVar, ejxr ejxrVar2, boolean z, ekhx ekhxVar, boolean z2, dtah dtahVar, ejwi ejwiVar2, Runnable runnable) {
        this.h = dxxkVar;
        this.i = dyauVar;
        this.j = ejwiVar;
        this.q = dympVar;
        this.f = abyqVar;
        this.a = dyyfVar;
        this.g = i;
        this.k = i2;
        this.l = i3;
        this.b = ejxrVar;
        this.m = ejxrVar2;
        this.c = z;
        this.d = ekhxVar;
        this.e = z2;
        this.n = dtahVar;
        this.o = ejwiVar2;
        this.p = runnable;
    }

    @Override // defpackage.dyms
    @Deprecated
    public final int a() {
        return this.l;
    }

    @Override // defpackage.dyms
    @Deprecated
    public final int b() {
        return this.k;
    }

    @Override // defpackage.dyms
    public final dtah c() {
        return this.n;
    }

    @Override // defpackage.dyms
    public final dxxk d() {
        return this.h;
    }

    @Override // defpackage.dyms
    public final dyau e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyms) {
            dyms dymsVar = (dyms) obj;
            if (this.h.equals(dymsVar.d()) && this.i.equals(dymsVar.e()) && this.j.equals(dymsVar.h()) && equals(dymsVar.o()) && this.f.equals(dymsVar.p()) && this.a.equals(dymsVar.f()) && this.g == dymsVar.q() && this.k == dymsVar.b() && this.l == dymsVar.a() && this.b.equals(dymsVar.i()) && this.m.equals(dymsVar.j()) && this.c == dymsVar.n() && this.d.equals(dymsVar.k()) && this.e == dymsVar.m()) {
                dymsVar.r();
                if (this.n.equals(dymsVar.c()) && this.o.equals(dymsVar.g()) && this.p.equals(dymsVar.l())) {
                    dymsVar.s();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dyms
    public final dyyf f() {
        return this.a;
    }

    @Override // defpackage.dyms
    public final ejwi g() {
        return this.o;
    }

    @Override // defpackage.dyms
    public final ejwi h() {
        return this.j;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((this.h.hashCode() ^ 1000003) * 1000003) ^ this.i.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ ((ekon) this.d).c) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ 1) * 1000003) ^ this.n.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.p.hashCode()) * 1000003) ^ 1;
    }

    @Override // defpackage.dyms
    public final ejxr i() {
        return this.b;
    }

    @Override // defpackage.dyms
    public final ejxr j() {
        return this.m;
    }

    @Override // defpackage.dyms
    public final ekhx k() {
        return this.d;
    }

    @Override // defpackage.dyms
    public final Runnable l() {
        return this.p;
    }

    @Override // defpackage.dyms
    public final boolean m() {
        return this.e;
    }

    @Override // defpackage.dyms
    public final boolean n() {
        return this.c;
    }

    @Override // defpackage.dyms
    public final dymp o() {
        return this.q;
    }

    @Override // defpackage.dyms
    public final abyq p() {
        return this.f;
    }

    @Override // defpackage.dyms
    public final int q() {
        return this.g;
    }

    public final String toString() {
        int i = this.g;
        dtah dtahVar = this.n;
        ejxr ejxrVar = this.b;
        return "SlimCardEducationModel{accountConverter=" + this.h.toString() + ", accountsModel=" + this.i.toString() + ", incognitoModel=Optional.absent(), shouldShowEducationAndHighlightChecker=" + toString() + ", callbacks=" + this.f.toString() + ", simpleVeLogger=" + this.a.toString() + ", id=" + Integer.toString(i - 1) + ", impressionCap=" + this.k + ", highlightImpressionCap=" + this.l + ", shouldConsumeEducation=" + ejxrVar.toString() + ", shouldConsumeHighlight=" + this.m.toString() + ", withScrim=" + this.c + ", highlightIds=" + this.d.toString() + ", shouldClickAnchorOnInteraction=" + this.e + ", a11yLevel=VISIBLE_AS_DIALOG, vePrimitives=" + dtahVar.toString() + ", appIdentifier=Optional.absent(), onEducationShown=" + this.p.toString() + ", placement=BELOW}";
    }

    @Override // defpackage.dyms
    public final void r() {
    }

    @Override // defpackage.dyms
    public final void s() {
    }
}
