package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbcy {
    public static /* synthetic */ bbcz a(String str, String str2, String str3, String str4, crnc crncVar, crnc crncVar2, List list, List list2, fddf fddfVar, int i) {
        List list3 = (i & 4096) != 0 ? fcvo.a : list;
        List list4 = (i & 8192) != 0 ? fcvo.a : list2;
        list3.getClass();
        list4.getClass();
        List list5 = bbcz.b;
        list5.getClass();
        List listAp = fcva.ap(list5);
        for (int iE = fcva.e(listAp); iE > 0; iE--) {
            int iF = fddfVar.f(iE + 1);
            listAp.set(iF, listAp.set(iE, listAp.get(iF)));
        }
        int i2 = i & 256;
        int i3 = i & 8;
        int i4 = i & 4;
        int i5 = i & 2;
        int i6 = i & 1;
        crnc crncVar3 = (i & 1024) != 0 ? null : crncVar2;
        crnc crncVar4 = i2 != 0 ? null : crncVar;
        String str5 = i3 != 0 ? null : str4;
        String str6 = i4 != 0 ? null : str3;
        String str7 = i5 != 0 ? null : str2;
        String str8 = 1 == i6 ? null : str;
        List listAm = fcva.am(listAp, 10);
        return new bbcz(b(str8, listAm), b(str7, listAm), b(str6, listAm), b(str5, listAm), b(null, listAm), b(null, listAm), b(null, listAm), b(null, listAm), d(crncVar4, listAm), d(null, listAm), d(crncVar3, listAm), d(null, listAm), c(list3, listAm), c(list4, listAm));
    }

    private static final String b(String str, List list) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (bbcz.c.contains(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
            } else if (Character.isDigit(cCharAt)) {
                sb.append(((Character) list.get(fdfv.c(cCharAt))).charValue());
            } else {
                sb.append('x');
            }
        }
        return sb.toString();
    }

    private static final List c(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            crnc crncVar = (crnc) it.next();
            bbcy bbcyVar = bbcz.a;
            String strD = d(crncVar, list2);
            if (strD != null) {
                arrayList.add(strD);
            }
        }
        return arrayList;
    }

    private static final String d(crnc crncVar, List list) {
        return b(String.valueOf(crncVar), list);
    }
}
