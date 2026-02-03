package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edxk implements fdat {
    public static final edxk a = new edxk();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dthx.b(jqu.b(R.string.pqe_allow_camera_access_in_settings, hmlVar), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 131070);
        }
        return fctx.a;
    }
}
