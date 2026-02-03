package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ixl {
    public static int a(ixm ixmVar, ivu ivuVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ivc((ivt) list.get(i2), 2, 2));
        }
        return ixmVar.e(new ivw(ivuVar, ivuVar.q()), arrayList, kim.k(0, i, 0, 13)).j();
    }

    public static int b(ixm ixmVar, ivu ivuVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ivc((ivt) list.get(i2), 2, 1));
        }
        return ixmVar.e(new ivw(ivuVar, ivuVar.q()), arrayList, kim.k(0, 0, i, 7)).k();
    }

    public static int c(ixm ixmVar, ivu ivuVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ivc((ivt) list.get(i2), 1, 2));
        }
        return ixmVar.e(new ivw(ivuVar, ivuVar.q()), arrayList, kim.k(0, i, 0, 13)).j();
    }

    public static int d(ixm ixmVar, ivu ivuVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ivc((ivt) list.get(i2), 1, 1));
        }
        return ixmVar.e(new ivw(ivuVar, ivuVar.q()), arrayList, kim.k(0, 0, i, 7)).k();
    }
}
