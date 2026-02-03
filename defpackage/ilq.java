package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilq extends ilr {
    private final imn a;
    private final imn b;
    private final float[] c;

    public ilq(imn imnVar, imn imnVar2) {
        float[] fArrF;
        super(imnVar2, imnVar, imnVar2);
        this.a = imnVar;
        this.b = imnVar2;
        if (ilh.c(imnVar.d, imnVar2.d)) {
            fArrF = ilh.f(imnVar2.j, imnVar.i);
        } else {
            float[] fArr = imnVar.i;
            float[] fArr2 = imnVar2.j;
            float[] fArrA = imnVar.d.a();
            float[] fArrA2 = imnVar2.d.a();
            imq imqVar = imnVar.d;
            imq imqVar2 = ilu.a;
            imq imqVar3 = ilu.b;
            fArrF = ilh.f(ilh.c(imnVar2.d, imqVar3) ? fArr2 : ilh.e(ilh.f(ilh.d(ile.b.c, fArrA2, ilu.a()), imnVar2.i)), ilh.c(imqVar, imqVar3) ? fArr : ilh.f(ilh.d(ile.b.c, fArrA, ilu.a()), imnVar.i));
        }
        this.c = fArrF;
    }

    @Override // defpackage.ilr
    public final long a(long j) {
        double d = ije.d(j);
        float fC = ije.c(j);
        float fB = ije.b(j);
        ilt iltVar = this.a.p;
        float fA = (float) iltVar.a(d);
        float fA2 = (float) iltVar.a(fC);
        float fA3 = (float) iltVar.a(fB);
        float[] fArr = this.c;
        float f = fArr[0] * fA;
        float f2 = fArr[3] * fA2;
        float f3 = fArr[6] * fA3;
        float f4 = fArr[1] * fA;
        float f5 = fArr[4] * fA2;
        float f6 = fArr[7] * fA3;
        float f7 = fArr[2] * fA;
        float f8 = fArr[5] * fA2;
        float f9 = fArr[8] * fA3;
        imn imnVar = this.b;
        ilt iltVar2 = imnVar.m;
        return ijg.f((float) iltVar2.a(f + f2 + f3), (float) iltVar2.a(f4 + f5 + f6), (float) iltVar2.a(f7 + f8 + f9), ije.a(j), imnVar);
    }
}
