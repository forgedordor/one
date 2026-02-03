package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeaa implements fdau {
    final /* synthetic */ boolean a;

    public eeaa(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else if (this.a) {
            hmlVar.v(-1681568376);
            dtfn.a(jqq.a(R.drawable.quantum_gm_ic_photo_camera_vd_theme_24, hmlVar, 0), jqu.b(R.string.pqe_edit_profile_picture_button_a11y_label, hmlVar), null, 0L, hmlVar, 0, 12);
            hmlVar.o();
        } else {
            hmlVar.v(-1681314672);
            dtgm.a(egq.c(ics.e, 0.75f), 0L, 0.0f, 0L, 0, 0.0f, hmlVar, 6, 62);
            hmlVar.o();
        }
        return fctx.a;
    }
}
