package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glu extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ ddp c;
    final /* synthetic */ List d;
    final /* synthetic */ hri e;
    final /* synthetic */ hrg f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glu(ddp ddpVar, ddp ddpVar2, List list, hri hriVar, hrg hrgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = ddpVar2;
        this.d = list;
        this.e = hriVar;
        this.f = hrgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((glu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdil.d((fdjx) this.g, null, null, new glt(this.c, this.d, this.e, this.f, null), 3);
            ddp ddpVar = this.b;
            Float f = new Float(360.0f);
            dff dffVarD = dea.d(dea.c(4666, 0, dev.d, 2), 1, 0L, 4);
            this.a = 1;
            if (ddp.k(ddpVar, f, dffVarD, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        glu gluVar = new glu(this.b, this.c, this.d, this.e, this.f, fcxyVar);
        gluVar.g = obj;
        return gluVar;
    }
}
