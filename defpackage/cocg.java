package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cocg {
    public static final fctc a = fctd.a(new fdae() { // from class: cocd
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = cocg.a;
            return new cocp(new fdat() { // from class: coce
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    cnyz cnyzVar = (cnyz) obj;
                    Collection collection = (Collection) obj2;
                    fctc fctcVar2 = cocg.a;
                    cnyzVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    if (!collection.isEmpty() && !cobt.b(collection) && cobt.e(cnyzVar)) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }, new fdat() { // from class: cocf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    cnyz cnyzVar = (cnyz) obj;
                    Collection<cnyz> collection = (Collection) obj2;
                    fctc fctcVar2 = cocg.a;
                    cnyzVar.getClass();
                    collection.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        evtg evtgVar = ((cnyz) it.next()).f;
                        evtgVar.getClass();
                        fcva.y(arrayList, evtgVar);
                    }
                    ArrayList arrayList2 = new ArrayList(fcva.p(collection, 10));
                    for (cnyz cnyzVar2 : collection) {
                        cnyzVar2.getClass();
                        cnyu cnyuVar = (cnyu) cnyzVar2.toBuilder();
                        cnyuVar.getClass();
                        DesugarCollections.unmodifiableList(((cnyz) cnyuVar.instance).f).getClass();
                        cnzi.j(cnyuVar);
                        DesugarCollections.unmodifiableList(((cnyz) cnyuVar.instance).h).getClass();
                        cnzi.i(cnyuVar);
                        arrayList2.add(cocb.b(cnzi.c(cnyuVar)));
                    }
                    List<cnyz> listAh = fcva.ah(arrayList, arrayList2);
                    ArrayList arrayList3 = new ArrayList(fcva.p(listAh, 10));
                    for (cnyz cnyzVar3 : listAh) {
                        cnyzVar3.getClass();
                        evqs evqsVar = cnyzVar.e;
                        evqsVar.getClass();
                        arrayList3.add(new cobv(cnyzVar3, evqsVar));
                    }
                    return new cobx(fcva.b(cnyzVar), 3, arrayList3);
                }
            });
        }
    });
}
