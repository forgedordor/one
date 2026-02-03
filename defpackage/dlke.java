package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlke implements fdax {
    public static final dlke a = new dlke();

    @Override // defpackage.fdax
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        hml hmlVar;
        dlim dlimVarA;
        dlih dlihVar;
        long j;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        dtic dticVar = (dtic) obj2;
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        hml hmlVar2 = (hml) obj5;
        ((Number) obj6).intValue();
        dticVar.getClass();
        hmlVar2.v(20658371);
        hpt hptVar = dlio.a;
        if (zBooleanValue) {
            long j2 = dticVar.m;
            long j3 = dticVar.h;
            long j4 = dticVar.ae;
            long j5 = dticVar.p;
            long j6 = dticVar.n;
            long j7 = dticVar.X;
            long jC = dticVar.Y;
            float[] fArr = {0.0f, 0.0f, f};
            kzb.j(ijg.b(jC), fArr);
            float f = fArr[2] + 0.03f;
            if (f <= 1.0f) {
                jC = ijg.c(kzb.c(fArr));
            }
            dlij dlijVar = new dlij(j2, j3, j4, j5, j6, j3, j7, jC, j3, dticVar.U, j5);
            long j8 = dticVar.aa;
            long j9 = dticVar.Z;
            dljj dljjVar = dljk.b;
            dlih dlihVar2 = new dlih(ijg.c(kzb.e(ijg.b(j8), ijg.b(j9), 0.4f)), ijg.c(kzb.e(ijg.b(j8), ijg.b(j9), 0.7f)), ijg.c(kzb.e(ijg.b(j8), ijg.b(j9), 0.8f)));
            long j10 = dticVar.s;
            long j11 = dticVar.T;
            long jD = ijg.d(4294756660L);
            long jD2 = ijg.d(4294372010L);
            long jD3 = ijg.d(4280229663L);
            long j12 = ije.d;
            long jF = ijg.f(ije.d(j10), ije.c(j10), ije.b(j10), 0.6f, ije.f(j10));
            long jD4 = ijg.d(4293814108L);
            long jD5 = ijg.d(4280295716L);
            long jC2 = ijg.c(452114613);
            long jD6 = ijg.d(4279440148L);
            long jD7 = ijg.d(4293125091L);
            long jE = ijg.e(96, 20, 16, 255);
            long jD8 = ijg.d(4281230558L);
            long jD9 = ijg.d(4282159075L);
            long jD10 = ijg.d(4288183273L);
            long jD11 = ijg.d(4294306808L);
            long jD12 = ijg.d(4291607039L);
            long jD13 = ijg.d(4289842940L);
            long jD14 = ijg.d(4294306808L);
            long jD15 = ijg.d(4282549748L);
            long jD16 = ijg.d(4288377547L);
            long jD17 = ijg.d(4292437360L);
            long jF2 = ijg.f(ije.d(j11), ije.c(j11), ije.b(j11), 0.52f, ije.f(j11));
            long jD18 = ijg.d(4284201332L);
            long jD19 = ijg.d(4279440148L);
            long jD20 = ijg.d(4293814108L);
            long jD21 = ijg.d(4279440148L);
            long j13 = dticVar.q;
            if (!zBooleanValue3 || Build.VERSION.SDK_INT < 34) {
                dlihVar = dlihVar2;
                j = dticVar.J;
            } else {
                dlihVar = dlihVar2;
                j = j6;
            }
            hmlVar = hmlVar2;
            dlimVarA = new dlim(dticVar, dlijVar, dljjVar, dlihVar, jD, j5, jD2, j5, jD3, j12, jF, true, zBooleanValue2, jD4, jD5, jC2, jD6, jD7, jE, jD8, jD9, jD10, jD11, jD12, jD13, jD15, jD16, jD17, jD14, jF2, jD18, jD19, jD20, jD21, j13, j);
        } else {
            hmlVar = hmlVar2;
            dlimVarA = dlio.a(dticVar, zBooleanValue2, zBooleanValue3);
        }
        hmlVar.o();
        return dlimVarA;
    }
}
