package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class casc extends fcyz implements fdat {
    int a;
    final /* synthetic */ casd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public casc(casd casdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = casdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((casc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.c;
            casd casdVar = this.b;
            fcyi fcyiVar = fcyi.a;
            fdjz fdjzVar = fdjz.a;
            fdkf[] fdkfVarArr = {fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new carz(null, casdVar)), fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new casa(null, casdVar)), fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new casb(null, casdVar))};
            this.a = 1;
            obj = fdii.b(fdkfVarArr, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        List list = (List) obj;
        return new cars(((Number) list.get(0)).intValue(), ((Number) list.get(2)).intValue(), ((Number) list.get(1)).intValue());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        casc cascVar = new casc(this.b, fcxyVar);
        cascVar.c = obj;
        return cascVar;
    }
}
