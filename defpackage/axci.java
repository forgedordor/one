package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axci extends fcyz implements fdat {
    final /* synthetic */ Iterable a;
    final /* synthetic */ axcl b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axci(fcxy fcxyVar, Iterable iterable, axcl axclVar) {
        super(2, fcxyVar);
        this.a = iterable;
        this.b = axclVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axci) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Iterable<crof> iterable = this.a;
        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
        for (crof crofVar : iterable) {
            String strW = crofVar.w();
            strW.getClass();
            int iA = crofVar.a();
            String strR = crofVar.r();
            strR.getClass();
            arrayList.add(new axfv(iA, strW, (alqm) fdct.b(crofVar.i(false)), strR, 16));
        }
        return this.b.a(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axci axciVar = new axci(fcxyVar, this.a, this.b);
        axciVar.c = obj;
        return axciVar;
    }
}
