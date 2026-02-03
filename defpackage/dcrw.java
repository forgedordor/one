package defpackage;

import android.content.Context;
import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcrw {
    private static dcri a;

    public static synchronized dcri a(Context context) {
        if (a == null) {
            HandlerThread handlerThread = new HandlerThread("DG");
            handlerThread.start();
            ddmy ddmyVar = new ddmy(handlerThread.getLooper());
            Context applicationContext = context.getApplicationContext();
            dcrx dcrxVar = new dcrx();
            dcrv dcrvVar = new dcrv(ddmyVar, new dcpz(applicationContext, ddmyVar.getLooper(), dcrxVar, dcrxVar), dcrxVar);
            ddmw ddmwVar = ddmx.a;
            a = new dcsg(dcrvVar, ddmw.d(1), new dcrz(context));
        }
        return a;
    }
}
