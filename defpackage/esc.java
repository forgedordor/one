package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esc implements dsj {
    private final etv a;
    private final dsj b;

    public esc(etv etvVar, dsj dsjVar) {
        this.a = etvVar;
        this.b = dsjVar;
    }

    @Override // defpackage.dsj
    public final float a(float f, float f2, float f3) {
        float f4 = f + f2;
        float fA = this.b.a(f, f2, f3);
        boolean z = true;
        if (f <= 0.0f ? f4 > 0.0f : f4 <= f3) {
            z = false;
        }
        if (Math.abs(fA) == 0.0f || !z) {
            etv etvVar = this.a;
            if (Math.abs(etvVar.g) < 1.0E-6d) {
                return 0.0f;
            }
            float fL = -etvVar.g;
            if (etvVar.v()) {
                fL += etvVar.l();
            }
            return fddu.e(fL, -f3, f3);
        }
        etv etvVar2 = this.a;
        float fL2 = -etvVar2.g;
        while (fA > 0.0f && fL2 < fA) {
            fL2 += etvVar2.l();
        }
        while (fA < 0.0f && fL2 > fA) {
            fL2 -= etvVar2.l();
        }
        return fL2;
    }
}
