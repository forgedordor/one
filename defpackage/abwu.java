package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwu {
    private final Optional a;

    public abwu(Optional optional) {
        this.a = optional;
    }

    public final boolean a(eg egVar) {
        if (!abxb.a()) {
            return false;
        }
        Bundle bundleA = egVar.U().d() ? egVar.U().a("tiktok_account_controller_saved_instance_state") : null;
        if (bundleA != null) {
            return !((Boolean) this.a.orElse(false)).booleanValue() && bundleA.getBoolean("tiktok_accounts_disabled");
        }
        return true;
    }
}
