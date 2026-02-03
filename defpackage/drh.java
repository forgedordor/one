package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drh implements eat {
    final /* synthetic */ dsd a;
    final /* synthetic */ fdap b;
    final /* synthetic */ fdae c;

    public drh(dsd dsdVar, fdap fdapVar, fdae fdaeVar) {
        this.a = dsdVar;
        this.b = fdapVar;
        this.c = fdaeVar;
    }

    @Override // defpackage.eat
    public final float a(float f, float f2) {
        return 0.0f;
    }

    @Override // defpackage.eat
    public final float b(float f) {
        Object objC;
        dsd dsdVar = this.a;
        float fC = dsdVar.c();
        dst dstVarK = dsdVar.k();
        if (Float.isNaN(fC)) {
            throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
        boolean z = Math.abs(f) > 0.0f;
        boolean z2 = z && f > 0.0f;
        if (z) {
            if (Math.abs(f) >= Math.abs(((Number) this.c.invoke()).floatValue())) {
                objC = dstVarK.c(fC, z2);
                objC.getClass();
            } else {
                fdap fdapVar = this.b;
                Object objC2 = dstVarK.c(fC, false);
                objC2.getClass();
                float fA = dstVarK.a(objC2);
                Object objC3 = dstVarK.c(fC, true);
                objC3.getClass();
                float fA2 = dstVarK.a(objC3);
                float fAbs = Math.abs(((Number) fdapVar.invoke(Float.valueOf(Math.abs(fA - fA2)))).floatValue());
                if (true != z2) {
                    fA = fA2;
                }
                objC = (Math.abs(fA - fC) < fAbs ? !z2 : z2) ? objC3 : objC2;
            }
        } else {
            objC = dstVarK.b(fC);
            objC.getClass();
        }
        return dsdVar.k().a(objC) - fC;
    }
}
