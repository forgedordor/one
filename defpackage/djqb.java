package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djqb {
    public static final ics a(ics icsVar, final dpn dpnVar) {
        icsVar.getClass();
        dpnVar.getClass();
        return icsVar.a(ifb.c(ijn.a(ics.e, new fdap() { // from class: djpz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ikl iklVar = (ikl) obj;
                iklVar.getClass();
                iklVar.a(0.99f);
                return fctx.a;
            }
        }), new fdap() { // from class: djqa
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                imw imwVar = (imw) obj;
                imwVar.getClass();
                imwVar.p();
                List listG = fcva.g(new ije(ije.a), new ije(ije.g));
                long jB = imwVar.b() & 4294967295L;
                dpn dpnVar2 = dpnVar;
                float fIntBitsToFloat = Float.intBitsToFloat((int) jB) - dpnVar2.b();
                float fC = dpnVar2.c();
                float fB = dpnVar2.b() - dpnVar2.c();
                float fMin = Math.min(imwVar.en(48.0f), fB + fB);
                if (fMin != 0.0f) {
                    float f = fIntBitsToFloat + fC;
                    imy.i(imwVar, iix.d(listG, f - fMin, f, 8), 0L, 0L, 0.0f, null, 6, 62);
                }
                return fctx.a;
            }
        }));
    }
}
