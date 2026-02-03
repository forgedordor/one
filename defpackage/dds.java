package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dds extends fcyz implements fdat {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ ddp c;
    final /* synthetic */ hsf d;
    final /* synthetic */ hsf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dds(Object obj, ddp ddpVar, hsf hsfVar, hsf hsfVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = obj;
        this.c = ddpVar;
        this.d = hsfVar;
        this.e = hsfVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dds) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dds ddsVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            ddsVar = this;
        } else {
            Object obj2 = this.b;
            ddp ddpVar = this.c;
            if (fdbq.f(obj2, ddpVar.c())) {
                return fctx.a;
            }
            hsf hsfVar = this.d;
            int i2 = ddu.a;
            ddz ddzVar = (ddz) hsfVar.a();
            this.a = 1;
            ddsVar = this;
            if (ddp.k(ddpVar, obj2, ddzVar, null, ddsVar, 12) == fcylVar) {
                return fcylVar;
            }
        }
        hsf hsfVar2 = ddsVar.e;
        int i3 = ddu.a;
        fdap fdapVar = (fdap) hsfVar2.a();
        if (fdapVar != null) {
            fdapVar.invoke(ddsVar.c.d());
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dds(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
