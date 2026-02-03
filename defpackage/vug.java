package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vug extends fcyz implements fdat {
    int a;
    final /* synthetic */ vuh b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vug(vuh vuhVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vuhVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vug) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object objB = this.b.b.b();
            objB.getClass();
            this.a = 1;
            obj = fdtc.a((fdpl) objB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ajlj ajljVarC = ((ajlk) obj).c();
        airv airvVar = (airv) this.b.c.b();
        int i2 = this.c;
        ajljVarC.getClass();
        enng enngVar = (enng) ennh.a.createBuilder();
        enngVar.getClass();
        evsn evsnVarBuild = enngVar.build();
        evsnVarBuild.getClass();
        auvw.k(airvVar.b, null, null, new airs(airvVar, ajljVarC, (ennh) evsnVarBuild, i2, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vug(this.b, this.c, fcxyVar);
    }
}
