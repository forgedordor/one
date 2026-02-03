package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnqw extends fcyz implements fdat {
    final /* synthetic */ dnqy a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnqw(dnqy dnqyVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dnqyVar;
        this.b = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnqw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fcww fcwwVar = new fcww((byte[]) null);
        int i = 0;
        for (Object obj2 : this.b) {
            int i2 = i + 1;
            if (i < 0) {
                fcva.m();
            }
            dnqy dnqyVar = this.a;
            dnkg dnkgVar = (dnkg) obj2;
            String string = dnqyVar.o.getString(dnot.a(dnkgVar).a);
            string.getClass();
            fcwwVar.add(new dnqt(string, i2));
            dnqyVar.p.put(i2, fcwwVar.c - 1);
            Iterator it = dnkgVar.b.iterator();
            while (it.hasNext()) {
                fcwwVar.add(new dnqs((dnmj) it.next(), i2));
            }
            i = i2;
        }
        return fcva.a(fcwwVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnqw(this.a, this.b, fcxyVar);
    }
}
