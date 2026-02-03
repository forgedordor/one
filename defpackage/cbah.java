package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbah extends fcyz implements fdat {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ cbai c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbah(List list, cbai cbaiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = list;
        this.c = cbaiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbah) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                List list = this.b;
                cbai cbaiVar = this.c;
                ArrayList arrayList = new ArrayList(fcva.p(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ejaa.a(cbaiVar.d, cbaiVar.e, new cbag(cbaiVar, (UUID) it.next(), null)));
                }
                this.a = 1;
                if (fdii.a(arrayList, this) == fcylVar) {
                    return fcylVar;
                }
            }
        } catch (Exception e) {
            auvh.d(e);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbah(this.b, this.c, fcxyVar);
    }
}
