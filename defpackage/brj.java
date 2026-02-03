package defpackage;

import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brj {
    private final bir a;
    private final Rational b;
    private final brk c;

    public brj(bir birVar, Size size) {
        Rational rational;
        this.a = birVar;
        birVar.b();
        birVar.a();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listO = birVar.o(256);
            if (listO.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listO, new bnv());
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.b = rational;
        this.c = new brk(birVar, rational);
    }

    static Rational a(int i, boolean z) {
        if (i == -1) {
            return null;
        }
        if (i == 0) {
            return z ? bno.a : bno.b;
        }
        if (i == 1) {
            return z ? bno.c : bno.d;
        }
        bbs.c("SupportedOutputSizesCollector", a.g(i, "Undefined target aspect ratio: "));
        return null;
    }

    static List b(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bno.a);
        arrayList.add(bno.c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                int size2 = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size2) {
                        arrayList.add(rational);
                        break;
                    }
                    boolean zA = bno.a(size, (Rational) arrayList.get(i));
                    i++;
                    if (zA) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    static Map d(List list) {
        HashMap map = new HashMap();
        Iterator it = b(list).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (bno.a(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    static void e(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            } else {
                arrayList.add(0, size3);
            }
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static List f(bvc bvcVar, List list, Size size, Rational rational) {
        Map mapD = d(list);
        Rational rationalA = a(bvcVar.a.b, rational == null || rational.getNumerator() >= rational.getDenominator());
        ArrayList arrayList = new ArrayList(mapD.keySet());
        Collections.sort(arrayList, new bnn(rationalA, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            Rational rational2 = (Rational) arrayList.get(i);
            linkedHashMap.put(rational2, (List) mapD.get(rational2));
        }
        if (size != null) {
            int iA = bsd.a(size);
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                List<Size> list2 = (List) linkedHashMap.get((Rational) it.next());
                ArrayList arrayList2 = new ArrayList();
                for (Size size3 : list2) {
                    if (bsd.a(size3) <= iA) {
                        arrayList2.add(size3);
                    }
                }
                list2.clear();
                list2.addAll(arrayList2);
            }
        }
        bvd bvdVar = bvcVar.b;
        if (bvdVar != null) {
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (it2.hasNext()) {
                List list3 = (List) linkedHashMap.get((Rational) it2.next());
                if (!list3.isEmpty()) {
                    int i2 = bvdVar.c;
                    Integer numValueOf = Integer.valueOf(i2);
                    if (!bvdVar.equals(bvd.a)) {
                        Size size4 = bvdVar.b;
                        numValueOf.getClass();
                        if (i2 == 0) {
                            boolean zContains = list3.contains(size4);
                            list3.clear();
                            if (zContains) {
                                list3.add(size4);
                            }
                        } else if (i2 == 1) {
                            e(list3, size4, true);
                        } else if (i2 == 2) {
                            e(list3, size4, false);
                        } else if (i2 != 3) {
                            g(list3, size4, false);
                        } else {
                            g(list3, size4, true);
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            for (Size size5 : (List) it3.next()) {
                if (!arrayList3.contains(size5)) {
                    arrayList3.add(size5);
                }
            }
        }
        bvb bvbVar = bvcVar.c;
        return arrayList3;
    }

    private static void g(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c(defpackage.bni r15) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brj.c(bni):java.util.List");
    }
}
