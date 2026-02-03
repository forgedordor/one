package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwj {
    public final mcj a;
    public ekgb b;
    public nen c;
    public nen d;
    public nen e;
    private ekgp f;

    public mwj(mcj mcjVar) {
        this.a = mcjVar;
        int i = ekgb.d;
        this.b = ekoe.a;
        this.f = ekoj.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static nen b(mcg mcgVar, ekgb ekgbVar, nen nenVar, mcj mcjVar) {
        mcl mclVarH = mcgVar.H();
        int iAF = mcgVar.aF();
        Object objF = mclVarH.q() ? null : mclVarH.f(iAF);
        int iB = -1;
        if (!mcgVar.Y() && !mclVarH.q()) {
            iB = mclVarH.n(iAF, mcjVar).b(mgb.w(mcgVar.y()) - mcjVar.e);
        }
        int i = iB;
        for (int i2 = 0; i2 < ekgbVar.size(); i2++) {
            nen nenVar2 = (nen) ekgbVar.get(i2);
            if (e(nenVar2, objF, mcgVar.Y(), mcgVar.aC(), mcgVar.aD(), i)) {
                return nenVar2;
            }
        }
        if (ekgbVar.isEmpty() && nenVar != null && e(nenVar, objF, mcgVar.Y(), mcgVar.aC(), mcgVar.aD(), i)) {
            return nenVar;
        }
        return null;
    }

    private final void d(ekgi ekgiVar, nen nenVar, mcl mclVar) {
        if (nenVar == null) {
            return;
        }
        if (mclVar.a(nenVar.a) != -1) {
            ekgiVar.i(nenVar, mclVar);
            return;
        }
        mcl mclVar2 = (mcl) this.f.get(nenVar);
        if (mclVar2 != null) {
            ekgiVar.i(nenVar, mclVar2);
        }
    }

    private static boolean e(nen nenVar, Object obj, boolean z, int i, int i2, int i3) {
        if (nenVar.a.equals(obj)) {
            return z ? nenVar.b == i && nenVar.c == i2 : nenVar.b == -1 && nenVar.e == i3;
        }
        return false;
    }

    public final mcl a(nen nenVar) {
        return (mcl) this.f.get(nenVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(mcl mclVar) {
        ekgi ekgiVar = new ekgi();
        if (this.b.isEmpty()) {
            d(ekgiVar, this.d, mclVar);
            if (!Objects.equals(this.e, this.d)) {
                d(ekgiVar, this.e, mclVar);
            }
            if (!Objects.equals(this.c, this.d) && !Objects.equals(this.c, this.e)) {
                d(ekgiVar, this.c, mclVar);
            }
        } else {
            for (int i = 0; i < this.b.size(); i++) {
                d(ekgiVar, (nen) this.b.get(i), mclVar);
            }
            if (!this.b.contains(this.c)) {
                d(ekgiVar, this.c, mclVar);
            }
        }
        this.f = ekgiVar.c();
    }
}
