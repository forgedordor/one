package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rdq extends fcyz implements fdat {
    int a;
    final /* synthetic */ rdr b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdq(rdr rdrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = rdrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((rdq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdjx fdjxVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fdjxVar = (fdjx) this.c;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            fdjx fdjxVar2 = (fdjx) this.c;
            fdap fdapVar = ((rdp) this.b.a).a;
            this.c = fdjxVar2;
            this.a = 1;
            Object objInvoke = fdapVar.invoke(this);
            if (objInvoke == fcylVar) {
                return fcylVar;
            }
            fdjxVar = fdjxVar2;
            obj = objInvoke;
        }
        rdz rdzVar = (rdz) obj;
        fdci fdciVar = new fdci();
        rdr rdrVar = this.b;
        synchronized (fdjxVar) {
            rdrVar.b = rdzVar;
            List list = rdrVar.c;
            fdciVar.a = new ArrayList(list);
            list.clear();
        }
        Iterator it = ((Iterable) fdciVar.a).iterator();
        while (it.hasNext()) {
            ((rtz) it.next()).g(rdzVar.a, rdzVar.b);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        rdq rdqVar = new rdq(this.b, fcxyVar);
        rdqVar.c = obj;
        return rdqVar;
    }
}
