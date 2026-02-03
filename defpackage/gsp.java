package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsp {
    public final boolean a;
    public final boolean b;
    public ddz c;
    public hgn d;
    public dew e;
    public dew f;
    private final fdap g;

    public gsp(boolean z, final fdae fdaeVar, fdae fdaeVar2, gsq gsqVar, fdap fdapVar, boolean z2) {
        this.a = z;
        this.g = fdapVar;
        this.b = z2;
        if (z && gsqVar == gsq.c) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z2 && gsqVar == gsq.a) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.c = gsi.a;
        this.d = new hgn(gsqVar, new fdap() { // from class: gsj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) fdaeVar.invoke()).floatValue());
            }
        }, fdaeVar2, new fdae() { // from class: gsk
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.c;
            }
        }, fdapVar);
        this.e = new dgg(0);
        this.f = new dgg(0);
    }

    public static /* synthetic */ Object l(gsp gspVar, gsq gsqVar, dew dewVar, fcxy fcxyVar) throws Throwable {
        Object objF = gspVar.d.f(gsqVar, dod.a, new gso(gspVar, gspVar.d.g.c(), dewVar, null), fcxyVar);
        return objF == fcyl.a ? objF : fctx.a;
    }

    public final float a() {
        return this.d.b();
    }

    public final float b() {
        return this.d.d();
    }

    public final gsq c() {
        return (gsq) this.d.h();
    }

    public final gsq d() {
        return (gsq) this.d.j();
    }

    public final Object e(fcxy fcxyVar) {
        Object objL;
        fdap fdapVar = this.g;
        gsq gsqVar = gsq.b;
        return (((Boolean) fdapVar.invoke(gsqVar)).booleanValue() && (objL = l(this, gsqVar, this.e, fcxyVar)) == fcyl.a) ? objL : fctx.a;
    }

    public final Object f(fcxy fcxyVar) {
        Object objL;
        if (this.b) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        fdap fdapVar = this.g;
        gsq gsqVar = gsq.a;
        return (((Boolean) fdapVar.invoke(gsqVar)).booleanValue() && (objL = l(this, gsqVar, this.f, fcxyVar)) == fcyl.a) ? objL : fctx.a;
    }

    public final Object g(fcxy fcxyVar) {
        Object objL;
        if (this.a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        fdap fdapVar = this.g;
        gsq gsqVar = gsq.c;
        return (((Boolean) fdapVar.invoke(gsqVar)).booleanValue() && (objL = l(this, gsqVar, this.e, fcxyVar)) == fcyl.a) ? objL : fctx.a;
    }

    public final Object h(float f, fcxy fcxyVar) {
        Object objK = this.d.k(f, fcxyVar);
        return objK == fcyl.a ? objK : fctx.a;
    }

    public final Object i(fcxy fcxyVar) {
        Object objL;
        gsq gsqVar = j() ? gsq.c : gsq.b;
        return (((Boolean) this.g.invoke(gsqVar)).booleanValue() && (objL = l(this, gsqVar, this.e, fcxyVar)) == fcyl.a) ? objL : fctx.a;
    }

    public final boolean j() {
        return this.d.p().e(gsq.c);
    }

    public final boolean k() {
        return this.d.h() != gsq.a;
    }
}
