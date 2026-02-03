package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efxy {
    public boolean c;
    int d = 3;
    Bundle a = null;
    ejwi b = ejud.a;

    final boolean a() {
        int i = this.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        boolean z = false;
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            throw new RuntimeException(null, null);
        }
        ejwl.l(i == 3);
        Bundle bundle = this.a;
        if (bundle == null ? !(this.b.g() && (!((Boolean) this.b.c()).booleanValue() || this.c)) : !(!bundle.getBoolean("tiktok_accounts_disabled") || this.c)) {
            z = true;
        }
        this.d = z ? 1 : 2;
        return z;
    }
}
