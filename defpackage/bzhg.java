package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzhg {
    public static final List a(Collection collection, Collection collection2, Collection collection3, fdap fdapVar) {
        if (collection.size() != collection2.size() || collection2.size() != collection3.size()) {
            throw new bzdk();
        }
        List listAr = fcva.ar(collection2, collection3);
        Iterator it = listAr.iterator();
        Iterator it2 = collection.iterator();
        ArrayList arrayList = new ArrayList(Math.min(fcva.p(listAr, 10), fcva.p(collection, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            String str = (String) it2.next();
            fcti fctiVar = (fcti) next;
            Object obj = fctiVar.a;
            exmy exmyVar = (exmy) fctiVar.b;
            String str2 = obj != null ? (String) fdapVar.invoke(obj) : null;
            Status statusFromCodeValue = Status.fromCodeValue(exmyVar.b);
            statusFromCodeValue.getClass();
            arrayList.add(new bzgw(obj, str, str2, statusFromCodeValue));
        }
        return arrayList;
    }

    public static final Map b(List list, Map map) {
        Object objA;
        list.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bzgw bzgwVar = (bzgw) it.next();
            String str = bzgwVar.a;
            try {
                Status status = bzgwVar.c;
                if (fdbq.f(status, Status.b)) {
                    String str2 = bzgwVar.b;
                    str2.getClass();
                    objA = new bzcc(str2, false);
                } else {
                    if (!fdbq.f(status, Status.h)) {
                        throw new fbtf(status);
                    }
                    Object obj = map.get(str);
                    obj.getClass();
                    Object obj2 = ((fctk) obj).a;
                    fctl.b(obj2);
                    objA = new bzcc((String) obj2, true);
                }
            } catch (Throwable th) {
                objA = fctl.a(th);
            }
            fcti fctiVar = new fcti(str, new fctk(objA));
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        return linkedHashMap;
    }
}
