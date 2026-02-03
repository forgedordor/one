package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doyc extends fcyz implements fdat {
    int a;
    final /* synthetic */ doyh b;
    final /* synthetic */ doxa c;
    final /* synthetic */ doyd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doyc(doyh doyhVar, doxa doxaVar, doyd doydVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = doyhVar;
        this.c = doxaVar;
        this.d = doydVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doyc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            doyh doyhVar = this.b;
            doxa doxaVar = this.c;
            doyd doydVar = this.d;
            this.a = 1;
            if (doyhVar.G(doxaVar, doydVar.s, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doyc(this.b, this.c, this.d, fcxyVar);
    }
}
