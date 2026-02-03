package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqen extends cqgj {
    public eigp a;
    private final cqey b;

    public cqen(cqey cqeyVar) {
        this.b = cqeyVar;
    }

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.a.c("ConnectivityBroadcastReceiverLegacy Receive broadcast", "com/google/android/apps/messaging/shared/util/connectivity/ConnectivityBroadcastReceiverLegacy", "beginRootTrace", 41);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, final Intent intent) {
        String action = intent.getAction();
        if (action == null || action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            final cqgh cqghVar = (cqgh) this.b;
            auwa.a(new Runnable() { // from class: cqfu
                @Override // java.lang.Runnable
                public final void run() {
                    cqgh cqghVar2 = cqghVar;
                    for (final cqev cqevVar : cqghVar2.p) {
                        final Intent intent2 = intent;
                        auwa.a(new Runnable() { // from class: cqez
                            @Override // java.lang.Runnable
                            public final void run() {
                                ekrg ekrgVar = cqgh.c;
                                cqevVar.a(intent2);
                            }
                        }, cqghVar2.h);
                    }
                }
            }, cqghVar.i);
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }
}
