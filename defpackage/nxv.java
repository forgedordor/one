package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nxv implements nva {
    private final List a;
    private final long[] b;
    private final long[] c;

    public nxv(List list) {
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.b = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            nxl nxlVar = (nxl) list.get(i);
            long[] jArr = this.b;
            int i2 = i + i;
            jArr[i2] = nxlVar.b;
            jArr[i2 + 1] = nxlVar.c;
        }
        long[] jArr2 = this.b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // defpackage.nva
    public final int a() {
        return this.c.length;
    }

    @Override // defpackage.nva
    public final int b(long j) {
        long[] jArr = this.c;
        int iAk = mgb.ak(jArr, j, false);
        if (iAk < jArr.length) {
            return iAk;
        }
        return -1;
    }

    @Override // defpackage.nva
    public final long c(int i) {
        mee.a(i >= 0);
        long[] jArr = this.c;
        mee.a(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.nva
    public final List e(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.b;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                nxl nxlVar = (nxl) list.get(i);
                mdu mduVar = nxlVar.a;
                if (mduVar.y == -3.4028235E38f) {
                    arrayList2.add(nxlVar);
                } else {
                    arrayList.add(mduVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new Comparator() { // from class: nxu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((nxl) obj).b, ((nxl) obj2).b);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            mdt mdtVar = new mdt(((nxl) arrayList2.get(i3)).a);
            mdtVar.c((-1) - i3, 1);
            arrayList.add(mdtVar.a());
        }
        return arrayList;
    }
}
