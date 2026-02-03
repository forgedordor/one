package defpackage;

import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhkb extends dhkt {
    public final TelephonyManager.BootstrapAuthenticationCallback a;

    public dhkb(TelephonyManager.BootstrapAuthenticationCallback bootstrapAuthenticationCallback) {
        this.a = bootstrapAuthenticationCallback;
    }

    @Override // defpackage.dhkt
    public final TelephonyManager.BootstrapAuthenticationCallback a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dhkt) {
            return this.a.equals(((dhkt) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BootstrapAuthenticationCallbackWrapper{callback=" + this.a.toString() + "}";
    }
}
