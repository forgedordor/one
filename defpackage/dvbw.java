package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvbw extends fcyz implements fdat {
    int a;
    final /* synthetic */ dvca b;
    final /* synthetic */ agh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvbw(dvca dvcaVar, agh aghVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dvcaVar;
        this.c = aghVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvbw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dvca dvcaVar = this.b;
        agh aghVar = this.c;
        this.a = 1;
        Object objE = dvcaVar.e(aghVar, this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dvbw(this.b, this.c, fcxyVar);
    }
}
