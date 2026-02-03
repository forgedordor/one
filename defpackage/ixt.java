package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ixt {
    public static int a(ixu ixuVar, ivu ivuVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new ivc((ivt) list2.get(i3), 2, 2));
            }
            arrayList.add(arrayList2);
        }
        return ixuVar.e(new ivw(ivuVar, ivuVar.q()), arrayList, kim.k(0, i, 0, 13)).j();
    }

    public static int b(ixu ixuVar, ivu ivuVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new ivc((ivt) list2.get(i3), 2, 1));
            }
            arrayList.add(arrayList2);
        }
        return ixuVar.e(new ivw(ivuVar, ivuVar.q()), arrayList, kim.k(0, 0, i, 7)).k();
    }

    public static int c(ixu ixuVar, ivu ivuVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new ivc((ivt) list2.get(i3), 1, 2));
            }
            arrayList.add(arrayList2);
        }
        return ixuVar.e(new ivw(ivuVar, ivuVar.q()), arrayList, kim.k(0, i, 0, 13)).j();
    }

    public static int d(ixu ixuVar, ivu ivuVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new ivc((ivt) list2.get(i3), 1, 1));
            }
            arrayList.add(arrayList2);
        }
        return ixuVar.e(new ivw(ivuVar, ivuVar.q()), arrayList, kim.k(0, 0, i, 7)).k();
    }
}
