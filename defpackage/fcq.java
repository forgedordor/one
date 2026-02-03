package defpackage;

import androidx.compose.foundation.gestures.ScrollableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcq implements fdau {
    final /* synthetic */ fcu a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ebk c;

    public fcq(fcu fcuVar, boolean z, ebk ebkVar) {
        this.a = fcuVar;
        this.b = z;
        this.c = ebkVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(805428266);
        Object objE = hmlVar.e(jmh.j);
        final fcu fcuVar = this.a;
        boolean z = fcuVar.c() == dwm.a || objE != kji.b;
        boolean zD = hmlVar.D(fcuVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new fdap() { // from class: fcm
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    float fFloatValue = ((Float) obj4).floatValue();
                    fcu fcuVar2 = fcuVar;
                    float fB = fcuVar2.b() + fFloatValue;
                    if (fB > fcuVar2.a()) {
                        fFloatValue = fcuVar2.a() - fcuVar2.b();
                    } else if (fB < 0.0f) {
                        fFloatValue = -fcuVar2.b();
                    }
                    fcuVar2.d(fcuVar2.b() + fFloatValue);
                    return Float.valueOf(fFloatValue);
                }
            };
            hmlVar.y(objF);
        }
        final hsf hsfVarA = hsc.a((fdap) objF, hmlVar);
        Object objF2 = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF2 == obj4) {
            dtd dtdVar = new dtd(new fdap() { // from class: dyc
                @Override // defpackage.fdap
                public final Object invoke(Object obj5) {
                    Float f = (Float) obj5;
                    f.floatValue();
                    return Float.valueOf(((Number) ((fdap) hsfVarA.a()).invoke(f)).floatValue());
                }
            });
            hmlVar.y(dtdVar);
            objF2 = dtdVar;
        }
        dyb dybVar = (dyb) objF2;
        boolean zD2 = hmlVar.D(dybVar) | hmlVar.D(fcuVar);
        Object objF3 = hmlVar.f();
        if (zD2 || objF3 == obj4) {
            objF3 = new fcp(dybVar, fcuVar);
            hmlVar.y(objF3);
        }
        ScrollableElement scrollableElement = new ScrollableElement((fcp) objF3, fcuVar.c(), this.b && fcuVar.a() != 0.0f, z, this.c);
        hmlVar.o();
        return scrollableElement;
    }
}
