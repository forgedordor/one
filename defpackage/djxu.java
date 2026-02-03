package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djxu implements fdau {
    final /* synthetic */ List a;
    final /* synthetic */ fdae b;

    public djxu(List list, fdae fdaeVar) {
        this.a = list;
        this.b = fdaeVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                djyg.h((djyn) it.next(), this.b, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}
