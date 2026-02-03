package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qvw implements qwi {
    public static final qvw a = new qvw();

    private qvw() {
    }

    @Override // defpackage.qwi
    public final /* bridge */ /* synthetic */ Object a(qwn qwnVar, float f) {
        int iQ = qwnVar.q();
        if (iQ == 1) {
            return qvp.c(qwnVar, f);
        }
        if (iQ == 3) {
            return qvp.c(qwnVar, f);
        }
        if (iQ != 7) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(qwm.a(iQ)));
        }
        PointF pointF = new PointF(((float) qwnVar.a()) * f, ((float) qwnVar.a()) * f);
        while (qwnVar.o()) {
            qwnVar.n();
        }
        return pointF;
    }
}
