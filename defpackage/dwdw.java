package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwdw {
    public static int a(eyax eyaxVar) {
        int iD = d(eyaxVar.c);
        int iD2 = d(eyaxVar.d);
        int iD3 = d(eyaxVar.e);
        if ((eyaxVar.b & 1) == 0) {
            return Color.rgb(iD, iD2, iD3);
        }
        evsc evscVar = eyaxVar.f;
        if (evscVar == null) {
            evscVar = evsc.a;
        }
        return Color.argb(d(evscVar.b), iD, iD2, iD3);
    }

    public static eyax b(int i) {
        eyaw eyawVar = (eyaw) eyax.a.createBuilder();
        float fC = c(Color.red(i));
        eyawVar.copyOnWrite();
        ((eyax) eyawVar.instance).c = fC;
        float fC2 = c(Color.green(i));
        eyawVar.copyOnWrite();
        ((eyax) eyawVar.instance).d = fC2;
        float fC3 = c(Color.blue(i));
        eyawVar.copyOnWrite();
        ((eyax) eyawVar.instance).e = fC3;
        evsb evsbVar = (evsb) evsc.a.createBuilder();
        float fC4 = c(Color.alpha(i));
        evsbVar.copyOnWrite();
        ((evsc) evsbVar.instance).b = fC4;
        eyawVar.copyOnWrite();
        eyax eyaxVar = (eyax) eyawVar.instance;
        evsc evscVar = (evsc) evsbVar.build();
        evscVar.getClass();
        eyaxVar.f = evscVar;
        eyaxVar.b |= 1;
        return (eyax) eyawVar.build();
    }

    private static float c(int i) {
        return i / 255.0f;
    }

    private static int d(float f) {
        if (f <= 1.0f) {
            f *= 255.0f;
        }
        int i = (int) f;
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }
}
