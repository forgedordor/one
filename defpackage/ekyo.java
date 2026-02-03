package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyo implements Comparable, Serializable, ekzg {
    public final List a;
    public ekyd b;
    public transient elaw c;
    public int d;
    private final AtomicInteger e;

    public ekyo() {
        this.a = new ArrayList();
        this.e = new AtomicInteger();
        this.d = 0;
        this.b = ekyd.d();
        ekyd.d();
        c();
    }

    public static boolean f(ekyh ekyhVar) {
        return ekyhVar.c == 1 && ekyhVar.d(0).p(ekyh.a);
    }

    private final void g(ekyh ekyhVar, int i, Map map) {
        if (ekyhVar != null) {
            ekyhVar.f = i;
            this.a.add(ekyhVar);
        }
        List list = (List) map.get(ekyhVar);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g((ekyh) it.next(), i + 1, map);
            }
        }
    }

    private static void h(ekyh ekyhVar, ekyh ekyhVar2, Map map) {
        List<ekyh> arrayList = (List) map.get(ekyhVar2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(ekyhVar2, arrayList);
        }
        for (ekyh ekyhVar3 : arrayList) {
            if (ekyhVar3.i(ekyhVar)) {
                h(ekyhVar, ekyhVar3, map);
                return;
            }
        }
        List arrayList2 = (List) map.get(ekyhVar);
        int i = 0;
        while (i < arrayList.size()) {
            ekyh ekyhVar4 = (ekyh) arrayList.get(i);
            if (ekyhVar.i(ekyhVar4)) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(ekyhVar, arrayList2);
                }
                arrayList2.add(ekyhVar4);
                arrayList.remove(i);
            } else {
                i++;
            }
        }
        arrayList.add(ekyhVar);
    }

    private Object readResolve() {
        c();
        return this;
    }

    public final int a() {
        return this.a.size();
    }

    public final ekyh b(int i) {
        return (ekyh) this.a.get(i);
    }

    public final void c() {
        int i = this.d;
        int i2 = 10;
        if (i > 8) {
            if (i <= 8192) {
                i2 = 50;
            } else if (i > 50000) {
                i2 = 2;
            }
        }
        this.e.set(i2);
        if (this.c == null) {
            this.c = new elaw();
        }
        for (int i3 = 0; i3 < a(); i3++) {
            this.c.c(b(i3));
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ekyo ekyoVar = (ekyo) obj;
        if (a() != ekyoVar.a()) {
            return a() - ekyoVar.a();
        }
        for (int i = 0; i < a(); i++) {
            int iCompareTo = ((ekyh) this.a.get(i)).compareTo((ekyh) ekyoVar.a.get(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final void d() {
        this.d = 0;
        ekyc ekycVarC = ekyc.c();
        for (ekyh ekyhVar : this.a) {
            if ((ekyhVar.f & 1) == 0) {
                ekycVarC.e(ekyhVar.d);
            }
            this.d += ekyhVar.c;
        }
        ekyd ekydVarD = ekycVarC.d();
        this.b = ekydVarD;
        ekxu.a(ekydVarD);
        c();
    }

    public final boolean e(ekyj ekyjVar) throws Throwable {
        if (!this.c.d && !this.b.h(ekyjVar)) {
            return false;
        }
        if (this.d <= 32 || (!this.c.d && this.e.decrementAndGet() > 0)) {
            boolean zG = false;
            for (int i = 0; i < a(); i++) {
                zG ^= b(i).g(ekyjVar);
            }
            return zG;
        }
        ekya ekyaVarA = this.c.a();
        if (!ekxy.d(ekyaVarA, ekyjVar)) {
            return false;
        }
        ekzu ekzuVar = (ekzu) ekyaVarA.a();
        ekxt ekxtVar = new ekxt(ekxy.c(ekyaVarA), ekyjVar);
        boolean zF = false;
        for (int i2 = 0; i2 < ekzuVar.a(); i2++) {
            elat elatVarB = ekzuVar.b(i2);
            zF ^= elatVarB.f();
            int iD = elatVarB.d();
            if (iD > 0) {
                ekyh ekyhVar = (ekyh) this.a.get(elatVarB.e());
                int i3 = -2;
                int i4 = 0;
                while (i4 < iD) {
                    int iC = elatVarB.c(i4);
                    if (iC != i3 + 1) {
                        ekxtVar.c(ekyhVar.d(iC));
                    }
                    zF ^= ekxtVar.d(ekyhVar.d(iC + 1));
                    i4++;
                    i3 = iC;
                }
            }
        }
        return zF;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekyo) {
            ekyo ekyoVar = (ekyo) obj;
            if (this.d == ekyoVar.d && this.b.equals(ekyoVar.b) && this.a.equals(ekyoVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Polygon: (");
        sb.append(a());
        sb.append(") loops:\n");
        for (int i = 0; i < a(); i++) {
            ekyh ekyhVarB = b(i);
            sb.append("loop <\n");
            for (int i2 = 0; i2 < ekyhVarB.c; i2++) {
                sb.append(ekyhVarB.d(i2).o());
                sb.append("\n");
            }
            sb.append(">\n");
        }
        return sb.toString();
    }

    public ekyo(List list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.e = new AtomicInteger();
        this.d = 0;
        arrayList.clear();
        elaw elawVar = this.c;
        if (elawVar != null) {
            elawVar.d();
        }
        this.b = ekyd.d();
        ekyd.d();
        this.d = 0;
        if (list.size() == 1) {
            ekyh ekyhVar = (ekyh) list.remove(0);
            if (f(ekyhVar)) {
                d();
                return;
            }
            arrayList.add(ekyhVar);
            ekyh ekyhVar2 = (ekyh) arrayList.get(0);
            ekyhVar2.f = 0;
            this.d = ekyhVar2.c;
            this.b = ekyhVar2.d;
            ekyd ekydVar = ekyhVar2.e;
            c();
            return;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        identityHashMap.put(null, new ArrayList());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ekyh ekyhVar3 = (ekyh) it.next();
            if (!f(ekyhVar3)) {
                h(ekyhVar3, null, identityHashMap);
            }
        }
        list.clear();
        Iterator it2 = identityHashMap.values().iterator();
        while (it2.hasNext()) {
            Collections.sort((List) it2.next());
        }
        g(null, -1, identityHashMap);
        d();
    }
}
