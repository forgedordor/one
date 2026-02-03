package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzgf extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzgt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzgf(bzgt bzgtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bzgtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzgf) c((Map) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        Map map = (Map) this.b;
        bzgt bzgtVar = this.c;
        this.a = 1;
        Object objD = bzgtVar.d.d(map);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzgf bzgfVar = new bzgf(this.c, fcxyVar);
        bzgfVar.b = obj;
        return bzgfVar;
    }
}
