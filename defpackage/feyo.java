package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyo {
    public String a;
    public String d;
    public final List f;
    public List g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;

    public feyo() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    private final int d() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        char[] cArr = feyq.a;
        String str = this.a;
        str.getClass();
        return feyp.a(str);
    }

    public final feyq a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        char[] cArr = feyq.a;
        String strC = feyp.c(this.b, 0, 0, false, 7);
        String strC2 = feyp.c(this.c, 0, 0, false, 7);
        String str2 = this.d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iD = d();
        List list = this.f;
        ArrayList arrayList2 = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(feyp.c((String) it.next(), 0, 0, false, 7));
        }
        List<String> list2 = this.g;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(fcva.p(list2, 10));
            for (String str3 : list2) {
                arrayList3.add(str3 != null ? feyp.c(str3, 0, 0, true, 3) : null);
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new feyq(str, strC, strC2, str2, iD, arrayList2, arrayList, str4 != null ? feyp.c(str4, 0, 0, false, 7) : null, toString());
    }

    public final void b(String str) {
        List listD;
        if (str != null) {
            char[] cArr = feyq.a;
            listD = feyp.d(feyp.e(str, 0, 0, " \"'<>#", true, false, true, false, 211));
        } else {
            listD = null;
        }
        this.g = listD;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.feyq r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feyo.c(feyq, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feyo.toString():java.lang.String");
    }
}
