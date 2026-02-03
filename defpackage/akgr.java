package defpackage;

import java.util.Iterator;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akgr extends fcyz implements fdat {
    int a;
    final /* synthetic */ akgw b;
    final /* synthetic */ Iterable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akgr(akgw akgwVar, Iterable iterable, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akgwVar;
        this.c = iterable;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akgr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.util.Collection] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            akgw akgwVar = this.b;
            this.a = 1;
            obj = akgwVar.e.invoke(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        awpx awpxVar = (awpx) obj;
        if (awpxVar != null) {
            ?? r0 = this.c;
            if (!r0.isEmpty()) {
                Iterator it = r0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (fdbq.f(((awmp) it.next()).a, awpxVar)) {
                        akgw akgwVar2 = this.b;
                        akgwVar2.f.c(new Supplier() { // from class: akgq
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return null;
                            }
                        }, "GroupObservableSupplier::GroupChangeListener");
                        break;
                    }
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akgr(this.b, this.c, fcxyVar);
    }
}
