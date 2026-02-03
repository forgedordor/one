package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djlh implements fdat {
    final /* synthetic */ fdae a;
    final /* synthetic */ ghy b;

    public djlh(fdae fdaeVar, ghy ghyVar) {
        this.a = fdaeVar;
        this.b = ghyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            String strB = jqu.b(R.string.datetime_picker_dialog_next_button, hmlVar);
            hmlVar.v(1849434622);
            final ghy ghyVar = this.b;
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                fdae fdaeVar = new fdae() { // from class: djlg
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Boolean.valueOf(ghyVar.d() != null);
                    }
                };
                hxn hxnVar = hrp.a;
                hnt hntVar = new hnt(fdaeVar, null);
                hmlVar.y(hntVar);
                objF = hntVar;
            }
            hmlVar.o();
            djmd.a(null, this.a, strB, ((Boolean) ((hsf) objF).a()).booleanValue(), hmlVar, 0, 1);
        }
        return fctx.a;
    }
}
