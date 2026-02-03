package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cljt {
    public final esty a;
    private final Context b;
    private final eosc c;

    public cljt(esty estyVar, Context context, eosc eoscVar) {
        context.getClass();
        eoscVar.getClass();
        this.a = estyVar;
        this.b = context;
        this.c = eoscVar;
        HashMap map = new HashMap();
        fbus.b("stargate.DatagramNotificationService", espo.a(context, new ekph("com.google.android.apps.stargate"), eoscVar), map);
        fbus.b("stargate.SatelliteSessionStateNotificationService", espo.a(context, new ekph("com.google.android.apps.stargate"), eoscVar), map);
        estyVar.b(fbus.a(map));
    }
}
