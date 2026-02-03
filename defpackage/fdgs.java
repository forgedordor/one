package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fdgs extends fdgo {
    public static final String b(String str) {
        int length;
        Comparable comparable;
        List listF = fdgn.F(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (!fdgn.H((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!fdfv.a(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listF.size();
        fdap fdapVarF = f();
        int iE = fcva.e(listF);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listF) {
            int i = length + 1;
            if (length < 0) {
                fcva.m();
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iE) && fdgn.H(str3)) {
                str3 = null;
            } else {
                String str4 = (String) fdapVarF.invoke(fdgn.Y(str3, iIntValue));
                if (str4 != null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        fcva.aI(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static final String c(String str, String str2) {
        if (fdgn.H(str2)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listF = fdgn.F(str);
        listF.size();
        fdap fdapVarF = f();
        int iE = fcva.e(listF);
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        int i = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(str.length());
                fcva.aI(arrayList, sb, null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                fcva.m();
            }
            String str3 = (String) next;
            if ((i != 0 && i != iE) || !fdgn.H(str3)) {
                int length = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!fdfv.a(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && fdgn.m(str3, str2, i3, false)) {
                    int length2 = i3 + str2.length();
                    str3.getClass();
                    strSubstring = str3.substring(length2);
                    strSubstring.getClass();
                }
                if (strSubstring == null || (strSubstring = (String) fdapVarF.invoke(strSubstring)) == null) {
                    strSubstring = str3;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
    }

    private static final fdap f() {
        return "".length() == 0 ? new fdap() { // from class: fdgq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                return str;
            }
        } : new fdap() { // from class: fdgr
            public final /* synthetic */ String a = "";

            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                return this.a.concat(str);
            }
        };
    }
}
