package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doud extends fcyz implements fdat {
    int a;
    final /* synthetic */ eeve b;
    final /* synthetic */ douf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doud(eeve eeveVar, douf doufVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = eeveVar;
        this.c = doufVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doud) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eeve eeveVar = this.b;
            fdpl fdplVarC = dphw.c(eeveVar.i);
            douc doucVar = new douc(eeveVar);
            this.a = 1;
            if (fdplVarC.a(doucVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doud(this.b, this.c, fcxyVar);
    }
}
