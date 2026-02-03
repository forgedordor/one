package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfws {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/network/NetworkAvailabilityMonitor");
    public final ConnectivityManager b;
    public final fdjx c;
    public final fcsu d;
    public final fctc e;

    public cfws(ConnectivityManager connectivityManager, fdjx fdjxVar, fcsu fcsuVar) {
        connectivityManager.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.b = connectivityManager;
        this.c = fdjxVar;
        this.d = fcsuVar;
        this.e = fctd.a(new fdae() { // from class: cfwe
            @Override // defpackage.fdae
            public final Object invoke() {
                cfws cfwsVar = this.a;
                fdpb fdpbVar = new fdpb(new cfwp(cfwsVar, null));
                Object objB = cfwsVar.d.b();
                objB.getClass();
                long jLongValue = ((Number) objB).longValue();
                cfwq cfwqVar = new cfwq(null);
                if (jLongValue <= 0) {
                    throw new IllegalArgumentException(a.u(jLongValue, "Expected positive amount of retries, but had "));
                }
                return fdtg.b(new cfwm(new fdto(fcvq.a, new fdri(fdpbVar, new fdrg(jLongValue, cfwqVar, null)), new cfwr(null))), cfwsVar.c, fdur.b, cfwd.b);
            }
        });
    }
}
