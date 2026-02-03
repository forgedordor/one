package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class erh implements iqp {
    private final etv a;
    private final dwm b;

    public erh(etv etvVar, dwm dwmVar) {
        this.a = etvVar;
        this.b = dwmVar;
    }

    @Override // defpackage.iqp
    public final long a(long j, long j2, int i) {
        if (!ira.a(i, 2)) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.b == dwm.b ? j2 >> 32 : 4294967295L & j2)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.iqp
    public final long b(long j, int i) {
        if (!ira.a(i, 1)) {
            return 0L;
        }
        etv etvVar = this.a;
        if (Math.abs(etvVar.c()) <= 1.0E-6d) {
            return 0L;
        }
        float fC = etvVar.c() * etvVar.k();
        int i2 = etvVar.x().b + etvVar.x().c;
        float f = -Math.signum(etvVar.c());
        float fC2 = etvVar.c();
        dwm dwmVar = this.b;
        dwm dwmVar2 = dwm.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dwmVar == dwmVar2 ? j >> 32 : j & 4294967295L));
        float f2 = (i2 * f) + fC;
        float f3 = fC2 > 0.0f ? f2 : fC;
        if (fC2 <= 0.0f) {
            fC = f2;
        }
        float fIntBitsToFloat2 = -etvVar.a(-fddu.e(fIntBitsToFloat, f3, fC));
        float fIntBitsToFloat3 = dwmVar == dwmVar2 ? fIntBitsToFloat2 : Float.intBitsToFloat((int) (j >> 32));
        if (dwmVar != dwm.a) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return ihs.i(fIntBitsToFloat3, fIntBitsToFloat2);
    }

    @Override // defpackage.iqp
    public final Object c(long j, long j2, fcxy fcxyVar) {
        return new kjo(this.b == dwm.a ? kjo.g(j2, 0.0f, 0.0f, 2) : kjo.g(j2, 0.0f, 0.0f, 1));
    }

    @Override // defpackage.iqp
    public final /* synthetic */ Object d(long j, fcxy fcxyVar) {
        return new kjo(0L);
    }
}
