package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwgl implements PointerInputEventHandler {
    final /* synthetic */ hox a;
    final /* synthetic */ hox b;

    public cwgl(hox hoxVar, hox hoxVar2) {
        this.a = hoxVar;
        this.b = hoxVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final isn isnVar, fcxy<? super fctx> fcxyVar) {
        final hox hoxVar = this.a;
        final hox hoxVar2 = this.b;
        Object objB = dvn.b(isnVar, new dzs(new fdav() { // from class: cwgk
            @Override // defpackage.fdav
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                float fFloatValue = ((Float) obj3).floatValue();
                ((Float) obj4).floatValue();
                hox hoxVar3 = hoxVar;
                hoxVar3.b(Float.valueOf(fddu.e(cwgn.b(hoxVar3) * fFloatValue, 1.0f, 4.0f)));
                ito itoVar = (ito) isnVar;
                long j = itoVar.h >> 32;
                float fB = cwgn.b(hoxVar3) - 1.0f;
                long j2 = itoVar.h & 4294967295L;
                float fB2 = cwgn.b(hoxVar3) - 1.0f;
                hox hoxVar4 = hoxVar2;
                long jE = ihs.e(cwgn.c(hoxVar4), ihs.f(((ihs) obj2).a, fddu.e(cwgn.b(hoxVar3) / 3.0f, 1.0f, 2.0f)));
                float fC = fddu.c((((int) j) * fB) / 2.0f, 0.0f);
                float fE = fddu.e(Float.intBitsToFloat((int) (jE >> 32)), -fC, fC);
                float fC2 = fddu.c((((int) j2) * fB2) / 2.0f, 0.0f);
                float fE2 = fddu.e(Float.intBitsToFloat((int) (jE & 4294967295L)), -fC2, fC2);
                hoxVar4.b(new ihs((Float.floatToRawIntBits(fE2) & 4294967295L) | (Float.floatToRawIntBits(fE) << 32)));
                return fctx.a;
            }
        }, null), fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objB != fcylVar) {
            objB = fctx.a;
        }
        return objB == fcylVar ? objB : fctx.a;
    }
}
