package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ona {
    public final ojc a;
    public final fdae b;
    public oka c;
    public Bundle d;
    public Bundle[] e;
    public final fcuq f = new fcuq();
    public final fduf g;
    public final fduf h;
    public final Map i;
    public final Map j;
    public lvj k;
    public oje l;
    public final List m;
    public lvb n;
    public final lvi o;
    public final ola p;
    public final Map q;
    public fdap r;
    public fdap s;
    public final Map t;
    private final Map u;
    private final Map v;
    private int w;
    private final List x;
    private final fdue y;

    public ona(ojc ojcVar, fdae fdaeVar) {
        this.a = ojcVar;
        this.b = fdaeVar;
        fcvo fcvoVar = fcvo.a;
        this.g = fdvf.a(fcvoVar);
        this.h = fdvf.a(fcvoVar);
        this.u = new LinkedHashMap();
        this.v = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.m = new ArrayList();
        this.n = lvb.b;
        this.o = new lvh() { // from class: omu
            @Override // defpackage.lvh
            public final void gL(lvj lvjVar, lva lvaVar) {
                ona onaVar = this.a;
                onaVar.n = lvaVar.a();
                if (onaVar.c != null) {
                    Iterator it = fcva.aq(onaVar.f).iterator();
                    while (it.hasNext()) {
                        oml omlVar = ((oip) it.next()).f;
                        omlVar.b = lvaVar.a();
                        omlVar.c();
                    }
                }
            }
        };
        this.p = new ola();
        this.q = new LinkedHashMap();
        this.t = new LinkedHashMap();
        this.x = new ArrayList();
        this.y = fdun.e(1, 0, 2, 2);
    }

    public static /* synthetic */ ojx p(ona onaVar, int i) {
        return onaVar.d(i, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [ojx, oka] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, oka] */
    public static final ojx q(ojx ojxVar, int i, boolean z, ojx ojxVar2) {
        ojxVar.getClass();
        if (ojxVar.c() == i && (ojxVar2 == null || (fdbq.f(ojxVar, ojxVar2) && fdbq.f(ojxVar.e, ojxVar2.e)))) {
            return ojxVar;
        }
        ?? r0 = ojxVar instanceof oka ? (oka) ojxVar : 0;
        if (r0 == 0) {
            r0 = ojxVar.e;
            r0.getClass();
        }
        return r0.m(i, r0, z, ojxVar2);
    }

    public static /* synthetic */ boolean t(ona onaVar, int i) {
        return onaVar.o(i, true, false);
    }

    public static /* synthetic */ void u(ona onaVar, oip oipVar) {
        onaVar.k(oipVar, false, new fcuq());
    }

    private final boolean x(int i, final Bundle bundle, okg okgVar) {
        ojx ojxVarF;
        oip oipVar;
        ojx ojxVar;
        Map map = this.i;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return false;
        }
        final String str = (String) map.get(numValueOf);
        fcva.A(map.values(), new fdap() { // from class: omy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(fdbq.f((String) obj, str));
            }
        });
        Map map2 = this.j;
        fdcm.g(map2);
        fcuq<oiq> fcuqVar = (fcuq) map2.remove(str);
        final ArrayList arrayList = new ArrayList();
        oip oipVar2 = (oip) this.f.f();
        if (oipVar2 == null || (ojxVarF = oipVar2.a) == null) {
            ojxVarF = f();
        }
        if (fcuqVar != null) {
            for (oiq oiqVar : fcuqVar) {
                ojx ojxVarQ = q(ojxVarF, oiqVar.a(), true, null);
                if (ojxVarQ == null) {
                    int i2 = ojx.h;
                    throw new IllegalStateException("Restore State failed: destination " + ojv.a(g(), oiqVar.a()) + " cannot be found from the current destination " + ojxVarF);
                }
                arrayList.add(oiqVar.c(g(), ojxVarQ, a(), this.l));
                ojxVarF = ojxVarQ;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<oip> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((oip) obj).a instanceof oka)) {
                arrayList3.add(obj);
            }
        }
        for (oip oipVar3 : arrayList3) {
            List list = (List) fcva.T(arrayList2);
            if (fdbq.f((list == null || (oipVar = (oip) fcva.S(list)) == null || (ojxVar = oipVar.a) == null) ? null : ojxVar.c, oipVar3.a.c)) {
                list.add(oipVar3);
            } else {
                arrayList2.add(fcva.i(oipVar3));
            }
        }
        final fdce fdceVar = new fdce();
        for (List list2 : arrayList2) {
            oky okyVarA = this.p.a(((oip) fcva.N(list2)).a.c);
            final fdcg fdcgVar = new fdcg();
            s(okyVarA, list2, okgVar, new fdap() { // from class: omv
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    List listSubList;
                    oip oipVar4 = (oip) obj2;
                    oipVar4.getClass();
                    fdceVar.a = true;
                    List list3 = arrayList;
                    int iIndexOf = list3.indexOf(oipVar4);
                    if (iIndexOf != -1) {
                        fdcg fdcgVar2 = fdcgVar;
                        int i3 = iIndexOf + 1;
                        listSubList = list3.subList(fdcgVar2.a, i3);
                        fdcgVar2.a = i3;
                    } else {
                        listSubList = fcvo.a;
                    }
                    this.i(oipVar4.a, bundle, oipVar4, listSubList);
                    return fctx.a;
                }
            });
        }
        return fdceVar.a;
    }

    public final lvb a() {
        return this.k == null ? lvb.c : this.n;
    }

    public final oip b(int i) {
        Object objPrevious;
        fcuq fcuqVar = this.f;
        ListIterator<E> listIterator = fcuqVar.listIterator(fcuqVar.a);
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((oip) objPrevious).a.c() == i) {
                break;
            }
        }
        oip oipVar = (oip) objPrevious;
        if (oipVar != null) {
            return oipVar;
        }
        throw new IllegalArgumentException("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + e());
    }

    public final oip c() {
        return (oip) this.f.f();
    }

    public final ojx d(int i, ojx ojxVar) {
        ojx ojxVar2;
        oka okaVar = this.c;
        if (okaVar == null) {
            return null;
        }
        if (okaVar.c() == i && (ojxVar == null || (fdbq.f(this.c, ojxVar) && ojxVar.e == null))) {
            return this.c;
        }
        oip oipVar = (oip) this.f.f();
        if (oipVar == null || (ojxVar2 = oipVar.a) == null) {
            ojxVar2 = this.c;
            ojxVar2.getClass();
        }
        return q(ojxVar2, i, false, ojxVar);
    }

    public final ojx e() {
        oip oipVarC = c();
        if (oipVarC != null) {
            return oipVarC.a;
        }
        return null;
    }

    public final oka f() {
        oka okaVar = this.c;
        if (okaVar != null) {
            return okaVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final omn g() {
        return this.a.c;
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.q.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((oiz) it.next()).h.c();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                oip oipVar = (oip) obj;
                if (!arrayList.contains(oipVar) && !oipVar.b().a(lvb.d)) {
                    arrayList2.add(obj);
                }
            }
            fcva.y(arrayList, arrayList2);
        }
        fcuq fcuqVar = this.f;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : fcuqVar) {
            oip oipVar2 = (oip) obj2;
            if (!arrayList.contains(oipVar2) && oipVar2.b().a(lvb.d)) {
                arrayList3.add(obj2);
            }
        }
        fcva.y(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((oip) obj3).a instanceof oka)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final void i(ojx ojxVar, Bundle bundle, oip oipVar, List list) {
        fcuq fcuqVar;
        Object objPrevious;
        Object objPrevious2;
        fcuq fcuqVar2;
        ojx ojxVar2 = oipVar.a;
        if (!(ojxVar2 instanceof olk)) {
            do {
                fcuqVar2 = this.f;
                if (fcuqVar2.isEmpty() || !(((oip) fcuqVar2.e()).a instanceof olk)) {
                    break;
                }
            } while (t(this, ((oip) fcuqVar2.e()).a.c()));
        }
        fcuq<oip> fcuqVar3 = new fcuq();
        Object obj = null;
        if (ojxVar instanceof oka) {
            ojx ojxVar3 = ojxVar2;
            do {
                ojxVar3.getClass();
                ojxVar3 = ojxVar3.e;
                if (ojxVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (fdbq.f(((oip) objPrevious2).a, ojxVar3)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    oip oipVarB = (oip) objPrevious2;
                    if (oipVarB == null) {
                        oipVarB = oio.b(g(), ojxVar3, bundle, a(), this.l);
                    }
                    fcuqVar3.addFirst(oipVarB);
                    fcuq fcuqVar4 = this.f;
                    if (!fcuqVar4.isEmpty() && ((oip) fcuqVar4.e()).a == ojxVar3) {
                        u(this, (oip) fcuqVar4.e());
                    }
                }
                if (ojxVar3 == null) {
                    break;
                }
            } while (ojxVar3 != ojxVar);
        }
        ojx ojxVar4 = fcuqVar3.isEmpty() ? ojxVar2 : ((oip) fcuqVar3.a()).a;
        while (ojxVar4 != null && d(ojxVar4.c(), ojxVar4) != ojxVar4) {
            ojxVar4 = ojxVar4.e;
            if (ojxVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (fdbq.f(((oip) objPrevious).a, ojxVar4)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                oip oipVarB2 = (oip) objPrevious;
                if (oipVarB2 == null) {
                    oipVarB2 = oio.b(g(), ojxVar4, ojxVar4.d(bundle2), a(), this.l);
                }
                fcuqVar3.addFirst(oipVarB2);
            }
        }
        if (!fcuqVar3.isEmpty()) {
            ojxVar2 = ((oip) fcuqVar3.a()).a;
        }
        while (true) {
            fcuqVar = this.f;
            if (fcuqVar.isEmpty() || !(((oip) fcuqVar.e()).a instanceof oka)) {
                break;
            }
            ojx ojxVar5 = ((oip) fcuqVar.e()).a;
            ojxVar5.getClass();
            if (cvy.a(((oka) ojxVar5).k(), ojxVar2.c()) != null) {
                break;
            } else {
                u(this, (oip) fcuqVar.e());
            }
        }
        oip oipVar2 = (oip) fcuqVar.b();
        if (oipVar2 == null) {
            oipVar2 = (oip) fcuqVar3.b();
        }
        if (!fdbq.f(oipVar2 != null ? oipVar2.a : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                ojx ojxVar6 = ((oip) objPrevious3).a;
                oka okaVar = this.c;
                okaVar.getClass();
                if (fdbq.f(ojxVar6, okaVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            oip oipVarB3 = (oip) obj;
            if (oipVarB3 == null) {
                omn omnVarG = g();
                oka okaVar2 = this.c;
                okaVar2.getClass();
                okaVar2.getClass();
                oipVarB3 = oio.b(omnVarG, okaVar2, okaVar2.d(bundle), a(), this.l);
            }
            fcuqVar3.addFirst(oipVarB3);
        }
        for (oip oipVar3 : fcuqVar3) {
            Object obj2 = this.q.get(this.p.a(oipVar3.a.c));
            if (obj2 == null) {
                throw new IllegalStateException("NavigatorBackStack for " + ojxVar.c + " should already be created");
            }
            ((oiz) obj2).b(oipVar3);
        }
        fcuqVar.addAll(fcuqVar3);
        fcuqVar.add(oipVar);
        for (oip oipVar4 : fcva.ai(fcuqVar3, oipVar)) {
            oka okaVar3 = oipVar4.a.e;
            if (okaVar3 != null) {
                j(oipVar4, b(okaVar3.c()));
            }
        }
    }

    public final void j(oip oipVar, oip oipVar2) {
        oipVar.getClass();
        this.u.put(oipVar, oipVar2);
        Map map = this.v;
        if (map.get(oipVar2) == null) {
            map.put(oipVar2, new omf());
        }
        Object obj = map.get(oipVar2);
        obj.getClass();
        ((omf) obj).a.incrementAndGet();
    }

    public final void k(oip oipVar, boolean z, fcuq fcuqVar) {
        oje ojeVar;
        Set set;
        oipVar.getClass();
        fcuq fcuqVar2 = this.f;
        oip oipVar2 = (oip) fcuqVar2.e();
        if (!fdbq.f(oipVar2, oipVar)) {
            throw new IllegalStateException("Attempted to pop " + oipVar.a + ", which is not the top of the back stack (" + oipVar2.a + ')');
        }
        fcva.u(fcuqVar2);
        oiz oizVar = (oiz) this.q.get(this.p.a(oipVar2.a.c));
        boolean z2 = true;
        if ((oizVar == null || (set = (Set) oizVar.h.c()) == null || !set.contains(oipVar2)) && !this.v.containsKey(oipVar2)) {
            z2 = false;
        }
        lvb lvbVar = ((lvn) oipVar2.P()).c;
        lvb lvbVar2 = lvb.c;
        if (lvbVar.a(lvbVar2)) {
            if (z) {
                oipVar2.c(lvbVar2);
                fcuqVar.addFirst(new oiq(oipVar2));
            }
            if (z2) {
                oipVar2.c(lvbVar2);
            } else {
                oipVar2.c(lvb.a);
                v(oipVar2);
            }
        }
        if (z || z2 || (ojeVar = this.l) == null) {
            return;
        }
        ojeVar.a(oipVar2.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x030d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0213  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [ojx, oka] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, oka] */
    /* JADX WARN: Type inference failed for: r8v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.oka r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ona.l(oka, android.os.Bundle):void");
    }

    public final void m() {
        omf omfVar;
        Set set;
        List<oip> listAq = fcva.aq(this.f);
        if (listAq.isEmpty()) {
            return;
        }
        ojx ojxVar = ((oip) fcva.S(listAq)).a;
        List listI = fcva.i(ojxVar);
        if (ojxVar instanceof olh) {
            boolean z = ojxVar instanceof olk;
            Iterator it = fcva.ac(fcva.aj(listAq), 1).iterator();
            while (it.hasNext()) {
                ojx ojxVar2 = ((oip) it.next()).a;
                if (z && !(ojxVar2 instanceof olk) && !(ojxVar2 instanceof oka)) {
                    break;
                }
                listI.add(ojxVar2);
                if (!(ojxVar2 instanceof olh) && !(ojxVar2 instanceof oka)) {
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (fcva.S(listI) instanceof olk) {
            Iterator it2 = fcva.aj(listAq).iterator();
            while (it2.hasNext()) {
                ojx ojxVar3 = ((oip) it2.next()).a;
                arrayList.add(ojxVar3);
                if (!(ojxVar3 instanceof olk) && !(ojxVar3 instanceof olh) && !(ojxVar3 instanceof oka)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (oip oipVar : fcva.aj(listAq)) {
            lvb lvbVarB = oipVar.b();
            ojx ojxVar4 = oipVar.a;
            ojx ojxVar5 = (ojx) fcva.P(listI);
            if (ojxVar5 != null && ojxVar5.c() == ojxVar4.c()) {
                lvb lvbVar = lvb.e;
                if (lvbVarB != lvbVar) {
                    oiz oizVar = (oiz) this.q.get(this.p.a(oipVar.a.c));
                    Boolean boolValueOf = null;
                    if (oizVar != null && (set = (Set) oizVar.h.c()) != null) {
                        boolValueOf = Boolean.valueOf(set.contains(oipVar));
                    }
                    if (fdbq.f(boolValueOf, true) || ((omfVar = (omf) this.v.get(oipVar)) != null && omfVar.a.get() == 0)) {
                        map.put(oipVar, lvb.d);
                    } else {
                        map.put(oipVar, lvbVar);
                    }
                }
                ojx ojxVar6 = (ojx) fcva.P(arrayList);
                if (ojxVar6 != null && ojxVar6.c() == ojxVar4.c()) {
                    fcva.t(arrayList);
                }
                fcva.t(listI);
                oka okaVar = ojxVar4.e;
                if (okaVar != null) {
                    listI.add(okaVar);
                }
            } else if (arrayList.isEmpty() || ojxVar4.c() != ((ojx) fcva.N(arrayList)).c()) {
                oipVar.c(lvb.c);
            } else {
                ojx ojxVar7 = (ojx) fcva.t(arrayList);
                if (lvbVarB == lvb.e) {
                    oipVar.c(lvb.d);
                } else {
                    lvb lvbVar2 = lvb.d;
                    if (lvbVarB != lvbVar2) {
                        map.put(oipVar, lvbVar2);
                    }
                }
                oka okaVar2 = ojxVar7.e;
                if (okaVar2 != null && !arrayList.contains(okaVar2)) {
                    arrayList.add(okaVar2);
                }
            }
        }
        for (oip oipVar2 : listAq) {
            lvb lvbVar3 = (lvb) map.get(oipVar2);
            if (lvbVar3 != null) {
                oipVar2.c(lvbVar3);
            } else {
                oipVar2.f.c();
            }
        }
    }

    public final boolean n() {
        fcuq fcuqVar;
        while (true) {
            fcuqVar = this.f;
            if (fcuqVar.isEmpty() || !(((oip) fcuqVar.e()).a instanceof oka)) {
                break;
            }
            u(this, (oip) fcuqVar.e());
        }
        oip oipVar = (oip) fcuqVar.f();
        if (oipVar != null) {
            this.x.add(oipVar);
        }
        this.w++;
        m();
        int i = this.w - 1;
        this.w = i;
        if (i == 0) {
            List list = this.x;
            List<oip> listAq = fcva.aq(list);
            list.clear();
            for (oip oipVar2 : listAq) {
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    ((oja) it.next()).a(oipVar2.a, oipVar2.a());
                }
                this.y.h(oipVar2);
            }
            this.g.h(fcva.aq(fcuqVar));
            this.h.h(h());
        }
        return oipVar != null;
    }

    public final boolean o(int i, boolean z, boolean z2) {
        ojx ojxVar;
        final ona onaVar;
        final boolean z3;
        fcuq fcuqVar = this.f;
        if (fcuqVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = fcva.aj(fcuqVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                ojxVar = null;
                break;
            }
            ojxVar = ((oip) it.next()).a;
            oky okyVarA = this.p.a(ojxVar.c);
            if (z || ojxVar.c() != i) {
                arrayList.add(okyVarA);
            }
            if (ojxVar.c() == i) {
                break;
            }
        }
        if (ojxVar == null) {
            int i2 = ojx.h;
            omg.a("Ignoring popBackStack to destination " + ojv.a(g(), i) + " as it was not found on the current back stack");
            return false;
        }
        final fdce fdceVar = new fdce();
        final fcuq fcuqVar2 = new fcuq();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                onaVar = this;
                z3 = z2;
                break;
            }
            oky okyVar = (oky) it2.next();
            final fdce fdceVar2 = new fdce();
            oip oipVar = (oip) fcuqVar.e();
            onaVar = this;
            z3 = z2;
            fdap fdapVar = new fdap() { // from class: omz
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    oip oipVar2 = (oip) obj;
                    oipVar2.getClass();
                    fdceVar2.a = true;
                    fdceVar.a = true;
                    onaVar.k(oipVar2, z3, fcuqVar2);
                    return fctx.a;
                }
            };
            okyVar.getClass();
            oipVar.getClass();
            onaVar.s = fdapVar;
            okyVar.j(oipVar, z3);
            onaVar.s = null;
            if (!fdceVar2.a) {
                break;
            }
            z2 = z3;
        }
        if (z3) {
            if (!z) {
                fdfr fdfrVar = new fdfr(new fdfs(fdey.e(ojxVar, new fdap() { // from class: omo
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ojx ojxVar2 = (ojx) obj;
                        ojxVar2.getClass();
                        oka okaVar = ojxVar2.e;
                        if (okaVar == null || okaVar.j() != ojxVar2.c()) {
                            return null;
                        }
                        return ojxVar2.e;
                    }
                }), new fdap() { // from class: omp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((ojx) obj).getClass();
                        return Boolean.valueOf(!this.a.i.containsKey(Integer.valueOf(r2.c())));
                    }
                }));
                while (fdfrVar.hasNext()) {
                    ojx ojxVar2 = (ojx) fdfrVar.next();
                    Map map = onaVar.i;
                    Integer numValueOf = Integer.valueOf(ojxVar2.c());
                    oiq oiqVar = (oiq) fcuqVar2.b();
                    map.put(numValueOf, oiqVar != null ? oiqVar.d() : null);
                }
            }
            if (!fcuqVar2.isEmpty()) {
                oiq oiqVar2 = (oiq) fcuqVar2.a();
                fdfr fdfrVar2 = new fdfr(new fdfs(fdey.e(p(this, oiqVar2.a()), new fdap() { // from class: omq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ojx ojxVar3 = (ojx) obj;
                        ojxVar3.getClass();
                        oka okaVar = ojxVar3.e;
                        if (okaVar == null || okaVar.j() != ojxVar3.c()) {
                            return null;
                        }
                        return ojxVar3.e;
                    }
                }), new fdap() { // from class: omr
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((ojx) obj).getClass();
                        return Boolean.valueOf(!this.a.i.containsKey(Integer.valueOf(r2.c())));
                    }
                }));
                while (fdfrVar2.hasNext()) {
                    onaVar.i.put(Integer.valueOf(((ojx) fdfrVar2.next()).c()), oiqVar2.d());
                }
                if (onaVar.i.values().contains(oiqVar2.d())) {
                    onaVar.j.put(oiqVar2.d(), fcuqVar2);
                }
            }
        }
        onaVar.b.invoke();
        return fdceVar.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(final defpackage.ojx r13, android.os.Bundle r14, defpackage.okg r15) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ona.r(ojx, android.os.Bundle, okg):void");
    }

    public final void s(oky okyVar, List list, okg okgVar, fdap fdapVar) {
        list.getClass();
        this.r = fdapVar;
        okyVar.d(list, okgVar);
        this.r = null;
    }

    public final void v(oip oipVar) {
        oipVar.getClass();
        oip oipVar2 = (oip) this.u.remove(oipVar);
        if (oipVar2 == null) {
            return;
        }
        Map map = this.v;
        omf omfVar = (omf) map.get(oipVar2);
        Integer numValueOf = omfVar != null ? Integer.valueOf(omfVar.a.decrementAndGet()) : null;
        if (numValueOf == null || numValueOf.intValue() != 0) {
            return;
        }
        oiz oizVar = (oiz) this.q.get(this.p.a(oipVar2.a.c));
        if (oizVar != null) {
            oizVar.c(oipVar2);
        }
        map.remove(oipVar2);
    }

    public final void w(int i, boolean z) {
        if (o(i, z, false)) {
            n();
        }
    }
}
