package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnaa extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ List c;
    final /* synthetic */ dnau d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnaa(List list, dnau dnauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = list;
        this.d = dnauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnaa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Iterator it;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            fctl.b(obj);
            it = obj2;
        } else {
            fctl.b(obj);
            it = this.c.iterator();
        }
        while (it.hasNext()) {
            dojw dojwVar = (dojw) it.next();
            dnau dnauVar = this.d;
            ekrg ekrgVar = dnau.a;
            dnhq dnhqVar = ((dnhl) dnauVar.bG().invoke()).b;
            this.a = it;
            this.b = 1;
            if (dnhqVar.b(dojwVar, null, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnaa(this.c, this.d, fcxyVar);
    }
}
