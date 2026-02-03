package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnhg extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dnhi c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnhg(dnhi dnhiVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dnhiVar;
        this.d = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnhg) c((String) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        String str = (String) this.b;
        dnhi dnhiVar = this.c;
        aem aemVar = new aem();
        Object[] array = this.d.toArray(new String[0]);
        this.a = 1;
        Object objD = dpgw.d(dnhiVar.b, str, aemVar, array, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dnhg dnhgVar = new dnhg(this.c, this.d, fcxyVar);
        dnhgVar.b = obj;
        return dnhgVar;
    }
}
