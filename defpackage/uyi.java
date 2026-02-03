package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uyi extends fcyz implements fdat {
    int a;
    final /* synthetic */ uys b;
    final /* synthetic */ epiv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyi(uys uysVar, epiv epivVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = uysVar;
        this.c = epivVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uyi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            uys uysVar = this.b;
            epiv epivVar = this.c;
            dnce dnceVar = dpil.aK;
            this.a = 1;
            if (dneq.e(uysVar.o, epivVar, dnceVar, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new uyi(this.b, this.c, fcxyVar);
    }
}
