package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxtd implements bxso {
    public final lkb a;
    private final fdjx b;
    private final fdjx c;

    public bxtd(lkb lkbVar, fdjx fdjxVar, fdjx fdjxVar2) {
        lkbVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.a = lkbVar;
        this.b = fdjxVar;
        this.c = fdjxVar2;
    }

    @Override // defpackage.bxso
    public final eiju a() {
        return auvw.c(this.b, fcyi.a, fdjz.a, new bxsq(this, null));
    }

    @Override // defpackage.bxso
    public final eiju b() {
        return auvw.c(this.b, fcyi.a, fdjz.a, new bxss(this, null));
    }

    @Override // defpackage.bxso
    public final eiju c() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new bxsw(this, null));
    }

    @Override // defpackage.bxso
    public final eiju d() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new bxsy(this, null));
    }

    @Override // defpackage.bxso
    public final eiju e() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new bxta(this, null));
    }

    @Override // defpackage.bxso
    public final eiju f() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new bxtc(this, null));
    }

    @Override // defpackage.bxso
    public final Object g(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.c.hE()), new bxsp(null, this), fcxyVar);
    }

    @Override // defpackage.bxso
    public final Object h(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.c.hE()), new bxsr(null, this), fcxyVar);
    }

    @Override // defpackage.bxso
    public final Object i(fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.c.hE()), new bxst(null, this), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
