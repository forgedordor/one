package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agin extends fcyz implements fdat {
    int a;
    final /* synthetic */ agiu b;
    final /* synthetic */ fduf c;
    final /* synthetic */ fduf d;
    final /* synthetic */ ahat e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agin(agiu agiuVar, fduf fdufVar, fduf fdufVar2, ahat ahatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = agiuVar;
        this.c = fdufVar;
        this.d = fdufVar2;
        this.e = ahatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agin) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            agiu agiuVar = this.b;
            aghz aghzVar = (aghz) agiuVar.f.b();
            fduf fdufVar = this.c;
            int iA = agia.a((cgra) fdufVar.c());
            fduf fdufVar2 = this.d;
            aghzVar.e(iA, ((Boolean) fdufVar2.c()).booleanValue());
            eiju eijuVarT = ((ajln) agiuVar.d.b()).t(agiuVar.b, ((Boolean) fdufVar2.c()).booleanValue() ? cgrc.d : cgrc.e, (cgra) fdufVar.c());
            eijuVarT.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarT, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.e.a();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agin(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
