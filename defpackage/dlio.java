package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlio {
    public static final hpt a = new hnz(hsi.a, new fdae() { // from class: dlin
        @Override // defpackage.fdae
        public final Object invoke() {
            hpt hptVar = dlio.a;
            return dlio.a(dtid.a, false, false);
        }
    });

    public static final dlim a(dtic dticVar, boolean z, boolean z2) {
        long j;
        dticVar.getClass();
        long j2 = dticVar.W;
        long jA = dlik.a(dticVar.V);
        long jA2 = dlik.a(j2);
        long j3 = dticVar.a;
        long j4 = dticVar.Y;
        long j5 = dticVar.P;
        long j6 = dticVar.g;
        long j7 = dticVar.ac;
        long j8 = dticVar.e;
        long j9 = dticVar.p;
        dlij dlijVar = new dlij(j8, j9, j7, j9, j6, j9, jA, jA2, j3, j4, j5);
        dljj dljjVar = dljk.a;
        dticVar.getClass();
        long j10 = dticVar.R;
        long j11 = dticVar.S;
        long jC = ijg.c(kzb.e(ijg.b(j11), ijg.b(j10), 0.4f));
        float[] fArr = new float[3];
        kzb.j(ijg.b(j10), fArr);
        float fMax = Math.max(fArr[2], 0.9f);
        dlih dlihVar = new dlih(dlii.a(j10, fMax), dlii.a(jC, (-0.04f) + fMax), dlii.a(j11, fMax - 0.06f));
        long j12 = dticVar.s;
        long jD = ijg.d(4294756660L);
        long jD2 = ijg.d(4294372010L);
        long jD3 = ijg.d(4280229663L);
        long j13 = ije.d;
        long jF = ijg.f(ije.d(j12), ije.c(j12), ije.b(j12), 0.6f, ije.f(j12));
        long jD4 = ijg.d(4293542709L);
        long jE = ijg.e(255, 0, 0, 10);
        long jD5 = ijg.d(4284441448L);
        long jE2 = ijg.e(252, 238, 238, 255);
        long jD6 = ijg.d(4292339455L);
        long jD7 = ijg.d(4291290367L);
        long jD8 = ijg.d(4292666111L);
        long jD9 = ijg.d(4285746081L);
        long jD10 = ijg.d(4291607039L);
        long jD11 = ijg.d(4289842940L);
        long jD12 = ijg.d(4280229663L);
        long jD13 = ijg.d(4282549748L);
        long jD14 = ijg.d(4288377547L);
        long jD15 = ijg.d(4292437360L);
        long jF2 = ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.52f, ije.f(j2));
        long jD16 = ijg.d(4280192574L);
        long jD17 = ijg.d(4292423717L);
        if (z2) {
            j = Build.VERSION.SDK_INT >= 34 ? dticVar.c : dticVar.v;
        } else {
            j = j3;
        }
        return new dlim(dticVar, dlijVar, dljjVar, dlihVar, jD, j9, jD2, j9, jD3, j13, jF, false, z, jD4, j13, jE, j13, jD5, jE2, jD6, jD7, jD8, jD9, jD10, jD11, jD13, jD14, jD15, jD12, jF2, jD16, j3, jD17, j3, dticVar.b, j);
    }
}
