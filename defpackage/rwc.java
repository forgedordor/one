package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xml.sax.SAXException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rwc {
    private final rvx a;
    private boolean b = false;

    public rwc(rvx rvxVar) {
        this.a = rvxVar;
    }

    public static List b(rvw rvwVar) throws SAXException {
        ArrayList arrayList = new ArrayList();
        while (!rvwVar.o()) {
            try {
                arrayList.add((rvx) Enum.valueOf(rvx.class, rvwVar.k(',')));
                if (!rvwVar.q()) {
                    break;
                }
            } catch (IllegalArgumentException unused) {
                throw new SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    public static boolean c(List list, rvx rvxVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rvx rvxVar2 = (rvx) it.next();
            if (rvxVar2 == rvx.all || rvxVar2 == rvxVar) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(rwa rwaVar, int i, List list, int i2, rxq rxqVar) {
        rwb rwbVarB = rwaVar.b(i);
        if (!e(rwbVarB, list, i2, rxqVar)) {
            return false;
        }
        int i3 = rwbVarB.d;
        if (i3 != 1) {
            if (i3 == 2) {
                return g(rwaVar, i - 1, list, i2);
            }
            int iF = f(list, i2, rxqVar);
            if (iF <= 0) {
                return false;
            }
            return d(rwaVar, i - 1, list, i2, (rxq) rxqVar.u.n().get(iF - 1));
        }
        if (i == 0) {
            return true;
        }
        while (i2 >= 0) {
            if (g(rwaVar, i - 1, list, i2)) {
                return true;
            }
            i2--;
        }
        return false;
    }

    public static boolean e(rwb rwbVar, List list, int i, rxq rxqVar) {
        List list2;
        String str = rwbVar.a;
        if (str != null) {
            if (str.equalsIgnoreCase("G")) {
                if (!(rxqVar instanceof rwr)) {
                    return false;
                }
            } else if (!str.equals(rxqVar.getClass().getSimpleName().toLowerCase(Locale.US))) {
                return false;
            }
        }
        List<rvv> list3 = rwbVar.b;
        if (list3 != null) {
            for (rvv rvvVar : list3) {
                String str2 = rvvVar.a;
                if (str2 == "id") {
                    if (!rvvVar.b.equals(rxqVar.o)) {
                        return false;
                    }
                } else if (str2 != "class" || (list2 = rxqVar.s) == null || !list2.contains(rvvVar.b)) {
                    return false;
                }
            }
        }
        List list4 = rwbVar.c;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((String) it.next()).equals("first-child") || f(list, i, rxqVar) != 0) {
                return false;
            }
        }
        return true;
    }

    private static int f(List list, int i, rxq rxqVar) {
        if (i < 0) {
            return -1;
        }
        Object obj = list.get(i);
        rxo rxoVar = rxqVar.u;
        if (obj != rxoVar) {
            return -1;
        }
        Iterator it = rxoVar.n().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((rxs) it.next()) == rxqVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static boolean g(rwa rwaVar, int i, List list, int i2) {
        rwb rwbVarB = rwaVar.b(i);
        rxq rxqVar = (rxq) list.get(i2);
        if (!e(rwbVarB, list, i2, rxqVar)) {
            return false;
        }
        int i3 = rwbVarB.d;
        if (i3 != 1) {
            if (i3 == 2) {
                return g(rwaVar, i - 1, list, i2 - 1);
            }
            int iF = f(list, i2, rxqVar);
            if (iF <= 0) {
                return false;
            }
            return d(rwaVar, i - 1, list, i2, (rxq) rxqVar.u.n().get(iF - 1));
        }
        if (i == 0) {
            return true;
        }
        while (i2 > 0) {
            i2--;
            if (g(rwaVar, i - 1, list, i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x024f, code lost:
    
        if (r7 == 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0253, code lost:
    
        if (r11.a != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0255, code lost:
    
        r11.a = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x025c, code lost:
    
        r11.a.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0265, code lost:
    
        if (r19.q() == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0267, code lost:
    
        r3.add(r11);
        r11 = new defpackage.rwa();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x026f, code lost:
    
        r7 = r16;
        r8 = 0;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0277, code lost:
    
        r19.b = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0375 A[EDGE_INSN: B:235:0x0375->B:213:0x0375 BREAK  A[LOOP:1: B:161:0x029b->B:244:?, LOOP_LABEL: LOOP:0: B:3:0x0009->B:238:0x0009], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x024f A[EDGE_INSN: B:263:0x024f->B:142:0x024f BREAK  A[LOOP:6: B:71:0x012d->B:268:0x012d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0133  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [rwb] */
    /* JADX WARN: Type inference failed for: r7v16, types: [rwb] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [rwb] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rvz a(defpackage.rvw r19) throws org.xml.sax.SAXException {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwc.a(rvw):rvz");
    }
}
