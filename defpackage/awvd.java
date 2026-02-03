package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awvd extends fcyz implements fdat {
    final /* synthetic */ awvh a;
    final /* synthetic */ Iterable b;
    final /* synthetic */ Iterable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awvd(awvh awvhVar, Iterable iterable, Iterable iterable2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = awvhVar;
        this.b = iterable;
        this.c = iterable2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awvd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        awye awyeVar = this.a.b;
        awyeVar.d(this.b);
        Iterable iterable = this.c;
        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((awxn) it.next()).b());
        }
        awyeVar.c(arrayList);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awvd(this.a, this.b, this.c, fcxyVar);
    }
}
