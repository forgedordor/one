package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsl implements fdat {
    final /* synthetic */ float a;

    public dmsl(float f) {
        this.a = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            gkd.a(jqq.a(R.drawable.gs_visual_effects_wght600_vd_theme_24, hmlVar, 0), jqu.b(R.string.camera_effect_toggle_show_content_description, hmlVar), ifi.a(egq.k(ics.e, 24.0f), this.a), 0L, hmlVar, 0, 8);
        }
        return fctx.a;
    }
}
