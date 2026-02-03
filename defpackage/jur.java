package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jur {
    public static final juo a = new juo("");

    public static final List a(juo juoVar, int i, int i2, fdap fdapVar) {
        List list;
        if (i == i2 || (list = juoVar.a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0) {
            if (i2 >= juoVar.b.length()) {
                if (fdapVar == null) {
                    return list;
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i3 < size) {
                    Object obj = list.get(i3);
                    if (((Boolean) fdapVar.invoke(((jum) obj).a)).booleanValue()) {
                        arrayList.add(obj);
                    }
                    i3++;
                }
                return arrayList;
            }
            i = 0;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            jum jumVar = (jum) list.get(i3);
            if (fdapVar == null || ((Boolean) fdapVar.invoke(jumVar.a)).booleanValue()) {
                int i4 = jumVar.b;
                int i5 = jumVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new jum((jui) jumVar.a, fddu.i(i4, i, i2) - i, fddu.i(i5, i, i2) - i, jumVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
