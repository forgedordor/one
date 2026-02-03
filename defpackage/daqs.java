package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daqs extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ctbi c;
    final /* synthetic */ daqz d;
    final /* synthetic */ ctay e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daqs(ctbi ctbiVar, daqz daqzVar, ctay ctayVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ctbiVar;
        this.d = daqzVar;
        this.e = ctayVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daqs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            ctbi ctbiVar = this.c;
            ctbiVar.b(3);
            daqz daqzVar = this.d;
            ctay ctayVar = this.e;
            this.a = ctbiVar;
            this.b = 1;
            Object objB = daqzVar.b(ctayVar, this);
            if (objB == fcylVar) {
                return fcylVar;
            }
            obj2 = ctbiVar;
            obj = objB;
        }
        ctav ctavVar = (ctav) obj;
        ctavVar.getClass();
        ctbe ctbeVar = ((ctbi) obj2).a;
        ctbeVar.copyOnWrite();
        ctbg ctbgVar = (ctbg) ctbeVar.instance;
        ctbg ctbgVar2 = ctbg.a;
        ctbgVar.c = ctavVar;
        ctbgVar.b = 2;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new daqs(this.c, this.d, this.e, fcxyVar);
    }
}
