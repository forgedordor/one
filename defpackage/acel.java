package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acel implements fdau {
    public static final acel a = new acel();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((eve) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlhh.b(new dlhm(jqu.b(R.string.account_sign_out_profile_message_bubble, hmlVar), null, true, false, null, false, true, null, false, null, null, null, false, false, null, null, false, false, false, 4194134), egq.u(ics.e, 40.0f, 0.0f, 2), null, null, hmlVar, 48, 12);
        }
        return fctx.a;
    }
}
