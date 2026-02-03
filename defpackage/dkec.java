package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkec implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ dkeg b;

    public dkec(String str, dkeg dkegVar) {
        this.a = str;
        this.b = dkegVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            String str = this.a;
            dkeg dkegVar = this.b;
            hmlVar.v(397227782);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : dkegVar.d) {
                if (((dkdi) obj3).b == 2) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fcva.y(arrayList2, ((dkdi) it.next()).a);
            }
            hmlVar.o();
            dkef.b(str, arrayList2, hmlVar, 0);
        }
        return fctx.a;
    }
}
