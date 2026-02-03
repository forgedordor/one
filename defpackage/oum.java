package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oum extends fcyz implements fdat {
    final /* synthetic */ oun a;
    final /* synthetic */ orr b;
    final /* synthetic */ orp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oum(oun ounVar, orr orrVar, orp orpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ounVar;
        this.b = orrVar;
        this.c = orpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oum) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdap fdapVar = new fdap() { // from class: oul
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(((WeakReference) obj2).get() == null);
            }
        };
        List list = this.a.f;
        fcva.x(list, fdapVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fdat fdatVar = (fdat) ((WeakReference) it.next()).get();
            if (fdatVar != null) {
                fdatVar.a(this.b, this.c);
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new oum(this.a, this.b, this.c, fcxyVar);
    }
}
