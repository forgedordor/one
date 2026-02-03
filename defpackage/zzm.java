package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzm {
    public static final void a(final zzk zzkVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2126218824);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(zzkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            diuy.a(new divf(jqu.b(R.string.premium_sms_options_title, hmlVarC), new dktq(jqu.b(R.string.premium_sms_options_open_settings_button, hmlVarC), zzkVar.d), new dktq(jqu.b(R.string.premium_sms_options_resend_button, hmlVarC), zzkVar.e), zzkVar.b, zzkVar.c, (dkts) null, 2, zzkVar.a, 736), icsVar, hmlVarC, i2 & 112, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zzl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zzk zzkVar2 = zzkVar;
                    int i4 = i;
                    zzm.a(zzkVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
