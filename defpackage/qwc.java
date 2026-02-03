package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwc implements qwi {
    public static final qwc a = new qwc();
    private static final qwl b = qwl.a("c", "v", "i", "o");

    private qwc() {
    }

    @Override // defpackage.qwi
    public final /* bridge */ /* synthetic */ Object a(qwn qwnVar, float f) {
        if (qwnVar.q() == 1) {
            qwnVar.h();
        }
        qwnVar.i();
        List listD = null;
        List listD2 = null;
        List listD3 = null;
        boolean zP = false;
        while (qwnVar.o()) {
            int iC = qwnVar.c(b);
            if (iC == 0) {
                zP = qwnVar.p();
            } else if (iC == 1) {
                listD = qvp.d(qwnVar, f);
            } else if (iC == 2) {
                listD2 = qvp.d(qwnVar, f);
            } else if (iC != 3) {
                qwnVar.m();
                qwnVar.n();
            } else {
                listD3 = qvp.d(qwnVar, f);
            }
        }
        qwnVar.k();
        if (qwnVar.q() == 2) {
            qwnVar.j();
        }
        if (listD == null || listD2 == null || listD3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listD.isEmpty()) {
            return new qty(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listD.size();
        PointF pointF = (PointF) listD.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) listD.get(i);
            int i2 = i - 1;
            arrayList.add(new qsp(qwu.c((PointF) listD.get(i2), (PointF) listD3.get(i2)), qwu.c(pointF2, (PointF) listD2.get(i)), pointF2));
        }
        if (zP) {
            PointF pointF3 = (PointF) listD.get(0);
            int i3 = size - 1;
            arrayList.add(new qsp(qwu.c((PointF) listD.get(i3), (PointF) listD3.get(i3)), qwu.c(pointF3, (PointF) listD2.get(0)), pointF3));
        }
        return new qty(pointF, zP, arrayList);
    }
}
