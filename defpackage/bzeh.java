package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzeh extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzem c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzeh(bzem bzemVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bzemVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzeh) c((Map) obj, (fcxy) obj2)).b(fctx.a);
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
        Set setKeySet = map.keySet();
        this.a = 1;
        Object objA = fdin.a(eicg.a(bzemVar.e), new bzed(null, setKeySet), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzeh bzehVar = new bzeh(this.c, fcxyVar);
        bzehVar.b = obj;
        return bzehVar;
    }
}
