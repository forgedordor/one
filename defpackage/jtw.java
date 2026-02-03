package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtw {
    public static final /* synthetic */ int a = 0;
    private static final Comparator[] b;
    private static final fdat c;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new jtv(new jtu(i == 0 ? jrx.a : jru.a, jcr.b));
            i++;
        }
        b = comparatorArr;
        c = jts.a;
    }

    public static final List a(jsl jslVar, fdap fdapVar, fdap fdapVar2, List list) {
        int i;
        ArrayList arrayList;
        cuh cuhVar = ctk.a;
        cuh cuhVar2 = new cuh((byte[]) null);
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            b((jsl) list.get(i2), arrayList2, fdapVar, fdapVar2, cuhVar2);
        }
        char c2 = jslVar.b.s == kji.b ? (char) 0 : (char) 1;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() / 2);
        int iE = fcva.e(arrayList2);
        if (iE >= 0) {
            int i3 = 0;
            while (true) {
                jsl jslVar2 = (jsl) arrayList2.get(i3);
                if (i3 != 0) {
                    float f = jslVar2.d().c;
                    float f2 = jslVar2.d().e;
                    int iE2 = fcva.e(arrayList3);
                    if (iE2 >= 0) {
                        int i4 = 0;
                        while (true) {
                            ihu ihuVar = (ihu) ((fcti) arrayList3.get(i4)).a;
                            float f3 = ihuVar.c;
                            i = 0;
                            float f4 = ihuVar.e;
                            if (f < f2 && f3 < f4 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList = arrayList2;
                                arrayList3.set(i4, new fcti(new ihu(Math.max(ihuVar.b, 0.0f), Math.max(f3, f), Math.min(ihuVar.d, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((fcti) arrayList3.get(i4)).b));
                                ((List) ((fcti) arrayList3.get(i4)).b).add(jslVar2);
                                break;
                            }
                            arrayList = arrayList2;
                            if (i4 == iE2) {
                                break;
                            }
                            i4++;
                            arrayList2 = arrayList;
                        }
                    } else {
                        arrayList = arrayList2;
                        i = 0;
                    }
                } else {
                    arrayList = arrayList2;
                    i = 0;
                    i3 = 0;
                }
                ihu ihuVarD = jslVar2.d();
                jsl[] jslVarArr = new jsl[1];
                jslVarArr[i] = jslVar2;
                arrayList3.add(new fcti(ihuVarD, fcva.i(jslVarArr)));
                if (i3 == iE) {
                    break;
                }
                i3++;
                arrayList2 = arrayList;
            }
        } else {
            i = 0;
        }
        fcva.s(arrayList3, jtx.a);
        ArrayList arrayList4 = new ArrayList();
        Comparator comparator = b[c2];
        int size2 = arrayList3.size();
        for (int i5 = i; i5 < size2; i5++) {
            Object obj = ((fcti) arrayList3.get(i5)).b;
            fcva.s((List) obj, comparator);
            arrayList4.addAll((Collection) obj);
        }
        final fdat fdatVar = c;
        fcva.s(arrayList4, new Comparator() { // from class: jtp
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                int i6 = jtw.a;
                return ((Number) fdatVar.a(obj2, obj3)).intValue();
            }
        });
        int size3 = i;
        while (size3 <= fcva.e(arrayList4)) {
            List list2 = (List) cuhVar2.a(((jsl) arrayList4.get(size3)).e);
            if (list2 != null) {
                if (((Boolean) fdapVar2.invoke(arrayList4.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList4.remove(size3);
                }
                arrayList4.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList4;
    }

    private static final void b(jsl jslVar, ArrayList arrayList, fdap fdapVar, fdap fdapVar2, cuh cuhVar) {
        boolean zBooleanValue = ((Boolean) jslVar.c.c(jte.m, jtt.a)).booleanValue();
        if (zBooleanValue || ((Boolean) fdapVar2.invoke(jslVar)).booleanValue()) {
            if (((Boolean) fdapVar.invoke(jslVar)).booleanValue()) {
                arrayList.add(jslVar);
            }
            if (zBooleanValue) {
                cuhVar.f(jslVar.e, a(jslVar, fdapVar, fdapVar2, jslVar.i()));
                return;
            }
        }
        List listI = jslVar.i();
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            b((jsl) listI.get(i), arrayList, fdapVar, fdapVar2, cuhVar);
        }
    }
}
