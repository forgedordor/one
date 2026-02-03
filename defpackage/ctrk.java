package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctrk implements fdat {
    public static final ctrk a = new ctrk();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(jqq.a(R.drawable.gs_cancel_vd_theme_24, hmlVar, 0), jqu.b(R.string.group_rename_cancel_button_content_description, hmlVar), null, 0L, hmlVar, 0, 12);
        }
        return fctx.a;
    }
}
