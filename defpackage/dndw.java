package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndw {
    public static /* synthetic */ List a(List list, List list2, int i, fdat fdatVar, fdat fdatVar2, int i2) {
        fdat fdatVar3 = (i2 & 8) != 0 ? new fdat() { // from class: dndr
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Boolean.valueOf(fdbq.f(obj, obj2));
            }
        } : null;
        if ((i2 & 16) != 0) {
            fdatVar = new fdat() { // from class: dnds
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    return Boolean.valueOf(fdbq.f(obj, obj2));
                }
            };
        }
        if ((i2 & 32) != 0) {
            fdatVar2 = dndt.a;
        }
        int i3 = ((i2 & 4) != 0 ? 0 : 1) & i;
        list.getClass();
        fdatVar3.getClass();
        fdatVar.getClass();
        fdatVar2.getClass();
        mq mqVarA = mv.a(new dndv(list, list2, fdatVar3, fdatVar, fdatVar2));
        ArrayList arrayList = new ArrayList();
        mqVarA.b(new dndu(arrayList, i3));
        return arrayList;
    }

    public static final void b(List list, int i, vo voVar) {
        dndp dndpVar;
        int i2;
        list.getClass();
        voVar.getClass();
        if (list.size() < 5) {
            Iterator it = list.iterator();
            int iG = i;
            while (it.hasNext()) {
                dndq dndqVar = (dndq) it.next();
                if ((dndqVar instanceof dndp) && (i2 = (dndpVar = (dndp) dndqVar).a) < i) {
                    iG -= fddu.g(dndpVar.b + i2, i) - i2;
                }
            }
            if (iG > 0) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((dndq) it2.next()).a(voVar);
                }
                return;
            }
        }
        voVar.p();
    }
}
