package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpd {
    public final eygg a;

    public dxpd(eygg eyggVar) {
        eyggVar.getClass();
        this.a = eyggVar;
    }

    public final dxnj a() {
        int i = ((SharedPreferences) this.a.b()).getInt("last_successful_registration_account_type", dxnj.b.f);
        boolean z = false;
        dxnj dxnjVar = null;
        for (dxnj dxnjVar2 : dxnj.values()) {
            if (dxnjVar2.f == i) {
                if (z) {
                    return null;
                }
                z = true;
                dxnjVar = dxnjVar2;
            }
        }
        if (z) {
            return dxnjVar;
        }
        return null;
    }

    public final String b() {
        String string = ((SharedPreferences) this.a.b()).getString("internal_target_id", "");
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String c() {
        String string = ((SharedPreferences) this.a.b()).getString("last_successful_registration_environment_url", "");
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String d() {
        String string = ((SharedPreferences) this.a.b()).getString("last_successful_registration_pseudonymous_cookie", "");
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean e() {
        return ((SharedPreferences) this.a.b()).getBoolean("is_registered_to_unified_fcm_registration", false);
    }

    public final int f() {
        int i = ((SharedPreferences) this.a.b()).getInt("last_used_registration_api", 3);
        int[] iArr = {1, 2, 3};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (true) {
            if (i3 < 3) {
                int i5 = iArr[i3];
                if (i5 == 0) {
                    throw null;
                }
                if (i5 == i) {
                    if (z) {
                        break;
                    }
                    z = true;
                    i4 = i5;
                }
                i3++;
            } else if (z) {
                i2 = i4;
            }
        }
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
