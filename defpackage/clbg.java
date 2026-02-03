package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class clbg extends ckzz {
    public static final cqce a = cqce.g("Bugle", "SimChangeReceiver");
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.d.b()).c("SimChangeReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/SimChangeReceiver", "beginRootTrace", 44);
    }

    @Override // defpackage.cldb
    public final eiju c(final Context context, Intent intent) {
        final String action = intent.getAction();
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("action:");
        cqbdVarC.I(action);
        cqbdVarC.r();
        auwa.a(new Runnable() { // from class: clbf
            @Override // java.lang.Runnable
            public final void run() {
                clbg clbgVar = this.a;
                String str = action;
                if ("com.google.android.ims.SIM_ABSENT".equals(str)) {
                    clbg.a.m("SIM ABSENT");
                } else if ("com.google.android.ims.SIM_LOADED".equals(str)) {
                    ((cmiw) clbgVar.e.b()).a(context);
                }
                ((aill) clbgVar.b.b()).r();
            }
        }, (Executor) this.c.b());
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }
}
