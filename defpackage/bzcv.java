package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzcv extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzda c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzcv(bzda bzdaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bzdaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzcv) c((Map) obj, (fcxy) obj2)).b(fctx.a);
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
        bzda bzdaVar = this.c;
        Set setKeySet = map.keySet();
        this.a = 1;
        Object objA = fdin.a(eicg.a(bzdaVar.b), new bzcx(null, setKeySet), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzcv bzcvVar = new bzcv(this.c, fcxyVar);
        bzcvVar.b = obj;
        return bzcvVar;
    }
}
