package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class docb extends fcyz implements fdat {
    int a;
    final /* synthetic */ docj b;
    final /* synthetic */ doav c;
    final /* synthetic */ dnhn d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public docb(docj docjVar, doav doavVar, dnhn dnhnVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = docjVar;
        this.c = doavVar;
        this.d = dnhnVar;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((docb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnhq dnhqVar = ((dnhl) this.b.bG().invoke()).b;
            doav doavVar = this.c;
            dnhn dnhnVar = this.d;
            this.a = 1;
            obj = dnhqVar.b(doavVar, dnhnVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.b.e(this.c, this.e);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new docb(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
