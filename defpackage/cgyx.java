package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgyx extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgzi b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgyx(cgzi cgziVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgziVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgyx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.c;
            cgzi cgziVar = this.b;
            List listG = fcva.g(auvw.m(fdjxVar, null, new cgyv(cgziVar, null), 3), auvw.m(fdjxVar, null, new cgyw(cgziVar, null), 3));
            this.a = 1;
            if (fdii.c(listG, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgyx cgyxVar = new cgyx(this.b, fcxyVar);
        cgyxVar.c = obj;
        return cgyxVar;
    }
}
