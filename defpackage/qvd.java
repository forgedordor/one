package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qvd implements qwi {
    public static final qvd a = new qvd();

    private qvd() {
    }

    @Override // defpackage.qwi
    public final /* bridge */ /* synthetic */ Object a(qwn qwnVar, float f) {
        boolean z = qwnVar.q() == 1;
        if (z) {
            qwnVar.h();
        }
        double dA = qwnVar.a();
        double dA2 = qwnVar.a();
        double dA3 = qwnVar.a();
        double dA4 = qwnVar.q() == 7 ? qwnVar.a() : 1.0d;
        if (z) {
            qwnVar.j();
        }
        if (dA <= 1.0d && dA2 <= 1.0d && dA3 <= 1.0d) {
            dA *= 255.0d;
            dA2 *= 255.0d;
            dA3 *= 255.0d;
            if (dA4 <= 1.0d) {
                dA4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dA4, (int) dA, (int) dA2, (int) dA3));
    }
}
