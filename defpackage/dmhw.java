package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmhw implements fdat {
    public static final dmhw a = new dmhw();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(jqq.a(R.drawable.gs_close_vd_theme_24, hmlVar, 0), jqu.b(R.string.popup_camera_cancel_button_content_description, hmlVar), null, glz.a(hmlVar).q, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
