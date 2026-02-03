package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjv {
    public static final lty a(lty ltyVar, float[] fArr) {
        return ltyVar.d(new hju(fArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ikd b(ltr ltrVar, float f, ikd ikdVar, boolean z, float f2, float f3, int i) {
        ltb ltbVar = null;
        ikd iikVar = (i & 2) != 0 ? new iik((byte[]) (0 == true ? 1 : 0)) : ikdVar;
        int i2 = (i & 4) != 0 ? 270 : 0;
        boolean z2 = ((i & 8) == 0) & z;
        boolean z3 = (i & 16) != 0;
        float f4 = (i & 32) != 0 ? 0.0f : f2;
        float f5 = (i & 64) == 0 ? f3 : 0.0f;
        fcww fcwwVar = new fcww((byte[]) null);
        List list = ltrVar.a;
        int size = list.size();
        ltb ltbVar2 = null;
        int i3 = 0;
        while (i3 < size) {
            float[] fArr = new float[8];
            int i4 = 0;
            for (int i5 = 8; i4 < i5; i5 = 8) {
                fArr[i4] = lub.b(((ltb) ((fcti) list.get(i3)).a).a[i4], ((ltb) ((fcti) list.get(i3)).b).a[i4], f);
                i4++;
                iikVar = iikVar;
            }
            ikd ikdVar2 = iikVar;
            ltb ltbVar3 = new ltb(fArr);
            if (ltbVar2 == null) {
                ltbVar2 = ltbVar3;
            }
            if (ltbVar != null) {
                fcwwVar.add(ltbVar);
            }
            i3++;
            ltbVar = ltbVar3;
            iikVar = ikdVar2;
        }
        ikd ikdVar3 = iikVar;
        if (ltbVar != null && ltbVar2 != null) {
            fcwwVar.add(ltc.a(ltbVar.a(), ltbVar.b(), ltbVar.e(), ltbVar.f(), ltbVar.g(), ltbVar.h(), ltbVar2.a(), ltbVar2.b()));
        }
        d(ikdVar3, i2, z2, z3, fcva.a(fcwwVar), f4, f5);
        return ikdVar3;
    }

    public static /* synthetic */ void c(lty ltyVar, ikd ikdVar, boolean z, int i) {
        if ((i & 1) != 0) {
            ikdVar = new iik((byte[]) null);
        }
        d(ikdVar, (i & 2) != 0 ? 270 : 0, ((i & 4) == 0) & z, true, ltyVar.b, ltyVar.a(), ltyVar.b());
    }

    private static final void d(ikd ikdVar, int i, boolean z, boolean z2, List list, float f, float f2) {
        ikdVar.l();
        fcww fcwwVar = (fcww) list;
        int i2 = fcwwVar.c;
        boolean z3 = true;
        ltb ltbVar = null;
        int i3 = 0;
        boolean z4 = true;
        while (i3 < i2) {
            ltb ltbVar2 = (ltb) list.get(i3);
            if (z4) {
                ikdVar.f(ltbVar2.a(), ltbVar2.b());
                if (i != 0) {
                    ltbVar = ltbVar2;
                }
            }
            ikdVar.d(ltbVar2.e(), ltbVar2.f(), ltbVar2.g(), ltbVar2.h(), ltbVar2.c(), ltbVar2.d());
            i3++;
            z4 = false;
        }
        if (z) {
            int i4 = fcwwVar.c;
            int i5 = 0;
            while (i5 < i4) {
                ltb ltbVar3 = (ltb) list.get(i5);
                if (z3) {
                    ikdVar.e(ltbVar3.a(), ltbVar3.b());
                }
                ikdVar.d(ltbVar3.e(), ltbVar3.f(), ltbVar3.g(), ltbVar3.h(), ltbVar3.c(), ltbVar3.d());
                i5++;
                z3 = false;
            }
        }
        if (z2) {
            ikdVar.c();
        }
        if (i == 0 || ltbVar == null) {
            return;
        }
        float fB = ((ltb) list.get(0)).b() - f2;
        float[] fArrF = iju.f();
        iju.d(fArrF, (-((float) ((((float) Math.atan2(fB, ((ltb) list.get(0)).a() - f)) * 180.0d) / 3.141592653589793d))) + i);
        ikdVar.n(fArrF);
    }
}
