package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class veb {
    public static final List a(Set set, List list) {
        try {
            fdap fdapVar = new fdap() { // from class: vea
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    vdy vdyVar = (vdy) obj;
                    vdyVar.getClass();
                    return vdyVar.getClass();
                }
            };
            list.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(set, 10)), 16));
            for (Object obj : set) {
                linkedHashMap.put(fdapVar.invoke(obj), obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj2 = linkedHashMap.get(it.next());
                if (obj2 == null) {
                    throw new NoSuchElementException("Key in sortedKeys was not found in collection.");
                }
                arrayList.add(obj2);
            }
            return arrayList;
        } catch (NoSuchElementException e) {
            throw new IllegalStateException("Action was included in manifest but was not bound.", e);
        }
    }
}
