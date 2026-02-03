package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evva {
    public static final evvs a;

    static {
        evuq evuqVar = evuq.a;
        a = new evvu();
    }

    public static void A(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evtv)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.x(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int iY = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iY += evrf.Y(((Long) list.get(i3)).longValue());
            }
            evrfVar.w(iY);
            while (i2 < list.size()) {
                evrfVar.y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        evtv evtvVar = (evtv) list;
        if (!z) {
            while (i2 < evtvVar.c) {
                evrgVar.a.x(i, evtvVar.a(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int iY2 = 0;
        for (int i4 = 0; i4 < evtvVar.c; i4++) {
            iY2 += evrf.Y(evtvVar.a(i4));
        }
        evrfVar2.w(iY2);
        while (i2 < evtvVar.c) {
            evrfVar2.y(evtvVar.a(i2));
            i2++;
        }
    }

    public static void B(int i, List list, evrg evrgVar, evuz evuzVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            evrgVar.k(i, list.get(i2), evuzVar);
        }
    }

    public static void C(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evsq)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            evrfVar.w(i3);
            while (i2 < list.size()) {
                evrfVar.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        evsq evsqVar = (evsq) list;
        if (!z) {
            while (i2 < evsqVar.c) {
                evrgVar.a.i(i, evsqVar.d(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < evsqVar.c; i6++) {
            evsqVar.d(i6);
            i5 += 4;
        }
        evrfVar2.w(i5);
        while (i2 < evsqVar.c) {
            evrfVar2.j(evsqVar.d(i2));
            i2++;
        }
    }

    public static void D(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evtv)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            evrfVar.w(i3);
            while (i2 < list.size()) {
                evrfVar.l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        evtv evtvVar = (evtv) list;
        if (!z) {
            while (i2 < evtvVar.c) {
                evrgVar.a.k(i, evtvVar.a(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < evtvVar.c; i6++) {
            evtvVar.a(i6);
            i5 += 8;
        }
        evrfVar2.w(i5);
        while (i2 < evtvVar.c) {
            evrfVar2.l(evtvVar.a(i2));
            i2++;
        }
    }

    public static void E(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evsq)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.aj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int iP = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iP += evrf.P(((Integer) list.get(i3)).intValue());
            }
            evrfVar.w(iP);
            while (i2 < list.size()) {
                evrfVar.ak(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        evsq evsqVar = (evsq) list;
        if (!z) {
            while (i2 < evsqVar.c) {
                evrgVar.a.aj(i, evsqVar.d(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int iP2 = 0;
        for (int i4 = 0; i4 < evsqVar.c; i4++) {
            iP2 += evrf.P(evsqVar.d(i4));
        }
        evrfVar2.w(iP2);
        while (i2 < evsqVar.c) {
            evrfVar2.ak(evsqVar.d(i2));
            i2++;
        }
    }

    public static void F(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evtv)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.al(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int iR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iR += evrf.R(((Long) list.get(i3)).longValue());
            }
            evrfVar.w(iR);
            while (i2 < list.size()) {
                evrfVar.am(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        evtv evtvVar = (evtv) list;
        if (!z) {
            while (i2 < evtvVar.c) {
                evrgVar.a.al(i, evtvVar.a(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int iR2 = 0;
        for (int i4 = 0; i4 < evtvVar.c; i4++) {
            iR2 += evrf.R(evtvVar.a(i4));
        }
        evrfVar2.w(iR2);
        while (i2 < evtvVar.c) {
            evrfVar2.am(evtvVar.a(i2));
            i2++;
        }
    }

    public static void G(int i, List list, evrg evrgVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evtq)) {
            while (i2 < list.size()) {
                evrgVar.a.s(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        evtq evtqVar = (evtq) list;
        while (i2 < list.size()) {
            Object objC = evtqVar.c();
            if (objC instanceof String) {
                evrgVar.a.s(i, (String) objC);
            } else {
                evrgVar.a.az(i, (evqs) objC);
            }
            i2++;
        }
    }

    public static void H(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evsq)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.v(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int iW = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iW += evrf.W(((Integer) list.get(i3)).intValue());
            }
            evrfVar.w(iW);
            while (i2 < list.size()) {
                evrfVar.w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        evsq evsqVar = (evsq) list;
        if (!z) {
            while (i2 < evsqVar.c) {
                evrgVar.a.v(i, evsqVar.d(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int iW2 = 0;
        for (int i4 = 0; i4 < evsqVar.c; i4++) {
            iW2 += evrf.W(evsqVar.d(i4));
        }
        evrfVar2.w(iW2);
        while (i2 < evsqVar.c) {
            evrfVar2.w(evsqVar.d(i2));
            i2++;
        }
    }

    public static void I(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evtv)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.x(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int iY = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iY += evrf.Y(((Long) list.get(i3)).longValue());
            }
            evrfVar.w(iY);
            while (i2 < list.size()) {
                evrfVar.y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        evtv evtvVar = (evtv) list;
        if (!z) {
            while (i2 < evtvVar.c) {
                evrgVar.a.x(i, evtvVar.a(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int iY2 = 0;
        for (int i4 = 0; i4 < evtvVar.c; i4++) {
            iY2 += evrf.Y(evtvVar.a(i4));
        }
        evrfVar2.w(iY2);
        while (i2 < evtvVar.c) {
            evrfVar2.y(evtvVar.a(i2));
            i2++;
        }
    }

    static void J(Object obj, Object obj2) {
        evvt evvtVarK = evvu.k(obj);
        evvt evvtVarK2 = evvu.k(obj2);
        evvt evvtVar = evvt.a;
        if (!evvtVar.equals(evvtVarK2)) {
            if (evvtVar.equals(evvtVarK)) {
                evvtVarK = evvt.b(evvtVarK, evvtVarK2);
            } else if (!evvtVarK2.equals(evvtVar)) {
                evvtVarK.c();
                int i = evvtVarK.b + evvtVarK2.b;
                evvtVarK.d(i);
                System.arraycopy(evvtVarK2.c, 0, evvtVarK.c, evvtVarK.b, evvtVarK2.b);
                System.arraycopy(evvtVarK2.d, 0, evvtVarK.d, evvtVarK.b, evvtVarK2.b);
                evvtVarK.b = i;
            }
        }
        evvu.l(obj, evvtVarK);
    }

    static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof evsq)) {
            int iG = 0;
            while (i < size) {
                iG += evrf.G(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG;
        }
        evsq evsqVar = (evsq) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += evrf.G(evsqVar.d(i));
            i++;
        }
        return iG2;
    }

    static int b(List list) {
        return list.size() * 4;
    }

    static int c(List list) {
        return list.size() * 8;
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof evsq)) {
            int iG = 0;
            while (i < size) {
                iG += evrf.G(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG;
        }
        evsq evsqVar = (evsq) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += evrf.G(evsqVar.d(i));
            i++;
        }
        return iG2;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof evtv)) {
            int iY = 0;
            while (i < size) {
                iY += evrf.Y(((Long) list.get(i)).longValue());
                i++;
            }
            return iY;
        }
        evtv evtvVar = (evtv) list;
        int iY2 = 0;
        while (i < size) {
            iY2 += evrf.Y(evtvVar.a(i));
            i++;
        }
        return iY2;
    }

    static int f(int i, Object obj, evuz evuzVar) {
        return obj instanceof evtp ? evrf.I(i, (evtp) obj) : evrf.U(i) + evrf.M((evuh) obj, evuzVar);
    }

    static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof evsq)) {
            int iP = 0;
            while (i < size) {
                iP += evrf.P(((Integer) list.get(i)).intValue());
                i++;
            }
            return iP;
        }
        evsq evsqVar = (evsq) list;
        int iP2 = 0;
        while (i < size) {
            iP2 += evrf.P(evsqVar.d(i));
            i++;
        }
        return iP2;
    }

    static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof evtv)) {
            int iR = 0;
            while (i < size) {
                iR += evrf.R(((Long) list.get(i)).longValue());
                i++;
            }
            return iR;
        }
        evtv evtvVar = (evtv) list;
        int iR2 = 0;
        while (i < size) {
            iR2 += evrf.R(evtvVar.a(i));
            i++;
        }
        return iR2;
    }

    static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof evsq)) {
            int iW = 0;
            while (i < size) {
                iW += evrf.W(((Integer) list.get(i)).intValue());
                i++;
            }
            return iW;
        }
        evsq evsqVar = (evsq) list;
        int iW2 = 0;
        while (i < size) {
            iW2 += evrf.W(evsqVar.d(i));
            i++;
        }
        return iW2;
    }

    static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof evtv)) {
            int iY = 0;
            while (i < size) {
                iY += evrf.Y(((Long) list.get(i)).longValue());
                i++;
            }
            return iY;
        }
        evtv evtvVar = (evtv) list;
        int iY2 = 0;
        while (i < size) {
            iY2 += evrf.Y(evtvVar.a(i));
            i++;
        }
        return iY2;
    }

    static Object k(Object obj, int i, List list, evsu evsuVar, Object obj2, evvs evvsVar) {
        if (evsuVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (evsuVar.a(iIntValue) == null) {
                    obj2 = m(obj, i, iIntValue, obj2, evvsVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (evsuVar.a(iIntValue2) != null) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m(obj, i, iIntValue2, obj2, evvsVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object l(Object obj, int i, List list, evsv evsvVar, Object obj2, evvs evvsVar) {
        if (evsvVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!evsvVar.a(iIntValue)) {
                    obj2 = m(obj, i, iIntValue, obj2, evvsVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (evsvVar.a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m(obj, i, iIntValue2, obj2, evvsVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object m(Object obj, int i, int i2, Object obj2, evvs evvsVar) {
        if (obj2 == null) {
            obj2 = evvsVar.a(obj);
        }
        evvsVar.g(obj2, i, i2);
        return obj2;
    }

    static void n(evrs evrsVar, Object obj, Object obj2) {
        evry evryVarA = evrsVar.a(obj2);
        if (evryVarA.i()) {
            return;
        }
        evry evryVarB = evrsVar.b(obj);
        evvf evvfVar = evryVarA.b;
        int i = evvfVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            evryVarB.g(evvfVar.d(i2));
        }
        Iterator it = evvfVar.a().iterator();
        while (it.hasNext()) {
            evryVarB.g((Map.Entry) it.next());
        }
    }

    static boolean o(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int p(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * evrf.ap(i);
    }

    static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * evrf.aq(i);
    }

    public static void r(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evqi)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.ay(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            evrfVar.w(i3);
            while (i2 < list.size()) {
                evrfVar.ax(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        evqi evqiVar = (evqi) list;
        if (!z) {
            while (i2 < evqiVar.c) {
                evrgVar.a.ay(i, evqiVar.g(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < evqiVar.c; i6++) {
            evqiVar.g(i6);
            i5++;
        }
        evrfVar2.w(i5);
        while (i2 < evqiVar.c) {
            evrfVar2.ax(evqiVar.g(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void s(int i, List list, evrg evrgVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            evrgVar.a.az(i, (evqs) list.get(i2));
        }
    }

    public static void t(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evrh)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.ae(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            evrfVar.w(i3);
            while (i2 < list.size()) {
                evrfVar.af(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        evrh evrhVar = (evrh) list;
        if (!z) {
            while (i2 < evrhVar.d) {
                evrgVar.a.ae(i, evrhVar.d(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < evrhVar.d; i6++) {
            evrhVar.d(i6);
            i5 += 8;
        }
        evrfVar2.w(i5);
        while (i2 < evrhVar.d) {
            evrfVar2.af(evrhVar.d(i2));
            i2++;
        }
    }

    public static void u(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evsq)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += evrf.G(((Integer) list.get(i3)).intValue());
            }
            evrfVar.w(iG);
            while (i2 < list.size()) {
                evrfVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        evsq evsqVar = (evsq) list;
        if (!z) {
            while (i2 < evsqVar.c) {
                evrgVar.a.m(i, evsqVar.d(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < evsqVar.c; i4++) {
            iG2 += evrf.G(evsqVar.d(i4));
        }
        evrfVar2.w(iG2);
        while (i2 < evsqVar.c) {
            evrfVar2.n(evsqVar.d(i2));
            i2++;
        }
    }

    public static void v(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evsq)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            evrfVar.w(i3);
            while (i2 < list.size()) {
                evrfVar.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        evsq evsqVar = (evsq) list;
        if (!z) {
            while (i2 < evsqVar.c) {
                evrgVar.a.i(i, evsqVar.d(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < evsqVar.c; i6++) {
            evsqVar.d(i6);
            i5 += 4;
        }
        evrfVar2.w(i5);
        while (i2 < evsqVar.c) {
            evrfVar2.j(evsqVar.d(i2));
            i2++;
        }
    }

    public static void w(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evtv)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            evrfVar.w(i3);
            while (i2 < list.size()) {
                evrfVar.l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        evtv evtvVar = (evtv) list;
        if (!z) {
            while (i2 < evtvVar.c) {
                evrgVar.a.k(i, evtvVar.a(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < evtvVar.c; i6++) {
            evtvVar.a(i6);
            i5 += 8;
        }
        evrfVar2.w(i5);
        while (i2 < evtvVar.c) {
            evrfVar2.l(evtvVar.a(i2));
            i2++;
        }
    }

    public static void x(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evsa)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.ag(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            evrfVar.w(i3);
            while (i2 < list.size()) {
                evrfVar.ah(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        evsa evsaVar = (evsa) list;
        if (!z) {
            while (i2 < evsaVar.d) {
                evrgVar.a.ag(i, evsaVar.d(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < evsaVar.d; i6++) {
            evsaVar.d(i6);
            i5 += 4;
        }
        evrfVar2.w(i5);
        while (i2 < evsaVar.d) {
            evrfVar2.ah(evsaVar.d(i2));
            i2++;
        }
    }

    public static void y(int i, List list, evrg evrgVar, evuz evuzVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            evrgVar.h(i, list.get(i2), evuzVar);
        }
    }

    public static void z(int i, List list, evrg evrgVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof evsq)) {
            if (!z) {
                while (i2 < list.size()) {
                    evrgVar.a.m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            evrf evrfVar = evrgVar.a;
            evrfVar.u(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += evrf.G(((Integer) list.get(i3)).intValue());
            }
            evrfVar.w(iG);
            while (i2 < list.size()) {
                evrfVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        evsq evsqVar = (evsq) list;
        if (!z) {
            while (i2 < evsqVar.c) {
                evrgVar.a.m(i, evsqVar.d(i2));
                i2++;
            }
            return;
        }
        evrf evrfVar2 = evrgVar.a;
        evrfVar2.u(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < evsqVar.c; i4++) {
            iG2 += evrf.G(evsqVar.d(i4));
        }
        evrfVar2.w(iG2);
        while (i2 < evsqVar.c) {
            evrfVar2.n(evsqVar.d(i2));
            i2++;
        }
    }
}
