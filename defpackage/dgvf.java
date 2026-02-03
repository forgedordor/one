package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgvf {
    private static dgvf a;

    private dgvf() {
    }

    public static final void a(Context context, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.ims.provisioning.engine.update_provisioning_status_key", i - 1);
        dgic.c(context, 11, bundle);
    }

    public static synchronized void b() {
        if (a == null) {
            a = new dgvf();
        }
    }
}
