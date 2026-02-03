package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljn {
    public final dew a;
    public final dew b;
    public final dew c;
    public final dew d;
    public final dff e;
    public final fdap f;
    public final dff g;
    public final dew h;
    public final dew i;
    public final dew j;
    public final dew k;
    public final dew l;
    public final der m;
    public final der n;
    public final dap o;
    public final der p;
    public final dljl q;
    public final dljm r;
    private final dew s;
    private final dew t;
    private final dar u;

    public dljn(dew dewVar, dew dewVar2, dew dewVar3, dew dewVar4, dew dewVar5, dew dewVar6, dff dffVar, fdap fdapVar, dff dffVar2, dew dewVar7, dew dewVar8, dew dewVar9, dew dewVar10, dew dewVar11, der derVar, der derVar2, dap dapVar, dar darVar, der derVar3, dljl dljlVar, dljm dljmVar) {
        this.a = dewVar;
        this.b = dewVar2;
        this.s = dewVar3;
        this.t = dewVar4;
        this.c = dewVar5;
        this.d = dewVar6;
        this.e = dffVar;
        this.f = fdapVar;
        this.g = dffVar2;
        this.h = dewVar7;
        this.i = dewVar8;
        this.j = dewVar9;
        this.k = dewVar10;
        this.l = dewVar11;
        this.m = derVar;
        this.n = derVar2;
        this.o = dapVar;
        this.u = darVar;
        this.p = derVar3;
        this.q = dljlVar;
        this.r = dljmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dljn)) {
            return false;
        }
        dljn dljnVar = (dljn) obj;
        return fdbq.f(this.a, dljnVar.a) && fdbq.f(this.b, dljnVar.b) && fdbq.f(this.s, dljnVar.s) && fdbq.f(this.t, dljnVar.t) && fdbq.f(this.c, dljnVar.c) && fdbq.f(this.d, dljnVar.d) && fdbq.f(this.e, dljnVar.e) && fdbq.f(this.f, dljnVar.f) && fdbq.f(this.g, dljnVar.g) && fdbq.f(this.h, dljnVar.h) && fdbq.f(this.i, dljnVar.i) && fdbq.f(this.j, dljnVar.j) && fdbq.f(this.k, dljnVar.k) && fdbq.f(this.l, dljnVar.l) && fdbq.f(this.m, dljnVar.m) && fdbq.f(this.n, dljnVar.n) && fdbq.f(this.o, dljnVar.o) && fdbq.f(this.u, dljnVar.u) && fdbq.f(this.p, dljnVar.p) && fdbq.f(this.q, dljnVar.q) && fdbq.f(this.r, dljnVar.r);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.u.hashCode()) * 31) + this.p.hashCode()) * 31) - 566205836) * 31) + this.r.hashCode();
    }

    public final String toString() {
        return "AbcMotionScheme(bannerSlideInAnimationSpec=" + this.a + ", bannerSlideOutAnimationSpec=" + this.b + ", composeAiIconScaleInSpec=" + this.s + ", composeAiIconScaleOutSpec=" + this.t + ", textResultsBarSlideInAnimationSpec=" + this.c + ", reactionsBarFadeOutAnimationSpec=" + this.d + ", timerDotAnimationSpec=" + this.e + ", recordingDotAnimationSpec=" + this.f + ", recordingDotIndicatorAnimationSpec=" + this.g + ", swipeUpToLockPillZIndexAnimationSpec=" + this.h + ", topAppBarFadeInAnimationSpec=" + this.i + ", topAppBarFadeOutAnimationSpec=" + this.j + ", conversationBackgroundFadeInAnimationSpec=" + this.k + ", conversationBackgroundFadeOutAnimationSpec=" + this.l + ", topAppBarHighlightAnimationSpec=" + this.m + ", aiButtonBackgroundAnimationSpec=" + this.n + ", animatedLinkPreviewEnterTransitionSpec=" + this.o + ", animatedLinkPreviewExitTransitionSpec=" + this.u + ", swipeButtonSnapAnimationSpec=" + this.p + ", duration=" + this.q + ", easing=" + this.r + ")";
    }
}
