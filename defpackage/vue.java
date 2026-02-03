package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vue extends fcyz implements fdat {
    int a;
    final /* synthetic */ vuh b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vue(vuh vuhVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vuhVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vue) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        enmy enmyVar = (enmy) enmz.a.createBuilder();
        enmyVar.getClass();
        evsn evsnVarBuild = enmyVar.build();
        evsnVarBuild.getClass();
        auvw.k(airvVar.b, null, null, new airq(airvVar, ajljVarC, (enmz) evsnVarBuild, i2, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vue(this.b, this.c, fcxyVar);
    }
}
