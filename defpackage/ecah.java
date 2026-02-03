package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecah {
    public static final String[] a = new String[0];

    public static void a(ebzv ebzvVar, int i, ecak ecakVar) {
        ArrayList<ebzu> arrayList;
        ArrayList arrayList2;
        ecakVar.a(i + i);
        ecakVar.println(ebzvVar.c());
        int i2 = i + 1;
        if (i2 > 3) {
            ecakVar.a(8);
            ecakVar.println("...");
            return;
        }
        ecaq ecaqVar = ecaf.a;
        List listD = ebzvVar.d();
        if (listD == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList3 = new ArrayList(listD);
            Collections.sort(arrayList3, new Comparator() { // from class: ecaa
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    ecaq ecaqVar2 = ecaf.a;
                    return ((ebzu) obj).b().toLowerCase(Locale.ENGLISH).compareTo(((ebzu) obj2).b().toLowerCase(Locale.ENGLISH));
                }
            });
            arrayList = arrayList3;
        }
        for (ebzu ebzuVar : arrayList) {
            ecakVar.a(i2 + i2);
            ecakVar.println(ebzuVar.b());
        }
        List listE = ebzvVar.e();
        if (listE == null) {
            arrayList2 = new ArrayList();
        } else {
            ArrayList arrayList4 = new ArrayList(listE);
            Collections.sort(arrayList4, new Comparator() { // from class: ebzz
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    ecaq ecaqVar2 = ecaf.a;
                    return ((ebzv) obj).c().toLowerCase(Locale.ENGLISH).compareTo(((ebzv) obj2).c().toLowerCase(Locale.ENGLISH));
                }
            });
            arrayList2 = arrayList4;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a((ebzv) it.next(), i2, ecakVar);
        }
    }

    public static String[] b(ListIterator listIterator) {
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasNext()) {
            arrayList.add((String) listIterator.next());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static final ebzv c(ListIterator listIterator, ebzv ebzvVar) {
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            ebzv ebzvVarB = ecaf.b(ebzvVar, (String) listIterator.next());
            if (ebzvVarB == null) {
                listIterator.previous();
                break;
            }
            ebzvVar = ebzvVarB;
        }
        return ebzvVar;
    }
}
