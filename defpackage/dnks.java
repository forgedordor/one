package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnks extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnkw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnks(dnkw dnkwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnkwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnks) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final dnkw dnkwVar = this.b;
            fdap fdapVar = new fdap() { // from class: dnkr
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = ((List) obj2).iterator();
                    while (it.hasNext()) {
                        for (dnmj dnmjVar : ((dnkg) it.next()).b) {
                            linkedHashMap.put(dnmjVar.a().a(), dnmjVar);
                            Iterator it2 = dnmjVar.i().iterator();
                            while (it2.hasNext()) {
                                linkedHashMap.put(((dnke) it2.next()).a(), dnmjVar);
                            }
                        }
                    }
                    dnkwVar.c = linkedHashMap;
                    return fctx.a;
                }
            };
            this.a = 1;
            if (dnkwVar.f(fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnks(this.b, fcxyVar);
    }
}
