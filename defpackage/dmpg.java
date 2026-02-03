package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmpg implements fdat {
    public static final dmpg a = new dmpg();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            gkd.a(jqq.a(R.drawable.gs_close_vd_theme_24, hmlVar, 0), jqu.b(R.string.camera_close_button_content_description, hmlVar), null, ije.d, hmlVar, 3072, 4);
        }
        return fctx.a;
    }
}
