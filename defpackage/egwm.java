package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egwm extends fcyz implements fdat {
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
    public egwm(fdpl fdplVar, feav feavVar, fdci fdciVar, fdau fdauVar, fdap fdapVar, List list, fdos fdosVar, fcxy fcxyVar) {
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
        return ((egwm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.i;
            fdpl fdplVar = this.b;
            egwl egwlVar = new egwl(fdjxVar, this.c, this.d, this.e, this.f, this.g, this.h);
            this.a = 1;
            if (fdplVar.a(egwlVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        egwm egwmVar = new egwm(this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
        egwmVar.i = obj;
        return egwmVar;
    }
}
