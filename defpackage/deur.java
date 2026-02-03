package defpackage;

import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deur {
    public static denz a(deuq deuqVar) {
        denz denzVar = new denz();
        for (deva devaVar : deuqVar.a.b) {
            List list = deuqVar.b;
            String str = devaVar.c;
            deuz deuzVar = devaVar.d;
            if (deuzVar == null) {
                deuzVar = deuz.a;
            }
            d(list, denzVar, str, deuzVar);
        }
        return denzVar;
    }

    public static deuq b(denz denzVar) {
        ArrayList arrayList = new ArrayList();
        deus deusVar = (deus) devb.a.createBuilder();
        TreeSet treeSet = new TreeSet(denzVar.f());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object objD = denzVar.d(str);
            deut deutVar = (deut) deva.a.createBuilder();
            deutVar.copyOnWrite();
            deva devaVar = (deva) deutVar.instance;
            str.getClass();
            devaVar.b |= 1;
            devaVar.c = str;
            deuz deuzVarC = c(arrayList, objD);
            deutVar.copyOnWrite();
            deva devaVar2 = (deva) deutVar.instance;
            deuzVarC.getClass();
            devaVar2.d = deuzVarC;
            devaVar2.b |= 2;
            arrayList2.add((deva) deutVar.build());
        }
        deusVar.copyOnWrite();
        devb devbVar = (devb) deusVar.instance;
        evtg evtgVar = devbVar.b;
        if (!evtgVar.c()) {
            devbVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(arrayList2, devbVar.b);
        return new deuq((devb) deusVar.build(), arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.deuz c(java.util.List r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deur.c(java.util.List, java.lang.Object):deuz");
    }

    private static void d(List list, denz denzVar, String str, deuz deuzVar) {
        int i;
        int iA;
        int iA2;
        int iA3;
        int iA4 = deuw.a(deuzVar.c);
        if (iA4 == 0) {
            iA4 = 1;
        }
        if (iA4 == 14) {
            denzVar.n(str, null);
            return;
        }
        deuy deuyVar = deuzVar.d;
        if (deuyVar == null) {
            deuyVar = deuy.a;
        }
        if (iA4 == 1) {
            denzVar.j(str, deuyVar.c.I());
            return;
        }
        if (iA4 == 11) {
            denzVar.a.put(str, (String[]) deuyVar.m.toArray(new String[0]));
            return;
        }
        if (iA4 == 12) {
            denzVar.a.put(str, eonh.e(deuyVar.n));
            return;
        }
        if (iA4 == 15) {
            Object[] array = deuyVar.o.toArray();
            int length = array.length;
            float[] fArr = new float[length];
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = array[i2];
                obj.getClass();
                fArr[i2] = ((Number) obj).floatValue();
            }
            denzVar.a.put(str, fArr);
            return;
        }
        if (iA4 == 2) {
            denzVar.n(str, deuyVar.d);
            return;
        }
        if (iA4 == 3) {
            denzVar.a.put(str, Double.valueOf(deuyVar.e));
            return;
        }
        if (iA4 == 4) {
            denzVar.a.put(str, Float.valueOf(deuyVar.f));
            return;
        }
        if (iA4 == 5) {
            denzVar.m(str, deuyVar.g);
            return;
        }
        if (iA4 == 6) {
            denzVar.l(str, deuyVar.h);
            return;
        }
        if (iA4 == 7) {
            denzVar.i(str, (byte) deuyVar.i);
            return;
        }
        if (iA4 == 8) {
            denzVar.h(str, deuyVar.j);
            return;
        }
        if (iA4 == 13) {
            denzVar.g(str, (Asset) list.get((int) deuyVar.p));
            return;
        }
        if (iA4 == 9) {
            denz denzVar2 = new denz();
            for (deva devaVar : deuyVar.k) {
                try {
                    String str2 = devaVar.c;
                    deuz deuzVar2 = devaVar.d;
                    if (deuzVar2 == null) {
                        deuzVar2 = deuz.a;
                    }
                    d(list, denzVar2, str2, deuzVar2);
                } catch (RuntimeException e) {
                    throw new RuntimeException("DataBundle parse error for: ".concat(String.valueOf(str)), e);
                }
            }
            denzVar.a.put(str, denzVar2);
            return;
        }
        if (iA4 != 10) {
            throw new RuntimeException("populateBundle: unexpected type ".concat(Integer.toString(iA4)));
        }
        do {
            int iA5 = 14;
            for (deuz deuzVar3 : deuyVar.l) {
                if (iA5 == 14) {
                    i = deuzVar3.c;
                    int iA6 = deuw.a(i);
                    if ((iA6 == 0 || iA6 != 9) && (((iA = deuw.a(i)) == 0 || iA != 2) && ((iA2 = deuw.a(i)) == 0 || iA2 != 6))) {
                        iA3 = deuw.a(i);
                        if (iA3 == 0) {
                            break;
                        }
                    } else {
                        iA5 = deuw.a(i);
                        if (iA5 == 0) {
                            iA5 = 1;
                        }
                    }
                } else {
                    int iA7 = deuw.a(deuzVar3.c);
                    if (iA7 == 0) {
                        iA7 = 1;
                    }
                    if (iA7 != iA5) {
                        String string = Integer.toString(iA5);
                        int iA8 = deuw.a(deuzVar3.c);
                        throw new IllegalArgumentException("The ArrayList elements should all be the same type, but ArrayList with key " + str + " contains items of type " + string + " and " + Integer.toString(iA8 != 0 ? iA8 : 1));
                    }
                }
            }
            ArrayList arrayList = new ArrayList(deuyVar.l.size());
            for (deuz deuzVar4 : deuyVar.l) {
                int iA9 = deuw.a(deuzVar4.c);
                if (iA9 != 0 && iA9 == 14) {
                    arrayList.add(null);
                } else if (iA5 == 9) {
                    denz denzVar3 = new denz();
                    deuy deuyVar2 = deuzVar4.d;
                    if (deuyVar2 == null) {
                        deuyVar2 = deuy.a;
                    }
                    for (deva devaVar2 : deuyVar2.k) {
                        String str3 = devaVar2.c;
                        deuz deuzVar5 = devaVar2.d;
                        if (deuzVar5 == null) {
                            deuzVar5 = deuz.a;
                        }
                        d(list, denzVar3, str3, deuzVar5);
                    }
                    arrayList.add(denzVar3);
                } else if (iA5 == 2) {
                    deuy deuyVar3 = deuzVar4.d;
                    if (deuyVar3 == null) {
                        deuyVar3 = deuy.a;
                    }
                    arrayList.add(deuyVar3.d);
                } else {
                    if (iA5 != 6) {
                        throw new IllegalArgumentException("Unexpected typeOfArrayList: ".concat(Integer.toString(iA5)));
                    }
                    deuy deuyVar4 = deuzVar4.d;
                    if (deuyVar4 == null) {
                        deuyVar4 = deuy.a;
                    }
                    arrayList.add(Integer.valueOf(deuyVar4.h));
                }
            }
            if (iA5 == 14) {
                denzVar.o(str, arrayList);
                return;
            }
            if (iA5 == 9) {
                denzVar.k(str, arrayList);
                return;
            } else if (iA5 == 2) {
                denzVar.o(str, arrayList);
                return;
            } else {
                if (iA5 != 6) {
                    throw new IllegalStateException("Unexpected typeOfArrayList: ".concat(Integer.toString(iA5)));
                }
                denzVar.a.put(str, arrayList);
                return;
            }
        } while (iA3 == 14);
        int iA10 = deuw.a(i);
        throw new IllegalArgumentException(a.n(str, Integer.toString(iA10 != 0 ? iA10 : 1), "Unexpected TypedValue type: ", " for key "));
    }
}
