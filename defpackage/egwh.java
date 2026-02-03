package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egwh extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ feav c;
    final /* synthetic */ fdci d;
    final /* synthetic */ fdau e;
    final /* synthetic */ fdap f;
    final /* synthetic */ List g;
    final /* synthetic */ fdos h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egwh(fcxy fcxyVar, fdpl fdplVar, feav feavVar, fdci fdciVar, fdau fdauVar, fdap fdapVar, List list, fdos fdosVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = feavVar;
        this.d = fdciVar;
        this.e = fdauVar;
        this.f = fdapVar;
        this.g = list;
        this.h = fdosVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egwh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fcyf fcyfVar = ((fdjx) this.i).hE().get(fdlr.c);
            fcyfVar.getClass();
            fdpl fdplVar = this.b;
            egwk egwkVar = new egwk(this.c, this.d, this.e, this.f, this.g, (fdlr) fcyfVar, this.h);
            this.a = 1;
            if (fdplVar.a(egwkVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        egwh egwhVar = new egwh(fcxyVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        egwhVar.i = obj;
        return egwhVar;
    }
}
