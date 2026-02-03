package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qvp {
    private static final qwl a = qwl.a("x", "y");

    static float a(qwn qwnVar) {
        int iQ = qwnVar.q();
        int i = iQ - 1;
        if (i != 0) {
            if (i == 6) {
                return (float) qwnVar.a();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(qwm.a(iQ)));
        }
        qwnVar.h();
        float fA = (float) qwnVar.a();
        while (qwnVar.o()) {
            qwnVar.n();
        }
        qwnVar.j();
        return fA;
    }

    static int b(qwn qwnVar) {
        qwnVar.h();
        double dA = qwnVar.a() * 255.0d;
        double dA2 = qwnVar.a() * 255.0d;
        double dA3 = qwnVar.a() * 255.0d;
        while (qwnVar.o()) {
            qwnVar.n();
        }
        int i = (int) dA2;
        int i2 = (int) dA;
        qwnVar.j();
        return Color.argb(255, i2, i, (int) dA3);
    }

    static PointF c(qwn qwnVar, float f) {
        int iQ = qwnVar.q() - 1;
        if (iQ == 0) {
            qwnVar.h();
            float fA = (float) qwnVar.a();
            float fA2 = (float) qwnVar.a();
            while (qwnVar.q() != 2) {
                qwnVar.n();
            }
            qwnVar.j();
            return new PointF(fA * f, fA2 * f);
        }
        if (iQ != 2) {
            if (iQ != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(qwm.a(qwnVar.q())));
            }
            float fA3 = (float) qwnVar.a();
            float fA4 = (float) qwnVar.a();
            while (qwnVar.o()) {
                qwnVar.n();
            }
            return new PointF(fA3 * f, fA4 * f);
        }
        qwnVar.i();
        float fA5 = 0.0f;
        float fA6 = 0.0f;
        while (qwnVar.o()) {
            int iC = qwnVar.c(a);
            if (iC == 0) {
                fA5 = a(qwnVar);
            } else if (iC != 1) {
                qwnVar.m();
                qwnVar.n();
            } else {
                fA6 = a(qwnVar);
            }
        }
        qwnVar.k();
        return new PointF(fA5 * f, fA6 * f);
    }

    static List d(qwn qwnVar, float f) {
        ArrayList arrayList = new ArrayList();
        qwnVar.h();
        while (qwnVar.q() == 1) {
            qwnVar.h();
            arrayList.add(c(qwnVar, f));
            qwnVar.j();
        }
        qwnVar.j();
        return arrayList;
    }
}
