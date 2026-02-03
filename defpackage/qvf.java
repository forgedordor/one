package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qvf implements qwi {
    public static final qvf a = new qvf();
    private static final qwl b = qwl.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private qvf() {
    }

    @Override // defpackage.qwi
    public final /* bridge */ /* synthetic */ Object a(qwn qwnVar, float f) {
        qwnVar.i();
        String strG = null;
        String strG2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float fA4 = 0.0f;
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        int i = 3;
        boolean zP = true;
        while (qwnVar.o()) {
            switch (qwnVar.c(b)) {
                case 0:
                    strG = qwnVar.g();
                    break;
                case 1:
                    strG2 = qwnVar.g();
                    break;
                case 2:
                    fA = (float) qwnVar.a();
                    break;
                case 3:
                    int iB4 = qwnVar.b();
                    if (iB4 > 2) {
                        i = 3;
                        break;
                    } else if (iB4 >= 0) {
                        i = new int[]{1, 2, 3}[iB4];
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                case 4:
                    iB = qwnVar.b();
                    break;
                case 5:
                    fA2 = (float) qwnVar.a();
                    break;
                case 6:
                    fA3 = (float) qwnVar.a();
                    break;
                case 7:
                    iB2 = qvp.b(qwnVar);
                    break;
                case 8:
                    iB3 = qvp.b(qwnVar);
                    break;
                case 9:
                    fA4 = (float) qwnVar.a();
                    break;
                case 10:
                    zP = qwnVar.p();
                    break;
                case 11:
                    qwnVar.h();
                    PointF pointF3 = new PointF(((float) qwnVar.a()) * f, ((float) qwnVar.a()) * f);
                    qwnVar.j();
                    pointF = pointF3;
                    break;
                case 12:
                    qwnVar.h();
                    PointF pointF4 = new PointF(((float) qwnVar.a()) * f, ((float) qwnVar.a()) * f);
                    qwnVar.j();
                    pointF2 = pointF4;
                    break;
                default:
                    qwnVar.m();
                    qwnVar.n();
                    break;
            }
        }
        qwnVar.k();
        return new qsq(strG, strG2, fA, i, iB, fA2, fA3, iB2, iB3, fA4, zP, pointF, pointF2);
    }
}
