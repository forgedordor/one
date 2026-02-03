package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdw implements fdau {
    public static final gdw a = new gdw();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int i = iIntValue & 17;
        if (hmlVar.J(i != 16, iIntValue & 1)) {
            gyj.c(hjw.b(R.string.m3c_time_picker_pm, hmlVar), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 262142);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
