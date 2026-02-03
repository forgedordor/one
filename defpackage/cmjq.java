package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmjq extends fcyz implements fdat {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmjq(Set set, Set set2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmjq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Set set = this.a;
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((cmiv) it.next()).b(this.b);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmjq(this.a, this.b, fcxyVar);
    }
}
