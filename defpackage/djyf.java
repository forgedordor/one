package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djyf implements fdat {
    final /* synthetic */ djys a;

    public djyf(djys djysVar) {
        this.a = djysVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        String strB;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final djys djysVar = this.a;
            hmlVar.v(-723587255);
            boolean z = djysVar.d;
            if (z) {
                hmlVar.v(53040804);
                strB = jqu.b(R.string.list_item_selected, hmlVar);
                hmlVar.o();
            } else {
                hmlVar.v(53099394);
                strB = jqu.b(R.string.list_item_unselected, hmlVar);
                hmlVar.o();
            }
            hmlVar.o();
            hmlVar.v(5004770);
            boolean zD = hmlVar.D(djysVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: djye
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ((Boolean) obj3).booleanValue();
                        djysVar.f.invoke();
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            djae.b(new djah(strB, z, (fdap) objF, false), null, hmlVar, 0, 2);
        }
        return fctx.a;
    }
}
