package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzej extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzem c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzej(bzem bzemVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bzemVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzej) c((Map) obj, (fcxy) obj2)).b(fctx.a);
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
        bzem bzemVar = this.c;
        this.a = 1;
        Object objD = bzemVar.d(map, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzej bzejVar = new bzej(this.c, fcxyVar);
        bzejVar.b = obj;
        return bzejVar;
    }
}
